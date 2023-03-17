package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverIntilizer {

    public static WebDriver driver;
    public static Properties prop;
    static String currentpath = System.getProperty("user.dir");

    public DriverIntilizer() {


        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    currentpath + "\\src\\main\\resources\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void initialization() {

        String browsername = prop.getProperty("Browser");
        if (browsername.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            driver = new ChromeDriver();
            //driver.get(prop.getProperty("URL"));

        } else if (browsername.equals("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));

        }


    }
