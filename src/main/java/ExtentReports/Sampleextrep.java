package ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class Sampleextrep {
    @BeforeTest
    public void config() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter Reporter = new ExtentSparkReporter(path);
        Reporter.config().setReportName("Automation Reports");
        Reporter.config().setDocumentTitle("Test reports");
    }
}
