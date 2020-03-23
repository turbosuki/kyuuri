package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests
{
    @Test
    public void testFileUpload()
    {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\meganekko\\IdeaProjects\\kintsukuroi\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
