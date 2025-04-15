package com.certificacion.HansJ.app.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.certificacion.HansJ.app.helpers.ConstantSampleApp.*;

@DefaultUrl("http://uitestingplayground.com/sampleapp")
public class LoginPage extends PageObject {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean titleIsDisplayed() {
        return $(TITLE_SIMPLE_APP).isDisplayed();
    }

    public By enterUsername() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        return By.xpath(INPUT_USERNAME);
    }

    public By enterPassword() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        return By.xpath(INPUT_PASSWORD);
    }

    public By clickLogin() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        return By.xpath(BUTTON_LOGIN);
    }

    public WebElementFacade messageLogIn() {
        return find(By.xpath(LABEL_LOGIN_STATUS));
    }
}
