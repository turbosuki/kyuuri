package horizontalslider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests
{
    @Test
    public void testSliderValue()
    {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue("4");
        Assert.assertEquals(sliderPage.getSliderValue(), "4", "Value incorrect");
    }
}
