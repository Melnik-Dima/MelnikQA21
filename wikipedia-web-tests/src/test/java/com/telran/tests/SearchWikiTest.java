package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {

    WebDriver driver;
    @Test
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
        driver.findElement(By.name("search")).sendKeys("java");
        Thread.sleep(6000);
        driver.quit();

    }
}
