package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _011_PageElements {

    public _011_PageElements(){
        PageFactory.initElements(DriverClass.driver,this);
    }

    @FindBy(css = "a[class=\"zak-button\"]")
    public WebElement demo;

   @FindBy(xpath = "//span[text()=\"Enter the OpenMRS 2 Demo\"]")
    public WebElement enterTheOpenMRS;

   @FindBy(css = "input[placeholder=\"Enter your username\"]")
    public WebElement enterUserName;

   @FindBy(css = "i[id=\"togglePassword\"]")
   public  WebElement revealPasswordButton;

   @FindBy (css = "input[placeholder=\"Enter your password\"]")
    public WebElement enterPassWord;

   @FindBy (css = "li[id=\"Inpatient Ward\"]")
    public WebElement inpatientWard;

   @FindBy (css = "input[id=\"loginButton\"]")
    public WebElement logInButton;


}
