package pages.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageMainWeb {

    private String loggedOutSuccessMessageCss = ".css-1ozswge > div";
    public PageMainWeb(Page page) {
    }


    public WebElement getLoggedOutSuccessMessage(String mainPageLoggedOutSuccessMessageLocatorString1, String mainPageLoggedOutSuccessMessageLocatorString2) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s') and contains(., '%s')]", mainPageLoggedOutSuccessMessageLocatorString1, mainPageLoggedOutSuccessMessageLocatorString2)));}
    }
}
