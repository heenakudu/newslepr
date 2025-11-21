package testngexample;

import org.testng.annotations.*;

public class SuiteConfigTests {
@Parameters({"URL"})
    @BeforeSuite
    public void beforeSuite(String urlname) {

    System.out.println(urlname);
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Cleaning up global resources.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Preparing test environment.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Resetting test environment.");
    }
}
