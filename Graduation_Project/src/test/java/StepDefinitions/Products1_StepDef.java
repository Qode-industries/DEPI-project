package StepDefinitions;

import HooksPackage.Hooks;
import Pages.ProductPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Products1_StepDef {

    ProductPage productpage = new ProductPage(Hooks.driver);



    @Given("User is on the Products page")
    public void VerifyNavigatingtoaPoloBrand(){
       productpage.clickProducts();
    }



    @When("User clicks on the Polo brand in the Sidebar")
    public void UserclicksonthePolobrandintheSidebar(){
        productpage.clickPoloButtonLocator();
    }


    @Then("The page header displays BRAND - POLO PRODUCTS")
    public void ThepageheaderdisplaysBRANDPOLOPRODUCTS(String expectedHeader){
            String actualHeader = productpage.getHeaderBrand(expectedHeader);
            Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);

        }






    @When("User clicks on the HandM brand in the Sidebar")
    public void UserclicksontheHandMbrandintheSidebar(){
        productpage.clickHAndMButtonLocator();
    }

    @Then("The page header displays BRAND - HandM PRODUCTS")
    public void ThepageheaderdisplaysBRANDHandMPRODUCTS(String expectedHeader){
        String actualHeader = productpage.getHeaderBrand(expectedHeader);
        Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);

    }

@When("User clicks on the Madame brand in the Sidebar")
public void UserclicksontheMadamebrandintheSidebar(){
        productpage.clickMadameButtonLocator();
}

@Then("The page header displays BRAND - Madame PRODUCTS")
    public void ThepageheaderdisplaysBRANDMadamePRODUCTS(String expectedHeader){

    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);
}

@When("User clicks on the MastAndHarbour brand in the Sidebar")
    public void UserclicksontheMastAndHarbourbrandintheSidebar(){
        productpage.clickMastAndHarbourButtonLocator();
}
@Then("The page header displays BRAND - MastAndHarbour PRODUCTS")
    public void ThepageheaderdisplaysBRANDMastAndHarbourPRODUCTS(String expectedHeader){
    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);
}

@When("User clicks on the Babyhug brand in the Sidebar")
    public void UserclicksontheBabyhugbrandintheSidebar(){
        productpage.clickBabyhugButtonLocator();
}
@Then("The page header displays BRAND - Babyhug PRODUCTS")
    public void ThepageheaderdisplaysBRANDBabyhugPRODUCTS(String expectedHeader){
    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);

}

@When("User clicks on the AllenSollyJunior brand in the Sidebar")
    public void UserclicksontheAllenSollyJuniorbrandintheSidebar(){
productpage.clickAllenSollyJuniorButtonLocator();
}

@Then("The page header displays BRAND - AllenSollyJunior PRODUCTS")
public void ThepageHeaderdisplaysBRANDAllenSollyJuniorPRODUCTS(String expectedHeader) {
    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);
}


@When("User clicks on the KookieKids brand in the Sidebar")
    public void UserclicksontheKookieKidsbrandintheSidebar(){
        productpage.clickKookieKidsButtonLocator();
}

@Then("The page header displays BRAND - KookieKids PRODUCTS")
public void ThepageheaderdisplaysBRANDKookieKidsPRODUCTS(String expectedHeader){
    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);
}

@When("User clicks on the Biba brand in the Sidebar")
    public void UserclicksontheBibabrandintheSidebar(){
        productpage.clickBibaButtonLocator();
}

@Then("The page header displays BRAND - Biba PRODUCTS")
    public void ThepageheaderdisplaysBRANDBibaPRODUCTS(String expectedHeader){
    String actualHeader = productpage.getHeaderBrand(expectedHeader);
    Assert.assertEquals("Header text mismatch", expectedHeader, actualHeader);
}




@Given("User is on the All Products page")
public void UserisontheAllProductspage(){
    ProductPage productPage = productpage.clickProducts();

}

@When("User hovers over the first product and clicks the Add to cart button")
    public void UserhoversoverthefirstproductandclickstheAddtocartbutton(int productindex){
    productpage.clickAddToCartButtonLocator(productindex);
}

    @Then("A message is displayed with the title Added")
    public void AmessageisdisplayedwiththetitleAdded(String expectedPhrase){

        String actual = productpage.ViewMessageAdded(expectedPhrase);
   Assert.assertEquals("text mismatch", expectedPhrase, actual);
    }




    }

















