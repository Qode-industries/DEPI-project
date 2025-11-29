package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    public static String site = "https://automationexercise.com/checkout";

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By CommentTextboxLocator = By.className("form-control");
    By PlaceOrderButtonLocator = By.cssSelector("a[href='/payment']");

    public void setComment(String s){
        driver.findElement(CommentTextboxLocator).sendKeys(s);
    }
    public PaymentPage clickPlaceOrder(){
        driver.findElement(PlaceOrderButtonLocator).click();
        return new PaymentPage(driver);
    }

}
