package environment;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {

    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.webDriver = webDriver;
    }
}
