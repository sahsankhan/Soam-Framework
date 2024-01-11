package step_defination.web;

//import core.utils.AndroidCore.AndroidDriverSetup;

import core.utils.AndroidCore.Initializer;
import core.utils.BrowerConfig.WebConnector;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

import java.io.IOException;

import static core.utils.BrowerConfig.WebConnector.driver;

public class MainPage extends Page {

    @Before("@Web")
    public void startTest() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Web")) {
            WebConnector connector = new WebConnector();
            driver = connector.openBrowser();
            driver.get(myProp.getProperty("weburl"));
            driver.manage().window().maximize();
        }
    }
    @After("@Web")
    public void afterTest() {
        if (myProp.getProperty("platformname").toString().equals("Web")) {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @When("^\\[Main Page] User go the web portal and navigate to the login page$")
    public static void webBrowser() {
        System.out.println("Vimient Web Page");
    }
    @Then("^\\[Main Page] User sees (.*) message at bottom$")
    public void userShouldSeeMainPageLoggedOutSuccessMessage(String mainPageLoggedOutSuccessMessageLocatorString2) throws InterruptedException {
        Thread.sleep(2000);
        String mainPageLoggedOutSuccessMessageLocatorString1 = "MuiAlert-message";
        Assert.assertTrue(getPageMainWeb().getLoggedOutSuccessMessage(mainPageLoggedOutSuccessMessageLocatorString1, mainPageLoggedOutSuccessMessageLocatorString2).isDisplayed());
    }



//    ("[Main Page] User sees user logged out successfully message at bottom")
}

//main page user logged out successfully message Xpath = "//*[@id="root"]/div[1]/div"