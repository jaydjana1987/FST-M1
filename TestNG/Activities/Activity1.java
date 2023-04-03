package testNGTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
   WebDriver driver;
    @BeforeMethod
    public void setUP()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net");

    }

    @Test
    public void body()
    {
        String title=driver.getTitle();
        System.out.println("Current page title is : "+title);
        Assert.assertEquals(title,"Training Support","Title doesn't match");
        driver.findElement(By.cssSelector("#about-link")).click();
        System.out.println("New Page Title is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"About Training Support","Title doesn't match");

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
