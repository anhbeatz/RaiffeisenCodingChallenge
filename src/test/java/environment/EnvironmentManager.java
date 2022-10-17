package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static environment.RunEnvironment.webDriver;

public class EnvironmentManager {
public static String url="https://the-internet.herokuapp.com/login";
static final String driverPath = System.getProperty("user.dir") + "/src/test/java/environment/chromedriver";
    public static WebDriver initWebDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        RunEnvironment.setWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    public void goTo(){
        webDriver.get(url);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }
}
