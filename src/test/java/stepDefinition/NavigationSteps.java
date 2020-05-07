package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DynamicLoadingExample1Page;
import pageObjects.DynamicLoadingExample2Page;
import pageObjects.DynamicLoadingPage;
import utils.TestContext;

import static org.testng.Assert.*;

public class NavigationSteps
{
    private TestContext testContext;
    private DynamicLoadingPage dynamicLoadingPage;
    private DynamicLoadingExample1Page example1Page;
    private DynamicLoadingExample2Page example2Page;

    public NavigationSteps(TestContext context)
    {
        testContext = context;
        dynamicLoadingPage = testContext.getPageObjectManager().getDynamicLoadingPage();
        example1Page = testContext.getPageObjectManager().getDynamicLoadingExample1Page();
        example2Page = testContext.getPageObjectManager().getDynamicLoadingExample2Page();
    }

    @When("^the user opens the Example 2 link in a new tab$")
    public void theUserOpensTheExample2LinkInANewTab()
    {
        dynamicLoadingPage.openExample2NewTab();
        testContext.getWindowManager().switchToNewTab();
    }

    @When("the user visits the Example 1 page")
    public void theUserVisitsTheExample1Page()
    {
        dynamicLoadingPage.clickExample1();
    }

    @Then("^the user sees the Example 1 page$")
    public void theUserSeesTheExample1Page()
    {
        assertEquals(example1Page.getTitle(), "Example 1: Element on page that is hidden", "Correct page not displayed");
    }

    @Then("^the start button is displayed on the page in the new tab$")
    public void theStartButtonIsDisplayedOnThePageInTheNewTab()
    {
        assertTrue(example2Page.isStartButtonDisplayed(), "Start button is not displayed");
    }

    @And("backtracks and refreshes the page then navigates forward")
    public void backtracksAndRefreshesThePageThenNavigatesForward()
    {
        testContext.getWindowManager().goBack();
        testContext.getWindowManager().refreshPage();
        testContext.getWindowManager().goForward();
    }
}
