package ru.tw1911.test.SimpleCucumberTest.steps;

import org.openqa.selenium.support.PageFactory;
import ru.tw1911.test.SimpleCucumberTest.pages.LoginPage;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class BaseStep {
    Context context;

    public BaseStep(Context context) {
        this.context = context;
    }

    public <T> T getPage(Class<T> clazz){
        return PageFactory.initElements(context.getDriver(), clazz);
    }
}
