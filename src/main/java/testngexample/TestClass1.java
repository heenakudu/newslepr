package testngexample;

import org.testng.annotations.*;

public class TestClass1 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: TestClass1 setup.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: TestClass1 cleanup.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Preparing test case in TestClass1.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Cleaning up after test case in TestClass1.");
    }
    @BeforeTest
    public void test3() {
        System.out.println("beforetest.");
    }
    @Test
    @Parameters ({"val1", "val2"})
    public void Sum(@Optional("3") int v1,@Optional("7") int v2) {
        int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
    }
    @AfterTest
    public void test4() {
        System.out.println("aftertest");
    }
    @Test
    public void test1() {
        System.out.println("Running test1 in TestClass1.");
    }

    @Test
    public void test2() {
        System.out.println("Running test2 in TestClass1.");
    }
}
