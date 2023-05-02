package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Find the username and password input fields. Type in the credentials:
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/button")).click();

        //Wait for login message to appear and print the login message to the console

        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login validation message: " + message);

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
