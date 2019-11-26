package ru.tw1911.test.SimpleCucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"ru.tw1911.test.SimpleCucumberTest.steps"}
        ,plugin = {"pretty"}
        , tags = {"@Enabled"}
        ,snippets = SnippetType.CAMELCASE
)
public class Runner {
}
