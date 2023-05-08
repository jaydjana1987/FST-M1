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

public class GoogleKeep {


    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        //options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //Appium Server url
        URL serverURL=new URL("http://localhost:4720/wd/hub");

        //Initialze Driver
        driver=new AndroidDriver(serverURL,options);

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @Test
    public void googleKeppTest()
    {
        String notes="My Notes";
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("new_note_button")));
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AppiumBy.id("new_note_button"))));
        WebElement addbtn=driver.findElement(AppiumBy.id("new_note_button"));
        addbtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("editable_title")));
        WebElement title=driver.findElement(AppiumBy.id("editable_title"));
        title.sendKeys(notes);
        WebElement notestxt=driver.findElement(AppiumBy.id("edit_note_text"));
        notestxt.sendKeys("This is test txt");
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AppiumBy.accessibilityId("Navigate up")));
        WebElement backbtn=driver.findElement(AppiumBy.accessibilityId("Navigate up"));
        backbtn.click();

        //Assertion

        String txt=driver.findElement(By.id("index_note_title")).getText();
        Assert.assertEquals(txt,notes);

    }
}
