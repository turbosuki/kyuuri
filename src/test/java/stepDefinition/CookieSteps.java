package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import utils.CookieManager;
import utils.TestContext;

import static org.testng.Assert.assertFalse;

public class CookieSteps
{
    private TestContext testContext;
    private CookieManager cookieManager;
    private Cookie cookie;

    public CookieSteps(TestContext context)
    {
        testContext = context;
        cookieManager = testContext.getCookieManager();
    }

    @Given("a cookie is created")
    public void aCookieIsCreated()
    {
        cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
    }

    @When("the user deletes a cookie")
    public void theUserDeletesACookie()
    {
        cookieManager.deleteCookie(cookie);
    }

    @Then("the cookie is deleted")
    public void theCookieIsDeleted()
    {
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie is not deleted");
    }
}
