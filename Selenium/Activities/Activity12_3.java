package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {

    public static void main(String[] args) {

        // Initiate Browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");

        //Find Sign in button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));

        //Hover over button using action class
        Actions builder = new Actions(driver);
        builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);

        //Click on the button
        button.click();

        //Wait for modal to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        //Find username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Read the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);

        //Close browser
        driver.close();
    }
}
