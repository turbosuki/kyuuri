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

	public LoginPage clickFormAuthenticationLink()
	{
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}

	public void clickDropDown()
	{
		clickLink("Dropdown");
	}

	public void clickForgotPassword()
	{
		clickLink("Forgot Password");
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

	public DynamicLoadingPage clickDynamicLoading()
	{
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver);
	}

	public LargeAndDeepDomPage clickLargeAndDeepDom()
	{
		clickLink("Large & Deep DOM");
		return new LargeAndDeepDomPage(driver);
	}

	public InfiniteScrollPage clickInfiniteScroll()
	{
		clickLink("Infinite Scroll");
		return new InfiniteScrollPage(driver);
	}

	public MultipleWindowsPage clickMultipleWindows()
	{
		clickLink("Multiple Windows");
		return new MultipleWindowsPage(driver);
	}
}