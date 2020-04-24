package oldTests.javascript;

import stepDefinition.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JavaScriptTests extends Hooks
{
    @Test
    public void testScrollToTable()
    {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph()
    {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testMultipleAttribute()
    {
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);

        var selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        Assert.assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items incorrect");
    }
}
