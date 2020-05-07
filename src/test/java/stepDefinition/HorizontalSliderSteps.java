package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HorizontalSliderPage;
import utils.TestContext;

import static org.testng.Assert.*;

public class HorizontalSliderSteps
{
    private TestContext testContext;
    private HorizontalSliderPage sliderPage;

    public HorizontalSliderSteps(TestContext context)
    {
        testContext = context;
        sliderPage = testContext.getPageObjectManager().getHorizontalSliderPage();
    }

    @When("^the user moves the slider to position \"([^\"]*)\"$")
    public void theUserMovesTheSliderToPosition(String position)
    {
        sliderPage.setSliderValue(position);
    }

    @Then("^the page displays the slider was moved to position \"([^\"]*)\"$")
    public void thePageDisplaysTheSliderWasMovedToPosition(String position)
    {
        assertEquals(sliderPage.getSliderValue(), position, "Value incorrect");
    }
}
