package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.util.Objects;

public class PageAddSeniorWeb {

    private String firstNameXpath = "//*[@id=\"First Name\"]" ;
    private String firstNameCss = "#First\\ Name";
    private String lastNameXpath = "//*[@id=\"Last Name\"]";
    private String lastNameCSS = "#Last\\ Name";
    private String mobileNumberXpath = "//*[@id=\"Mobile Phone\"]";
    private String mobileNumberCSS = "#Mobile\\ Phone";
    private String genderSelectDropdownCss = "#mui-component-select-gender";
//    private String SelectMaleButtonXpath = "//*[@id="menu-gender"]/div[3]/ul/li[2]";
    private String selectMaleButtonCss = "li:nth-child(2)";
    private String seniorDateOfBirthXpath = "/html/body/div[1]/div[1]/div/div/div[3]/div/form[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div[1]/div/div/input";
//private String AddSeniorDateOfBirthCss = "#mui-57";
    private String seniorEmailCss = "#Email";
    private String seniorAddressCss = "#Street\\ Address";
//    private String stateSelectDropDownCss = "#mui-component-select-address\\.state";
    private String stateSelectDropDownXpath = "//*[@id=\"mui-component-select-address.state\"]";
    private String stateColoradoButtonXpath = "//*[@id=\"menu-address.state\"]/div[3]/ul/li[8]";
    private String seniorCityCss = "#City";
    private String seniorZipcodeCss = "#Zip\\ code";
    private String createAccountButtonXpath = "//*[@id=\"tabpanel-0\"]/div/form[1]/div[2]/button";
    private String accountCreatedSuccessAlertCss = "div > div.MuiAlert-message.css-1xsto0d";
    public PageAddSeniorWeb(Page page) {

    }

    public WebElement getAddUserPageInputboxes(String addUserPageInputboxLocatorString) {
        if(Objects.equals(addUserPageInputboxLocatorString, "MM/DD/YYYY")) {
            {return  WebConnector.driver.findElement(By.cssSelector(String.format("input[placeholder='%s']", addUserPageInputboxLocatorString)));}
        }
        else
        {return  WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", addUserPageInputboxLocatorString)));}
    }
    public WebElement getAddUserDropdowns(String addUserDropdownLocatorString) {
        {return  WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", addUserDropdownLocatorString)));}
    }
    public WebElement getAddUserDropdownOptions(String addUserDropdownOptionLocatorString) {
        {return  WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", addUserDropdownOptionLocatorString)));}
    }
    public WebElement getAddUserButtons(String addUserButtonLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", addUserButtonLocatorString))); }
    }
    public WebElement getAccountCreatedSuccessAlert(String addUserSuccessAlertLocatorString) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, 'MuiAlert-message') and contains(., '%s')]", addUserSuccessAlertLocatorString))); }
    }
}