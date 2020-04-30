package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import enums.DriverType;
import enums.EnvironmentType;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager
{
    private WebDriver driver;
    private DriverType driverType;
    private EnvironmentType environmentType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public WebDriverManager()
    {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
    }

    public WebDriver getDriver()
    {
        if (driver == null)
        {
            driver = createDriver();
        }

        return driver;
    }

    private WebDriver createDriver()
    {
        switch (environmentType)
        {
            case LOCAL : driver = createLocalDriver();
                break;
            case REMOTE : driver = createRemoteDriver();
                break;
        }

        return driver;
    }

    private WebDriver createRemoteDriver()
    {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    private WebDriver createLocalDriver()
    {
        switch (driverType)
        {
            case FIREFOX:
                throw new RuntimeException("Firefox driver is not yet implemented");
            case CHROME:
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
                driver = new ChromeDriver(getChromeOptions());
                break;
            case INTERNETEXPLORER:
                throw new RuntimeException("Internet Explorer driver is not yet implemented");
        }

        if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
        {
            driver.manage().window().maximize();
        }

        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

        return driver;
    }

    public void teardown()
    {
        driver.close();
        driver.quit();
    }

    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        // set options here when finished
        return options;
    }
}