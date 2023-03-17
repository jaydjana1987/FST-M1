package activities_Selenium_CRM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.DriverIntilizer;
import util.ConfigRead;

import java.io.IOException;

public class Activity1 extends DriverIntilizer {


    @BeforeTest
    public void setup() {
        //Open a browser.
        //Navigate to ‘http://alchemy.hguy.co/crm’.
        initialization();

    }

    @Test
    public void body() throws IOException {
        //Get the title of the website.
        String title = driver.getTitle();
        //Assert.assertEquals(title,"SuiteCRM","Title doesn't match expected value")
        System.out.println(title);
        //Make sure it matches “SuiteCRM” exactly.
        //If it matches, close the browser.
        if (title.equals("SuiteCRM")) {
            driver.close();
        }

    }


}
