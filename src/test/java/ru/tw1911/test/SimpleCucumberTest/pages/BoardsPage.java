package ru.tw1911.test.SimpleCucumberTest.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardsPage extends AbstractPage{
    @FindBy(xpath = "//span[text()='Create new board']")
    private WebElement createNewBoardButton;

    @FindBy(xpath = "//input[@data-test-id='create-board-title-input']")
    private WebElement boardTitleInput;

    @FindBy(xpath = "//button[.//span[text()='Create Board']]")
    private WebElement createBoardButton;

    public void createBoardWithName(String name){
        createNewBoardButton.click();
        boardTitleInput.sendKeys(name);
        createBoardButton.click();
    }
}
