package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public static final String site = "https://automationexercise.com/login";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By HomeLocator = By.cssSelector("a[href='/']");
    By ProductsLocator = By.cssSelector("a[href='/products']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/a[href='/']']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");
    By EmailTextbox = By.id("susbscribe_email");
    By FailMsgLocator = By.cssSelector(".login-form p");
    By SubscribeButtonLocator = By.id("subscribe");
    private String ExpectedFailMsg = "Your email or password is incorrect!";

    By LoginEmailTextboxLocator = By.cssSelector("input[data-qa='login-email']");
    By LoginPasswordTextboxLocator = By.cssSelector("input[data-qa='login-password']");
    By LoginButtonLocator = By.cssSelector("button[data-qa='login-button']");
    By SignupNameTextboxLocator = By.cssSelector("input[data-qa='Signup-email']");
    By SignupEmailTextboxLocator = By.cssSelector("input[data-qa='Signup-password']");
    By SignupButtonLocator = By.cssSelector("button[data-qa='Signup-button']");

    public String getExpectedFailMsg() {
        return ExpectedFailMsg;
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

    public void setLoginEmail(String s){
        driver.findElement(LoginEmailTextboxLocator).sendKeys(s);
    }
    public void setLoginPassword(String s){
        driver.findElement(LoginPasswordTextboxLocator).sendKeys(s);
    }
    public HomePage clickLoginButton(){
        driver.findElement(LoginButtonLocator).click();
        return new HomePage(driver);
    }
    public String getFailMsg(){
        return driver.findElement(FailMsgLocator).getText();
    }
    public void setSignupName(String s){
        driver.findElement(SignupNameTextboxLocator).sendKeys(s);
    }
    public void setSignupEmail(String s){
        driver.findElement(SignupEmailTextboxLocator).sendKeys(s);
    }
    public SignupPage clickSignupButton(){
        driver.findElement(SignupButtonLocator).click();
        return new SignupPage(driver);
    }


}
