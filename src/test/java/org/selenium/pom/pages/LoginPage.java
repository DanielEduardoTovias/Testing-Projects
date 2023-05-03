package org.selenium.pom.pages;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.Locators;
import org.testng.Assert;

public class LoginPage extends BasePage {

    Locators locators = new Locators();
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage loginInPage() throws InterruptedException {
        //driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(locators.LogIn).click();
        //Write username:
        driver.findElement(locators.userNameLogIn).sendKeys("DanielTovias");
        //Write password:
        Thread.sleep(1000);
        driver.findElement(locators.passwordLogIn).sendKeys("02041999");
        //Click in Sign Up button:
        Thread.sleep(1000);
        driver.findElement(locators.btnLogInOk).click();
        //driver.switchTo().alert().accept();
        Thread.sleep(2000);
        // WE´RE LOGGED Man!!!:
        //Check the message of navbar logged:
        String actualMessage = driver.findElement(locators.messageAfterLogged).getText();
        String expectedMessage = "Welcome DanielTovias";
        Assert.assertEquals(actualMessage, expectedMessage);

        return new LoginPage(driver);
    }

}
