package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("^the user accesses the File Upload page$")
    public void theUserAccessesTheFileUploadPage()
    {
        homePage.clickFileUpload();
    }

    @Given("^the user accesses the Dropdown page$")
    public void theUserAccessesTheDropdownPage()
    {
        homePage.clickDropDown();
    }

    @Given("^the user accesses the Forgot Password page$")
    public void theUserAccessesTheForgotPasswordPage()
    {
        homePage.clickForgotPassword();
    }

    @Given("^the user accesses the Frames page$")
    public void theUserAccessesTheFramesPage()
    {
        homePage.clickFrames();
    }

    @Given("^the user accesses the WYSIWYG Editor page$")
    public void theUserAccessesTheWYSIWYGEditorPage()
    {
        homePage.clickWysiwygEditor();
    }

    @Given("^the user accesses the Horizontal Slider page$")
    public void theUserAccessesTheHorizontalSliderPage()
    {
        homePage.clickHorizontalSlider();
    }

    @Given("^the user accesses the Hover page$")
    public void theUserAccessesTheHoverPage()
    {
        homePage.clickHovers();
    }

    @Given("^the user accesses the Key Presses page$")
    public void theUserAccessesTheKeyPressesPage()
    {
        homePage.clickKeyPresses();
    }

    @Given("^the user accesses the Form Authentication page$")
    public void theUserAccessesTheFormAuthenticationPage()
    {
        homePage.clickFormAuthenticationLink();
    }

    @Given("^the user accesses the Dynamic Loading page$")
    public void theUserAccessesTheDynamicLoadingPage()
    {
        homePage.clickDynamicLoading();
    }

    @When("^the user accesses the Large and Deep Dom page$")
    public void theUserAccessesTheLargeAndDeepDomPage()
    {
        homePage.clickLargeAndDeepDom();
    }
}