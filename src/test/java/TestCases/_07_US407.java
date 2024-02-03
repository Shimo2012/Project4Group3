package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _07_US407 extends DriverClass {
    @Test
    void myAccountTest() throws AWTException, InterruptedException {

        Elements_Locators elements = new Elements_Locators();
        elements.usernameInput.sendKeys("admin");
        elements.passwordInput.sendKeys("Admin123");
        int randomIndex = (int) (Math.random() * elements.locationList.size());
        elements.locationList.get(randomIndex).click();
        elements.loginButton.click();
        elements.findPatientRecord.click();
        elements.searchInput.sendKeys("Martha Steel");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait.until(ExpectedConditions.visibilityOf(elements.patientsNameList));
        elements.patientsNameList.click();
        elements.deletePatient.click();
        elements.deleteReason.sendKeys("too healthy");
        elements.confirmButtonForDeletion.click();


    }
}
