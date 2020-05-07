package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pageObjects.KeyPressesPage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;

public class KeysSteps
{
    private TestContext testContext;
    private KeyPressesPage keysPage;

    public KeysSteps(TestContext context)
    {
        testContext = context;
        keysPage = testContext.getPageObjectManager().getKeyPressesPage();
    }

    @When("^they input a backspace$")
    public void theyInputABackspace()
    {
        keysPage.enterText("a" + Keys.BACK_SPACE);
    }

    @Then("^the page displays that backspace was pressed$")
    public void thePageDisplaysThatBackspaceWasPressed()
    {
        assertEquals(keysPage.getResultText(), "You entered: BACK_SPACE");
    }
}
