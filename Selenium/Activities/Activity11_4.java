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
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/tab-opener");

        //Print the Page Title and Handle of that tab.
        String title=driver.getTitle();

        //Find the button to open a new tab and click it.
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.id("launcher")).click();

        //Wait for the new tab to open.
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //Print all the handles.

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);



        //Finally, close() the browser.
        Thread.sleep(5000);
        driver.quit();

    }
}
