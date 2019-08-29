package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBase {
    @Test
    public void loginTest() throws InterruptedException {
        initLogin();
        fillLoginForm ("Vasyssya@gmail.com","12345678");
        clickLoginButton();
        Thread.sleep(5000);
    }

}
