# Playwright TestNG Project

This project is a Java test automation example using Playwright and TestNG.

It opens `https://example.com` in Chromium, verifies that the page title is `Example Domain`, and checks that the main heading contains `Example Domain`.

## Project Structure

```text
src/test/java/com/example/
  PlaywrightTest.java
  base/
    BaseTest.java
  pages/
    ExamplePage.java
```

- `BaseTest.java` handles Playwright setup, browser launch, page creation, and teardown.
- `ExamplePage.java` contains the page URL, locators, and page-specific methods.
- `PlaywrightTest.java` contains the TestNG test case and uses the page object.

## Tech Stack

- Java 17
- Maven
- Playwright Java
- TestNG

## Run Tests

Run tests in headless mode:

```bash
mvn test
```

Run tests with the browser visible:

```bash
mvn test -Dheadless=false
```

Run a clean test build:

```bash
mvn clean test
```
