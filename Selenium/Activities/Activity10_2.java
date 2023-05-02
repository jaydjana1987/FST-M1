package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args) throws InterruptedException {
        WebElement cubeVal;
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/input-events");

        //Get the title of the page using driver.getTitle() and print out the title.
        String title=driver.getTitle();
        System.out.println("The title of the page is: "+title);

        //Press the key of your first name in caps
        Actions action = new Actions(driver);
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        action.sendKeys("J").build().perform();
        System.out.println("Pressed key is: " + pressedKey.getText());

        //Press CTRL+a and the CTRL+c to copy all the text on the page.(Paste the text in a text editor to verify results.)
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println("Pressed key is: " + pressedKey.getText());



        //Finally, close the browser.
        Thread.sleep(5000);
        driver.close();

    }
}
