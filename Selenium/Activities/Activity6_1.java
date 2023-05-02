package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);


        //Find checkbox and toggle button
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        //Click the toggle button
        toggleCheckboxButton.click();

        //Wait for checkbox to disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        //Click toggle button again
        toggleCheckboxButton.click();

        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
