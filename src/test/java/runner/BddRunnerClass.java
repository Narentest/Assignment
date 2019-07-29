package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        features = "/Users/deekondanarender/Desktop/OIshoppinglist-rbs/src/test/features", snippets = SnippetType.CAMELCASE,
        glue = {"/src/test/java/Step_definitions"},
        plugin = {"pretty", "html:target/cucumberHtmlReport"}
)
public class BddRunnerClass {
    File f = new File("src/test/java/utils");
}

