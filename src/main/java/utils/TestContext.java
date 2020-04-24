package utils;

public class TestContext
{
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private WindowManager windowManager;
    private CookieManager cookieManager;

    public TestContext()
    {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        windowManager = new WindowManager(webDriverManager.getDriver());
        cookieManager = new CookieManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager()
    {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager()
    {
        return pageObjectManager;
    }

    public WindowManager getWindowManager()
    {
        return windowManager;
    }

    public CookieManager getCookieManager()
    {
        return cookieManager;
    }
}