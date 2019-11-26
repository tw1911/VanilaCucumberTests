package ru.tw1911.test.SimpleCucumberTest.steps;

import cucumber.api.java.en.And;
import org.apache.commons.lang3.RandomStringUtils;
import ru.tw1911.test.SimpleCucumberTest.pages.BoardsPage;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class BoardsSteps extends BaseStep{
    BoardsPage boardsPage;

    public BoardsSteps(Context context) {
        super(context);
        this.boardsPage = getPage(BoardsPage.class);
    }

    @And("he creates new board")
    public void createNewBoard(){
        String generatedString = RandomStringUtils.random(10, true, false);
        boardsPage.createBoardWithName(generatedString);
    }
}
