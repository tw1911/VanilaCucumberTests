package ru.tw1911.test.SimpleCucumberTest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class CoreSteps extends BaseStep {
    public CoreSteps(Context context) {
        super(context);
    }

    @Given("user open trello page")
    public void openTrelloPage(){
        context.getDriver().get("https://trello.com/");
    }

    @Then("user closes browser")
    public void closeBrowser(){
        context.getDriver().close();
    }
}
