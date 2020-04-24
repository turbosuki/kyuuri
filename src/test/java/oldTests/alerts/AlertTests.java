package oldTests.alerts;

import stepDefinition.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests
{
    /*@Test
    public void testAcceptAlert()
    {
        var alertPage = homePage.clickJavascriptAlerts();
        alertPage.triggerJsAlert();
        alertPage.acceptAlert();

        assertEquals(alertPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert()
    {
        var alertPage = homePage.clickJavascriptAlerts();
        alertPage.triggerJsConfirm();

        String alertText = alertPage.getTextFromAlert();
        alertPage.dismissAlert();

        assertEquals(alertText, "I am a JS Confirm", "Alert text is incorrect");
    }

    @Test
    public void testInputInAlert()
    {
        var alertPage = homePage.clickJavascriptAlerts();
        alertPage.triggerJsPrompt();

        String inputText = "This is some text";
        alertPage.inputToAlert(inputText);
        alertPage.acceptAlert();

        assertEquals(alertPage.getResult(), "You entered: " + inputText, "Result text is incorrect");
    }
*/
}
