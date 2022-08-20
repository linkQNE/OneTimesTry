package tests.keyPressesTest;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.KeyPressesPage;

public class PositiveKeyPressesTest extends TestUtilities {

    @Test
    public void checkKeyPresses(){
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver,log);
        keyPressesPage.openPage();

        keyPressesPage.pressTabKey();

        Assert.assertTrue(keyPressesPage.getResultMessage().contains("TAB"),"The TAB is not pressed");

        keyPressesPage.pressShiftKeyByAction();

        Assert.assertTrue(keyPressesPage.getResultMessage().contains("SHIFT"),"The SHIFT is not pressed by Action");
    }
}
