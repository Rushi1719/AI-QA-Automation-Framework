package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");

    // VALID locator
    By validLoginBtn = By.id("submit");

    // INVALID locator
    By invalidLoginBtn = By.id("wrong-id");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass, boolean useInvalid) {

        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);

        if (useInvalid) {
            driver.findElement(invalidLoginBtn).click();
        } else {
            driver.findElement(validLoginBtn).click();
        }
    }
}