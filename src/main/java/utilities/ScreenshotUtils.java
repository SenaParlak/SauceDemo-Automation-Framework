package utilities;

import driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.nio.file.Files;


public class ScreenshotUtils {

    public static String takeScreenshot(String testName) {

        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();

        File source =  ts.getScreenshotAs(OutputType.FILE);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");

        String timestamp = LocalDateTime.now().format(formatter);

        String fileName = testName + "_" + timestamp + ".png";



        File folder = new File("screenshots");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        File destination = new File(folder, fileName);

            try {
                Files.copy(source.toPath(), destination.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        return destination.getAbsolutePath();
    }
}
