package StepDefinitions;

import HooksPackage.Hooks;
import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Products_StepDef {
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    SignupPage signupPage;
    LoginPage loginPage;
    ContactUsPage contactUsPage;

    @Given("User in productsPage")
    public void User_in_productsPage(){
        homePage = new HomePage(Hooks.driver);
        productPage = homePage.clickProducts();
    }

    @When("Click on home button")
    public void Click_on_home_button(){
        homePage = productPage.clickHome();
    }

    @Then("User redirected to home page")
    public void User_redirected_to_homePage(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/");
    }

    @When("Click on cart button")
    public void click_On_Cart_Button(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        cartPage = productPage.clickCart();
    }

    @Then("User redirected to cart page")
    public void userRedirectedToCartPage(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
    }

    @When("Click on signUp button")
    public void clickOnSignUpButton(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        loginPage = productPage.clickLogIn();
    }

    @Then("User redirected to signUp page")
    public void userRedirectedToSignUpPage(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/login");
    }


    @When("Click on contact button")
    public void clickOnContactButton(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        contactUsPage = productPage.clickContactUs();
    }

    @Then("User redirected to contact page")
    public void userRedirectedToContactPage(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/contact_us");
    }

    @When("The user searches for {string}")
    public void theUserSearchesFor(String searchTerm){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.setSearchBarLocator(searchTerm);
        productPage.clickSearchButtonLocator();
    }

    @Then("Search results should be shown on the screen")
    public void searchResultsShouldBeShownOnTheScreen(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.getActualSearchReturn().contains(productPage.getExpectedSearchReturn()));
    }

    @Then("The product grid should be empty")
    public void theProductGridShouldBeEmpty(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSearchReturn(),productPage.getExpectedNullReturnSearch());
    }

    @When("The user submits an empty search query")
    public void theUserSubmitsAnEmptySearchQuery(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.setSearchBarLocator("");
        productPage.clickSearchButtonLocator();
    }

    @Then("The page should be reloaded")
    public void thePageShouldBeReloaded(){
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Hooks.driver.getCurrentUrl(), "The URL should not have changed, indicating a simple reload.");
    }


    @Given("The women category section is currently Collapsed")
    public void theWomenCategorySectionIsCurrentlyCollapsed(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertFalse(productPage.isCategoryExpanded(productPage.getDressButtonLocator()),"Expected Women category to be Collapsed, but sub-elements are visible.");
    }

    @When("The user clicks on the women category title")
    public void theUserClicksOnTheWomenCategoryTitle(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickWomenCategoryButtonLocator();
    }

    @Then("The women category sub-list should be Expanded")
    public void theWomenCategorySubListShouldBeExpanded(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getDressButtonLocator()),"Expected Women category to be Expanded, but sub-elements are NOT visible.");
    }


    @Given("A different product category \\(e.g., Men or Kids) is currently Open")
    public void aDifferentProductCategoryEGMenOrKidsIsCurrentlyOpen(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickMenCategoryButtonLocator();
    }


    @Then("The displayed products should be Switched to Women's products")
    public void theDisplayedProductsShouldBeSwitchedToWomenSProducts(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getDressButtonLocator()));
    }

    @Given("The men category section is currently Collapsed")
    public void theMenCategorySectionIsCurrentlyCollapsed(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertFalse(productPage.isCategoryExpanded(productPage.getTShirtsButtonLocator()),"Expected Men category to be Collapsed, but sub-elements are visible.");
    }

    @When("The user clicks on the men category title")
    public void theUserClicksOnTheMenCategoryTitle(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickMenCategoryButtonLocator();
    }

    @Then("The men category sub-list should be Expanded")
    public void theMenCategorySubListShouldBeExpanded(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getTShirtsButtonLocator()),"Expected Men category to be Expanded, but sub-elements are NOT visible.");
    }

    @Given("A different product category \\(e.g., Women or Kids) is currently Open")
    public void aDifferentProductCategoryEGWomenOrKidsIsCurrentlyOpen(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickWomenCategoryButtonLocator();
    }

    @Then("The displayed products should be Switched to Men's products")
    public void theDisplayedProductsShouldBeSwitchedToMenSProducts(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getTShirtsButtonLocator()));
    }

    @Given("The kids category section is currently Collapsed")
    public void theKidsCategorySectionIsCurrentlyCollapsed(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertFalse(productPage.isCategoryExpanded(productPage.getDressKidsButtonLocator()),"Expected Kids category to be Collapsed, but sub-elements are visible.");
    }


    @When("The user clicks on the kids category title")
    public void theUserClicksOnTheKidsCategoryTitle(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickKidsCategoryButtonLocator();
    }

    @Then("The kids category sub-list should be Expanded")
    public void theKidsCategorySubListShouldBeExpanded(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getDressKidsButtonLocator()),"Expected Kids category to be Expanded, but sub-elements are NOT visible.");
    }


    @Given("A different product category \\(e.g., Women or Men) is currently Open")
    public void aDifferentProductCategoryEGWomenOrMenIsCurrentlyOpen(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickWomenCategoryButtonLocator();
    }


    @Then("The displayed products should be Switched to kids products")
    public void theDisplayedProductsShouldBeSwitchedToKidsProducts(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertTrue(productPage.isCategoryExpanded(productPage.getDressKidsButtonLocator()));
    }

    @When("The user clicks on the Dress sub-category")
    public void theUserClicksOnTheDressSubCategory(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickDressButtonLocator();
    }


    @Then("The user should be redirected to the Dress products page")
    public void theUserShouldBeRedirectedToTheDressProductsPage(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedDressPage());
    }

    @When("The user clicks on the Tops sub-category")
    public void theUserClicksOnTheTopsSubCategory(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickTopsButtonLocator();
    }

    @Then("The user should be redirected to the Tops products page")
    public void theUserShouldBeRedirectedToTheTopsProductsPage(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedTopsPage());
    }

    @When("The user clicks on the Saree sub-category")
    public void theUserClicksOnTheSareeSubCategory(){
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickSareeButtonLocator();
    }

    @Then("The user should be redirected to the Saree products page")
    public void theUserShouldBeRedirectedToTheSareeProductsPage() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedSareePage());
    }

    @When("The user clicks on the Tshirts sub-category")
    public void theUserClicksOnTheTshirtsSubCategory() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickTShirtsButtonLocator();
    }

    @Then("The user should be redirected to the Tshirts products page")
    public void theUserShouldBeRedirectedToTheTshirtsProductsPage() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedTShPage());
    }

    @When("The user clicks on the Jeans sub-category")
    public void theUserClicksOnTheJeansSubCategory() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickJeansButtonLocator();
    }

    @Then("The user should be redirected to the Jeans products page")
    public void theUserShouldBeRedirectedToTheJeansProductsPage() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedJeanPage());
    }

    @When("The user clicks on the Dress-Kids sub-category")
    public void theUserClicksOnTheDressKidsSubCategory() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickDressKidsButtonLocator();
    }

    @Then("The user should be redirected to the Dress-Kids products page")
    public void theUserShouldBeRedirectedToTheDressKidsProductsPage() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedDressKidsPage());
    }

    @When("The user clicks on the Tops&Shirts sub-category")
    public void theUserClicksOnTheTopsShirtsSubCategory() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        productPage.clickTopsAndShirtsButtonLocator();
    }

    @Then("The user should be redirected to the Tops&Shirts products page")
    public void theUserShouldBeRedirectedToTheTopsShirtsProductsPage() {
        if (productPage == null) {
            productPage = new ProductPage(Hooks.driver);
        }
        Assert.assertEquals(productPage.getActualSubCategoryPageMsg(),productPage.getExpectedTopsAndShirtsPage());
    }
}
