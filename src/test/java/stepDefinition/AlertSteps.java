package stepDefinition;

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

    @When("^the user accepts the alert$")
    public void theUserAcceptsTheAlert()
    {
        alertsPage.acceptAlert();
    }

    @Then("^the alert is dismissed$")
    public void theAlertIsDismissed()
    {
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }
}
