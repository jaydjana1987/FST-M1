package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title= driver.getTitle();
        System.out.println("Page title is: "+title);

        //Use findElement() with xpath() to find and click the "About Us" link on the page.
        driver.findElement(By.xpath("//*[@id='about-link']")).click();

        //Print the title of the new page that open when the link is clicked.
        System.out.println("Current Page title is: "+driver.getTitle());

    }
}
