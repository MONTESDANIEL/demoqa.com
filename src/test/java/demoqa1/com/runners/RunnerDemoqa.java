package demoqa1.com.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/demoqa1.feature",
        tags = " @General",
        glue = "demoqa1.com.stepdefinitions",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerDemoqa {

}
