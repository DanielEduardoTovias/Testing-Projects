package org.selenium.pom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.base.Locators;
import org.testng.Assert;

public class SearchingProduct extends BasePage {

    public SearchingProduct(WebDriver driver) {
        super(driver);
    }

    // Instance of the class locators by take the attributes:
    Locators locators = new Locators();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public SearchingProduct verifyUserName(){
        String msgUser = driver.findElement(locators.nameOfUser).getText();
        String expectedMessage = "Welcome DanielTovias";
        Assert.assertEquals(msgUser, expectedMessage);
        return this;
    }

    public SearchingProduct scrollDownAndClickNext() throws InterruptedException {

        int n = 0;
        for (int i = 0; i <= 6; i++){
            n += 50;
            js.executeScript("window.scrollBy(0,"+n+")", "");
            Thread.sleep(200);
        }
        return this;
    }

    public SearchingProduct addProductToCart() throws InterruptedException {
        driver.findElement(locators.nextBtn).click();
        Thread.sleep(500);
        driver.findElement(locators.macBookBtn).click();
        String nameProductPage = driver.findElement(locators.nameProduct).getText();
        String expMsg = "MacBook Pro";
        Assert.assertEquals(nameProductPage, expMsg);
        driver.findElement(locators.addProduct).click();
        Thread.sleep(1000);

        driver.switchTo().alert().accept();
        driver.findElement(locators.backToProductsPage).click();
        Thread.sleep(2000);
        return this;
    }

}



