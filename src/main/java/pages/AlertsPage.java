package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage
{
    private WebDriver driver;
    private By jsAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void triggerJsAlert()
    {
        driver.findElement(jsAlertButton).click();
    }

    public void triggerJsConfirm()
    {
        driver.findElement(jsConfirmButton).click();
    }

    public void triggerJsPrompt()
    {
        driver.findElement(jsPromptButton).click();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    public void inputToAlert(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult()
    {
        return driver.findElement(result).getText();
    }
}
