package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AlertsPage;
import utils.TestContext;

import static org.testng.Assert.assertEquals;

public class AlertSteps
{
    TestContext testContext;
    AlertsPage alertsPage;

    public AlertSteps(TestContext context)
    {
        testContext = context;
        alertsPage = testContext.getPageObjectManager().getAlertsPage();
    }

    @Given("^the user has triggered a Javascript Alert$")
    public void theUserHasTriggeredAJavascriptAlert()
    {
        alertsPage.triggerJsAlert();
    }

    @Given("^the user has triggered a Javascript Confirm Alert$")
    public void theUserHasTriggeredAJavascriptConfirmAlert()
    {
        alertsPage.triggerJsConfirm();
    }

    @Given("^the user has triggered a Javascript Prompt Alert$")
    public void theUserHasTriggeredAJavascriptPromptAlert()
    {
        alertsPage.triggerJsPrompt();
    }

    @When("^the user accepts the alert$")
    public void theUserAcceptsTheAlert()
    {
        alertsPage.acceptAlert();
    }

    @When("^the user dismisses the alert$")
    public void theUserDismissesTheAlert()
    {
        alertsPage.dismissAlert();
    }

    @When("^the user inputs \"([^\"]*)\" and accepts the alert$")
    public void theUserInputsAndAcceptsTheAlert(String inputText)
    {
        alertsPage.inputToAlert(inputText);
        alertsPage.acceptAlert();
    }

    @Then("^the alert is dismissed$")
    public void theAlertIsDismissed()
    {
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }

    @Then("^\"([^\"]*)\" is displayed on the webpage$")
    public void isDisplayedOnTheWebpage(String inputText)
    {
        assertEquals(alertsPage.getResult(), "You entered: " + inputText, "Result text is incorrect");
    }

    @Then("^the page displays that the user cancelled the alert$")
    public void thePageDisplaysThatTheUserCancelledTheAlert()
    {
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Button choice text is incorrect");
    }

    @Then("^the page displays that the user accepted the alert$")
    public void thePageDisplaysThatTheUserAcceptedTheAlert()
    {
        assertEquals(alertsPage.getResult(), "You clicked: Ok", "Button choice text is incorrect");
    }

    @And("^sees the Javascript Confirm alert text$")
    public void seesTheJavascriptConfirmAlertText()
    {
        String alertText = alertsPage.getTextFromAlert();
        assertEquals(alertText, "I am a JS Confirm", "Alert text is incorrect");
    }
}
