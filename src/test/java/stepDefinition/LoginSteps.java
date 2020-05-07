package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.SecureAreaPage;
import utils.TestContext;

import static org.testng.Assert.assertTrue;

public class LoginSteps
{
    private TestContext testContext;
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;

    public LoginSteps(TestContext context)
    {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        secureAreaPage = testContext.getPageObjectManager().getSecureAreaPage();
    }

    @When("^the user enters their username and password and logs in$")
    public void theUserEntersTheirUsernameAndPasswordAndLogsIn()
    {
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
    }

    @Then("^they are logged in and the secure area page is displayed$")
    public void theyAreLoggedInAndTheSecureAreaPageIsDisplayed()
    {
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
