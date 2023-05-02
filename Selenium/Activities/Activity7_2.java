package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Find the input fields of the Sign Up form. Fill in the details in the fields with your own data.
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("abcd");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[3]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[4]/input")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();


        //Wait for success message to appear and print it to the console.

        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
