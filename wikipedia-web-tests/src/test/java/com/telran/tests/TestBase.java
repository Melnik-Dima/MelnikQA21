package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        openSite("https://en.wikipedia.org");

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String string) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(string);
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickLoginButton() {
        click(By.id("wpLoginAttempt"));
    }

    public void fillLoginForm(String email, String pwd) {
        type(By.id("wpName1"), email);
        type(By.id("wpPassword1"), pwd);
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }

    public void clickGoButton() {
        click(By.name("go"));
    }

    public void typeRequest(String request) {
        type(By.name("search"), request);
    }
}
