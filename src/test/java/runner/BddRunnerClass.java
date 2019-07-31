package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        features = "src/test/features", snippets = SnippetType.CAMELCASE,
        glue = {"/src/test/java/Step_definitions"},
        plugin = {"pretty", "html:target/cucumberHtmlReport"}
)
public class BddRunnerClass {

}

