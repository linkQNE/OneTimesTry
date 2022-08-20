package tests.iFrameTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.WYSIWYGEditorPage;

public class PositiveWYSIWYGEditorTest extends TestUtilities {

    @Test
    public void checkFrameText() {
        WYSIWYGEditorPage wysiwygEditorPage = new WYSIWYGEditorPage(driver, log);
        wysiwygEditorPage.openPage();
        wysiwygEditorPage.switchToFrame();

        wysiwygEditorPage.typeSomeTextToField("Test for example");

        Assert.assertTrue(wysiwygEditorPage.getTextFromField().contains("Test for example"));
    }
}
