package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;

import java.io.IOException;

public class Activity2 extends DriverIntilizer {


    @BeforeTest
    public void setup() {
        initialization();

    }

    @Test
    public void body() throws IOException {
        //Get the url of the header image.
        WebElement headerimage = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        String headerurl = headerimage.getAttribute("src");
        //Print the url to the console.
        System.out.println("Header image url is: " + headerurl);

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
