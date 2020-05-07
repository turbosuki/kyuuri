package stepDefinition;

import io.cucumber.java.en.Then;
import pageObjects.LargeAndDeepDomPage;
import utils.TestContext;

import static org.testng.Assert.assertTrue;

public class TableSteps
{
    private TestContext testContext;
    private LargeAndDeepDomPage largeAndDeepDomPage;

    public TableSteps(TestContext context)
    {
        testContext = context;
        largeAndDeepDomPage = testContext.getPageObjectManager().getLargeAndDeepDomPage();
    }

    @Then("the page displays the value \"([^\"]*)\" in column \"([^\"]*)\"$")
    public void thePageDisplaysTheValueInColumn(String value, String column)
    {
        assertTrue(largeAndDeepDomPage.getColumnValuesFromTable(column).contains(value));
    }
}
