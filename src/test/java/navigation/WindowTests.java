package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTests extends BaseTests
{
    @Test
    public void testSwitchToNewTab()
    {
        var newTab = homePage.clickDynamicLoading().openExample2NewTab();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(newTab.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
