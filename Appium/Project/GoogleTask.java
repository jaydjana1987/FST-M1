package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class GoogleTask {


    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        //options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //Appium Server url
        URL serverURL=new URL("http://localhost:4720/wd/hub");

        //Initialze Driver
        driver=new AndroidDriver(serverURL,options);

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @Test
    public void googleTasktest() throws InterruptedException {
        String txt;

        String task1="Complete Activity with Google Tasks";
        String task2="Complete Activity with Google Keep";
        String task3="Complete the second Activity Google Keep";

        WebElement taskbtn=driver.findElement(AppiumBy.id("tasks_fab"));
        taskbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        //Thread.sleep(5000);
        WebElement taskBox=driver.findElement(AppiumBy.id("add_task_title"));
        taskBox.sendKeys(task1);
        WebElement savebtn=driver.findElement(AppiumBy.id("add_task_done"));
        savebtn.click();

        Thread.sleep(3000);
        txt=driver.findElement(AppiumBy.id("task_name")).getText();
        Assert.assertEquals(txt,task1);

        // Add second task
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("tasks_fab")));
        taskbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        taskBox=driver.findElement(AppiumBy.id("add_task_title"));
        taskBox.sendKeys(task2);
        savebtn=driver.findElement(AppiumBy.id("add_task_done"));
        savebtn.click();
        Thread.sleep(3000);
        txt=driver.findElement(AppiumBy.id("task_name")).getText();
        Assert.assertEquals(txt,task2);

        //Add Third Task
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("tasks_fab")));
        taskbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        taskBox=driver.findElement(AppiumBy.id("add_task_title"));
        taskBox.sendKeys(task3);
        savebtn=driver.findElement(AppiumBy.id("add_task_done"));
        savebtn.click();
        Thread.sleep(3000);
        txt=driver.findElement(AppiumBy.id("task_name")).getText();
        Assert.assertEquals(txt,task3);


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }




}
