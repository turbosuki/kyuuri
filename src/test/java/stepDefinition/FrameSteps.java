package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FramesPage;
import pageObjects.NestedFramePage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;

public class FrameSteps
{
    private TestContext testContext;
    private FramesPage framesPage;
    private NestedFramePage nestedFramePage;

    public FrameSteps(TestContext context)
    {
        testContext = context;
        framesPage = testContext.getPageObjectManager().getFramesPage();
        nestedFramePage = testContext.getPageObjectManager().getNestedFramePage();
    }

    @When("^the user loads the Nested Frames page$")
    public void theUserLoadsTheNestedFramesPage()
    {
        framesPage.clickNestedFrames();
    }

    @Then("^the page displays text in iframes$")
    public void thePageDisplaysTextInIframes()
    {
        assertEquals(nestedFramePage.getLeftFrameText(), "LEFT", "Frame text incorrect");
        assertEquals(nestedFramePage.getBottomFrameText(), "BOTTOM", "Frame text incorrect");
    }
}
