package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.util.Objects;

public class PageForgotPasswordWeb {

    private String crossButtonXpath = "/html/body/div[2]/div[3]/div/div[1]";

    public PageForgotPasswordWeb(Page page) {
    }

    public WebElement getEnterRecoveryEmail() {
        return  WebConnector.driver.findElement(By.cssSelector("input[name='email']"));
    }
    public WebElement getResetPasswordButton(String forgotPasswordButtonLocatorString) {
        return  WebConnector.driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public WebElement getForgotPasswordH1Heading(String forgotPasswordPageHeadingLocatorString) {
        if(Objects.equals(forgotPasswordPageHeadingLocatorString, "Enter One Time Password")){
                return  WebConnector.driver.findElement(By.xpath(String.format("//label[contains(., '%s')]", forgotPasswordPageHeadingLocatorString)));
        }
        else
            return  WebConnector.driver.findElement(By.xpath(String.format("//h1[contains(., '%s')]", forgotPasswordPageHeadingLocatorString)));
    }
    public WebElement getForgotPasswordSuccessAlert(String forgotPasswordPageSuccessAlertLocatorString) {
        return  WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", forgotPasswordPageSuccessAlertLocatorString)));
    }
    public WebElement getResetPasswordSuccessAlertCrossButton() {
        return  WebConnector.driver.findElement(By.xpath(crossButtonXpath));
    }
    public WebElement getForgotPasswordInputbox(String forgotPasswordPageInputboxLocatorString) {
        return  WebConnector.driver.findElement(By.cssSelector(String.format("input[placeholder='%s']", forgotPasswordPageInputboxLocatorString)));
    }
}