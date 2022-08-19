
package tests.checkBoxesTest;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.CheckBoxesPage;
import pages.herokuapp.WelcomePage;

public class PositiveCheckboxTest extends TestUtilities {

    @Test
    public void checkSelectCheckboxes() {
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        CheckBoxesPage checkBoxesPage = welcomePage.goToCheckBoxesPage();

        Assert.assertTrue(checkBoxesPage.getCurrentUrl().contains(checkBoxesPage.getCheckBoxesPageUrl()),
                "Current link is incorrect: " + checkBoxesPage.getCurrentUrl());

        checkBoxesPage.selectAllCheckboxes();
        Assert.assertTrue(checkBoxesPage.checkBoxesIsSelected(), "not all checkboxes isSelected");
    }
}
