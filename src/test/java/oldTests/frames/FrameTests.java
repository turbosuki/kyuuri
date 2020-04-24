package oldTests.frames;

import stepDefinition.Hooks;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTests
{
   /* @Test
    public void testWysiwigEditor()
    {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello";
        String text2 = " world";

        editorPage.enterTextInTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.enterTextInTextArea(text2);

        assertEquals(editorPage.getTextEditorText(), text1 + text2, "Editor text incorrect");
    }

    @Test
    public void testTextFromIframes()
    {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();

        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Frame text incorrect");
    }*/
}
