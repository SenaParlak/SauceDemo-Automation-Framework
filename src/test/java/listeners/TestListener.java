package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ScreenshotUtils;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtils.takeScreenshot(result.getName());


    }
}
