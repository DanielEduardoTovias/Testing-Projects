package org.selenium.pom.base;

import org.openqa.selenium.By;

public class Locators {

    // locators of LOGIN PAGE:
    public By LogIn = By.xpath("//a[@id='login2']");
    public By userNameLogIn = By.xpath("//input[@id='loginusername']");
    public By passwordLogIn = By.xpath("//input[@id='loginpassword']");
    public By btnLogInOk = By.xpath("//button[normalize-space()='Log in']");
    public By messageAfterLogged = By.xpath("//a[@id='nameofuser']");
    // locators of MAIN PAGE:
    public By nameOfUser = By.xpath("//a[@id='nameofuser']");
    public By nextBtn = By.xpath("//button[@id='next2']");
    public By macBookBtn = By.linkText("MacBook Pro");
        //MacBook Page:
    public By addProduct = By.xpath("//a[normalize-space()='Add to cart']");
    public By nameProduct = By.xpath("//h2[normalize-space()='MacBook Pro']");
    public By backToProductsPage = By.xpath("(//a[@class='nav-link'])[1]");
    // locators MAIN PAGE [PHONES]:
    public By phonesBtn = By.xpath("(//a[normalize-space()='Phones'])[1]");
    public By phoneBtn = By.linkText("Samsung galaxy s7");
        //Phone Page:
    public By phoneName = By.xpath("//h2[normalize-space()='Samsung galaxy s7']");
    public By namePhone = By.xpath("//a[normalize-space()='Add to cart']");
    // locators CART PAGE:
    public By cartBtn = By.xpath("//a[@id='cartur']");
    public By totalToPay = By.xpath("//h3[@id='totalp']");
    public By placeOrderBtn = By.xpath("//button[normalize-space()='Place Order']");
    // locators CART PAGE - Place Order:
    public By nameOrder = By.xpath("//input[@id='name']");
    public By countryOrder = By.xpath("//input[@id='country']");
    public By cityOrder = By.xpath("//input[@id='city']");
    public By cardOrder = By.xpath("//input[@id='card']");
    public By monthOrder = By.xpath("//input[@id='month']");
    public By yearOrder = By.xpath("//input[@id='year']");
    public By purchaseBtn = By.xpath("//button[normalize-space()='Purchase']");
    // locators CART PAGE popUp! message:
    public By congratsChecked = By.xpath("//div[@class='sa-placeholder']");
    public By popUpOkBtn = By.xpath("//button[normalize-space()='OK']");
}
