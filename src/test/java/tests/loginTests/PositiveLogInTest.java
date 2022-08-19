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

        log.info("Go to WelcomePage");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        log.info("Open LoginPage");
        LoginPage loginPage = welcomePage.clickFormAuthentication();

        log.info("Login to Secure");
        SecurePage securePage = loginPage.logIN("tomsmith", "SuperSecretPassword!");

        log.info("Check is the redirect correct");
        Assert.assertEquals(securePage.getSecurePageUrl(), securePage.getCurrentUrl());

        log.info("Check is the LogOutButton isDisplayed");
        Assert.assertTrue(securePage.isLogoutButtonDisplayed(),
                "The LogOutButton in not Visible");

        log.info("Check the success message");
        String expectedSuccessMessage = "You logged into a secure area!";
        Assert.assertTrue(securePage.getFlashMessage().contains(expectedSuccessMessage),
                "actualSuccessMessage: " + securePage.getFlashMessage() + ", not equals to expectedSuccessMessage: " + expectedSuccessMessage);
    }
}
