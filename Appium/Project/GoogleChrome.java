package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class GoogleChrome {

    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        //options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //Appium Server url
        URL serverURL=new URL("http://localhost:4720/wd/hub");

        //Initialze Driver
        driver=new AndroidDriver(serverURL,options);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium");

    }

    @Test
    public void googleChromeTest()
    {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollTextIntoView(\"To-Do\")"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("taskInput")));
        //Add tasks to list
        driver.findElement(AppiumBy.xpath("//input[@id='taskInput']")).sendKeys("Test1");
        driver.findElement(AppiumBy.xpath("//input[@id='taskInput']/button")).click();
        driver.findElement(AppiumBy.xpath("//input[@id='taskInput']")).sendKeys("Test2");
        driver.findElement(AppiumBy.xpath("//input[@id='taskInput']/button")).click();
        //Get number of tasks
        List<WebElement> tasklist=driver.findElements(AppiumBy.xpath("//div[@class='item']/div"));
        int taskcount=tasklist.size();
        System.out.println("Number of the task in list is: "+taskcount);

        //Click on each of the tasks added to strike them out.
        for(WebElement ref:tasklist)
        {
            if(!ref.getText().contains("Add more tasks to this list."))
            {
                ref.click();
            }
        }
        //Finally, clear the list.
        driver.findElement(AppiumBy.xpath("//div[contains(@onclick,'clearList')]")).click();

        //Add assertions to verify that the test has passed or failed.

        Assert.assertEquals(tasklist.size(),0,"Test Casee Failed");


    }
}
