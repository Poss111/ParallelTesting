package per.poss.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:html-reports",
        "json:target/html-reports/cucumber.json",
        "pretty:pretty-version.html"
},
        glue = {
                "per.poss.steps"
        },
        features = {
                "src/test/resources"
        })
public class Runner {

    @Before
    public void before() {

    }
}
