package Pages;

import io.cucumber.java.ht.Le;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;
    public static String site = "https://automationexercise.com";
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    By ProductsLocator = By.cssSelector("a[href='/products']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/login']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");
    By EmailTextbox = By.id("subscribe_email");
    By SubscribeButtonLocator = By.id("subscribe");
    By LogOutLocator = By.cssSelector("a[href='/logout']");
    By DeleteLocator = By.cssSelector("a[href='/delete_account']");
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

    By testCasesButtonLocator = By.xpath("//button[text()='Test Cases']");
    By apiListButtonLocator = By.xpath("//button[text()='APIs list for practice']");
    By RightSliderControlLocator = By.cssSelector("a[data-slide='next']");
    By LeftSliderControlLocator = By.cssSelector("a[data-slide='prev']");
    By RightRecommendedControlLocator = By.cssSelector("a.right.recommended-item-control");
    By LeftRecommendedControlLocator = By.cssSelector("a.left.recommended-item-control");

    By ActiveSlideItemLocator = By.cssSelector("div.item.active");
    public WebElement getCurrentActiveSlideElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(ActiveSlideItemLocator)
        );
    }
    public boolean hasSliderMovedAfterClick(WebElement initialActiveSlide) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            boolean moved = wait.until(
                    ExpectedConditions.not(
                            ExpectedConditions.attributeContains(initialActiveSlide, "class", "active")
                    )
            );

            if (moved) {
                return driver.findElement(ActiveSlideItemLocator).isDisplayed();
            }
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }


    public void clickLogOut(){
        driver.findElement(LogOutLocator).click();
    }
    public void clickDelete(){
        driver.findElement(DeleteLocator).click();
    }
    public ProductPage clickProducts(){
        driver.findElement(ProductsLocator).click();
        return new ProductPage(driver);
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
        return new  ContactUsPage(driver);
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
    public void clickRightRecommendedControl() {
        driver.findElement(RightRecommendedControlLocator).click();
    }
    public void clickLeftRecommendedControl() {
        driver.findElement(LeftRecommendedControlLocator).click();
    }
    public void clickRightSliderControl(){
        driver.findElement(RightSliderControlLocator).click();
    }
    public void clickLeftSliderControl(){
        driver.findElement(LeftSliderControlLocator).click();
    }
    public void clickTestCasesButton() {
        driver.findElement(testCasesButtonLocator).click();
    }
    public void clickApiListButton() {
        driver.findElement(apiListButtonLocator).click();
    }
}
