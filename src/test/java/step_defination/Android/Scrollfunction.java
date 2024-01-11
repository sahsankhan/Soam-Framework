package step_defination.Android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.Dimension;
import pages.Page;

public class Scrollfunction extends Page {
    public static void scrollDown() {



        //The viewing size of the device
        Dimension size = AndroidDriverSetup.getAndroidDriver().manage().window().getSize();

        //x position set to mid-screen horizontally
        int width = size.width / 2;

        //Starting y location set to 80% of the height (near bottom)
        int startPoint = (int) (size.getHeight() * 0.80);

        //Ending y location set to 20% of the height (near top)
        int endPoint = (int) (size.getHeight() * 0.20);

        //new TouchAction().press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();

    }
}
