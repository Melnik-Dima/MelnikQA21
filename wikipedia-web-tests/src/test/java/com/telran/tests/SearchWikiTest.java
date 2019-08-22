package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {

    WebDriver driver;
    @Test
    public void WikiSearch() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");
        driver.findElement(By.name("go")).click();
        Thread.sleep(6000);
        driver.quit();
    }
}
