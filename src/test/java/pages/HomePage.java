package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    // Constructor: PageFactory ile driver'ı başlatıyoruz
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Çerezleri kabul etme butonu
    @FindBy(id = "wt-cli-accept-all-btn")
    public WebElement cookiesAllAcceptButton;

    // "Company" sekmesi
    @FindBy(xpath = "//a[contains(.,'Company')]")
    public WebElement companyButton;

    // "Careers" sekmesi
    @FindBy(xpath = "//a[text()='Careers']")
    public WebElement careersButton;
}


