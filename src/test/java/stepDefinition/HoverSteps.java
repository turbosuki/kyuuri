package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HoversPage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverSteps
{
    private TestContext testContext;
    private HoversPage hoversPage;
    private HoversPage.FigureCaption caption;

    public HoverSteps(TestContext context)
    {
        testContext = context;
        hoversPage = testContext.getPageObjectManager().getHoversPage();
    }

    @When("^the user hovers over a user$")
    public void theUserHoversOverAUser()
    {
        caption = hoversPage.hoverOverFigure(1);
    }

    @Then("^the page displays information about the user$")
    public void thePageDisplaysInformationAboutTheUser()
    {
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Incorrect caption title");
        assertEquals(caption.getLinkText(), "View profile", "incorrect link text");
        assertTrue(caption.getLink().endsWith("/users/1"), "link incorrect");
    }
}
