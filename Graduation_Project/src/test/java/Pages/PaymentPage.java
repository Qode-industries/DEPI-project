package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.smartcardio.Card;
import java.rmi.UnmarshalException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class PaymentPage {
    WebDriver driver;
    WebDriverWait wait;
    public static String site = "https://automationexercise.com/payment";

    public PaymentPage(WebDriver driver) {
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

    By NameTextboxLocator = By.cssSelector("input[data-qa ='name-on-card']");
    By CardTextboxLocator = By.cssSelector("input[data-qa ='card-number']");
    By CVCTextboxLocator = By.cssSelector("input[data-qa ='cvc']");
    By MonthTextboxLocator = By.cssSelector("input[data-qa ='expiry-month']");
    By YearTextboxLocator = By.cssSelector("input[data-qa ='expiry-year']");
    By PayButtonLocator = By.id("submit");

    By PayMsgLocator = By.cssSelector("#form p");
    By DownloadInvoiceButtonLocator = By.xpath("//a[contains(@href,'download_invoice')]");
    By ContinueButtonLocator = By.xpath("//a[contains(@data-qa,'continue-button')]");

    private String ExpectedPayMsg = "Congratulations! Your order has been confirmed!";

    public String getExpectedPayMsg() {
        return ExpectedPayMsg;
    }

    public void setName(String s){
        driver.findElement(NameTextboxLocator).sendKeys(s);
    }
    public void setCard(String s){
        driver.findElement(CardTextboxLocator).sendKeys(s);
    }
    public void setCVC(int cvc){
        driver.findElement(CVCTextboxLocator).sendKeys(Integer.toString(cvc));
    }
    public void setMonth(int Month){
        driver.findElement(MonthTextboxLocator).sendKeys(Integer.toString(Month));
    }
    public void setYear(int Year){
        driver.findElement(YearTextboxLocator).sendKeys(Integer.toString(Year));
    }
    public void clickPay(){
        driver.findElement(PayButtonLocator).click();
    }

    public String getPayMsg(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement PayMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(PayMsgLocator));
        return PayMsg.getText();
    }
    public void clickDownloadInvoice(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement invoiceBtn = wait.until(ExpectedConditions.elementToBeClickable(DownloadInvoiceButtonLocator));
        invoiceBtn.click();
    }
    public void clickContinue(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement invoiceBtn = wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonLocator));
        invoiceBtn.click();
    }
}
