package Pages;

import HooksPackage.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class ProductPage {
    WebDriver driver;
    public static String site = "https://automationexercise.com/products";
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    By HomeLocator = By.cssSelector("a[href='/']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/login']");
    By LogOutLocator = By.cssSelector("a[href='/logout']");
    By DeleteLocator = By.cssSelector("a[href='/delete_account']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");

    By EmailTextbox = By.id("subscribe_email");
    By SubscribeButtonLocator = By.id("subscribe");
    //    Specifically, the product page
    //    Search_Section
    By SearchBarLocator = By.id("search_product");
    By SearchButtonLocator = By.id("submit_search");
    //    Category_Section
    By WomenCategoryButtonLocator = By.cssSelector("a[href='#Women']");
    By DressButtonLocator = By.cssSelector("a[href='/category_products/1']");
    By TopsButtonLocator = By.cssSelector("a[href='/category_products/2']");
    By SareeButtonLocator = By.cssSelector("a[href='/category_products/7']");
    By MenCategoryButtonLocator = By.cssSelector("a[href='#Men']");
    By TShirtsButtonLocator = By.cssSelector("a[href='/category_products/3']");
    By JeansButtonLocator = By.cssSelector("a[href='/category_products/6']");
    By KidsCategoryButtonLocator = By.cssSelector("a[href='#Kids']");
    By DressKidsButtonLocator = By.cssSelector("a[href='/category_products/4']");
    By TopsAndShirtsButtonLocator = By.cssSelector("a[href='/category_products/5']");
    //    Brands_Section
    By PoloButtonLocator = By.cssSelector("a[href='/brand_products/Polo']");
    By HAndMButtonLocator = By.cssSelector("a[href='/brand_products/H&M']");
    By MadameButtonLocator = By.cssSelector("a[href='/brand_products/Madame']");
    By MastAndHarbourButtonLocator = By.cssSelector("a[href='/brand_products/Mast & Harbour']");
    By BabyhugButtonLocator = By.cssSelector("a[href='/brand_products/Babyhug']");
    By AllenSollyJuniorButtonLocator = By.cssSelector("a[href='/brand_products/Allen Solly Junior']");
    By KookieKidsButtonLocator = By.cssSelector("a[href='/brand_products/KooKie Kids']");
    By BibaButtonLocator = By.cssSelector("a[href='/brand_products/Biba']");
    //    AddToCart
    By AddToCartButtonLocator = By.className("btn-default");
    public By getViewProductButtonLocator(int productId){
        return By.cssSelector("a[href='/product_details/" + productId + "']");
    }
    //    ScrollUp
    By ScrollUpButtonLocator = By.cssSelector("a[href='#top']");
    By actualSubCategoryPageMsg = By.cssSelector("h2.title.text-center");
    String expectedDressPage = "WOMEN - DRESS PRODUCTS";
    String expectedTopsPage = "WOMEN - TOPS PRODUCTS";
    String expectedSareePage = "WOMEN - SAREE PRODUCTS";
    String expectedTShPage = "MEN - TSHIRTS PRODUCTS";
    String expectedJeanPage = "MEN - JEANS PRODUCTS";
    String expectedDressKidsPage = "KIDS - DRESS PRODUCTS";
    String expectedTopsAndShirtsPage = "KIDS - TOPS & SHIRTS PRODUCTS";
    String expectedSearchReturn = "Dress";
    String expectedNullReturnSearch = "No results found on the screen";

    public String getActualSubCategoryPageMsg() {
        return driver.findElement(actualSubCategoryPageMsg).getText();
    }

    public String getExpectedDressPage() {
        return expectedDressPage;
    }

    public String getExpectedTopsPage() {
        return expectedTopsPage;
    }

    public String getExpectedSareePage() {
        return expectedSareePage;
    }

    public String getExpectedTShPage() {
        return expectedTShPage;
    }

    public String getExpectedJeanPage() {
        return expectedJeanPage;
    }

    public String getExpectedDressKidsPage() {
        return expectedDressKidsPage;
    }

    public String getExpectedTopsAndShirtsPage() {
        return expectedTopsAndShirtsPage;
    }

    public By getDressButtonLocator(){
        return DressButtonLocator;
    }
    public By getTShirtsButtonLocator(){
        return TShirtsButtonLocator;
    }
    public By getDressKidsButtonLocator(){
        return DressKidsButtonLocator;
    }

    public boolean isCategoryExpanded(By subCategoryLocator) {
        try {
            return driver.findElement(subCategoryLocator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public String getExpectedSearchReturn(){
        return expectedSearchReturn;
    }
    public String getActualSearchReturn(){
        List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='productinfo text-center']/p"));
        if (productNames.isEmpty()) {
            return "No results found on the screen";
        } else {
            return productNames.get(0).getText();
        }
    }
    public String getExpectedNullReturnSearch(){
        return expectedNullReturnSearch;
    }




    public HomePage clickHome(){
        driver.findElement(HomeLocator).click();
        return new HomePage(driver);
    }
    public CartPage clickCart(){
        driver.findElement(CartLocator).click();
        return new CartPage(driver);
    }
    public LoginPage clickLogIn(){
        driver.findElement(LogInLocator).click();
        return new LoginPage(driver);
    }
    public ContactUsPage clickContactUs() {
        driver.findElement(ContactUsLocator).click();
        return new ContactUsPage(driver);
    }
    public void clickLogOut(){
        driver.findElement(LogOutLocator).click();
    }
    public void clickDelete(){
        driver.findElement(DeleteLocator).click();
    }
    public void setEmailTextbox(String email) {
        driver.findElement(EmailTextbox).sendKeys(email);
    }
    public void clickSubscribe(){
        driver.findElement(SubscribeButtonLocator).click();
    }
    public void setSearchBarLocator(String text){
        driver.findElement(SearchBarLocator).sendKeys(text);
    }
    public void clickSearchButtonLocator(){
        driver.findElement(SearchButtonLocator).click();
    }
    public void clickWomenCategoryButtonLocator(){
        driver.findElement(WomenCategoryButtonLocator).click();
    }
    public void clickDressButtonLocator(){
        driver.findElement(DressButtonLocator).click();
    }
    public void clickTopsButtonLocator(){
        driver.findElement(TopsButtonLocator).click();
    }
    public void clickSareeButtonLocator(){
        driver.findElement(SareeButtonLocator).click();
    }
    public void clickMenCategoryButtonLocator(){
        driver.findElement(MenCategoryButtonLocator).click();
    }
    public void clickTShirtsButtonLocator(){
        driver.findElement(TShirtsButtonLocator).click();
    }
    public void clickJeansButtonLocator(){
        driver.findElement(JeansButtonLocator).click();
    }
    public void clickKidsCategoryButtonLocator(){
        driver.findElement(KidsCategoryButtonLocator).click();
    }
    public void clickDressKidsButtonLocator(){
        driver.findElement(DressKidsButtonLocator).click();
    }
    public void clickTopsAndShirtsButtonLocator(){
        driver.findElement(TopsAndShirtsButtonLocator).click();
    }
    public void clickPoloButtonLocator(){
        driver.findElement(PoloButtonLocator).click();
    }
    public void clickHAndMButtonLocator(){
        driver.findElement(HAndMButtonLocator).click();
    }
    public void clickMadameButtonLocator(){
        driver.findElement(MadameButtonLocator).click();
    }
    public void clickMastAndHarbourButtonLocator(){
        driver.findElement(MastAndHarbourButtonLocator).click();
    }
    public void clickBabyhugButtonLocator(){
        driver.findElement(BabyhugButtonLocator).click();
    }
    public void clickAllenSollyJuniorButtonLocator(){
        driver.findElement(AllenSollyJuniorButtonLocator).click();
    }
    public void clickKookieKidsButtonLocator(){
        driver.findElement(KookieKidsButtonLocator).click();
    }
    public void clickBibaButtonLocator(){
        driver.findElement(BibaButtonLocator).click();
    }
    public void clickAddToCartButtonLocator(int index){
        List<WebElement> addToCartButton =  driver.findElements(AddToCartButtonLocator);
        addToCartButton.get(index).click();
    }
    public void clickViewProductButtonLocator(int productID){
        driver.findElement(getViewProductButtonLocator(productID)).click();
    }
    public void clickScrollUpButtonLocator(){
        driver.findElement(ScrollUpButtonLocator).click();
    }
//    public void clickContinue(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonLocator));
//        element.click();
//    }
}
