package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage
{
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");
    private By iFrameLink = By.linkText("iFrame");

    public NestedFramePage clickNestedFrames()
    {
        driver.findElement(nestedFramesLink).click();
        return new NestedFramePage(driver);
    }

    public FramesPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
