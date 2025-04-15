package com.certificacion.HansJ.stepDefinitions.sampleApp;

import com.certificacion.HansJ.app.controller.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    private LoginStep loginSteps;

    @Given("the user is on the login page SampleAPP")
    public void theUserIsOnTheLoginPageSampleAPP() {
        loginSteps.navigateToLoginPage();
    }

    @Given("the user enters username {} and password {}")
    public void theUserEntersValidCredentials(String username, String password) {
        if(username.equals("-"))username="";
        if(password.equals("-"))password="";
        loginSteps.enterCredentials(username, password);
    }

    @Given("the user successfully login with username {} and password {}")
    public void theUserSuccessfullyLoginWithUsernameTestUserAndPasswordPwd(String username, String password) {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(username, password);
        loginSteps.clickLogin();
    }

    @When("clicks the login button")
    public void clicksTheLoginButton() {
        loginSteps.clickLogin();
    }

    @Then("the message should say {}")
    public void theWelcomeMessageShouldDisplay(String expectedMessage) {
        loginSteps.validateGreeting(expectedMessage);
    }

    @When("the user clicks logout button")
    public void theUserClicksLogoutButton() {
        loginSteps.clickLogin();
    }
}
