package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;

public class Activity7 extends DriverIntilizer {


    ConfigRead cf;

    @BeforeTest
    public void setup() {
        initialization();
        cf = new ConfigRead();
    }

    @Test
    public void body() throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Login in CRM Application
        driver.findElement(By.id("user_name")).sendKeys(cf.readProperties("UserName"));
        driver.findElement(By.id("username_password")).sendKeys(cf.readProperties("Password"));
        driver.findElement(By.id("bigbutton")).click();
        // Navigate to Sales -> Leads
        WebElement menu_sales = driver.findElement(By.id("grouptab_0"));
        WebElement submenu_Leads = driver.findElement(By.cssSelector("li.topnav:nth-child(2) > span:nth-child(2) > ul:nth-child(3) > li:nth-child(5) > a:nth-child(1)"));
        wait.until(ExpectedConditions.visibilityOf(menu_sales));

        Actions action = new Actions(driver);
        action.moveToElement(menu_sales);
        //wait.until(ExpectedConditions.visibilityOf(submenu_Leads));
        action.moveToElement(submenu_Leads).click().build().perform();

        //In the table, find the Additional information icon at the end of the row of the lead information. Click it.
        WebElement information = driver.findElement(By.cssSelector("#adspan_1bf01e91-1f26-5249-ed14-63294367a7e5 > span:nth-child(1)"));
        wait.until(ExpectedConditions.visibilityOf(information));
        information.click();

        //Read the popup and print the phone number displayed in it.

        WebElement phone_Number = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span"));
        wait.until(ExpectedConditions.visibilityOf(phone_Number));
        System.out.println("The Phone Number is: " + phone_Number.getText());


    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
