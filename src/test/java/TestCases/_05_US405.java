package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _05_US405 extends DriverClass {
    /*
      https://demo.openmrs.org/

      1. The user is on the Login page.
      2. The user randomly clicks on the Location button.
      3. The user successfully logs in (Depends on [US_402].
      4. When hovering over the profile icon, the user should see the [My Account] link, and it should be clickable.
      5. Upon clicking the [My Account] link, the user should be able to see and click on the "Change Password" and "My Languages" buttons.

     Valid Data:
      - Username: admin
      - Password: Admin123
      - Location: [*RANDOM*]
     */

    @Test
    void myAccountTest() {
        Elements_Locators elements = new Elements_Locators();

        elements.usernameInput.sendKeys("admin");
        elements.passwordInput.sendKeys("Admin123");
        int randomIndex = (int) (Math.random() * elements.locationList.size());
        elements.locationList.get(randomIndex).click();
        elements.loginButton.click();
        elements.adminIcon.click();
        elements.myAccountButton.click();

        Assert.assertTrue(elements.changePasswordButton.isDisplayed());
        Assert.assertTrue(elements.myLanguagesButton.isDisplayed());

        WebElement changePasswordButtonClickable = wait.until(ExpectedConditions.elementToBeClickable(elements.changePasswordButton));
        if (changePasswordButtonClickable != null) {
            System.out.println("The element is clickable.");
        } else {
            System.out.println("The element is not clickable.");
        }

        WebElement myLanguagesButtonClickable = wait.until(ExpectedConditions.elementToBeClickable(elements.changePasswordButton));
        if (myLanguagesButtonClickable != null) {
            System.out.println("The element is clickable.");
        } else {
            System.out.println("The element is not clickable.");
        }
    }
}
