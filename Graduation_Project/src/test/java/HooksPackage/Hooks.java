package HooksPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void setup(){
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    public static void handleExternalAds() {
        try {
            // *1. تحديد الـ iframe (تم تصحيح صيغة XPath)*
            WebElement adIframe = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[starts-with(@id, 'aswift_')]"))
            );

            // 2. التحويل إلى هذا الـ iframe
            driver.switchTo().frame(adIframe);

            System.out.println("✅ تم التحويل بنجاح إلى إطار الإعلان.");

            // *3. النقر على زر الإغلاق (تم تصحيح صيغة XPath)*
            WebElement closeButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class, 'close')] | //span[text()='X'] | //div[contains(@id, 'dismiss-button')]"))
            );
            closeButton.click();

            System.out.println("✅ تم إغلاق الإعلان بنجاح.");

        } catch (Exception e) {
            // يتم تجاهل الخطأ إذا لم يظهر الإعلان (وهو السلوك المطلوب)
            System.out.println("⚠ لا يوجد إعلان منبثق تم اكتشافه أو تم تجاهل الإغلاق.");
        } finally {
            // 4. العودة إلى الإطار الرئيسي (ضروري)
            driver.switchTo().defaultContent();
        }
    }
}
