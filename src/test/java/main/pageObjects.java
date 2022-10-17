package main;

import environment.EnvironmentManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjects {
    private static WebDriver webDriver=EnvironmentManager.initWebDriver();

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.xpath("//button[@class='radius']");
    By flashAlert=By.id("flash");

    public WebElement getUsername() {
        return webDriver.findElement(username);
    }
    public WebElement getPassword() {
        return webDriver.findElement(password);
    }
    public WebElement getLogIn() {
        return webDriver.findElement(loginBtn);
    }
    public String getError() {
        return webDriver.findElement(flashAlert).getText();
    }
    public String getUrl(){
        return webDriver.getCurrentUrl();
    }
}


