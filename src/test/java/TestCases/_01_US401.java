package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_US401 extends DriverClass {


    @Test(dataProvider = "loginData")
    void loginErrorsTest(String username, String password) {
        _011_PageElements pge = new _011_PageElements();
        driver.get("https://openmrs.org/");
        pge.demo.click();
        pge.enterTheOpenMRS.click();
        pge.enterUserName.sendKeys(username);
        pge.revealPasswordButton.click();
        pge.enterPassWord.sendKeys(password);
        pge.inpatientWard.click();
        pge.logInButton.click();

        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertTrue(errorMessage.isDisplayed());

        String targetURL = ("https://openmrs.org/");
       String actualURL = DriverClass.driver.getCurrentUrl();
        Assert.assertEquals(actualURL, targetURL, "URL is not correct");

    }

    @DataProvider(name = "loginData")
    public Object[][] credentials() {
        Object[][] credentialsArray = {
                {"Admin", " Admin123" },
                {"admin", "admin123" },
                {"admin1", "Admin12" },
        };
        return credentialsArray;
    }


}