package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBase {
    @BeforeMethod
   public  void preconditions(){
        if (!app.getSession().isElementPresent(By.id("pt-login"))) {
            app.getSession().openSite("https://en.wikipedia.org");
        }
    }

    @Test
    public void loginTest() throws InterruptedException {
        app.getSession().initLogin();
        app.getSession().fillLoginForm("Vasyssya@gmail.com", "12345678");
        app.getSession().clickLoginButton();
        Thread.sleep(5000);
    }
@AfterMethod
    public  void  postActions(){
    app.getSession().openSite("https://en.wikipedia.org");
}
}
