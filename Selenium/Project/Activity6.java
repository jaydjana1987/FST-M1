package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import java.io.IOException;

public class Activity6 extends DriverIntilizer {


    ConfigRead cf;

    @BeforeTest
    public void setup() {
        initialization();
        cf = new ConfigRead();
    }

    @Test
    public void body() throws IOException {
        //Login in CRM Application
        driver.findElement(By.id("user_name")).sendKeys(cf.readProperties("UserName"));
        driver.findElement(By.id("username_password")).sendKeys(cf.readProperties("Password"));
        driver.findElement(By.id("bigbutton")).click();

        //Ensure that the “Activities” menu item exists.
        boolean exists = driver.findElements(By.cssSelector("#grouptab_3")).size() != 0;
        if (exists == true) {
            System.out.println("Activities Element exists");
        } else {
            System.out.println("Element doesn't exists");
        }

        Boolean display = driver.findElement(By.cssSelector("#grouptab_3")).isDisplayed();

        if (display == true) {
            System.out.println("Activities Element available in UI");
        } else {
            System.out.println("Element doesn't available in UI");
        }


    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
