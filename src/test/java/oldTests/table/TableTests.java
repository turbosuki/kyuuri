package oldTests.table;

import stepDefinition.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TableTests extends Hooks
{
    @Test
    public void testValuePresentInTable()
    {
        var tablePage = homePage.clickLargeAndDeepDom();
        assertTrue(tablePage.getColumnValuesFromTable("11").contains("7.11"));
    }
}
