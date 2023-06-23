package SitecheckerUI.pages.AppPages.Components.SideBar;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static SitecheckerUI.pages.AppPages.Components.SideBar.SideBar.closeRestrictPopup;
import static com.codeborne.selenide.Selenide.$x;


public class AppUserInfo extends BasePage {

    private static final SelenideElement USER_EXPANDER_PATH = $x("//div[@class = 'min-info__wrapper']");
    private static final SelenideElement USER_EXPANDER_PATH_V2 = $x("//div[contains (@class, 'min-info__wrapper')]");
    private static final SelenideElement USER_SETTINGS_BUTTON_PATH = $x("//div[contains(@class, 'full-info')]//span[text() = 'Settings']");
    private static final SelenideElement PROFILE_BUTTON_PATH = $x("//span[text() ='Profile']");

    private static final SelenideElement EXPANDED_POP_UP = $x("//div[@class = 'cdk-overlay-pane']");
    private static final SelenideElement LOGOUT_PATH = $x("//span[text() = 'Log out']");
    private static final SelenideElement LOGIN_POPUP = $x("//app-login-modal");
    private static final SelenideElement PLAN_PATH = $x("//div[contains(@class, 'account-data-plan')]");
    private static final SelenideElement LOGIN_DASHBOARD_BUTTON = $x("//div[contains(@class, 'login-block')]");
    private static final SelenideElement PRICING_PATH = $x("//span[text() = 'Pricing']");
    private static final SelenideElement BOOK_DEMO_BUTTON = $x("//user-full-info//a");

    @Step("Logout by flow")
    public void logout() {
        closeRestrictPopup();
        expandUserInfo();
        LOGOUT_PATH.shouldBe(Condition.interactable).click();
//        try {
//            WaitUntil.visibilityOfElementLocated(MainPage.getSignInButtonPath());
//        } catch (TimeoutException ignored) {
//        }
    }
//
//    @Step("Logout by URL")
//    public void logoutByURL() {
//        app.wd.get("https://sitechecker.pro/logout-page");
//        try {
//            WaitUntil.visibilityOfElementLocated(MainPage.getSignInButtonPath());
//        } catch (TimeoutException ignored) {
//        }
//    }
//
    @Step("Expand User Info pop up")
    public void expandUserInfo() {
        if (USER_EXPANDER_PATH.isDisplayed()){
            USER_EXPANDER_PATH.hover();
            EXPANDED_POP_UP.shouldBe(Condition.visible);
        }
        if (USER_EXPANDER_PATH_V2.isDisplayed()){
            USER_EXPANDER_PATH_V2.hover();
            EXPANDED_POP_UP.shouldBe(Condition.visible);
        }
    }
//
//    @Step("Check 'Book demo' button on user info pop-up")
//    public boolean checkBookDemoButtonOnUserInfo() {
//        expandUserInfo();
//        return WaitUntil.visibilityOfElementLocated(BOOK_DEMO_BUTTON)
//                .getAttribute("href").equals("https://calendly.com/denys-kutsenko/product-demo");
//    }
//
//    @Step("Click 'User setting' button")
//    public v
//    oid clickSettings() {
//        expandUserInfo();
//        WaitUntil.elementToBeClickable(USER_SETTINGS_BUTTON_PATH).click();
//        isLoaderPresent();
//    }
//
//    public void getPricingPage() {
//        WaitUntil.elementToBeClickable(PRICING_PATH).click();
//    }
//
//    private boolean isExpanded() {
//        return isElementPresent(EXPANDED_POP_UP);
//    }
//
//    public boolean isElementPresent(String locator) {
//        try {
//            WebElement element = app.wd.findElement(By.xpath(locator));
//            wait = new WebDriverWait(app.wd, Duration.ofSeconds(60));
//            wait.until(ExpectedConditions.visibilityOf(element));
//            return true;
//        } catch (Exception ex) {
//            return false;
//        }
//    }
//
//    public void clickLogin() {
//        WaitUntil.waitToInSecondsVisibilityOfElementLocated(LOGIN_DASHBOARD_BUTTON, 120).click();
//        WaitUntil.presenceOfElementLocated(LOGIN_POPUP);
//    }
//
//    public String getPlanName() {
//        return WaitUntil.presenceOfElementLocated(PLAN_PATH).getText();
//    }

}
