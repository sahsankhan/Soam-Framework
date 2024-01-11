package pages.android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class LoginPage {

    private String emailAddressXpath = "//android.widget.EditText[@content-desc=\"SignInScreen:EmailInput:email\"]";
    private String emailAddressID = "SignInScreen:EmailInput:email";
    private String passwordXpath = "//android.widget.EditText[@content-desc=\"SignInScreen:PasswordInput:password\"]";
    private String loginButtonXpath = "//android.view.ViewGroup[@content-desc=\"SignInScreen:SignInButton:signinbutton\"]";
    private String forgotPasswordButtonXpath = "//android.widget.TextView[@content-desc=\"SignInScreen:ForgotPasswordText:forgotpasswordtext\"]";

    public LoginPage(Page page) {
    }

     public WebElement getEmailAddress() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(emailAddressXpath));
     }

    public WebElement getPassword() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(passwordXpath));
    }

    public WebElement getLoginButton() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(loginButtonXpath));
    }
    public WebElement getforgotPasswordButton() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(forgotPasswordButtonXpath));
    }
}
