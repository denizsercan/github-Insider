package Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

    static WebDriver driver;

    public  static WebDriver getDriver(){

        if(driver == null){
            String browser = ConfReader.getProperty("browser");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }

    public  static void closeDriver(){

        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    }

