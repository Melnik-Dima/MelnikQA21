package com.telran.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    ArticleHelper article;
    SessionHelper session;

    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        session = new SessionHelper(driver);
        driver.get("https://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    public ArticleHelper getArticle() {
        return article;
    }

    public SessionHelper getSession() {
        return session;
    }
}
