package TestCases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utilities.DriverClass;
import static Utilities.DriverClass.actions;
import static Utilities.DriverClass.driver;

public class _03_US403 extends DriverClass {
    // As a user, I want to securely log out of the system
    // so that I can ensure the application is not left open.

    @Test
    void logout() {

        _02_US402 login1 = new _02_US402();
        login1.login();

        actions.click(driver.findElement(By.name("Users"))).perform();
        actions.click(driver.findElement(By.cssSelector("button[aria-labelledby='Logout']"))).perform();







    }

}