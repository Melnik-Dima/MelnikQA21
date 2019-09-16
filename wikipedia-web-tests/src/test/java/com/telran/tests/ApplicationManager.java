package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        openSite("https://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(3000);
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

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public String getArticleTitle() {
        return driver.findElement(By.cssSelector("h1#firstHeading")).getText();
    }
}
