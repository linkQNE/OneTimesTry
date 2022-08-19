package tests.javaScriptAlertTest;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
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
        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.goToJavaScriptAlertPage();

        javaScriptAlertPage.clickJSConfirm();

        Assert.assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS Confirm");

        javaScriptAlertPage.acceptAlert();

        Assert.assertEquals(javaScriptAlertPage.getResultText(),"You clicked: Ok");
    }

    @Test
    public void checkJSPrompt(){
        WelcomePage welcomePage = new WelcomePage(driver,log);
        welcomePage.openPage();
        JavaScriptAlertPage javaScriptAlertPage = welcomePage.goToJavaScriptAlertPage();

        javaScriptAlertPage.clickJSPrompt();

        Assert.assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS prompt");

        javaScriptAlertPage.inputTextToAlert("Cat is coming");
        javaScriptAlertPage.acceptAlert();

        Assert.assertEquals(javaScriptAlertPage.getResultText(),"You entered: Cat is coming");

    }
}
