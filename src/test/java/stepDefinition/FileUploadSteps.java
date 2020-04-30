package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FileUploadPage;
import utils.TestContext;

import static org.testng.Assert.*;

public class FileUploadSteps
{
    private TestContext testContext;
    private FileUploadPage fileUploadPage;

    public FileUploadSteps(TestContext context)
    {
        testContext = context;
        fileUploadPage = testContext.getPageObjectManager().getFileUploadPage();
    }

    @When("^they upload a file$")
    public void theyUploadAFile()
    {
        fileUploadPage.uploadFile("C:\\Users\\meganekko\\IdeaProjects\\kyuuri\\src\\test\\resources\\drivers" +
                "\\chromedriver.exe");
    }

    @Then("^the user sees the name of the file they uploaded on the page$")
    public void theUserSeesTheNameOfTheFileTheyUploadedOnThePage()
    {
        assertEquals(fileUploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
