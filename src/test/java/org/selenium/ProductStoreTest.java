package org.selenium;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.CartPage;
import org.selenium.pom.pages.LoginPage;
import org.selenium.pom.pages.SearchinPhonePage;
import org.selenium.pom.pages.SearchingProduct;
import org.testng.annotations.Test;

public class ProductStoreTest extends BaseTest {


    @Test
    public void E2eTest() throws InterruptedException {
        // LOGIN PAGE:
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInPage();
            // LOGGED:
        // MAIN PAGE []:
        SearchingProduct searchingProduct = new SearchingProduct(driver);
        searchingProduct
                .verifyUserName()
                .scrollDownAndClickNext()
                .addProductToCart();
            // Searching for a phone:
        SearchinPhonePage searchinPhonePage = new SearchinPhonePage(driver);
        searchinPhonePage
                .clickPhonesBtn()
                .scrollDownAndSelectPhone()
                //this argument is by the for:
        .verifyNameAddToCart(5);
        //CART PAGE:
        CartPage cartPage = new CartPage(driver);
        cartPage
                .verifyPriceAndProceedToPay()
                .formPlaceOrder();
        Thread.sleep(3000);
    }
}
