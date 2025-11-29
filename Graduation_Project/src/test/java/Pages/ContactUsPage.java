package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    WebDriver driver;
    public static final String site = "https://automationexercise.com/contact_us";


    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    By HomeLocator = By.cssSelector("a[href='/']");
    By ProductsLocator = By.cssSelector("a[href='/products']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/a[href='/']']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");
    By EmailTextbox = By.id("susbscribe_email");
    By SubscribeButtonLocator = By.id("subscribe");

    By NameTextboxLocator = By.cssSelector("input[name='name']");
    By EmailTextboxLocator = By.cssSelector("input[name='email']");
    By SubjectTextboxLocator = By.cssSelector("input[name='subject']");
    By MessageTextboxLocator = By.cssSelector("input[name='message']");
    By SubmitButtonLocator = By.cssSelector("input[name='submit']");
    By MsgLocator = By.xpath("//div[contains(@class, 'status')]");

    private String ExpectedSuccessMsg = "Success! Your details have been submitted successfully.";


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

    public void setName(String s){
        driver.findElement(NameTextboxLocator).sendKeys(s);
    }
    public void setEmail(String s){
        driver.findElement(EmailTextboxLocator).sendKeys(s);
    }
    public void setSubject(String s){
        driver.findElement(SubjectTextboxLocator).sendKeys(s);
    }
    public void setMessage(String s){
        driver.findElement(MessageTextboxLocator).sendKeys(s);
    }
    public void clickSubmit(){
        driver.findElement(SubmitButtonLocator).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getActualMsg(){
        return driver.findElement(MsgLocator).getText();
    }
    public String getExpectedSuccessMsg(){
        return ExpectedSuccessMsg;
    }

}
