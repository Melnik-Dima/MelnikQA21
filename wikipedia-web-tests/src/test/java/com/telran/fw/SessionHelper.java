package com.telran.fw;

import com.telran.fw.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
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
}
