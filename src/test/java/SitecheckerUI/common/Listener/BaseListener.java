package SitecheckerUI.common.Listener;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static SitecheckerUI.api.UsefulFeatures.getCurrentTime;


public class BaseListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveTextLog("Url on page when test failed", WebDriverRunner.getWebDriver().getCurrentUrl());
    }

    @Attachment(value = "Time when test failed (UTC)", type = "text/plain")
    public String getTime() {
        return getCurrentTime();
    }

    @Attachment(value = "Url on page when test failed", type = "text/plain")
    public static String saveTextLog(String attachName, String message) {
        return message;
    }


    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
