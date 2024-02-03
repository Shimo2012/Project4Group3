package TestCases;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _05_US404 extends DriverClass {


@Test
    void patientRegisterationTest(){
    _011_PageElements pge = new _011_PageElements();
    driver.get("https://openmrs.org/");
    pge.demo.click();
    pge.enterTheOpenMRS.click();
    pge.enterUserName.sendKeys("admin");
    pge.enterPassWord.sendKeys("Admin123");
    List<WebElement> locationList = driver.findElements(By.cssSelector("ul[id=\"sessionLocation\"]>li"));
    int randomIndex = (int) (Math.random() * locationList.size());
    locationList.get(randomIndex).click();
    pge.logInButton.click();


}
}
