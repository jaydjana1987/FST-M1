package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/selects");

        //Use findElement() to find the dropdown WebElement on the page.
        WebElement dropdown= driver.findElement(By.id("single-select"));

        //Create a new Select class object with the WebElement.
        Select select=new Select(dropdown);

        //Select the second option using selectByVisibleText()
        select.selectByVisibleText("Option 2");

        //Select the third option using selectByIndex()
        select.selectByIndex(3);

        //Select the fourth option using selectByValue()
        select.selectByValue("4");


        //Get all options
        List<WebElement> options = select.getOptions();
        System.out.println(" All options in the dropdown below: ");
        for(WebElement option : options) {
            System.out.println(option.getText());
        }

        Thread.sleep(5000);
        driver.close();

    }
}
