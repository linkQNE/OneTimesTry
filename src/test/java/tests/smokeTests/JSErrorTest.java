package tests.smokeTests;

import base.TestUtilities;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.herokuapp.JSErrorPage;

import java.util.List;

public class JSErrorTest extends TestUtilities {

    @Test
    public void checkJsErrors(){
        SoftAssert softAssert = new SoftAssert();

        JSErrorPage jsErrorPage = new JSErrorPage(driver,log);
        jsErrorPage.openPage();

        List<LogEntry> logs = getBrowserLogs();

        for (LogEntry log : logs){
            if (log.getLevel().toString().equals("SEVERE")){
                softAssert.fail("Severe error: "+log.getMessage());
            }
        }
        softAssert.assertAll();
    }
}
