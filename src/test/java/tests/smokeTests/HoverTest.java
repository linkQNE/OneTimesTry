package tests.smokeTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.HoverPage;

public class HoverTest extends TestUtilities {


    @Test
    public void checkSelectionInHoverOver(){
        HoverPage hoverPage = new HoverPage(driver,log);
        hoverPage.openPage();


        hoverPage.selectAvatarByIndex(2);
        sleep(2000);
        Assert.assertTrue(hoverPage.getCurrentUrl().contains("users/2"),"user 2 is not selected");
    }
}
