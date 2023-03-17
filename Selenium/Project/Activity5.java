package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import java.io.IOException;

public class Activity5 extends DriverIntilizer {

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

        //Get the color of the navigation menu and print it to the console.
        String color = driver.findElement(By.cssSelector("#grouptab_0")).getCssValue("background-color");
        System.out.println("The rgba color is: " + color);
        System.out.println("The Hex color of the background is: " + Color.fromString(color).asHex());

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
