package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By HomeLocator = By.cssSelector("a[href='/']");
    By ProductsLocator = By.cssSelector("a[href='/products']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/login']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");
    By EmailTextbox = By.id("susbscribe_email");
    By SubscribeButtonLocator = By.id("subscribe");
    By SubscribeMsg = By.id("success-subscribe");
    By ProceedToCheckoutLocator = By.xpath("//a[contains(@class, 'check_out')]");
    By ProductTitleLocator = By.xpath("//a[contains(@href, 'product_details')]");
    By DeleteItemLocator = By.className("cart_quantity_delete");
    By MsgLocator = By.className("text-center");
    private String ExpectedSuccessSubMsg = "You have been successfully subscribed!";

    private String ExpectedEmptyCartMsg = "Cart is empty!";

    public String getExpectedSuccessSubMsg() {
        return ExpectedSuccessSubMsg;
    }

    public String getExpectedEmptyCartMsg() {
        return ExpectedEmptyCartMsg;
    }

    public HomePage clickHome(){
        driver.findElement(HomeLocator).click();
        return new HomePage(driver);
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
        return new ContactUsPage(driver);
    }
    public void setEmailTextbox(String email) {
        driver.findElement(EmailTextbox).sendKeys(email);
    }
    public void clickSubscribe(){
        driver.findElement(SubscribeButtonLocator).click();
    }
    public String getSubscribeMsg(){
        return driver.findElement(SubscribeMsg).getText();
    }
    public CheckoutPage clickProceedToCheckout(){
        driver.findElement(ProceedToCheckoutLocator).click();
        return new CheckoutPage(driver);
    }
    public void clickProductTitle(){
        driver.findElement(ProductTitleLocator).click();
    }
    public void RemoveItem(int index){
        List<WebElement> deleteButtons = driver.findElements(DeleteItemLocator);
        deleteButtons.get(index).click();
    }
    public String getMsg(){
        return driver.findElement(MsgLocator).getText();
    }

//    @Test
//    public void Test(){
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://automationexercise.com/view_cart");
//        clickHome();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com");
//    }


}
