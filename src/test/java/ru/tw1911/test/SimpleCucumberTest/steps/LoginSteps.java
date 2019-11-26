package ru.tw1911.test.SimpleCucumberTest.steps;

import cucumber.api.java.en.Then;
import ru.tw1911.test.SimpleCucumberTest.pages.AnotherLoginPage;
import ru.tw1911.test.SimpleCucumberTest.pages.HomePage;
import ru.tw1911.test.SimpleCucumberTest.pages.LoginPage;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class LoginSteps extends BaseStep{

    HomePage homePage;
    LoginPage loginPage;
    AnotherLoginPage anotherLoginPage;

    public LoginSteps(Context context){
        super(context);
        this.homePage=getPage(HomePage.class);
        this.loginPage=getPage(LoginPage.class);
        this.anotherLoginPage=getPage(AnotherLoginPage.class);
    }

    @Then("user login with name {string} and password {string}")
    public void loginWithNameAndPassword(String name, String password){
        homePage.clickLogin();
        loginPage.login(name,password);
        anotherLoginPage.login(name,password);
    }
}