package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        //Open a browser with https://www.training-support.net
        driver.get("https://www.training-support.net");

        //Close the browser with driver.close()
        driver.close();

    }
}
