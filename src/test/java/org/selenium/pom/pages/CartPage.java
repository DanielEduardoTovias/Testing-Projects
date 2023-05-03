package org.selenium.pom.pages;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.base.Locators;
import org.testng.Assert;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    Locators locators = new Locators();


    public CartPage verifyPriceAndProceedToPay() throws InterruptedException {
        Thread.sleep(2000);
        String totalExpected = "1900";
        String totalActual = driver.findElement(locators.totalToPay).getText();
        Assert.assertEquals(totalActual, totalExpected);
        Thread.sleep(2000);
        driver.findElement(locators.placeOrderBtn).click();
        return this;
    }

    public CartPage formPlaceOrder() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(locators.nameOrder).sendKeys("Daniel");
        driver.findElement(locators.countryOrder).sendKeys("México");
        driver.findElement(locators.cityOrder).sendKeys("Victoria");
        driver.findElement(locators.cardOrder).sendKeys("123456789987654321");
        driver.findElement(locators.monthOrder).sendKeys("Abril");
        driver.findElement(locators.yearOrder).sendKeys("2024");
        driver.findElement(locators.purchaseBtn).click();

        Thread.sleep(1000);
        driver.findElement(locators.congratsChecked).isDisplayed();
        driver.findElement(locators.popUpOkBtn).click();


        return this;
    }
}
