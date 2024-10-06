package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.logger.Log; // Log sınıfını içe aktar

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public void setup() {
        Log.info("WebDriver kuruluyor..."); // Log: Kurulum bilgisi
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://useinsider.com/"); // İnsider URL'si
        Log.info("WebDriver başarıyla başlatıldı ve Insider sayfası açıldı.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            Log.info("WebDriver kapatılıyor..."); // Log: Kapatma bilgisi
            driver.quit();
            Log.info("WebDriver başarıyla kapatıldı."); // Log: Başarılı kapama
        } else {
            Log.warn("WebDriver başlatılmadı."); // Log: Uyarı durumu
        }
    }
}


