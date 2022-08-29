package tests.sitechecker;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import sitechecker.landPages.SignUP;
import sitechecker.landPages.SitecheckerHome;
import sitechecker.base.TempMailPage;

public class RegistrationTest extends TestUtilities {
    private String EMAIL = null;
    @Test
    public void checkUserRegistration(){

        TempMailPage tempMailPage = new TempMailPage(driver,log);
        tempMailPage.openPage();

        EMAIL = tempMailPage.getEmail();

        SitecheckerHome sitecheckerHome = tempMailPage.goToSitecheckerHome();
        sitecheckerHome.openPage();

        SignUP signUP = sitecheckerHome.openSignUpForm();
        signUP.signUpByEmail(EMAIL,EMAIL);
        Assert.assertTrue(signUP.VerificationMessageIsDisplayed(), "VerificationMessage is absent");
        signUP.switchToTempMail();


        tempMailPage.userVerify();
        Assert.assertTrue(tempMailPage.getCurrentUrl().contains("sitechecker.pro"), "FAlse not sitechecker.pro");
    }

}
