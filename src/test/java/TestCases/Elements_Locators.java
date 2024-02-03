package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements_Locators {

    public Elements_Locators() {

        PageFactory.initElements(DriverClass.driver, this);

    }
    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(id = "sessionLocation")
    public List<WebElement> locationList;

    @FindBy(css = "i[class=\"icon-user small\"]")
    public WebElement adminIcon;

    @FindBy(css = "a[href=\"/openmrs/adminui/myaccount/myAccount.page\"]")
    public WebElement myAccountButton;

    @FindBy(css = "a[href=\"/openmrs/adminui/myaccount/changePassword.page\"]")
    public WebElement changePasswordButton;

    @FindBy(css = "a[href=\"/openmrs/adminui/myaccount/changeDefaults.page\"]")
    public WebElement myLanguagesButton;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatientRecord;

    @FindBy(id = "patient-search")
    public WebElement searchInput;

    @FindBy(css = "tr[class=\"odd\"]")
    public WebElement patientRecord;

    @FindBy(xpath = "//td[text() = \"100HTR\"]")
    public WebElement samplePatient;

    @FindBy(css = "div[class=\"dashboard clear row\"]")
    public WebElement medicalHistory;

    @FindBy(css = "tbody[role=\"alert\"]")
    public WebElement nonExistentPatient;



}

