package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_3 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Also use findElement() to find the button to open a PROMPT alert and click it.
        driver.findElement(By.cssSelector("#prompt")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        //Switch the focus from the main window to the Alert box.
       Alert alert=driver.switchTo().alert();

       //Use sendKeys() to type in "Yes, you are!".
        alert.sendKeys("Yes, you are!");
        Thread.sleep(2000);

        //Close the alert with alert.accept().
        alert.accept();
        
        //Finally, close() the browser.
        Thread.sleep(5000);
        driver.close();

    }
}
