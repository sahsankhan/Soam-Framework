package pages.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageLoginWeb {

    private String emailID = "email" ;
    private String passwordID= "password";
    private String loginButtonCss= "form > button";
    private String forgotPasswordCss = "h6 > a";
    private String loggedOutSuccessAlertXpath = "//*[@id=\"root\"]/div[1]";

    public PageLoginWeb(Page page) {
    }

    public WebElement getLoginPageInputbox(String loginPageInputboxLocatorString) {
        {return  WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", loginPageInputboxLocatorString))); }
    }
    public WebElement getLoginPageButtons(String loginPageButtonLocatorString) {
        {return  WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", loginPageButtonLocatorString))); }
    }

    public WebElement getLoginPageForgotPassword() {
        { return WebConnector.driver.findElement(By.cssSelector(forgotPasswordCss));}
    }
    public WebElement getUserLoggedOutSuccessAlert() { return WebConnector.driver.findElement(By.xpath(loggedOutSuccessAlertXpath));}
}