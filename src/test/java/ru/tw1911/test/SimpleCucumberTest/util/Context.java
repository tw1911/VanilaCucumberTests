package ru.tw1911.test.SimpleCucumberTest.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Context {
    WebDriver driver;
    Deque<String> stack = new LinkedList<>();

    public WebDriver getDriver(){
        if (this.driver==null){
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public void pushToStack(String string){
        stack.push(string);
    }

    public String popFromStack(){
        return stack.pop();
    }

    public String peekFromStack(){
        return stack.peek();
    }
}
