package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage
{
    private WebDriver driver;
    private By fileUploadButton = By.id("file-submit");
    private By fileInputField = By.id("file-upload");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickUploadButton()
    {
        driver.findElement(fileUploadButton).click();
    }

    public void uploadFile(String filePath)
    {
        driver.findElement(fileInputField).sendKeys(filePath);
        clickUploadButton();
    }

    public String getUploadedFile()
    {
        return driver.findElement(uploadedFiles).getText();
    }
}
