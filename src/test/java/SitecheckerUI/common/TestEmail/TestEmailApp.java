package SitecheckerUI.common.TestEmail;


import SitecheckerUI.api.TestMailAppApi;
import SitecheckerUI.pages.AppPages.MainPage;
import SitecheckerUI.tests.base.testData.Account;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class TestEmailApp extends TestMailAppApi {
    private final MainPage mainPage = new MainPage();
    private static final String TEST_MINI_TOOL_TEXT = "_test_minitool";
    private static final SelenideElement POPUP_INPUT_EMAIL_FIELD = $x("//input[@id='registerFormEmail']");

    private String getRandomEmail() {
        String sec = (new SimpleDateFormat("SSSSSS").format(new Date()));
        return getWorkspaceName() + "." + sec + TEST_MINI_TOOL_TEXT + "@inbox.testmail.app";
    }

    public void registrationUserForOnBoardingTest() {
        POPUP_INPUT_EMAIL_FIELD.should(Condition.visible);
        String login = getRandomEmail();
        String password = "123456";
        Account.ONBOARDING_TEST_USER.setLogin(login);
        Account.ONBOARDING_TEST_USER.setPassword(password);
        mainPage.register(login, password);
        open(getVerificationURL(getPrefix(login)));
    }

    public void registrationUserFreeTrial(String login, String password) {
        POPUP_INPUT_EMAIL_FIELD.should(Condition.visible);
        mainPage.register(login, password);
        open(getVerificationURL(getPrefix(login)));
    }

    public String getPrefix(String email) {
        Pattern pattern = Pattern.compile("\\.(.*)\\@");
        Matcher m = pattern.matcher(email);
        String emailPrefix = "";
        if (m.find()) {
            emailPrefix = m.group(1);
        }
        return emailPrefix;
    }

}
