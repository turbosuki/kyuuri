package dataProvider;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader
{
    private Properties properties;
    private final String propertyFilePath = "config/Configuration.properties";

    public ConfigFileReader()
    {
        BufferedReader reader;
        try
        {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try
            {
                properties.load(reader);
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath() throws RuntimeException
    {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null)
        {
            return driverPath;
        }
        else
        {
            throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
        }
    }

    public long getImplicitlyWait() throws RuntimeException
    {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null)
        {
            return Long.parseLong(implicitlyWait);
        }
        else
        {
            throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
        }
    }

    public String getApplicationUrl() throws RuntimeException
    {
        String url = properties.getProperty("url");
        if (url != null)
        {
            return url;
        }
        else
        {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    public DriverType getBrowser()
    {
        String browserName = properties.getProperty("browser");

        switch (browserName)
        {
            case "chrome":
                return DriverType.CHROME;
            case "firefox":
                return DriverType.FIREFOX;
            case "iexplorer":
                return DriverType.INTERNETEXPLORER;
            default:
                throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
        }
    }

    public EnvironmentType getEnvironment()
    {
        String environmentName = properties.getProperty("environment");

        switch (environmentName)
        {
            case "local":
                return EnvironmentType.LOCAL;
            case "remote":
                return EnvironmentType.REMOTE;
            default:
                throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
        }
    }

    public Boolean getBrowserWindowSize()
    {
        String windowSize = properties.getProperty("windowMaximize");

        if (windowSize != null)
        {
            return Boolean.valueOf(windowSize);
        }

        return true;
    }
}
