package ru.tw1911.test.SimpleCucumberTest.steps;

import cucumber.api.java.After;
import ru.tw1911.test.SimpleCucumberTest.util.Context;

public class Hooks {
    Context context;

    public Hooks(Context context){
        this.context=context;
    }

    @After
    public void closeBrowser(){
        //context.getDriver().close();
    }
}
