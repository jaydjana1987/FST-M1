package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import java.io.IOException;

public class Activity4 extends DriverIntilizer {

    ConfigRead cf;

    @BeforeTest
    public void setup() {
        initialization();
        cf = new ConfigRead();
    }

    @Test
    public void body() throws IOException {
        // Login in CRM application
        driver.findElement(By.id("user_name")).sendKeys(cf.readProperties("UserName"));
        driver.findElement(By.id("username_password")).sendKeys(cf.readProperties("Password"));
        driver.findElement(By.id("bigbutton")).click();

        //Verify that the homepage has opened.
        String txt = driver.findElement(By.xpath("//*[@id=\"tab0\"]")).getText();
        //System.out.println(txt);
        Assert.assertEquals(txt, "SUITECRM DASHBOARD", "Homepage isn't opened successfully");

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
