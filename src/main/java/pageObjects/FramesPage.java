package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage
{
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");
    private By iFrameLink = By.linkText("iFrame");

    public void clickNestedFrames()
    {
        driver.findElement(nestedFramesLink).click();
    }

    public FramesPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
