package stepDefinition;

import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

import utils.*;

import java.io.File;
import java.io.IOException;

public class Hooks
{
	TestContext testContext;

	public Hooks(TestContext context)
	{
		testContext = context;
	}

	@Before
	public void setUp()
	{
		testContext.getWebDriverManager().getDriver()
				.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@After
	public void recordFailure(Scenario scenario)
	{
		if (scenario.isFailed())
		{
			try
			{
				File screenshot = ((TakesScreenshot)testContext.getWebDriverManager().getDriver())
						.getScreenshotAs(OutputType.FILE);
				Files.move(screenshot, new File("resources/screenshots/" + scenario.getName() + ".png"));
			}
			catch (WebDriverException webDriverException)
			{
				System.err.println(webDriverException.getMessage());
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
		testContext.getWebDriverManager().teardown();
	}
}