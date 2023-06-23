package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountPage extends BasePage {

    private static final SelenideElement I_FRAME_PATH = $x("//app-account-container//iframe");
    private static final SelenideElement DELETE_ACCOUNT_PATH = $x("//button[@class='btn delete_acc_btn']");
    private static final SelenideElement POPUP_DELETE_ACCOUNT_PATH = $x("//div[@class='delete-acc-block']");
    private static final SelenideElement POPUP_DELETE_ACCOUNT_BUTTON_PATH = $x("//div[@class='btn delete-acc_btn']");
    private static final SelenideElement CANCEL_SUBSCRIPTION_BUTTON_PATH = $x("//a[contains(text(), 'Cancel')]");
    private static final SelenideElement INQUIRER_FIRST_CHECK_BOX = $x("//app-question[1]//label");
    private static final SelenideElement INQUIRER_CANCEL_SUB_BUTTON = $x("//span[contains(text(), 'Cancel subscription')]");
    private static final SelenideElement PLAN_PATH = $x("//p[text() = 'Your plan']//../div[@class = 'description']/span");
    private static final SelenideElement THANKS_FOR_SHARING_POP_UP_CLOSE_BUTTON = $x("//app-confirm-dialog//span[contains(text(), 'Close')]");

//    public void switchToFrame() {
//        switchToFrameByElement(I_FRAME_PATH);
//    }
//
//    public boolean settingsIframePresent() {
//        return I_FRAME_PATH.isDisplayed();
//    }
//
//    public String getPlan() {
//        switchToFrame();
//        return PLAN_PATH.shouldBe(Condition.visible).getText();
//    }
//
//    public void deleteAccount() {
//        try {
//            DELETE_ACCOUNT_PATH.shouldBe(Condition.exist).click();
//        } catch (TimeoutException ex) {
//            DELETE_ACCOUNT_PATH.shouldBe(Condition.exist).click();
//        }
//        POPUP_DELETE_ACCOUNT_PATH.shouldBe(Condition.visible);
//        POPUP_DELETE_ACCOUNT_BUTTON_PATH.shouldBe(Condition.visible);
//        POPUP_DELETE_ACCOUNT_BUTTON_PATH.shouldBe(Condition.exist).click();
//        acceptAlert();
//        switchToDefault();
//    }
//
//    public void cancelSubscription() {
//        CANCEL_SUBSCRIPTION_BUTTON_PATH.shouldBe(Condition.exist).hover().click();
//        switchToDefault();
//        INQUIRER_FIRST_CHECK_BOX.shouldBe(Condition.exist).click();
//        INQUIRER_CANCEL_SUB_BUTTON.shouldBe(Condition.interactable).click();
//        THANKS_FOR_SHARING_POP_UP_CLOSE_BUTTON.shouldBe(Condition.interactable).click();
//        app.sleep(5000);
//    }
}
