package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.ContextMenuPage;
import utils.TestContext;

public class ContextMenuSteps
{
    private TestContext testContext;
    private ContextMenuPage contextMenuPage;

    public ContextMenuSteps(TestContext context)
    {
        testContext = context;
        contextMenuPage = testContext.getPageObjectManager().getContextMenuPage();
    }

    @When("the user right clicks the hotspot")
    public void theUserRightClicksTheHotspot()
    {
        contextMenuPage.rightClickHotSpot();
    }

    @Then("the page displays an alert")
    public void thePageDisplaysAnAlert()
    {
        Assert.assertEquals(contextMenuPage.getAlertText(), "You selected a context menu",
                "Alert text is incorrect");
        contextMenuPage.acceptAlert();
    }
}
