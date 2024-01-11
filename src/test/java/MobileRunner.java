import com.aventstack.extentreports.ExtentReports;
import core.utils.EmailSender.EmailUtil;
//import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/vimient/android/"},
        glue = {"src/test/java/step_defination"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:Reports/cucumber-report/Cucumber.json"},
        monochrome = true,
        tags = "@LoginAndroid")

public class MobileRunner {

    @BeforeClass
    public static void PathFolderCreation() {
        DateFormat timeFormat = new SimpleDateFormat("HH.mm.ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
        ExtentReports extent;
        String Path = "./ExtentReport.html";
        System.out.println(Path);
        extent = new ExtentReports();

    }

    @AfterClass
    public static void ExtentXmlReader() throws IOException, InterruptedException {
        EmailUtil.Email();
    }

}