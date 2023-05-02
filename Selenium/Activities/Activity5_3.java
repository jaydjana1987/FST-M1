package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Use findElement() to find the text field.
        WebElement txtfield=driver.findElement(By.xpath("//*[@id='dynamicText']"));

        //Use the isEnabled() method to check if the text field is enabled.
        System.out.println("Checkbox selected? :"+txtfield.isEnabled());

        //Click the "Enable Input" button to enable the input field.
        driver.findElement(By.id("toggleInput")).click();

        //Use the isEnabled() method again and print the result.
        System.out.println("Checkbox selected? :"+txtfield.isEnabled());

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
