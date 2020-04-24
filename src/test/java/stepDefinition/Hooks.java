package stepDefinition;

import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import pageObjects.HomePage;
import utils.CookieManager;
import utils.PageObjectManager;
import utils.WebDriverManager;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks
{
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	private static WebDriver driver;
	private String baseUrl = "https://the-internet.herokuapp.com/";
	protected HomePage homePage;

	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		goHome();
	}

	@BeforeMethod
	public void goHome()
	{
		driver.get(baseUrl);
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void recordFailure(ITestResult result)
	{
		if (ITestResult.FAILURE == result.getStatus())
		{
			try
			{
				File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}

	public WindowManager getWindowManager()
	{
		return new WindowManager(driver);
	}

	public CookieManager getCookieManager()
	{
		return new CookieManager(driver);
	}

	private ChromeOptions getChromeOptions()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		return options;
	}

	private void setCookie()
	{
		Cookie cookie = new Cookie.Builder("kintsukuroi", "123")
				.domain("the-internet.herokuapp.com")
				.build();

		driver.manage().addCookie(cookie);
	}
}