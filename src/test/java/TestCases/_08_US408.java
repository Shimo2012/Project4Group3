package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Utilities.DriverClass.actions;

public class _08_US408 extends DriverClass {
    @Test
    void listOfPatients() {
        _02_US402 login1 = new _02_US402();
        login1.login();

        actions.click(driver.findElement(By.cssSelector("a[href='/openmrs/spa/home/patient-lists']"))).perform();
        actions.click(driver.findElement(By.id("ccs-2-tab-3"))).perform();


    }
}