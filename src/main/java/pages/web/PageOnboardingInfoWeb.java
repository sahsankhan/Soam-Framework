package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageOnboardingInfoWeb {

    private String profileInfoHeadingXpath= "//*[@id=\"tabpanel-0\"]/div/div[1]/span";
    private String providerInfoSubTabCss = "#tab-1";
    private String providerInfoHeadingXpath = "//*[@id=\"tabpanel-1\"]/div/div[1]/span";
    private String medicalInfoSubTabCss = "#tab-2";

    public PageOnboardingInfoWeb(Page page) {
    }

    public WebElement getOnboardingInfoSubtabHeadings(String onboardingInfoSubtabHeadingLocatorInput) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", onboardingInfoSubtabHeadingLocatorInput)));}
    }
    public WebElement getOnboardingInfoSubTabs(String onboardingInfoSubTabs) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", onboardingInfoSubTabs)));}
    }
    public WebElement getProviderInfoHeading() {
        { return WebConnector.driver.findElement(By.xpath(providerInfoHeadingXpath));}
    }
    public WebElement getMedicalInfoSubTab() {
        { return WebConnector.driver.findElement(By.cssSelector(medicalInfoSubTabCss));}
    }
}
