package oldTests.wait;

import stepDefinition.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends Hooks
{
    @Test
    public void testWaitUntilHiddenExample1()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilDisplayedExample2()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
