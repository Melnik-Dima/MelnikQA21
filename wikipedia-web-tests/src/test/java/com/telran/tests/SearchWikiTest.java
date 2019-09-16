package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test (priority = 2)
    public void WikiSearchJava() {
        app.typeRequest("java");
        app.clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticleTitle().toLowerCase(),"java".toLowerCase());
    }
    @Test (priority=1)
    public void WikiSearchQA() {
        app.typeRequest("QA");
        app.clickGoButton();
        //Thread.sleep(3000);
        Assert.assertEquals(app.getArticleTitle().toLowerCase(),"QA".toLowerCase());
    }

}
