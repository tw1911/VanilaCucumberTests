package ru.tw1911.test.SimpleCucumberTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherLoginPage extends AbstractPage {

    @FindBy(id = "username")
    private WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button//span[text()='Продолжить']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[.//span/text()='Войти']")
    private WebElement loginButton;

    public void login(String name, String password) {
        loginInput.clear();
        loginInput.sendKeys(name);
        continueButton.click();
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
