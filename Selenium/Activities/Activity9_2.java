package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/selenium/selects");

        //Use findElement() to find the multi-select WebElement on the page.
        WebElement multiSelect=driver.findElement(By.id("multi-select"));

        //Create a new Select class object with the WebElement.
        Select select=new Select(multiSelect);

        //Check if the HTML element is a multi-list. Proceed with other actions if it is.
        if(select.isMultiple()) {

            //Select the 'JavaScript' option by visible text.
            select.selectByVisibleText("Javascript");

            //Select the 'NodeJS' option by value.
            select.selectByValue("node");

            //Select the 4th, 5th, and the 6th options by index.
            for(int i=4; i<=6; i++) {
                select.selectByIndex(i);
            }

            //Deselect the 'NodeJS' option by value attribute.
            select.deselectByValue("node");

            //Deselect the 7th option by index.
            select.deselectByIndex(7);

            //Print the first selected option.
            System.out.println(select.getFirstSelectedOption().getText());

            //Get all selected options
            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            Thread.sleep(3000);
            //Print all selected options
            System.out.println("All selected options  are: ");
            for(WebElement selectedOption : selectedOptions) {
                System.out.println(selectedOption.getText());
            }

            //Deselect all options
            select.deselectAll();
        }

        Thread.sleep(5000);
        driver.close();

    }
}
