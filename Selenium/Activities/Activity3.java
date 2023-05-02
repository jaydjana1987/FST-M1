package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/simple-form");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);


        driver.findElement(By.id("firstName")).sendKeys("Jaydeb");
        driver.findElement(By.id("lastName")).sendKeys("Jana");
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("number")).sendKeys("6362216009");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
