package packageprt;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class testnglistenersImpl extends testnglisteners {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTeststart listener");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

       System.out.println("onTestsuccess listener");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        super.onFinish(context);
    }
}
