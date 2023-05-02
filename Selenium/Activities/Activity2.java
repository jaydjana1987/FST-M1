package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net");

        //Get the title of the page using driver.getTitle() and print out the title

        String title= driver.getTitle();
        System.out.println("Current Page Title is: "+title);

        /*Use findElement() with the following locators to find the "About Us" link:
        id()
        className()
        linkText()
        cssSelector()
        Print the text in the WebElement using the getText() method.*/

        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLocator.getText());

        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classNameLocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());

        //Close the browser with driver.close()
        driver.close();
    }
}
