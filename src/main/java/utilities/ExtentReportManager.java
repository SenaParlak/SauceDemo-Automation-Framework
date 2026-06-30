package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.Locale;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports createReport(){

        Locale.setDefault(Locale.ENGLISH);

        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void pass(String message) {
        test.pass(message);
    }

    public static void fail(String message) {
        test.fail(message);
    }

    public static void flush() {
        extent.flush();
    }

    public static void addScreenshot(String screenshotPath) {
        try {
            test.addScreenCaptureFromPath(screenshotPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
