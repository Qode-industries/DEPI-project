package StepDefinitions;

import HooksPackage.Hooks;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Checkout_StepDef {
    CartPage cartpage;
    CheckoutPage checkoutpage;
    PaymentPage paymentpage;

    @Given("User clicks Proceed to Checkout")
    public void UserclicksProceedtoCheckout(){
        cartpage = new CartPage(Hooks.driver);
        Hooks.handleExternalAds();
        checkoutpage = cartpage.clickProceedToCheckout();
    }

    @When("User types a comment in checkout and click proceed to payment")
    public void userTypesACommentInCheckoutAndClickProceedToPayment() {
        checkoutpage.setComment("Comment");
        checkoutpage.clickPlaceOrder();
    }

    @Then("User directed to Payment page")
    public void userDirectedToPaymentPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), PaymentPage.site);
    }

    @When("User clicks Proceed to Payment")
    public void userClicksProceedToPayment() {
        paymentpage = checkoutpage.clickPlaceOrder();
    }
}
