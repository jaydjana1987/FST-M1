package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/ajax");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Find and click the "Change content" button on the page.
        driver.findElement(By.xpath("//*[@id='ajax-content']/button")).click();

        //Wait for the text to say "HELLO!". Print the message that appears on the page.
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        String txt = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(txt);


        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        //Get late text and print it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);


        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
