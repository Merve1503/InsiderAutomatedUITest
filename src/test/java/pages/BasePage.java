package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public static String productName;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "wt-cli-accept-all-btn")
    public WebElement cookiesAllAcceptButton;

    @FindBy(id = "close-button-1454703513202")
    public WebElement popUpAcceptButton;

    @FindBy(id = "")
    public WebElement accountsLinkForModel;

    @FindBy(xpath = "//a[contains(.,'Company')]")
    public WebElement companyButton;

    @FindBy(xpath = "//a[.='Careers']")
    public WebElement careersButton;

    @FindBy(xpath = "//div[@class='button-group d-flex flex-row']/a[.='Find your dream job']")
    public WebElement findYourDreamJobButton;

    @FindBy(id = "select2-filter-by-location-container")
    public WebElement ByLocationContainer;

    @FindBy(xpath = "//li[.='Istanbul, Turkey']")
    public WebElement IstanbulTurkey;

    @FindBy(id = "select2-filter-by-department-container")
    public WebElement ByDepartmentContainer;

    @FindBy(xpath = "//li[.='Quality Assurance']")
    public WebElement QualityAssurance;

    @FindBy(xpath = "//a[.='View Role']")
    public WebElement ViewRole;

}
