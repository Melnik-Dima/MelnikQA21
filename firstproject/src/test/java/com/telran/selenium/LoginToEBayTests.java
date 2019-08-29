package com.telran.selenium;

import org.testng.annotations.Test;

public class LoginToEBayTests extends TestBase {
    @Test
    public void loginTest() {
        openSite("https://ebay.com");
        initLogin();
        fillLoginForm("Vasyssya@gmail.com", "12345678");
        clickLoginButton();
    }


}
