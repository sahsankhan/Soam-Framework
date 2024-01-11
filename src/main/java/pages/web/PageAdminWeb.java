package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAdminWeb {

    private String homeTabCss = "div:nth-child(2) > p a";
    private String adminTabCss = "div:nth-child(1) > p > a";
    private String toDoHeading = "div:nth-child(1) > h2";
    private String profileDropdownCss =  "header div:nth-child(4) div div";
    private String logoutButtonCss = "nav > div:nth-child(2)";
    private String addUserCss = "div:nth-child(3) > p > a";

    public PageAdminWeb(Page page) {
    }
    public WebElement getAdminPageTabs(String adminPageTabLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//p[contains(., '%s')]", adminPageTabLocatorString))); }
    }
//    public WebElement getHomeTab(String adminPageTabs) {
//        { return  WebConnector.driver.findElement(By.xpath(String.format("//a[contains(., '%s')]", adminPageTabs))); }
//    }
    public WebElement getAdminPageHeadings(String adminPageHeadingLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//h2[contains(., '%s')]", adminPageHeadingLocatorString))); }
    }
    public WebElement getAdminPageProfileDropdown() {
        {return WebConnector.driver.findElement(By.cssSelector(profileDropdownCss)); }
    }
    public WebElement getAdminPageProfileDropdownButtons(String adminPageProfileDropdownButtonsLocatorString) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//h6[contains(., '%s')]", adminPageProfileDropdownButtonsLocatorString))); }
    }
    public WebElement getAddUserTab() { return WebConnector.driver.findElement(By.cssSelector(addUserCss)); }
    public WebElement getAdminPageTabs() { return WebConnector.driver.findElement(By.cssSelector(adminTabCss)); }
}
