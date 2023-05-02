package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Use findElement() to find the checkbox input element.
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));

        //Use the isDisplayed() method to check if it is visible on the page.
        System.out.println("Check displayed? :"+checkbox.isDisplayed());

        //Click the "Remove Checkbox".
        driver.findElement(By.id("toggleCheckbox")).click();

        //Print the result of the isDisplayed() method again.
        System.out.println("Check displayed? :"+checkbox.isDisplayed());

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
