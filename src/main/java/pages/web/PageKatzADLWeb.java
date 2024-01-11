package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.util.List;

import static core.utils.BrowerConfig.WebConnector.driver;

public class PageKatzADLWeb {

    public PageKatzADLWeb(Page page){
    }

    public WebElement getKatzADLHeadings(String headingsLocatorString){
        return driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", headingsLocatorString)));
    }
    public WebElement getKatzADLOptionsRadioButtons(String radioButtonsLocatorString){
        return driver.findElement(By.cssSelector(String.format("span[datatestid='%s']", radioButtonsLocatorString)));
    }
    public WebElement getKatzADLButtons(String buttonsLocatorString){
        return driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonsLocatorString)));
    }
    public WebElement getKatzADLSuccessAlert(String successAlertLocatorString){
        return driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertLocatorString)));
    }
    public WebElement getKatzADLCloseIcon(){
        return driver.findElement(By.cssSelector(String.format("path[d='M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")));
    }
    public void getKatzADLViewLink() {
        List<WebElement> elements = driver.findElements(By.xpath("//td[contains(., 'View')]"));
        System.out.println("Number of elements: " + elements.size());
        elements.get(0).click();
    }
}