package ru.tw1911.test.SimpleCucumberTest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsIterableContaining.hasItem;

public class BoardPage {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement listTitleInput;

    @FindBy(xpath = "//input[@value='Add List']")
    private WebElement addListButton;

    @FindBy(xpath = "//div[contains(@class,'list-content')]")
    private List<WebElement> trelloLists;

    public void checkListWithNameExists(String listName){
        List<String> listNames = new ArrayList<>();
        for (WebElement list: trelloLists){
            String name = list.findElement(By.xpath(".//h2[contains(@class,'list-header-name')]")).getAttribute("innerText");
            listNames.add(name);
        };
        assertThat(listNames, hasItem(listName));
    }

    public void checkCreateListExist(){
        Assert.assertTrue(listTitleInput.isEnabled());
        Assert.assertTrue(addListButton.isEnabled());
    }

    public void typeListName(String listName) {
        listTitleInput.sendKeys(listName);
    }

    public void clickCreateList() {
        addListButton.click();
    }
}
