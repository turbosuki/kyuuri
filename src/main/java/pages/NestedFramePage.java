package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage
{
    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getLeftFrameText()
    {
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String frameText = getFrameText();
        switchToParentFrame();
        switchToParentFrame();
        return frameText;
    }

    public String getBottomFrameText()
    {
        switchToFrame(bottomFrame);
        String frameText = getFrameText();
        switchToParentFrame();
        return frameText;
    }

    private void switchToFrame(String text)
    {
        driver.switchTo().frame(text);
    }

    private void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }

    private String getFrameText()
    {
        return driver.findElement(body).getText();
    }
}
