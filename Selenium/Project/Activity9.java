package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import java.io.IOException;
import java.time.Duration;

public class Activity9 extends DriverIntilizer {


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

        //Find the table on the page and print the first 10 values in the Name column and the User column of the table to the console.
        WebElement table_row = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr"));
        wait.until(ExpectedConditions.visibilityOf(table_row));
        System.out.println("Row No" + "  |    " + "Name" + "                   |   " + "User");
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            String name = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[" + i + "]/td[3]")).getText();
            String user = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[" + i + "]/td[8]")).getText();

            System.out.println(i + "          " + name + "       " + user);
        }
    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
