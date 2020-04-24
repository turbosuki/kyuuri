package oldTests.alerts;

import stepDefinition.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends Hooks
{
    @Test
    public void testFileUpload()
    {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\meganekko\\IdeaProjects\\kintsukuroi\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
