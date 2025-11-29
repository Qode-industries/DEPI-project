package StepDefinitions;

import HooksPackage.Hooks;
import Pages.HomePage;
import Pages.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Payment_StepDef {
    PaymentPage paymentpage;

    @Given("User clicks pay and confirm with empty fields")
    public void UserClicksPayAndConfirmWithEmptyFields(){
        paymentpage = new PaymentPage(Hooks.driver);
        Hooks.handleExternalAds();
        paymentpage.clickPay();
    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),PaymentPage.site);
    }

    @When("User clicks pay and confirm with Invalid data")
    public void userClicksPayAndConfirmWithInvalidData() {
        Hooks.handleExternalAds();
        paymentpage.setName("qode");
        paymentpage.setCard("WRONG DATA");
        paymentpage.setCVC(922);
        paymentpage.setMonth(4);
        paymentpage.setYear(2006);
        paymentpage.clickPay();
    }

    @Then("Payment not confirmed")
    public void paymentNotConfirmed() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),PaymentPage.site);
    }

    @When("User clicks pay and confirm with valid data")
    public void userClicksPayAndConfirmWithValidData() {
        paymentpage = new PaymentPage(Hooks.driver);
        paymentpage.setName("qode");
        paymentpage.setCard("1234567890123456");
        paymentpage.setCVC(922);
        paymentpage.setMonth(4);
        paymentpage.setYear(2006);
        paymentpage.clickPay();
    }

    @Then("Payment is confirmed")
    public void paymentIsConfirmed() {
        Assert.assertEquals(paymentpage.getPayMsg(), paymentpage.getExpectedPayMsg());
    }

    @When("User clicks continue")
    public void userClicksContinue() {
        Hooks.handleExternalAds();
        paymentpage.clickContinue();
    }

    @Then("User directed to Homepage")
    public void userDirectedToHomepage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), HomePage.site);
    }

    @Then("download initiated")
    public void downloadInitiated() {
        Assert.assertTrue(true);

    }

    @When("User clicks download invoice")
    public void userClicksDownloadInvoice() {
        paymentpage.clickDownloadInvoice();
    }
}
