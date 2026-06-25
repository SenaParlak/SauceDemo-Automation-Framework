package pages;

import driver.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;

import java.time.Duration;

public class BasePage {

    protected WebDriverWait wait;

    public BasePage() {

        PageFactory.initElements(DriverManager.getDriver(), this);

        wait = new WebDriverWait(
                DriverManager.getDriver(), Duration.ofSeconds(
                        Integer.parseInt(ConfigurationReader.getProperty("timeout"))));

    }
}
