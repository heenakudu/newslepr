package testngexample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestClass2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Setting up TestClass2.");
    }

    @Test(groups = {"regression"})
    public void regressionTest() {
        System.out.println("Running regression test in TestClass2.");
    }

    @Test(groups = {"sanity"})
    @Parameters("username")
    public void parameterizedTest(String username) {
        System.out.println("Running parameterized test with username: " + username);
    }
}
