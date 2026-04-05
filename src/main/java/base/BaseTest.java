package base;

import com.aventstack.extentreports.ExtentReports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;
import utils.ExtentManager;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;

    @BeforeSuite
    public void startReport() {
        extent = ExtentManager.setup();
    }

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void endReport() {
        extent.flush();
    }
    public String takeScreenshot(String testName) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/reports/" + testName + ".png";

        try {
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}