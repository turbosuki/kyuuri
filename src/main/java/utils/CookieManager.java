package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager
{
    private WebDriver driver;

    public CookieManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addCookie(Cookie cookie)
    {
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(Cookie cookie)
    {
        driver.manage().deleteCookie(cookie);
    }

    public boolean isCookiePresent(Cookie cookie)
    {
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }

    public Cookie buildCookie(String name, String value)
    {
        return new Cookie.Builder(name, value)
                .domain("https://the-internet.herokuapp.com/")
                .build();
    }

    public void setCookie()
    {
        Cookie cookie = new Cookie.Builder("kintsukuroi", "123")
                .domain("the-internet.herokuapp.com")
                .build();

        driver.manage().addCookie(cookie);
    }
}
