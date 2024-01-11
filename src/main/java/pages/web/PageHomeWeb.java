package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String welcomeHeading = "h2:nth-child(1)";
    private String homeTabCss = "div:nth-child(1) > p > a" ;
    private String profileDropdownCss =  "header div:nth-child(4) div div";
    private String logoutButtonCss = "nav > div:nth-child(2)";
    private String seniorListSearchTextboxCss = "form > div > input";
    private String topSeniorAfterSearchCss = "tbody > tr:nth-child(1) > td:nth-child(3)";

    public PageHomeWeb(Page page) {
    }

    public WebElement getHomePageTabs(String homePageTabLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//p[contains(., '%s')]", homePageTabLocatorString)));}
    }
    public WebElement getWelcomeHeading(String h2HeadingLocatorString) {
        {return  WebConnector.driver.findElement(By.xpath(String.format("//h2[contains(., '%s')]", h2HeadingLocatorString)));}
    }
    public WebElement getHomePageProfileDropdownHome() {
        {return WebConnector.driver.findElement(By.cssSelector(profileDropdownCss)); }
    }
    public WebElement getHomePageProfileDropdownButtons(String homePageProfileDropdownButtonsLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//h6[contains(., '%s')]", homePageProfileDropdownButtonsLocatorString)));}
    }

    public WebElement getSeniorNameInSearchTextbox() {
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[type='text']")));}
    }
    public WebElement getTopSeniorAfterSearch(String seniorInList) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//td[contains(@class, 'MuiTableCell-root') and contains(., '%s')]", seniorInList)));}
    }
}
