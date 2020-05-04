package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage
{
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.cssSelector("#form_submit i");

    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrievePassword()
    {
        driver.findElement(retrievePasswordButton).click();
    }
}