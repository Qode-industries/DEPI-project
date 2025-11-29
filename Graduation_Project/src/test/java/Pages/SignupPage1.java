package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage1 {
    WebDriver driver;

    public SignupPage1(WebDriver driver) {
        this.driver = driver;
    }

    By titleMr = By.id("id_gender1");
    By password = By.id("password");
    By day = By.id("days");
    By month = By.id("months");
    By year = By.id("years");

    By fName = By.id("first_name");
    By lName = By.id("last_name");
    By address = By.id("address1");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zip = By.id("zipcode");
    By mobile = By.id("mobile_number");

    By createBtn = By.cssSelector("button[data-qa='create-account']");
    By accountCreatedHeader = By.cssSelector("h2[data-qa='account-created']");



    public void fillAccountInformation() {
        driver.findElement(titleMr).click();
        driver.findElement(password).sendKeys("password123");

        new Select(driver.findElement(day)).selectByValue("1");
        new Select(driver.findElement(month)).selectByValue("1");
        new Select(driver.findElement(year)).selectByValue("2000");

        driver.findElement(fName).sendKeys("John");
        driver.findElement(lName).sendKeys("Doe");
        driver.findElement(address).sendKeys("123 Street");
        new Select(driver.findElement(country)).selectByValue("India");
        driver.findElement(state).sendKeys("State");
        driver.findElement(city).sendKeys("City");
        driver.findElement(zip).sendKeys("10001");
        driver.findElement(mobile).sendKeys("1234567890");
    }

    public void clickCreateAccount() {
        driver.findElement(createBtn).click();
    }

    public boolean isAccountCreatedVisible() {
        try {
            return driver.findElement(accountCreatedHeader).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}