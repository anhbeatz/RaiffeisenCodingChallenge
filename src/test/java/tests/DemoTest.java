package tests;

import environment.EnvironmentManager;
import main.pageObjects;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DemoTest extends EnvironmentManager{

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }


    @Test
    public void testCase1(){
        //wrong username and password
        pageObjects po = new pageObjects();
        goTo();
        po.getUsername().sendKeys("username");
        po.getPassword().sendKeys("password");
        po.getLogIn().click();
        assertEquals(url,po.getUrl());

    }
    @Test
    public void testCase2(){
        pageObjects po = new pageObjects();
        goTo();
        po.getUsername().sendKeys("tomsmith");
        po.getPassword().sendKeys("SuperSecretPassword!");
        po.getLogIn().click();
        assertTrue(po.getUrl().contains("secure"));
    }
    @Test
    public void testCase3(){
        pageObjects po = new pageObjects();
        goTo();
        po.getUsername().sendKeys("username");
        po.getPassword().sendKeys("SuperSecretPassword!");
        po.getLogIn().click();
        assertTrue(po.getError().contains("Your username is invalid!"));
    }

    @AfterAll
    public static void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
}
