package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Activity4_2 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Use findElement() with xpath() to find all the input fields on the page.
        //Fill in the details in the fields using the sendKeys() method.

        driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Jaydeb");
        driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Jana");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("6362216007");
        driver.findElement(By.xpath("//textarea")).sendKeys("Test message");
        //Click the submit button at the end of the form to submit the form.
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}
