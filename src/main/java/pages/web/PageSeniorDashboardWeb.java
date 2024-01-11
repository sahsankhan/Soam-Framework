package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSeniorDashboardWeb {

    private String schedulerTabCss = "div:nth-child(6) > button";
    private String wellnessSurveyTabCss = "div:nth-child(5) button";
    private String onboardingInfoTabDynamic = "div>div>div>div:nth-child(2)>button>span:nth-child(1)";

    public PageSeniorDashboardWeb(Page page) {
    }
    public WebElement getSchedulerTab() {
        return WebConnector.driver.findElement(By.cssSelector(schedulerTabCss));
    }
    public WebElement getWellnessSurveyTab() {
        return WebConnector.driver.findElement(By.cssSelector(wellnessSurveyTabCss));
    }
    public WebElement getSeniorDashTabs(String SeniorSubTabs) {
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(@class, 'MuiButtonBase-root') and contains(., '%s')]", SeniorSubTabs)));
    }
    public WebElement getSeniorPageTabs(String seniorPageTabsLocatorString) {
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", seniorPageTabsLocatorString)));
    }
    public WebElement getSeniorPageH3Headings(String seniorPageNameHeadingLocatorString) {
        return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", seniorPageNameHeadingLocatorString)));
    }
}
