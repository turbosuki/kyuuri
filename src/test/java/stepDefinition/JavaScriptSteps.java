package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.DropdownPage;
import utils.TestContext;

import java.util.List;

public class JavaScriptSteps
{
    private TestContext testContext;
    private DropdownPage dropdownPage;
    private List<String> optionsToSelect = List.of("Option 1", "Option 2");

    public JavaScriptSteps(TestContext context)
    {
        testContext = context;
        dropdownPage = testContext.getPageObjectManager().getDropdownPage();
    }

    @When("multiple options are selected from the dropdown")
    public void multipleOptionsAreSelectedFromTheDropdown()
    {
        dropdownPage.addMultipleAttribute();
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);
    }

    @Then("the page shows multiple options are selected")
    public void thePageShowsMultipleOptionsAreSelected()
    {
        var selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        Assert.assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items incorrect");
    }
}
