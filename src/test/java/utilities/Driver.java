package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Sınıfın dışından bu sınıfın nesnesine erişimi kapatmak için private bir yapıcı oluşturuyoruz.
    private Driver() {}

    // WebDriver'ı private yapıyoruz çünkü sınıf dışından erişimi kapatmak istiyoruz.
    private static WebDriver driver;

    // Tekrar kullanılabilir bir yardımcı metot oluşturuyoruz.
    // Bu metot çağrıldığında aynı driver örneğini döndürecek.
    public static WebDriver getDriver() {

        if (driver == null) {

            // browserType bilgisini configuration.properties dosyasından okuyoruz.
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "chrome_incognito":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                // Diğer tarayıcılar için case ekleyebilirsiniz
            }

        }

        return driver;
    }

    // Bu metot, quit() metodunu kullandıktan sonra driver değerinin her zaman null olmasını sağlayacaktır.
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Driver'ı null yaparak, sonraki çağrıda yeniden oluşturulmasını sağlıyoruz.
        }
    }
}


