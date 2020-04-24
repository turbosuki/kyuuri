package oldTests.navigation;

import stepDefinition.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTests extends Hooks
{
    @Test
    public void testSwitchToNewTab()
    {
        var newTab = homePage.clickDynamicLoading().openExample2NewTab();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(newTab.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
