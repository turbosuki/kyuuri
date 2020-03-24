package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests
{
	private WebDriver driver;
	private String baseUrl = "https://the-internet.herokuapp.com/";
	protected HomePage homePage;

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
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

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}