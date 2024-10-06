package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CareersPage;
import pages.HomePage;
import pages.OpenPositionsPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.logger.TestResultLogger;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class UseInsiderUITest extends BaseTest {

    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();
    OpenPositionsPage openPositionsPage = new OpenPositionsPage();
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriver driver = Driver.getDriver(); // Bonigarcia tarafından yönetilen driver'ı alıyoruz.
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // WebDriverWait'i başlatıyoruz.
    }

    @Test
    @Order(1)
    @DisplayName("User is on the Insider Page and accepts cookie. Kullanıcı Insider sayfasındadır ve çerezleri kabul eder.")
    public void AcceptCookiesTest() {
        WebDriver driver = Driver.getDriver();

        // 1) (https://useinsider.com/) sitesi açılır.
        driver.get(ConfigurationReader.getProperty("env")); // env, properties dosyasından alınan URL'yi temsil eder.

        // 2) Çerez kabul etme işlemi için bekleme ekleyerek, pop-up ve cookie butonlarını buluyoruz.
        WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("wt-cli-accept-all-btn")));

        // 3) Çerezler kabul edilir.
        acceptCookiesButton.click();

        // 4) Çerezlerin başarıyla kabul edildiğini doğrulamak için çerez popup'ının görünmez olduğunu kontrol ediyoruz.
        boolean isCookiePopupInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("wt-cli-accept-all-btn")));

        assertTrue(isCookiePopupInvisible, "Çerezler başarıyla kabul edilmedi.");
    }

    @Test
    @Order(2)
    @DisplayName("User clicks the Company button. Kullanıcı 'Company' butonuna tıklar.")
    public void CompanyButtonTest() {

        // "Company" butonuna tıklanmadan önce görünürlüğünü bekleyin ve Öyle tıklayın.
        WebElement companyButton = wait.until(ExpectedConditions.elementToBeClickable(homePage.companyButton));
        BrowserUtils.waitForClickability(companyButton, 10); // Tıklanabilirlik için bekleme
        companyButton.click();

    }

    @Test
    @Order(3)
    @DisplayName("User clicks the Careers button. Kullanıcı 'Careers' butonuna tıklar.")
    public void CareersButtonTest() {
        WebElement careersButton = wait.until(ExpectedConditions.elementToBeClickable(homePage.careersButton));
        careersButton.click();

        // Yeni sayfanın title'ını kontrol et
        String expectedTitle = "Ready to disrupt? | Insider Careers";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle, "Sayfanın title'ı beklenenle eşleşmiyor!");

    }

    @Test
    @Order(4)
    @DisplayName("Clicking the Find Your Dream Job button. Find Your Dream Job butonuna tıklanıyor.")

    public void FindYourDreamJobButtonTest() {

        // "Find Your Dream Job" butonuna tıklanır.
        WebElement findYourDreamJobButton = wait.until(ExpectedConditions.elementToBeClickable(careersPage.findYourDreamJobButton));
        BrowserUtils.scrollToElement(findYourDreamJobButton);
        findYourDreamJobButton.click();

    }

    @Test
    @Order(5)
    @DisplayName("User filters by location: Istanbul, Turkey. Kullanıcı 'Istanbul, Turkey' filtresini seçer.")

    public void FilterByLocationTest() {

        // 1) location filtresini tıklanabilir olana kadar bekleyin ve tıklayın
        WebElement locationFilter = wait.until(ExpectedConditions.elementToBeClickable(openPositionsPage.filterByLocation));
        locationFilter.click();

        // 2) Sayfanın aşağı kaydırılmasını sağlayarak 'Istanbul, Turkey' seçeneğini bulup tıklayın
        BrowserUtils.scrollToElement(openPositionsPage.istanbulTurkeyOption);

        // 3) "Istanbul, Turkey" filtresini tıklanabilir olana kadar bekleyin ve tıklayın
        WebElement istanbulOption = wait.until(ExpectedConditions.elementToBeClickable(openPositionsPage.istanbulTurkeyOption));
        istanbulOption.click();

        // 4) Dropdown menüsünden 'Istanbul, Turkey' seçeneği başarıyla seçilip seçilmediği doğrulanır
        String selectedDepartment = locationFilter.getText();
        assertTrue(selectedDepartment.contains("Istanbul, Turkey"), "'Istanbul, Turkey' seçimi başarısız!");

    }

    @Test
    @Order(6)
    @DisplayName("User filters by department: Quality Assurance. Kullanıcı 'Quality Assurance' filtresini seçer.")

    public void FilterByDepartmentTest() {

        // 1) Departman filtresini tıklanabilir olana kadar bekleyin ve tıklayın
        WebElement departmentFilter = wait.until(ExpectedConditions.elementToBeClickable(openPositionsPage.filterByDepartment));
        departmentFilter.click();

        // 2) Sayfanın aşağı kaydırılmasını sağlayarak 'Quality Assurance' seçeneğini bulup tıklayın
        BrowserUtils.scrollToElement(openPositionsPage.qualityAssuranceOption);

        // 3) QA filtresini tıklanabilir olana kadar bekleyin ve tıklayın
        WebElement qaOption = wait.until(ExpectedConditions.elementToBeClickable(openPositionsPage.qualityAssuranceOption));
        qaOption.click();

        // 4) Dropdown menüsünden 'Quality Assurance' seçeneği başarıyla seçilip seçilmediği doğrulanır
        String selectedDepartment = departmentFilter.getText();
        assertTrue(selectedDepartment.contains("Quality Assurance"), "'Quality Assurance' seçimi başarısız!");
    }

    @Test
    @Order(7)
    @DisplayName("User clicks the View Role button after filtering. Filtreleme işlemi sonrasında 'View Role' butonuna tıklanır.")

    public void ViewRoleTest() {

        // 1) 'View Role' butonunun üzerine gelme işlemi (hover)
        BrowserUtils.hover(openPositionsPage.viewRole);

        // 2) 'View Role' butonunun görünür ve tıklanabilir olduğundan emin olun
        WebElement viewRoleButton = wait.until(ExpectedConditions.elementToBeClickable(openPositionsPage.viewRole));
        assertTrue(viewRoleButton.isDisplayed(), "'View Role' butonu görünmüyor!");

        // 3) 'View Role' butonuna tıklayın
        viewRoleButton.click();
    }

}




