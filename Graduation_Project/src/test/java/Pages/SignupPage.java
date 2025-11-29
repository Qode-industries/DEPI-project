package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
    WebDriver driver;

    By HomeLocator = By.cssSelector("a[href='/']");
    By ProductsLocator = By.cssSelector("a[href='/products']");
    By CartLocator = By.cssSelector("a[href='/view_cart']");
    By LogInLocator = By.cssSelector("a[href='/a[href='/']']");
    By ContactUsLocator = By.cssSelector("a[href='/contact_us']");

    By TitleLocator = By.cssSelector("h2 b");
    private String ExpectedTitleText = "Enter Account Information";
    By NameTitle1 = By.id("id_gender1");
    By NameTitle2 = By.id("id_gender2");
    By PasswordTextboxLocator = By.id("password");
    By DaySelectLocator = By.id("days");
    By MonthSelectLocator = By.id("Months");
    By YearSelectLocator = By.id("years");
    By NewsletterCheckboxLocator = By.id("newsletter");
    By OffersCheckboxLocator = By.id("optin");
    By FirstnameTextboxLocator = By.id("first_name");
    By LastnameTextboxLocator = By.id("last_name");
    By AddressTextboxLocator = By.id("address1");
    By CountrySelectLocator = By.id("country");
    By StateTextboxLocator = By.id("state");
    By CityTextboxLocator = By.id("city");
    By ZipcodeTextboxLocator = By.id("zipcode");
    By MobileTextboxLocator = By.id("mobile_number");
    By CreateButtonLocator = By.cssSelector("button[data-qa='create-account']");

    public SignupPage(WebDriver driver){
        this.driver=driver;
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

    public String getExpectedTitleText(){
        return ExpectedTitleText;
    }
    public void selectNameTitle1(){
        driver.findElement(NameTitle1).click();
    }
    public void selectNameTitle2(){
        driver.findElement(NameTitle2).click();
    }
    public void setPassword(String s){
        driver.findElement(PasswordTextboxLocator).sendKeys(s);
    }
    public void selectDay(int i){
        Select s = new Select(driver.findElement(DaySelectLocator));
        s.selectByValue(Integer.toString(i));
    }
    public void selectMonth(int i){
        Select s = new Select(driver.findElement(MonthSelectLocator));
        s.selectByValue(Integer.toString(i));
    }
    public void selectYear(int i){
        Select s = new Select(driver.findElement(YearSelectLocator));
        s.selectByValue(Integer.toString(i));
    }
    public void checkNewsletter(){
        driver.findElement(NewsletterCheckboxLocator).click();
    }
    public void checkOffers(){
        driver.findElement(OffersCheckboxLocator).click();
    }
    public void setFirstname(String s){
        driver.findElement(FirstnameTextboxLocator).sendKeys();
    }
    public void setLastname(String s){
        driver.findElement(LastnameTextboxLocator).sendKeys();
    }
    public void setAddress(String s){
        driver.findElement(AddressTextboxLocator).sendKeys();
    }
    public void setCountry(String s){
        driver.findElement(CountrySelectLocator).sendKeys();
    }
    public void setState(String s){
        driver.findElement(StateTextboxLocator).sendKeys();
    }
    public void setCity(String s){
        driver.findElement(CityTextboxLocator).sendKeys();
    }
    public void setZipcode(String s){
        driver.findElement(ZipcodeTextboxLocator).sendKeys();
    }
    public void setMobilenumber(String s){
        driver.findElement(MobileTextboxLocator).sendKeys();
    }
    public void clickCreate(){
        driver.findElement(CreateButtonLocator).click();
    }



}
