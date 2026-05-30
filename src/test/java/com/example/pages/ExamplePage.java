package com.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ExamplePage {
    private static final String URL = "https://example.com";

    private final Page page;
    private final Locator heading;

    public ExamplePage(Page page) {
        this.page = page;
        this.heading = page.locator("h1");
    }

    public void navigate() {
        page.navigate(URL);
    }

    public String getTitle() {
        return page.title();
    }

    public String getHeadingText() {
        return heading.textContent();
    }
}
