package ru.tw1911.test.SimpleCucumberTest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import ru.tw1911.test.SimpleCucumberTest.pages.BoardPage;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class InsideBoardSteps extends BaseStep{

    BoardPage boardPage;

    public InsideBoardSteps(Context context) {
        super(context);
        this.boardPage = getPage(BoardPage.class);
    }

    @Then("he sees create list dialog")
    public void checkCreateListDialgExists(){
        boardPage.checkCreateListExist();
    }

    @When("he create list with name {string}")
    public void inputListName(String listName){
        boardPage.typeListName(listName);
        boardPage.clickCreateList();
    }

    @When("he create list with random name with length {int} and store in's name")
    public void inputRandomListName(int length){
        String generatedString = RandomStringUtils.random(length, true, false);
        boardPage.typeListName(generatedString);
        boardPage.clickCreateList();
        context.pushToStack(generatedString);
    }

    @Then("he checks that the list has been created")
    public void checkListExistence(){
        boardPage.checkListWithNameExists(context.popFromStack());
    }

    @Then("he checks that the list has been created with clipped name")
    public void checkListWithClippedNameExistence(){
        boardPage.checkListWithNameExists(context.popFromStack().substring(0,512));
    }

    @Then("checks list with name {string} existence")
    public void checkListWithNameExistence(String listName){
        boardPage.checkListWithNameExists(listName);
    }
}
