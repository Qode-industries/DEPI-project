package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LoginPage1 {
    WebDriver driver;

    public LoginPage1(WebDriver driver) {
        this.driver = driver;
    }

    By loginEmail = By.cssSelector("input[data-qa='login-email']");
    By loginPass = By.cssSelector("input[data-qa='login-password']");
    By loginBtn = By.cssSelector("button[data-qa='login-button']");

    By signupName = By.cssSelector("input[data-qa='signup-name']");
    By signupEmail = By.cssSelector("input[data-qa='signup-email']");
    By signupBtn = By.cssSelector("button[data-qa='signup-button']");


    By loginError = By.xpath("//form[@action='/login']/p[@style='color: red;']");
    By signupError = By.xpath("//form[@action='/signup']/p[@style='color: red;']");


    public void performLogin(String email, String password) {
        driver.findElement(loginEmail).sendKeys(email);
        driver.findElement(loginPass).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public void performSignup(String name, String email) {
        driver.findElement(signupName).sendKeys(name);
        driver.findElement(signupEmail).sendKeys(email);
        driver.findElement(signupBtn).click();
    }

    public void clickLoginOnly() {
        driver.findElement(loginBtn).click();
    }

    public void clickSignupOnly() {
        driver.findElement(signupBtn).click();
    }

    public String getVisibleErrorMessage() {
        List<WebElement> logErr = driver.findElements(loginError);
        if (!logErr.isEmpty() && logErr.get(0).isDisplayed()) return logErr.get(0).getText();

        List<WebElement> signErr = driver.findElements(signupError);
        if (!signErr.isEmpty() && signErr.get(0).isDisplayed()) return signErr.get(0).getText();

        return "";
    }
}