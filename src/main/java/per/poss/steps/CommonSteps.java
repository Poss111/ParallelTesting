package per.poss.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class CommonSteps {

    private static final Logger LOG = LoggerFactory.getLogger(CommonSteps.class);

    @Given("I navigate to {string}")
    public void navigateToUrl(String urlToNavigateTo) {
        LOG.info("Navigating to given url ('{}')", urlToNavigateTo);
        open(urlToNavigateTo);
    }

    @When("I type {string} into the search box")
    public void iTypeSearchItemIntoTheSearchBox(String searchItem) {
        LOG.info("Searching for Item ('{}')", searchItem);
        $("input.gLFyf").sendKeys(searchItem);
        LOG.info("Clicking Search...");
        $("input.gNO89b").click();
    }

    @Then("I will see {string}")
    public void iWillSeeSearchItem(String searchedTerm) {
        LOG.info("Validating for Search Item ('{}')", searchedTerm);
        $$("div.bkWMgd>h2+div>div>div>div>div>a>h3").first().shouldHave(Condition.matchText(searchedTerm));
    }
}
