package ru.tw1911.test.SimpleCucumberTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//a[text()='Войти']")
    private WebElement loginButton;

    public void clickLogin(){
        loginButton.click();
    }
}
