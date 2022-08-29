package tests.loginTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.LoginPage;
import pages.herokuapp.WelcomePage;

public class NegativeLogInTest extends TestUtilities {
    @Test
    public void checkLoginNegative() {

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.clickFormAuthentication();

        loginPage.logIN("Boolean", "Boolean");


        String expectedErrorMessage = "Your username is invalid!";
        Assert.assertTrue(loginPage.getErrorMessage().contains(expectedErrorMessage),
                "Actual message is: " + loginPage.getErrorMessage() + "expectedErrorMessage is: " + expectedErrorMessage);

        Assert.assertTrue(loginPage.LoginButtonIsDisplayed(), "No login button");
    }
}
