package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownPage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownSteps
{
    private TestContext testContext;
    private DropdownPage dropdownPage;
    final private String option = "Option 1";

    public DropdownSteps(TestContext context)
    {
        testContext = context;
        dropdownPage = testContext.getPageObjectManager().getDropdownPage();
    }


    @When("the user selects an option from the dropdown")
    public void theUserSelectsAnOptionFromTheDropdown()
    {
        dropdownPage.selectFromDropdown(option);
    }

    @Then("the user sees their selection in the dropdown")
    public void theUserSeesTheirSelectionInTheDropdown()
    {
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of options returned");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
