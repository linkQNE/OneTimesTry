package tests.multipleWindowsTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.MultipleWindowsPage;
import pages.herokuapp.WindowPage;

public class PositiveMultipleWindowsTest extends TestUtilities {

    @Test
    public void checkOpenNewWindow(){
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage(driver,log);

        multipleWindowsPage.openPage();
        multipleWindowsPage.openNewWindow();

        WindowPage windowPage = multipleWindowsPage.switchToNewWindowTab();

        Assert.assertTrue(windowPage.getSourceOfWindowPage().contains("New Window"), "Text from new window is incorrect");
    }
}
