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

public class Activity11_1 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Use findElement() to find the button to open a SIMPLE alert and click it.
        driver.findElement(By.cssSelector("button#simple")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert Box text is: "+ alert.getText());

        //Finally, close the alert with alert.accept() and close() the browser

        alert.accept();
        Thread.sleep(5000);
        driver.close();

    }
}
