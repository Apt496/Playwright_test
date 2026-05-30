package com.example;

import com.example.base.BaseTest;
import com.example.pages.ExamplePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaywrightTest extends BaseTest {

    @Test
    public void testExampleDomainLoads() {
        ExamplePage examplePage = new ExamplePage(page);

        examplePage.navigate();

        Assert.assertEquals(examplePage.getTitle(), "Example Domain");
        Assert.assertTrue(examplePage.getHeadingText().contains("Example Domain"));
    }
}
