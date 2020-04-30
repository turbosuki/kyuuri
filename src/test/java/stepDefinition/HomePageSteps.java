package stepDefinition;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;
import utils.TestContext;

public class HomePageSteps
{
    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context)
    {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^the user accesses the Alerts page$")
    public void theUserAccessTheAlertsPage()
    {
        homePage.clickJavascriptAlerts();
    }

    @Given("^the user accesses the Context Menu page$")
    public void theUserAccessTheContextMenuPage()
    {
        homePage.clickContextMenu();
    }

    @Given("the user accesses the File Upload page")
    public void theUserAccessesTheFileUploadPage()
    {
        homePage.clickFileUpload();
    }

    @Given("^the user accesses the Dropdown page$")
    public void theUserAccessesTheDropdownPage()
    {
        homePage.clickDropDown();
    }
}