package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.WysiwygEditorPage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;

public class EditorSteps
{
    private TestContext testContext;
    private WysiwygEditorPage editorPage;

    public EditorSteps(TestContext context)
    {
        testContext = context;
        editorPage = testContext.getPageObjectManager().getWysiwygEditorPage();
    }

    @When("^the user inputs \"([^\"]*)\" and \"([^\"]*)\" and indents$")
    public void theUserInputsAndAndIndents(String text1, String text2)
    {
        editorPage.clearTextArea();
        editorPage.enterTextInTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.enterTextInTextArea(text2);
    }

    @Then("^\"([^\"]*)\" is displayed in the textbox$")
    public void isDisplayedInTheTextbox(String input)
    {
        assertEquals(editorPage.getTextEditorText(), input, "Editor text incorrect");
    }
}
