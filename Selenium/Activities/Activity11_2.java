package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Use findElement() to find the button to open a CONFIRM alert and click it.
        driver.findElement(By.cssSelector("#confirm")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        Alert alert=driver.switchTo().alert();
        System.out.println("Confirm Alertbox text is: "+alert.getText());
        //Close the alert once with alert.accept() and again with alert.dismiss()
        //alert.accept();
        alert.dismiss();

        //Finally, close() the browser.
        Thread.sleep(5000);
        driver.close();

    }
}
