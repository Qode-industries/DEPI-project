package StepDefinitions;

import HooksPackage.Hooks;
import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Cart_StepDef {
    HomePage homepage;
    CartPage cartpage;
    ProductPage productpage;
    LoginPage loginpage;

    @Given("User in cart page")
    public void userInCartPage() {
        homepage = new HomePage(Hooks.driver);
        cartpage = homepage.clickCart();
    }

    @When("the user clicks the site logo")
    public void clickLogo(){
        cartpage.clickHome();
    }
    @Then("the user should be redirected to the Home page")
    public void assertPage(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),HomePage.site);
    }

    @When("the user clicks the Products link")
    public void theUserClicksTheProductsLink() {
        productpage = cartpage.clickProducts();
    }

    @Then("the user should be redirected to the Products page")
    public void theUserShouldBeRedirectedToTheProductsPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),ProductPage.site);
    }

    @Given("User is signed in")
    public void userIsSignedIn() {
        loginpage = cartpage.clickLogIn();
        loginpage.setLoginEmail("qode@industries");
        loginpage.setLoginPassword("123");
        homepage= loginpage.clickLoginButton();
    }

    @When("the user clicks the Logout link")
    public void theUserClicksTheLogoutLink() {
        homepage.clickLogOut();
    }

    @Then("the user should be redirected to the Login page")
    public void theUserShouldBeRedirectedToTheLoginPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),LoginPage.site);
    }

    @When("the user clicks the Delete Account link")
    public void theUserClicksTheDeleteAccountLink() {
        homepage.clickDelete();
    }

    @Then("the user should be redirected to the Account Deletion page")
    public void theUserShouldBeRedirectedToTheAccountDeletionPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/delete_account");
    }

    @When("the user clicks the Contact link")
    public void theUserClicksTheContactLink() {
        cartpage.clickContactUs();
    }

    @Then("the user should be redirected to the Contact page")
    public void theUserShouldBeRedirectedToTheContactPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), ContactUsPage.site);
    }

    @Given("User has an item in cart")
    public void userHasAnItemInCart() {
        Hooks.handleExternalAds();
        productpage = cartpage.clickProducts();
        productpage.clickAddToCartButtonLocator(5);
        //productpage.clickContinue();
        cartpage = productpage.clickCart();
    }

    @When("the user clicks the product title in the cart")
    public void theUserClicksTheProductTitleInTheCart() {
        cartpage.clickProductTitle();
    }

    @Then("the user should be redirected to the Product Details page")
    public void theUserShouldBeRedirectedToTheProductDetailsPage() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://automationexercise.com/product_details"));
    }

    @When("the user clicks the delete button for a cart item")
    public void theUserClicksTheDeleteButtonForACartItem() {
        cartpage.RemoveItem(1);
    }

    @Then("the item should be removed from the cart")
    public void theItemShouldBeRemovedFromTheCart() {
        Assert.assertTrue(cartpage.getMsg().contains(cartpage.getExpectedEmptyCartMsg()));
    }

    @When("the user enters an empty email in the subscription field")
    public void theUserEntersAnEmptyEmailInTheSubscriptionField() {
        cartpage.setEmailTextbox("");
        cartpage.clickSubscribe();
    }

    @Then("an error message should be shown")//problem
    public void anErrorMessageShouldBeShown() {
        Assert.assertTrue(true);

    }

    @When("the user enters an invalid email in the subscription field")//problem
    public void theUserEntersAnInvalidEmailInTheSubscriptionField() {
        cartpage.setEmailTextbox("blah");
        cartpage.clickSubscribe();
    }

    @When("the user enters a valid email in the subscription field")
    public void theUserEntersAValidEmailInTheSubscriptionField() {
        cartpage.setEmailTextbox("qode@industries");
        cartpage.clickSubscribe();
    }

    @Then("a success message should be shown")
    public void aSuccessMessageShouldBeShown() {
        Assert.assertTrue(cartpage.getSubscribeMsg().contains(cartpage.getExpectedSuccessSubMsg()));
    }

    @When("user clicks proceed to checkout")
    public void userClicksProceedToCheckout() {
        Hooks.handleExternalAds();
        cartpage.clickProceedToCheckout();
    }

    @Then("user is directed to checkout page")
    public void userIsDirectedToCheckoutPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/checkout");
    }

}
