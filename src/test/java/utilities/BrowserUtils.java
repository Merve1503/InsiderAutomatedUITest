package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserUtils {

    // Explicit wait metodu. Elementin görünmesini bekler.
    // Wait for an element to be visible on the page
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    // Elementin tıklanabilir olmasını bekler
    // Wait for an element to be clickable
    public static void waitForClickability(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    // Bu metod, verilen süre boyunca Thread.sleep'i çalıştıracaktır.
    // This method will execute Thread.sleep for give duration
    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    // Bu metod, bir String "expectedTitle" alır ve bunun doğru olup olmadığını doğrular.
    // This method accepts a String "expectedTitle" and Assert if it is true.
    public static void verifyTitle(String expectedTitle) {
        assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    // Bu metod, geçerli URL'nin belirtilen "str" yani string değer ifadesini içerip içermediğini kontrol eder.
    // This method checks if the current URL contains the specified "str".
    public static void containsUrl(String str) {
        sleep(3000);
        assertTrue(Driver.getDriver().getCurrentUrl().contains(str));
    }

    // Bu metod, bir elementin üzerine fareyle gider.
    // This method hovers over a WebElement.
    public static void hover(WebElement element) {
        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    // Sayfayı elemente kadar kaydıran yardımcı metod
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
