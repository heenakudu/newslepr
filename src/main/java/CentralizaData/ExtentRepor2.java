package CentralizaData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentRepor2 {
    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;
    @BeforeTest
    public void config() {
        String path=System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
        Reporter.config().setDocumentTitle("Automation Doc");
        Reporter.config().setReportName("Report 1");
        extent=new ExtentReports();
        extent.attachReporter(Reporter);
        extent.setSystemInfo("Tester","Heena kudu");
    }

    @Test
    public void Getdetails(){

        ExtentTest test= extent.createTest("START");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        test.log(Status.INFO,"Getting a title");
        test.log(Status.PASS, "Login test passed");
        test.log(Status.FAIL, "Test failed ");
        driver.getTitle();
        extent.flush();


    }

}
