package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {


    @Test
    public void WikiSearchJava() throws InterruptedException {
        Thread.sleep(3000);
        app.getArticle().typeRequest("java");
        app.getArticle().clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "java".toLowerCase());
    }

    @Test
    public void WikiSearchQA() throws InterruptedException {
        Thread.sleep(3000);
        app.getArticle().typeRequest("QA");
        app.getArticle().clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "QA".toLowerCase());
    }

}
