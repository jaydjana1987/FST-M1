package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/input-events");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Left click and print the value of the side in the front.

        WebElement cube= driver.findElement(By.id("wrapD3Cube"));
        Actions action=new Actions(driver);

        action.click(cube).build().perform();
        Thread.sleep(1000);
        cubeVal = driver.findElement(By.className("active"));
        Thread.sleep(1000);
        System.out.println("The value of the side in front after click is: "+cubeVal.getText());

        //Double click to show a random side and print the number.
        action.doubleClick(cube).build().perform();
        Thread.sleep(1000);
        cubeVal = driver.findElement(By.className("active"));
        Thread.sleep(1000);
        System.out.println("The value of the side in front after Doubleclick is: "+cubeVal.getText());

        //Right click and print the value shown on the front of the cube.

        action.contextClick(cube).build().perform();
        Thread.sleep(1000);
        cubeVal = driver.findElement(By.className("active"));
        Thread.sleep(1000);
        System.out.println("The value of the side in front after RIghtClick is: "+cubeVal.getText());

        //Finally, close the browser.
        Thread.sleep(5000);
        driver.close();

    }
}
