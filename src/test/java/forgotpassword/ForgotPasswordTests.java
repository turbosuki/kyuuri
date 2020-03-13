package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests
{
    @Test
    public void testSuccessfulPasswordReset()
    {
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("tau@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(emailSentPage.getPasswordResetMessage().contains("Your e-mail's been sent!"),
                "Incorrect message displayed");
    }
}