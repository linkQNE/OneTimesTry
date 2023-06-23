package SitecheckerUI.pages.AppPages.Components;

import SitecheckerUI.pages.AppPages.CreateEditProject.CreateProjectPage;
import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthPopup extends BasePage {
    private CreateProjectPage createProjectPage = new CreateProjectPage();
    private final String LOGIN_POPUP_PATH = "//div[@class = 'login-form-title'][text() = 'Sign in']";
    private final String EMAIL_LOGIN_PATH = "//form[@name='authForm']//input[@formcontrolname='email']";
    private final String PASSWORD_LOGIN_PATH = "//form[@name='authForm']//input[@formcontrolname='pass']";
    private final String SUBMIT_LOGIN_PATH = "//form[@name = 'authForm']/button";
    private final String SUBMIT_REGISTER_PATH = SUBMIT_LOGIN_PATH;
    private final SelenideElement START_FREE_TRIAL_BUTTON = $x("//button [contains (text(), 'Check my website')]");
    private final String FREE_TRIAL_SIGN_UP_POP_UP = "//div[@class = 'login-form-title']";
    private final String FREE_TRIAL_EMAIL_FIELD = "//input[@formcontrolname = 'email']";
    private final String PASSWORD_FREE_TRIAL_FIELD = "//input[@formcontrolname = 'pass']";
    private final String VERIFY_EMAIL_POP_UP = "//div[contains(@class, 'verification-message')]";
    private final SelenideElement CLOSE_THANKS_POP_UP_BUTTON =  $x("//button[@aria-label = 'Close dialog']");
    private final String DOMAIN_TAB = "//div[contains(text(),'Domain')]";
    private final String INTEGRATION_TAB = "//div[contains(text(), 'GA / GSC')]";
    private final String CHROME_EXTENSION = "//span[contains(text(), 'Install')]";

//    private void enterEmail(String email) {
//        //в зависимости от того какая форма открыта сетим путь для логина или регистрации
//        clearAndSendText(EMAIL_LOGIN_PATH,email);
//    }
//
//    private void enterPassword(String password) {
//        //в зависимости от того какая форма открыта сетим путь для логина или регистрации
//        clearAndSendText(PASSWORD_LOGIN_PATH,password);
//    }
//
//    @Step("Check if Only 1 step is present on create first project")
//    public boolean isDomainTabOnlyPresent() {
//        try {
//            $(DOMAIN_TAB).shouldBe(Condition.hidden, Duration.ofSeconds(5));
//            $(INTEGRATION_TAB).shouldBe(Condition.hidden, Duration.ofSeconds(5));
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
//
//    private void enterFreeTrialEmail(String email) {
//        clearAndSendText(FREE_TRIAL_EMAIL_FIELD, email);
//    }
//
//    private void enterFreeTrialPassword(String password) {
//        clearAndSendText(PASSWORD_FREE_TRIAL_FIELD, password);
//    }

//    private void signIn() {
//        SUBMIT_LOGIN_PATH.click();
//    }

    public void openStartFreeTrialSignUp() {
        START_FREE_TRIAL_BUTTON.click();
    }
//
//    private void signUp() {
//        SUBMIT_REGISTER_PATH.click();
//    }
//
//    // Custom login
//    public void login(String email, String password) {
//        LOGIN_POPUP_PATH.shouldBe(Condition.visible);
//        enterEmail(email);
//        enterPassword(password);
//        signIn();
//    }

    public void confirmRegistration() {
        CLOSE_THANKS_POP_UP_BUTTON.shouldBe(Condition.interactable).click();
    }

}
