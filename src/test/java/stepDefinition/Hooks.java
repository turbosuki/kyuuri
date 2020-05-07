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
	public void tearDown()
	{
		testContext.getWebDriverManager().teardown();
	}
}