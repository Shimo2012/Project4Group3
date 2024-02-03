package TestCases;
import java.sql.Driver;
import java.time.Duration;
import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import javax.swing.*;
import static Utilities.DriverClass.*;

public class _02_US402 extends DriverClass {
    //As a user, I want to be able to log into the system
    // so that I can benefit from the application's features.

    @Test
    void login() {

        actions.click(driver.findElement(By.xpath("//*[@id=\"zak-masthead\"]/div/div[2]/div/div/div[2]/div[2]/div"))).perform();


        actions.click(driver.findElement(By.linkText("Enter the OpenMRS 3 Demo"))).perform();


        actions.click(driver.findElement(By.id("username"))).sendKeys("admin").perform();

        actions.click(driver.findElement(By.className("-esm-login__login__continueButton___VnN+0"))).perform();


        actions.sendKeys(driver.findElement(By.id("password")), "Admin123").perform();
        actions.click(driver.findElement(By.className("-esm-login__login__continueButton___VnN+0"))).perform();

    }
}
