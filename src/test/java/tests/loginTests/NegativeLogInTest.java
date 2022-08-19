package tests.loginTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.LoginPage;
import pages.herokuapp.WelcomePage;

public class NegativeLogInTest extends TestUtilities {
    @Test
    public void checkLoginNegative() {

        log.info("Go to WelcomePage");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        log.info("Open LoginPage");
        LoginPage loginPage = welcomePage.clickFormAuthentication();

        log.info("Login to Secure");
        loginPage.logIN("Boolean", "Boolean");

        log.info("Check the ErrorMessage");
        String expectedErrorMessage = "Your username is invalid!";
        Assert.assertTrue(loginPage.getErrorMessage().contains(expectedErrorMessage),
                "Actual message is: " + loginPage.getErrorMessage() + "expectedErrorMessage is: " + expectedErrorMessage);

        log.info("Check the loginButton is present");
        Assert.assertTrue(loginPage.LoginButtonIsDisplayed(), "No login button");
    }
}
