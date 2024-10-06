package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OpenPositionsPage {

    public OpenPositionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "select2-filter-by-location-container")
    public WebElement filterByLocation;

    @FindBy(xpath = "//li[.='Istanbul, Turkey']")
    public WebElement istanbulTurkeyOption;

    @FindBy(id = "select2-filter-by-department-container")
    public WebElement filterByDepartment;

    @FindBy(xpath = "//li[.='Quality Assurance']")
    public WebElement qualityAssuranceOption;

    @FindBy(xpath = "//a[.='View Role']")
    public WebElement viewRole;


}

