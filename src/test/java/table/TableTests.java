package table;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TableTests extends BaseTests
{
    @Test
    public void testValuePresentInTable()
    {
        var tablePage = homePage.clickLargeAndDeepDom();
        assertTrue(tablePage.getColumnValuesFromTable("11").contains("7.11"));
    }
}
