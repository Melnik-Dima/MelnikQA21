package com.telran.tests;

import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {
    @Test
    public void WikiSearchJava() throws InterruptedException {
        typeRequest("java");
        clickGoButton();
        Thread.sleep(3000);
    }
    @Test
    public void WikiSearchQA() throws InterruptedException {
        typeRequest("QA");
        clickGoButton();
        Thread.sleep(3000);
    }

}
