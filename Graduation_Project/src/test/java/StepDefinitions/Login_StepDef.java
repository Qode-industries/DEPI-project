package StepDefinitions;

import HooksPackage.Hooks;
import Pages.LoginPage1;
import Pages.SignupPage;
import Pages.SignupPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login_StepDef {

    WebDriver driver;
    LoginPage1 loginPage;
    SignupPage1 signupPage;

    public Login_StepDef() {
        this.driver = Hooks.driver;
        this.loginPage = new LoginPage1(driver);
        this.signupPage = new SignupPage1(driver);
    }

    private String generateEmail() {
        return "user" + System.currentTimeMillis() + "@test.com";
    }

    @Given("the user is on the {string} page")
    public void navToPage(String page) {
        String url = "https://automationexercise.com/login";

        if (page.equals("Enter Account Information")) {
            driver.get(url);
            loginPage.performSignup("PreUser", generateEmail());
        } else {
            driver.get(url);
        }
    }

    @When("the user leaves the login fields empty and clicks the {string} button")
    public void emptyLogin(String btn) {
        loginPage.clickLoginOnly();
    }

    @When("the user enters an invalid email format and clicks the {string} button")
    public void invalidFormatLogin(String btn) {
        loginPage.performLogin("invalid_email", "pass");
    }

    @When("the user enters incorrect credentials and clicks the {string} button")
    public void invalidCredsLogin(String btn) {
        loginPage.performLogin("wrong@user.com", "wrongpass");
    }

    @When("the user enters valid credentials and clicks the {string} button")
    public void validLogin(String btn) {
        loginPage.performLogin("user@usertesting.com", "test");
    }

    @When("the user leaves the signup fields empty and clicks the {string} button")
    public void emptySignup(String btn) {
        loginPage.clickSignupOnly();
    }

    @When("the user enters an invalid email format in the signup form and clicks the {string} button")
    public void invalidFormatSignup(String btn) {
        loginPage.performSignup("User", "invalid_email");
    }

    @When("the user submits an existing email address via the {string} button")
    public void existingEmailSignup(String btn) {
        loginPage.performSignup("User", "user@usertesting.com");
    }

    @When("the user submits valid new registration details via the {string} button")
    public void validSignup(String btn) {
        loginPage.performSignup("NewUser", generateEmail());
    }

    @When("the user leaves mandatory fields empty and clicks the {string} button")
    public void emptyAccountFields(String btn) {
        signupPage.clickCreateAccount();
    }

    @When("the user fills all mandatory fields and clicks the {string} button")
    public void fillAccountFields(String btn) {
        signupPage.fillAccountInformation();
        signupPage.clickCreateAccount();
    }

    @Then("the system should display a validation error {string}")
    public void checkBrowserValidation(String msg) {
        WebElement activeElement = driver.switchTo().activeElement();
        String validationMessage = activeElement.getAttribute("validationMessage");
        Assert.assertTrue(validationMessage.length() > 0, "Browser validation not found!");
    }

    @Then("the system should display a validation error {string} on the missing input")
    public void checkBrowserValidationSpecific(String msg) {
        checkBrowserValidation(msg);
    }

    @Then("the system should display the error message {string}")
    public void checkPageErrorMessage(String expected) {
        Assert.assertEquals(loginPage.getVisibleErrorMessage(), expected);
    }

    @Then("the user should be redirected to the Homepage with the username visible")
    public void verifyHomeRedirect() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
    }

    @Then("the user should be redirected to the {string} page")
    public void verifySignupPage(String page) {
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
    }

    @Then("the user should be redirected to the {string} success page")
    public void verifyAccountCreated(String page) {
        Assert.assertTrue(signupPage.isAccountCreatedVisible());
    }
}