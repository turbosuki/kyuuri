package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage
{
    private WebDriver driver;
    private String editorIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("#mceu_12 button");

    public WysiwygEditorPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void enterTextInTextArea(String text)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndentation()
    {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextEditorText()
    {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea()
    {
        driver.switchTo().frame(editorIframe);
    }

    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }
}
