package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/target-practice");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Find the third header on the page.
        String h3 = driver.findElement(By.xpath("//*[@id='third-header']")).getText();
        System.out.println("Third headerin the page is: " + h3);

        //Find the fifth header on the page and get it's 'colour' CSS Property.
        String h5color=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("Fifth header color is: "+h5color);

        //Find the violet button on the page and print all the class attribute values.
        String violet_class = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violet_class);

        //Find the grey button on the page with Absolute XPath.
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);

        driver.close();
    }
}
