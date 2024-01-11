package pages.android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class WelcomePage {

    private String continueButton_XPATH = "//android.view.ViewGroup[@content-desc=\"WelcomeScreen:OnContinueButton:oncontinuebutton\"]";
    public WelcomePage(Page page) {
    }

     public WebElement getContinueButton() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(continueButton_XPATH));
     }
}
