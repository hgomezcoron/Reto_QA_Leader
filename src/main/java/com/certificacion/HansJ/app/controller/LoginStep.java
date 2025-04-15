package com.certificacion.HansJ.app.controller;

import com.certificacion.HansJ.app.page.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.fluentlenium.core.annotation.Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep extends UIInteractionSteps {

    @Page
    private LoginPage loginPage;

    @Step("Navigate to the login page SampleApp")
    public void navigateToLoginPage() {
        loginPage.open();
        loginPage.titleIsDisplayed();
    }

    @Step("Enter username and password")
    public void enterCredentials(String username, String password) {
        $(loginPage.enterUsername()).waitUntilEnabled().sendKeys(username);
        $(loginPage.enterPassword()).waitUntilEnabled().sendKeys(password);
    }

    @Step("Click the login/logout button")
    public void clickLogin() {
        $(loginPage.clickLogin()).waitUntilClickable().click();
    }

    @Step("Validate greeting message")
    public void validateGreeting(String expectedMessage) {
        String actualMessage = loginPage.messageLogIn().getText().trim();
        assertTrue(actualMessage.contains(expectedMessage),
                "Expected message to contain: " + expectedMessage + " but was: " + actualMessage);
    }
}
