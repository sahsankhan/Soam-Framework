package step_defination.Android;

import core.utils.AndroidCore.CapabilitiesGenerator;
import core.utils.BrowerConfig.WebConnector;
import core.utils.BsApiHelper;
import core.utils.BsDeviceHelper;
import core.utils.BsLocalHelper;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Collection;

import static core.utils.AndroidCore.AndroidDriverSetup.*;
import static core.utils.AndroidCore.AppiumServerRunner.StartAppiumServer;
import static pages.Page.myProp;

public class AndroidSetup {
    public WebDriver driver = WebConnector.driver;
    public static String PLATFORM_NAME = myProp.getProperty("platformname").toLowerCase();
    public static String PORT = myProp.getProperty("appiumport");
    public static String appDir = System.getProperty("user.dir") + "/APK/";


    @BeforeAll
    public static void beforeSuite() {
        if (isBrowserStack) {
            BsLocalHelper.enableLocalTesting();
            BsDeviceHelper.collectDeviceList();

            // If you want to upload apps you can use the uploadApp method with app location path and custom id
            CapabilitiesGenerator.App = BsApiHelper.uploadApp(appDir + "vim-stage.apk", "app_latest");
            System.out.println("TESTING");

            // If you have already uploaded the apps then just use the app url to get the app id
//            CapabilitiesGenerator.App = BsApiHelper.getRecentApp("app_latest");
        }
    }

    @Before
    public void BeforeLogging(Scenario scenario) throws IOException {
//        System.out.println("/*****************************************************************************************************/");
//        System.out.println("/*****************************************************************************************************/");
//        System.out.println("Starting - " + scenario.getName());
//        System.out.println("/*****************************************************************************************************/");
//        System.out.println("Scenario Id :  - " + scenario.getId());
//        System.out.println("/*****************************************************************************************************/");
//        System.out.println("Scenario Tags :  - " + scenario.getSourceTagNames());
//        System.out.println("/*****************************************************************************************************/");

        Collection<String> tags = scenario.getSourceTagNames();
        CapabilitiesGenerator.scenario.set(scenario);
        CapabilitiesGenerator.tags.set(tags);

        switch (PLATFORM_NAME) {
            case "android":
                if (tags.contains("@android")) {
                    if (!isBrowserStack)
                        StartAppiumServer(PORT);
                        androidDriver(PORT);
                }
                break;
            case "ios":
                if (tags.contains("@ios")) {
                    if (!isBrowserStack)
                        StartAppiumServer(PORT);
                    // iosDriver(PORT, APP);   // This method needs to be updated to run the iOS tests.
                }
                break;
            case "web":
                if (tags.contains("@web")) {
                    driver = new WebConnector().openBrowser();
                    driver.get(myProp.getProperty("weburl"));
                    driver.manage().window().maximize();
                }
                break;

            default:
                throw new IllegalStateException("Please enter valid OS platform.");
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        switch (PLATFORM_NAME) {
            case "android":
                if (isBrowserStack && getAndroidDriver() != null) {
                    BsApiHelper.updateTestStatus(scenario, getAndroidDriver().getSessionId());
                    getAndroidDriver().quit();
                } else if (CapabilitiesGenerator.tags.get().contains("@final")) {
                    quitAndroidDriver();
                }
                break;
            case "web":
                if (WebConnector.driver != null) {
                    WebConnector.driver.quit();
                }
                break;
            default:
                throw new IllegalStateException("Please enter valid OS platform.");
        }
    }

    @AfterAll
    public static void afterSuite() {
        if (isBrowserStack) {
            BsLocalHelper.disableLocalTesting();
        }
    }


//    @After
//    public  void after(Scenario scenario) throws IOException {
//        System.out.println("/------------------------------------------------------------------------------------------------------/");
//        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
//        if (scenario.isFailed()) {
//            String rootDirectoryPath = System.getProperty("user.dir");
//            String directoryName = rootDirectoryPath+"/Images/"+ LocalDate.now().toString()+"/";
//            File directory = new File(directoryName);
//            if(!directory.exists())
//            {
//                directory.mkdir();
//            }
//            File screenshot = ((TakesScreenshot) AndroidDriverSetup.GetDriverWithNoReset()).getScreenshotAs(OutputType.FILE);
//
//            String filename= DateTime.now().toString()+scenario.getName()+scenario.getSourceTagNames();
//            String filePath = directory+"/"+ LocalTime.now().toString().replaceAll(":","")+scenario.getName()+".jpg";
//            File targetFile=new File(directory+"/"+ LocalTime.now().toString().replaceAll(":","")+scenario.getName()+".jpg");
//            FileUtils.copyFile(screenshot,targetFile);
//            Path content = Paths.get(filePath);
//            try (InputStream is = Files.newInputStream(content)) {
//                Allure.addAttachment("Failure",is);
//            }
//        }
//        System.out.println("/------------------------------------------------------------------------------------------------------/");
//        AndroidDriverSetup.GetDriverWithNoReset().hideKeyboard();
//    }


//    @When("^Install previous version of Foree App.$")
//    public void installPreviousForeeApp() throws InterruptedException, IOException {
//        String previousApp = "previousApk";
//        AndroidDriverSetup.StartDriverWithNoReset(UDID,PLATFORM_VERSION,PORT,previousApp);
//        AndroidDriverSetup.GetDriverWithNoReset().findElement(By.xpath("//*[@text='Foree Server Logging']")).click();
//        AndroidDriverSetup.GetDriverWithNoReset().findElement(By.id("android:id/button1")).click();
//    }


}
