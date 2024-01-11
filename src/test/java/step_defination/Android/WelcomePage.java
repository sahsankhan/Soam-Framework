package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Page;

public class WelcomePage extends Page {


    @And("^\\[Welcome Page] User clicks on continue button$")
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        getPageWelcomeAndroid().getContinueButton().click();
    }

    @And("^\\[Welcome Page] Welcome page should open successfully$")
    public void test() {
        System.out.println("Welcome Page Open Successfully");
    }
}