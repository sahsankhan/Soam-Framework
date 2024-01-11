package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import pages.Page;

import java.time.Duration;
import java.util.List;

//import static core.utils.AppiumHook.MobileConnector.driver;
//import static core.utils.Wait.WaitForElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {
    public static final int TIMEOUT = 30;
    public static final int defaultWait = 10;
    public static ThreadLocal<String> errorMsg = new ThreadLocal<>();

    public BasePage(Page page) {

    }

    public BasePage() {
    }

    public static int getOsVersion() {
        return Integer.parseInt(AndroidDriverSetup.getAndroidDriver().getCapabilities().getCapability("platformVersion").toString());
    }

    public static String getDeviceName() {
        return AndroidDriverSetup.getAndroidDriver().getCapabilities().getCapability("device").toString();
    }

    private Dimension getScreenSize() {
        return AndroidDriverSetup.getAndroidDriver().manage().window().getSize();
    }

    public void clickElementByCoordinate() {
        clickElementByCoordinate(540, 2135);
    }

    public void clickElementByCoordinate(int x, int y) {
        sleep(5);
        new TouchAction<>(AndroidDriverSetup.getAndroidDriver()).tap(PointOption.point(x, y)).perform();
    }

    public void swipeUp() {
        Dimension dimension = getScreenSize();
        double x = dimension.getWidth();
        double y = dimension.getHeight();
        moveTo(x / 2.0, y * 0.75, x / 2.0, y * 0.25);
    }

    public void patientlyScroll(String text) {
        patientlyScroll(By.xpath("//*[contains(@text, '" + text + "')]"));
    }

    public void patientlyScroll(By by) {
        int i;
        for (i = 0; i < 10; i++) {
            try {
                if (isElementPresent(by, 0))
                    break;
                else
                    swipeUp();
            } catch (Exception e) {
                swipeUp();
            }
        }
        if (i == 10) {
            errorMsg.set("Not found: " + by.toString());
            Assert.fail("Not found: " + by);
        }
    }

    public void swipeUp1() {
        Dimension dimension = getScreenSize();
        double x = dimension.getWidth();
        double y = dimension.getHeight();
        moveTo(x / 0, y * 1263, x / 720, y * 1360);
    }

    public void swipeDown() {
        Dimension dimension = getScreenSize();
        int x = dimension.getWidth();
        int y = dimension.getHeight();
        moveTo(x / 2.0, y * 0.50, x / 2.0, y * 0.75);
    }

    private void moveTo(double x1, double y1, double x2, double y2) {
        TouchAction<?> action = new TouchAction<>(AndroidDriverSetup.getAndroidDriver());
        action.press(PointOption.point((int) x1, (int) y1))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(800)))
                .moveTo(PointOption.point((int) x2, (int) y2))
                .release()
                .perform();
    }

    public void waitUntilLoading(String text) {
        waitUntilLoading(text, defaultWait);
    }

    public void waitUntilLoading(String text, int timeout) {
        try {
            getFluentWait(timeout).until(a -> AndroidDriverSetup.getAndroidDriver().getPageSource().contains(text));
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            Assert.fail(e.getLocalizedMessage());
        }
    }

    public void waitUntilLoading(By by) {
        waitUntilLoading(by, defaultWait);
    }

    public void waitUntilLoading(By by, int timeout) {
        try {
            getFluentWait(timeout).until(a -> AndroidDriverSetup.getAndroidDriver().findElements(by).size() > 0);
        } catch (Exception ignored) {
        }
    }

    public void waitUntilDisappear(String text) {
        waitUntilDisappear(text, defaultWait);
    }

    public void waitUntilDisappear(String text, int timeout) {
        try {
            getFluentWait(timeout).until(a -> !AndroidDriverSetup.getAndroidDriver().getPageSource().contains(text));
        } catch (Exception ignored) {
        }
    }

    public void waitUntilDisappear(By by) {
        waitUntilDisappear(by, defaultWait);
    }

    public void waitUntilDisappear(By by, int timeout) {
        try {
            getFluentWait(timeout).until(a -> AndroidDriverSetup.getAndroidDriver().findElements(by).size() == 0);
        } catch (Exception ignored) {
        }
    }

    public WebElement waitForElementEnabled(By by) {
        return waitForElementEnabled(by, TIMEOUT);
    }

    public WebElement waitForElementEnabled(By by, int timeout) {
        try {
            getFluentWait(timeout)
                    .withMessage("\n" + by.toString() + "\n")
                    .until(a -> AndroidDriverSetup.getAndroidDriver().findElement(by).isEnabled());
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
        }
        return AndroidDriverSetup.getAndroidDriver().findElement(by);
    }


    public WebElement waitForElement(By by) {
        return waitForElement(by, TIMEOUT);
    }

    public WebElement waitForElement(By by, int timeout) {
        try {
            getFluentWait(timeout)
                    .withMessage("\n" + by.toString() + "\n")
                    .until(a -> AndroidDriverSetup.getAndroidDriver().findElement(by).isDisplayed());
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            Assert.fail(e.getLocalizedMessage());
        }
        return AndroidDriverSetup.getAndroidDriver().findElement(by);
    }

    public List<AndroidElement> waitForElementList(By by) {
        return waitForElementList(by, TIMEOUT);
    }

    public List<AndroidElement> waitForElementList(By by, int timeout) {
        try {
            getFluentWait(timeout)
                    .withMessage("\n" + by.toString() + "\n")
                    .until(a -> AndroidDriverSetup.getAndroidDriver().findElements(by).size() > 0);
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            Assert.fail(e.getLocalizedMessage());
        }
        return AndroidDriverSetup.getAndroidDriver().findElements(by);
    }

    public WebElement waitForElement(WebElement element) {
        return waitForElement(element, TIMEOUT);
    }

    public WebElement waitForElement(WebElement element, int timeout) {
        try {
            getFluentWait(timeout)
                    .withMessage("\n" + element.toString() + "\n")
                    .until(a -> element.isDisplayed());
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            Assert.fail(e.getLocalizedMessage());
        }
        return element;
    }

    public List<AndroidElement> waitForElementList(List<AndroidElement> elements) {
        return waitForElementList(elements, TIMEOUT);
    }

    public List<AndroidElement> waitForElementList(List<AndroidElement> elements, int timeout) {
        try {
            getFluentWait(timeout)
                    .withMessage("\n" + elements.toString() + "\n")
                    .until(a -> elements.size() > 0);
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            Assert.fail(e.getLocalizedMessage());
        }
        return elements;
    }

    public FluentWait<String> getFluentWait(int timeout) {
        return new FluentWait<>("")
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public boolean isElementPresent(By locator) {
        return isElementPresent(locator, defaultWait);
    }

    public boolean isElementPresent(By locator, int timeout) {
        try {
            return getFluentWait(timeout).until(a -> AndroidDriverSetup.getAndroidDriver().findElements(locator).size() > 0);
        } catch (Exception e) {
            errorMsg.set(e.getLocalizedMessage());
            return false;
        }
    }

    public void setNumericNumber(String keys) {
        for (char s : keys.toCharArray()) {
            switch (s) {
                case '0':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                    break;
                case '1':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    break;
                case '2':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                    break;
                case '3':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                    break;
                case '4':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                    break;
                case '5':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                    break;
                case '6':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                    break;
                case '7':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                    break;
                case '8':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                    break;
                case '9':
                    AndroidDriverSetup.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_9));
                    break;
                default:
                    throw new UnsupportedOperationException("Error! Only numeric number are supported.");
            }
        }
    }

    public void sleep(int seconds) {
        sleepInMillis(1000L * seconds);
    }

    protected void sleepInMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
