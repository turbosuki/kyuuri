package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests
{
    @Test
    public void testRightClickAssertAlert()
    {
        var contextPage = homePage.clickContextMenu();
        contextPage.rightClickHotSpot();

        Assert.assertEquals(contextPage.getAlertText(), "You selected a context menu", "Alert text is incorrect");
        contextPage.acceptAlert();
    }
}
