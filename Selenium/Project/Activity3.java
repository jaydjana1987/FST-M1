package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;

import java.io.IOException;

public class Activity3 extends DriverIntilizer {


    @BeforeTest
    public void setup() {
        initialization();

    }

    @Test
    public void body() throws IOException {
        //Get the url of the header image.
        WebElement footer = driver.findElement(By.id("admin_options"));
        String footertxt = footer.getText();
        System.out.println("The footer text is: " + footertxt);

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


}
