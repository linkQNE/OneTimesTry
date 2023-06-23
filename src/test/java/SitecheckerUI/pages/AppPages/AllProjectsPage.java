package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static SitecheckerUI.pages.AppPages.SummaryPage.isLoaderPresent;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Selenide.$x;

public class AllProjectsPage extends BasePage {

    //backlinkTracker
    private static final String LOADER = "//app-progress-bar";
    private static final String DASHBOARD_PROJECT = "//div[@class='dashboard-project']";
    public static final String DOMAIN_ON_DASHBOARD = "//div [contains(@class, 'dashboard-project')]//div [contains(text(), '%s')]";
    private static final String DOMAIN_ON_DASHBOARD_SELECTOR = DOMAIN_ON_DASHBOARD + "//ancestor::div[@class = 'dashboard-project__header']";
    private static final String CREATE_PROJECT_BUTTON = "//button[@at = 'create']";
    private static final String CONFIRM_DELETE = "//button/span[contains(text(), 'Yes')]";
    private static final String INFO_BAR_AREA = "//simple-snack-bar";
    private static final String THREE_DOTS_DOMAIN_MENU = DOMAIN_ON_DASHBOARD + "//ancestor::app-dashboard-project//button [contains (@class, 'dashboard-project__more-actions-info')]";
    private static final String THREE_DOTS_MENU = "//button [contains (@class, 'dashboard-project__more-actions-info')]";
    private static final String DELETE_BUTTON = "//button[@at='delete']";
    private static final String SHARE_PROJECT_BUTTON = DOMAIN_ON_DASHBOARD + "/ancestor::app-dashboard-project//button[@at='share']";
    private static final SelenideElement SETTING_PROJECT_BUTTON = $x("//div/mat-icon [text() = 'settings']");
    private static final SelenideElement SETTING_PROJECT_BUTTON_ON_AUDIT = $x("//app-tool-action-button [@id = 'editCrawlerStep']");
    private static final SelenideElement SETTING_PROJECT_BUTTON_ON_MONITORING = $x("//app-tool-action-button [@id = 'editMonitoringStep']");
    private static final SelenideElement THREE_DOTS_MENU_RANK_TRACKER = $x("//app-tool-action-button [@id = 'additionalOptionalRankTrackerSelect']");
    private static final SelenideElement SETTING_PROJECT_BUTTON_ON_RANK_TRACKER = $x("//span [text() = 'Settings']");
    private static final SelenideElement ALL_SET_POP_UP = $x("//div[@class = 'dialog-content-wrapper']");
    private static final SelenideElement ALL_SET_POP_UP_BUTTON = $x("//button/span[text() = 'Get started']");
    private static final String ENTER_EMAIL_TO_SHARE_INPUT = "//input[contains(@data-placeholder, 'Enter email')]";
    private static final String SEND_INVITE_BUTTON = "//button[contains(@class, 'send-invite')]";
    private static final String SEND_INVITE_DISABLED_BUTTON = "//button[contains(@class, 'mat-button-disable')]";
    private static final String SHARED_USER = "//span[text() = '%s']";
    private static final String CLOSE_SHARE_POP_UP_BUTTON = "//mat-icon[text() = 'close']";
    private static final String SIMON_TRIAL_POP_UP = "//app-i-am-simon-banner";
    private static final String SIMON_TRIAL_POP_UP_DEMO_BUTTON = "//app-i-am-simon-banner//a";
    private static final SelenideElement SIMON_TRIAL_POP_UP_GOT_IT_BUTTON = $x("//span[contains(text(), 'Got it')]");
    private static final SelenideElement SIMON_TRIAL_POP_UP_CLOSE_BUTTON = $x("//app-general-notification-message//mat-icon");
    private static final String TOP_TEN_LANDINGS_WIDGET_URLS = "(//app-top-landings[contains(@class, 'ng-star-inserted')]//span[@class='mat-tooltip-trigger link-decorator__link-text ng-star-inserted']//span[@class='ng-star-inserted'])[%s]";
    private static final String REMOVE = "//span[text()='%s']/../following-sibling::div//span[text()=' Remove ']";

    public static final String SITE_AUDIT = "Site Audit";
    public static final String SITE_MONITORING = "Site Monitoring";
    public static final String RANK_TRACKER = "Rank Tracker";
    public static final String DASHBOARD = "AllProjectsPage";
    private static final String DELETED_USER_POPUP = "//span[text()='The user has been deleted']";

    //todo
    @Step("Close all set popup")
    public static void closeAllSetPopUp() {
        if (ALL_SET_POP_UP.isDisplayed()) {
            ALL_SET_POP_UP.click();
        }
    }

    //
//    @Step("Check 'Book a Demo' button on Simon's popUp")
//    public boolean checkDemoButtonOnSimonPopUp() {
//        WaitUntil.visibilityOfElementLocated(SIMON_TRIAL_POP_UP);
//        return WaitUntil.visibilityOfElementLocated(SIMON_TRIAL_POP_UP_DEMO_BUTTON).getAttribute("href").equals("https://calendly.com/denys-kutsenko/product-demo");
//    }
//
    @Step("Close Simon's popUp")
    public void closeSimonNotificationPopUp() {
        if (SIMON_TRIAL_POP_UP_GOT_IT_BUTTON.isDisplayed()) {
            SIMON_TRIAL_POP_UP_GOT_IT_BUTTON.click();
        }
        if (SIMON_TRIAL_POP_UP_CLOSE_BUTTON.isDisplayed()) {
            SIMON_TRIAL_POP_UP_CLOSE_BUTTON.click();
        }
    }

    //
//    @Step("Click -create project- button")
//    public void clickCreateProject() {
//        new SideBar().expandProjectsList();
//        new Actions(app.wd).moveToElement(app.findElement(CREATE_PROJECT_BUTTON)).perform();
//        WaitUntil.elementToBeClickable(CREATE_PROJECT_BUTTON).click();
//        isLoaderPresent();
//    }
//
//
//    @Step("Click on Share Project button")
//    public void shareProject(String domain, String email) {
//        WaitUntil.elementToBeClickable(String.format(SHARE_PROJECT_BUTTON, domain)).click();
//        WebElement inputField = WaitUntil.visibilityOfElementLocated(ENTER_EMAIL_TO_SHARE_INPUT);
//        inputField.clear();
//        inputField.sendKeys(email);
//        WaitUntil.invisibilityOfElementLocated(SEND_INVITE_DISABLED_BUTTON);
//        WaitUntil.elementToBeClickable(SEND_INVITE_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(String.format(SHARED_USER, email));
//        WaitUntil.elementToBeClickable(CLOSE_SHARE_POP_UP_BUTTON).click();
//    }
//
//    @Step("Click on Share Project button")
//    public void shareOffProject(String domain, String email) {
//        WaitUntil.elementToBeClickable(String.format(SHARE_PROJECT_BUTTON, domain)).click();
//        WebElement sharedEmail = WaitUntil.visibilityOfElementLocated(String.format(SHARED_USER, email));
//        app.moveToElement(sharedEmail);
//        WaitUntil.visibilityOfElementLocated(String.format(REMOVE, email)).click();
//        WaitUntil.visibilityOfElementLocated(DELETED_USER_POPUP);
//        WaitUntil.invisibilityOfElementLocated(DELETED_USER_POPUP);
//    }
//
//    public String getBrowserName() {
//        Capabilities capabilities = ((RemoteWebDriver) app.wd).getCapabilities();
//        return capabilities.getBrowserName().toLowerCase();
//    }
//
//    @Step("Delete project by domain name")
//    public void deleteDomain(String domain) {
//        WaitUntil.elementToBeClickable(String.format(THREE_DOTS_DOMAIN_MENU, domain)).click();
//        WaitUntil.elementToBeClickable(DELETE_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(CONFIRM_DELETE).click();
//        waitForHideInfoMessage();
//    }
//
//    public void deleteDomains(String domains) {
//        List<WebElement> sameDomains = app.wd.findElements(By.xpath(String.format(THREE_DOTS_DOMAIN_MENU, domains)));
//        for (int i = 0; i < sameDomains.size(); i++) {
//            WaitUntil.visibilityOfElementLocated(String.format(THREE_DOTS_DOMAIN_MENU, domains)).click();
//            WaitUntil.elementToBeClickable(DELETE_BUTTON).click();
//            WaitUntil.visibilityOfElementLocated(CONFIRM_DELETE).click();
//            waitForHideInfoMessage();
//        }
//    }
//
//    @Step("Delete all project in the 'All Projects' list")
//    public void deleteAllDomains() {
//        List<WebElement> sameDomains = app.wd.findElements(By.xpath(THREE_DOTS_MENU));
//        for (WebElement sameDomain : sameDomains) {
//            sameDomain.click();
//            WaitUntil.elementToBeClickable(DELETE_BUTTON).click();
//            WaitUntil.visibilityOfElementLocated(CONFIRM_DELETE).click();
//            waitForHideInfoMessage();
//        }
//    }
//
    @Step("Click Setting Project")
    public void openSettingProject(String tab) {
        isLoaderPresent();
        switch (tab) {
            case SITE_AUDIT:
                SETTING_PROJECT_BUTTON_ON_AUDIT.shouldBe(Condition.exist).scrollTo().click();
                break;
            case SITE_MONITORING:
                SETTING_PROJECT_BUTTON_ON_MONITORING.shouldBe(Condition.exist).scrollTo().click();
                break;
            case RANK_TRACKER:
                THREE_DOTS_MENU_RANK_TRACKER.shouldBe(Condition.visible).click();
                SETTING_PROJECT_BUTTON_ON_RANK_TRACKER.shouldBe(Condition.exist).scrollTo().click();
                break;
            default:
                SETTING_PROJECT_BUTTON.shouldBe(Condition.exist).scrollTo().click();
        }
    }
//
//    @Step("Move to element \"{pathToElement}\"")
//    public void moveToElement(String pathToElement) {
//        isLoaderPresent();
//        WebElement webElement = WaitUntil.presenceOfElementLocated(pathToElement);
//        moveToLastDataOnGraph(webElement);
//    }
//
//    @Step("Move to element \"{webElement}\"")
//    public void moveToElement(WebElement webElement) {
//        Dimension dimension = webElement.getSize();
//        app.scrollToElement(webElement);
//        new Actions(app.wd).moveToElement(webElement).perform();
//        try {
//            if (getBrowserName().equals("firefox")) {
//                return;
//            }
//            if (OSInfo.WINDOWS) {
//                new Actions(app.wd).moveToElement(webElement, dimension.width - 5, dimension.height / 2).perform();
//            } else {
//                new Actions(app.wd).moveToElement(webElement, dimension.width / 2 - 15, dimension.height / 4).perform();
//            }
//        } catch (MoveTargetOutOfBoundsException e) {
//            throw new MoveTargetOutOfBoundsException(e.getMessage() + dimension.toString());
//        }
//        app.sleep(5000);
//    }
//
//    @Step("Move to elementTEST \"{webElement}\"")
//    public void moveToLastDataOnGraph(WebElement webElement) {
//        Dimension dimension = webElement.getSize();
//        app.sleep(1000);
//        int x = dimension.width / 2 - 10;
//        int y = dimension.height / 2;
//        try {
//            if (getBrowserName().equals("firefox")) {
//                return;
//            }
//            new Actions(app.wd).moveToElement(webElement, (x * 50) / 50, (y * 2) / 5).perform();
//        } catch (MoveTargetOutOfBoundsException e) {
//            throw new MoveTargetOutOfBoundsException(e.getMessage() + dimension);
//        }
//        app.sleep(5000);
//    }
//
//    @Step("Choose domain on projects page")
//    public void chooseDomain(String domain) {
//        WaitUntil.elementToBeClickable(String.format(DOMAIN_ON_DASHBOARD_SELECTOR, domain)).click();
//    }
//
//    @Step("Check if domain Present in domain list")
//    public boolean isDomainPresent(String domain) {
//        try {
//            WaitUntil.presenceOfElementLocated(String.format(DOMAIN_ON_DASHBOARD, domain));
//        } catch (TimeoutException e) {
//            return false;
//        }
//        return true;
//    }
//
//    @Step("Waiting for 'All projects' tab")
//    public void waitForAllProjectsTab() {
//        try {
//            WaitUntil.presenceOfElementLocated(DASHBOARD_PROJECT);
//            isLoaderPresent();
//        } catch (TimeoutException ex) {
//            new HeaderApp().clickOnLogo();
//            WaitUntil.presenceOfElementLocated(DASHBOARD_PROJECT);
//            isLoaderPresent();
//        }
//    }
//
//    private void waitForHideInfoMessage() {
//        WaitUntil.waitToInSecondsVisibilityOfElementLocated(INFO_BAR_AREA, 180);
//        WaitUntil.invisibilityOfElementLocated(INFO_BAR_AREA);
//    }
//
//    @Step("Waiting InvisibilityOfLoaders")
//    public void waitForInvisibilityOfLoaders() {
//        try {
//            WaitUntil.invisibilityOfElementLocated(LOADER);
//        } catch (TimeoutException e) {
//            try {
//                WaitUntil.invisibilityOfElementLocated(LOADER);
//            } catch (TimeoutException e1) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void openUrlInTopTenLandingsWidget(int urlNumber) {
//        WebElement url = WaitUntil.presenceOfElementLocated(String.format(TOP_TEN_LANDINGS_WIDGET_URLS, urlNumber));
//        app.scrollToElement(url);
//        url.click();
//    }
}
