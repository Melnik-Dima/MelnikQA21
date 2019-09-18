package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test (priority = 2)
    public void WikiSearchJava() {
        app.getArticle().typeRequest("java");
        app.getArticle().clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "java".toLowerCase());
    }
    @Test (priority=1)
    public void WikiSearchQA() {
        app.getArticle().typeRequest("QA");
        app.getArticle().clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(), "QA".toLowerCase());
    }

}
