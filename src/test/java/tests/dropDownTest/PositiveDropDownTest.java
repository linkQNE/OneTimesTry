package tests.dropDownTest;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.DropDownPage;
import pages.herokuapp.WelcomePage;

public class PositiveDropDownTest extends TestUtilities {

    @Test
    public void checkSelectionsForAllOptions(){
        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        DropDownPage dropDownPage = welcomePage.goToDropDownPage();

        dropDownPage.selectOption(1);
        Assert.assertEquals(dropDownPage.getSelectedOption(), "Option 1","The Options 1 is not selected");

        dropDownPage.selectOption(2);
        Assert.assertEquals(dropDownPage.getSelectedOption(), "Option 2","The Options 2 is not selected");
    }
}

