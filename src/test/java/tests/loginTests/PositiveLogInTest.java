package tests.loginTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.LoginPage;
import pages.herokuapp.SecurePage;
import pages.herokuapp.WelcomePage;

public class PositiveLogInTest extends TestUtilities {

    @Test
    public void checkLoginToSecure() {

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.clickFormAuthentication();
        SecurePage securePage = loginPage.logIN("tomsmith", "SuperSecretPassword!");

        Assert.assertEquals(securePage.getSecurePageUrl(), securePage.getCurrentUrl());


        Assert.assertTrue(securePage.isLogoutButtonDisplayed(),
                "The LogOutButton in not Visible");

        String expectedSuccessMessage = "You logged into a secure area!";
        Assert.assertTrue(securePage.getFlashMessage().contains(expectedSuccessMessage),
                "actualSuccessMessage: " + securePage.getFlashMessage() + ", not equals to expectedSuccessMessage: " + expectedSuccessMessage);
    }
}
