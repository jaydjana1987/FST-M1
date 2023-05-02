package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
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

        //Use the isSelected() method to check if the checkbox is selected.
        System.out.println("Checkbox selected? :"+checkbox.isSelected());

        //Click the checkbox to select it.
        checkbox.click();

        //Use the isSelected() method again and print the result.
        System.out.println("Checkbox selected? :"+checkbox.isSelected());

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
