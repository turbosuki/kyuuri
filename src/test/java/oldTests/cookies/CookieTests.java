package oldTests.cookies;

import stepDefinition.Hooks;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CookieTests extends Hooks
{
    @Test
    public void testCookieDeleted()
    {
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie is not deleted");
    }
}
