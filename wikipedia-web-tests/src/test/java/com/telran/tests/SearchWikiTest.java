package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {


    @Test(priority = 2)
    public void searchWikiTestJava() {
        app.getArticle().typeRequest("java");
        app.getArticle().clickGoButton();
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "java".toLowerCase());

    }

    @Test(priority = 1)
    public void searchWikiTestQA() throws InterruptedException {
        Thread.sleep(10000);
        app.getArticle().typeRequest("QA");
        app.getArticle().clickGoButton();
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "QA".toLowerCase());
        //pause
    }

}