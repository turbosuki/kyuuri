package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	private WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	private void clickLink(String linktext)
	{
		driver.findElement(By.linkText(linktext)).click();
	}

	public LoginPage clickFormAuthenticationLink()
	{
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}

	public DropdownPage clickDropDown()
	{
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}

	public ForgotPasswordPage clickForgotPassword()
	{
		clickLink("Forgot Password");
		return new ForgotPasswordPage(driver);
	}

	public HoversPage clickHovers()
	{
		clickLink("Hovers");
		return new HoversPage(driver);
	}

	public KeyPressesPage clickKeyPresses()
	{
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}

	public HorizontalSliderPage clickHorizontalSlider()
	{
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}

	public AlertsPage clickJavascriptAlerts()
	{
		clickLink("JavaScript Alerts");
		return new AlertsPage(driver);
	}
}