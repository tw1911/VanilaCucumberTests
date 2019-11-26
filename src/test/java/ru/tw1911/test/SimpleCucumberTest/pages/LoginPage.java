package ru.tw1911.test.SimpleCucumberTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage{
    @FindBy(name = "user")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Войти']")
    private WebElement loginButton;

    public void login(String name, String password) {
        loginInput.sendKeys(name);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
