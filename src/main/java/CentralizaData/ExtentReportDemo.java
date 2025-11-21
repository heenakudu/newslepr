package CentralizaData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
    ExtentReports extent; // Global variable

    @BeforeTest
    public void config() {
        // Path to the report
        String path = System.getProperty("user.dir") + "\\reports\\index.html";

        // Initialize the ExtentSparkReporter
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        // Initialize ExtentReports and attach the reporter
        extent = new ExtentReports(); // Use the global extent variable
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Heena Kudu");
    }

    @Test
    public void Demo() {
        // Create a test in the report
        //ExtentTest test = extent.createTest("InitialDemo");
ExtentTest test= extent.createTest("Initial Demo");
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        test.log(Status.INFO,"Getting title");
        String title = driver.getTitle();
        test.pass("Navigated to the page with title: " + title);

        // Close the browser
        driver.quit();

        // Finalize the report
        extent.flush();
    }
}
