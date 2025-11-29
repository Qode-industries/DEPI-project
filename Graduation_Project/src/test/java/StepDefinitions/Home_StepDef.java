package StepDefinitions;

import HooksPackage.Hooks;
import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Home_StepDef {
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    SignupPage signupPage;
    LoginPage loginPage;
    ContactUsPage contactUsPage;
    WebElement initialActiveSlide;

    @Given("User is on homePage")
    public void User_is_on_homePage(){
        homePage = new HomePage(Hooks.driver);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/");
    }

    @When("User clicks on products button")
    public void userClicksOnProductsButton(){
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        productPage = homePage.clickProducts();
    }

    @Then("User should be redirected to products page")
    public void userShouldBeRedirectedToProductsPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/products");
    }

    @When("User clicks on cart button")
    public void userClicksOnCartButton() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        cartPage = homePage.clickCart();
    }

    @Then("User should be redirected to cart page")
    public void userShouldBeRedirectedToCartPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
    }

    @When("User clicks on signUp button")
    public void userClicksOnSignUpButton() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        loginPage = homePage.clickLogIn();
    }

    @Then("User should be redirected to signUp page")
    public void userShouldBeRedirectedToSignUpPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/login");
    }

    @When("User clicks on contact button")
    public void userClicksOnContactButton() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        contactUsPage = homePage.clickContactUs();
    }

    @Then("User should be redirected to contact page")
    public void userShouldBeRedirectedToContactPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/contact_us");
    }

    @Given("The women category section is currently Collapsed on home page")
    public void theWomenCategorySectionIsCurrentlyCollapsedOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickWomenCategoryButtonLocator();
    }

    @Given("A different product category \\(e.g., Men or Kids) is currently Open on home page")
    public void aDifferentProductCategoryEGMenOrKidsIsCurrentlyOpenOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickMenCategoryButtonLocator();
    }

    @Given("The men category section is currently Collapsed on home page")
    public void theMenCategorySectionIsCurrentlyCollapsedOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickMenCategoryButtonLocator();
    }

    @Given("A different product category \\(e.g., Women or Kids) is currently Open on home page")
    public void aDifferentProductCategoryEGWomenOrKidsIsCurrentlyOpenOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickWomenCategoryButtonLocator();
    }

    @Given("The kids category section is currently Collapsed on home page")
    public void theKidsCategorySectionIsCurrentlyCollapsedOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickKidsCategoryButtonLocator();
    }

    @Given("A different product category \\(e.g., Women or Men) is currently Open on home page")
    public void aDifferentProductCategoryEGWomenOrMenIsCurrentlyOpenOnHomePage() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickWomenCategoryButtonLocator();
    }


    @When("the user clicks the Right Arrow \\(>) once")
    public void theUserClicksTheRightArrowOnce() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        initialActiveSlide = homePage.getCurrentActiveSlideElement();
        homePage.clickRightSliderControl();
    }

    @Then("the Carousel should move to the next slide")
    public void theCarouselShouldMoveToTheNextSlide() {
        Assert.assertTrue(homePage.hasSliderMovedAfterClick(initialActiveSlide),
                "Slider failed to move to the next slide after clicking the Right Arrow.");
    }

    @When("the user clicks the Left Arrow \\(<) once")
    public void theUserClicksTheLeftArrowOnce() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        initialActiveSlide = homePage.getCurrentActiveSlideElement();
        homePage.clickLeftSliderControl();
    }

    @Then("the Carousel should move to the previous slide")
    public void theCarouselShouldMoveToThePreviousSlide() {
        Assert.assertTrue(homePage.hasSliderMovedAfterClick(initialActiveSlide),
                "Slider failed to move to the next slide after clicking the Right Arrow.");
    }

    @When("the user clicks the Test Cases button below the slider")
    public void theUserClicksTheTestCasesButtonBelowTheSlider() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickTestCasesButton();
    }

    @Then("the user should be successfully redirected to the Test Cases page")
    public void theUserShouldBeSuccessfullyRedirectedToTheTestCasesPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/test_cases");
    }

    @When("the user clicks the APIs List button below the slider")
    public void theUserClicksTheAPIsListButtonBelowTheSlider() {
        if (homePage == null) {
            homePage = new HomePage(Hooks.driver);
        }
        homePage.clickApiListButton();
    }

    @Then("the user should be successfully redirected to the API List page")
    public void theUserShouldBeSuccessfullyRedirectedToTheAPIListPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/api_list");
    }
}
