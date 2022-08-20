package tests.smokeTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.WelcomePage;

public class simpleActionsTest extends TestUtilities {

    @Test
    public void scrollTest(){
        WelcomePage welcomePage = new WelcomePage(driver,log);

        welcomePage.openPage();
        welcomePage.scrollToFooter();
        sleep(2000);
    }
}
