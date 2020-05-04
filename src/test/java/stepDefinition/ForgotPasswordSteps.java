package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmailSentPage;
import pageObjects.ForgotPasswordPage;
import utils.TestContext;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordSteps
{
    private TestContext testContext;
    private ForgotPasswordPage forgotPasswordPage;
    private EmailSentPage emailSentPage;

    public ForgotPasswordSteps(TestContext context)
    {
        testContext = context;
        forgotPasswordPage = testContext.getPageObjectManager().getForgotPasswordPage();
        emailSentPage = testContext.getPageObjectManager().getEmailSentPage();
    }

    @When("^the user submits a password reset$")
    public void theUserSubmitsAPasswordReset()
    {
        forgotPasswordPage.enterEmail("tau@example.com");
        forgotPasswordPage.clickRetrievePassword();
    }

    @Then("^the page displays the password reset was successful$")
    public void thePageDisplaysThePasswordResetWasSuccessful()
    {
        assertTrue(emailSentPage.getPasswordResetMessage().contains("Your e-mail's been sent!"),
                "Incorrect message displayed");
    }
}