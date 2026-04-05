package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import ai.DataGenerator;
import utils.ExtentManager;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin_valid() {

        ExtentManager.test = extent.createTest("Valid Login Test");

        LoginPage loginPage = new LoginPage(driver);

        String email = DataGenerator.getEmail();
        String password = DataGenerator.getPassword();

        loginPage.login(email, password, false); // valid

        ExtentManager.test.pass("Valid login executed");
    }

    @Test
    public void testLogin_invalidLocator() {

        ExtentManager.test = extent.createTest("Invalid Locator Test");

        try {
            LoginPage loginPage = new LoginPage(driver);

            String email = DataGenerator.getEmail();
            String password = DataGenerator.getPassword();

            loginPage.login(email, password, true); // invalid

        } catch (Exception e) {

            String aiResponse = ai.BugAnalyzer.analyze(e.getMessage());
            String path = takeScreenshot("InvalidLocatorFailure");
            
            ExtentManager.test.fail("Test failed due to wrong locator");
            ExtentManager.test.fail("AI Analysis: " + aiResponse);
            ExtentManager.test.addScreenCaptureFromPath(path);

            throw e;
        }
    }
}