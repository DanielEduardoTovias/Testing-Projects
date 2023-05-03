package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.base.Locators;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchinPhonePage extends BasePage {

    Locators locators = new Locators();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    public SearchinPhonePage(WebDriver driver) {
        super(driver);
    }

    public SearchinPhonePage clickPhonesBtn() throws InterruptedException{
        driver.findElement(locators.phonesBtn).click();
        Thread.sleep(2000);
        return this;
    }

    public SearchinPhonePage scrollDownAndSelectPhone() throws InterruptedException {
        int n = 0;
        for (int i = 0; i <= 3; i++){
            n += 50;
            js.executeScript("window.scrollBy(0,"+n+")", "");
            Thread.sleep(200);
        }
        driver.findElement(locators.phoneBtn).click();
        return this;
    }

    public SearchinPhonePage verifyNameAddToCart(int a) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.phoneName));
        String actualName = driver.findElement(locators.phoneName).getText();
        String expectedName = "Samsung galaxy s7";
        Assert.assertEquals(actualName, expectedName);
        driver.findElement(locators.namePhone).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(locators.cartBtn).click();

        // this for is by delete the products of the cart
        /*for (int i = 5; i<= 3; i--){
            By deleteProductBtn = By.xpath("(//a[@href='#'][normalize-space()='Delete'])["+a+"]");
            driver.findElement(deleteProductBtn).click();
            a++;
        }*/
        //verifyPriceAndProceedToPay();
        return this;
    }

    /*public SearchinPhonePage verifyPriceAndProceedToPay() throws InterruptedException {
        Thread.sleep(2000);
        String totalExpected = "1900";
        String totalActual = driver.findElement(locators.totalToPay).getText();
        Assert.assertEquals(totalActual, totalExpected);
        Thread.sleep(2000);
        driver.findElement(locators.placeOrderBtn).click();
        return this;
    }*/



}
