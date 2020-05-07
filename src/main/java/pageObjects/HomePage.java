package pageObjects;

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

	public void clickFormAuthenticationLink()
	{
		clickLink("Form Authentication");
	}

	public void clickDropDown()
	{
		clickLink("Dropdown");
	}

	public void clickForgotPassword()
	{
		clickLink("Forgot Password");
	}

	public void clickHovers()
	{
		clickLink("Hovers");
	}

	public void clickKeyPresses()
	{
		clickLink("Key Presses");
	}

	public void clickHorizontalSlider()
	{
		clickLink("Horizontal Slider");
	}

	public void clickJavascriptAlerts()
	{
		clickLink("JavaScript Alerts");
	}

	public void clickFileUpload()
	{
		clickLink("File Upload");
	}

	public void clickContextMenu()
	{
		clickLink("Context Menu");
	}

	public void clickWysiwygEditor()
	{
		clickLink("WYSIWYG Editor");
	}

	public void clickFrames()
	{
		clickLink("Frames");
	}

	public void clickDynamicLoading()
	{
		clickLink("Dynamic Loading");
	}

	public void clickLargeAndDeepDom()
	{
		clickLink("Large & Deep DOM");
	}

	public void clickInfiniteScroll()
	{
		clickLink("Infinite Scroll");
	}

	public void clickMultipleWindows()
	{
		clickLink("Multiple Windows");
	}
}