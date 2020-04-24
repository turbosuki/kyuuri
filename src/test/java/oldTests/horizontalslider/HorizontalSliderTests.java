package oldTests.horizontalslider;

import stepDefinition.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends Hooks
{
    @Test
    public void testSliderValue()
    {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue("4");
        Assert.assertEquals(sliderPage.getSliderValue(), "4", "Value incorrect");
    }
}
