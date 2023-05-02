package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/drag-drop");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Find the ball and simulate a click and drag to move it into "Dropzone 1".
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));

        //wait.until(ExpectedConditions.pre)


        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        Actions action=new Actions(driver);
        action.dragAndDrop(ball,drop1).build().perform();


        //Verify that the ball has entered Dropzone 1.
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");

        //Once verified, move the ball into "Dropzone 2".
        action.dragAndDrop(ball, drop2).build().perform();

        //Verify that the ball has entered Dropzone 2.

        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");

        //Finally, close the browser.
        Thread.sleep(5000);
        driver.close();

    }
}
