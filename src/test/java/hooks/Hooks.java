package hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node;
import utilities.ExtentReportManager;
import utilities.ScreenshotUtils;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        DriverManager.getDriver();
        ExtentReportManager.createReport();
        ExtentReportManager.createTest(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtils.takeScreenshot(scenario.getName());
            ExtentReportManager.fail("Scenario failed. Screenshot attached.");
            ExtentReportManager.addScreenshot(screenshotPath);
        }
        else {
            ExtentReportManager.pass("Scenario completed successfully");
        }
        ExtentReportManager.flush();

        DriverManager.quitDriver();
    }
}