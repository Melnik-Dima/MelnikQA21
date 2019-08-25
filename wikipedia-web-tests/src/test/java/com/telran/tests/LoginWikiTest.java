package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBase {
    @Test
    public void loginTest () throws InterruptedException {
        driver.get("https://en.wikipedia.org");
        click(By.id("pt-login"));
        type(By.id("wpName1"),"Vasyssya@gmail.com");
        type(By.id("wpPassword1"),"12345678");
        click(By.id("wpLoginAttempt"));
        Thread.sleep(5000);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void type (By locator,String string) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(string);
    }
}
