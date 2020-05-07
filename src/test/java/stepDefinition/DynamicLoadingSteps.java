package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.DynamicLoadingExample1Page;
import pageObjects.DynamicLoadingExample2Page;
import pageObjects.DynamicLoadingPage;
import utils.TestContext;

public class DynamicLoadingSteps
{
    private TestContext testContext;
    private DynamicLoadingPage dynamicLoadingPage;
    private DynamicLoadingExample1Page example1Page;
    private DynamicLoadingExample2Page example2Page;

    public DynamicLoadingSteps(TestContext context)
    {
        testContext = context;
        dynamicLoadingPage = testContext.getPageObjectManager().getDynamicLoadingPage();
        example1Page = testContext.getPageObjectManager().getDynamicLoadingExample1Page();
        example2Page = testContext.getPageObjectManager().getDynamicLoadingExample2Page();
    }


    @Given("^the user accesses Example 1$")
    public void theUserAccessesExample1()
    {
        dynamicLoadingPage.clickExample1();
    }

    @Given("^the user accesses Example 2$")
    public void theUserAccessesExample2()
    {
        dynamicLoadingPage.clickExample2();
    }

    @When("^the user clicks the Example 1 start button$")
    public void theUserClicksTheExample1StartButton()
    {
        example1Page.clickStart();
    }

    @When("^the user clicks the Example 2 start button$")
    public void theUserClicksTheExample2StartButton()
    {
        example2Page.clickStart();
    }

    @Then("^the Example 1 page displays confirmation text after loading finishes$")
    public void theExample1PageDisplaysConfirmationTextAfterLoadingFinishes()
    {
        Assert.assertEquals(example1Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Then("^the Example 2 page displays confirmation text after loading finishes$")
    public void theExample2PageDisplaysConfirmationTextAfterLoadingFinishes()
    {
        Assert.assertEquals(example2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
