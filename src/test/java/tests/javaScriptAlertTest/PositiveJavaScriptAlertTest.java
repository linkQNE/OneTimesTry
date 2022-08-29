package tests.javaScriptAlertTest;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.herokuapp.JavaScriptAlertPage;
import pages.herokuapp.WelcomePage;

public class PositiveJavaScriptAlertTest extends TestUtilities {

    @Test
    public void checkJSAlert(){
        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.goToJavaScriptAlertPage();

        javaScriptAlertPage.clickJSAlert();

        Assert.assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS Alert");

        javaScriptAlertPage.acceptAlert();

        Assert.assertEquals(javaScriptAlertPage.getResultText(),"You successfully clicked an alert");
    }

    @Test
    public void checkJSConfirm(){
        SoftAssert softAssert = new SoftAssert();

        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.goToJavaScriptAlertPage();

        javaScriptAlertPage.clickJSConfirm();

        softAssert.assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS Confirm");

        javaScriptAlertPage.acceptAlert();

        softAssert.assertEquals(javaScriptAlertPage.getResultText(),"You clicked: Ok");
        softAssert.assertAll();

    }

    @Test
    public void checkJSPrompt(){
        SoftAssert softAssert = new SoftAssert();
        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.goToJavaScriptAlertPage();

        javaScriptAlertPage.clickJSPrompt();

        softAssert.assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS prompt");

        javaScriptAlertPage.inputTextToAlert("Cat is coming");
        javaScriptAlertPage.acceptAlert();

        softAssert.assertEquals(javaScriptAlertPage.getResultText(),"You entered: Cat is coming");
        softAssert.assertAll();
    }
}
