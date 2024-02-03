package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Locale;

public class _06_US406 extends DriverClass {
    /*
      https://demo.openmrs.org/

      1. The doctor, logged in as [admin] on the application homepage.
      2. The doctor clicks on the [Find Patient Record] button.
      3. The doctor successfully searches for a patient using information such as name, surname, or ID.
      4. The doctor should be able to view and click on the search result.
      5. When clicking on the search result, the doctor should be able to access the patient's medical history, appointments, and other information.
      6. If the doctor attempts to search for a non-existent patient, they receive a warning message: "No matching records found" -NEGATIVE-.


      Valid Data:
      - Username: admin
      - Password: Admin123
      - Location: [*RANDOM*]
     */

    @Test(dataProvider = "loginData")
    void patientSearchTest(String username, String password) throws InterruptedException, AWTException {
        Elements_Locators elements = new Elements_Locators();
        driver.get("https://demo.openmrs.org/");
        elements.usernameInput.sendKeys(username);
        elements.passwordInput.sendKeys(password);
        int randomIndex = (int) (Math.random() * elements.locationList.size());
        elements.locationList.get(randomIndex).click();
        elements.loginButton.click();
        elements.findPatientRecord.click();
        elements.searchInput.sendKeys("Batch Ten");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait.until(ExpectedConditions.visibilityOf(elements.patientsNameList));
        elements.patientsNameList.click();
        Assert.assertTrue(elements.medicalHistory.getText().toLowerCase().contains("diagnoses"));


    }

    @Test(dataProvider = "loginData")
    void nonExistentPatientSearchTest(String username, String password) throws InterruptedException, AWTException {
        Elements_Locators elements = new Elements_Locators();
        driver.get("https://demo.openmrs.org/");
        elements.usernameInput.sendKeys(username);
        elements.passwordInput.sendKeys(password);
        int randomIndex = (int) (Math.random() * elements.locationList.size());
        elements.locationList.get(randomIndex).click();
        elements.loginButton.click();
        elements.findPatientRecord.click();
        elements.searchInput.sendKeys("John Snow");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=\"No matching records found\"]")));
        Assert.assertTrue(elements.nonExistentPatient.getText().contains("No matching records found"));
    }

    @DataProvider(name = "loginData")
    public Object[][] credentials() {
        Object[][] credentialsArray = {
                {"admin", "Admin123"}

        };

        return credentialsArray;
    }
}
