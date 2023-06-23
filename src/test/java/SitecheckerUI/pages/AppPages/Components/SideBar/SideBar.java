package SitecheckerUI.pages.AppPages.Components.SideBar;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;
import java.util.List;


import static SitecheckerUI.pages.AppPages.SummaryPage.isLoaderPresent;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SideBar extends BasePage {

    public AppUserInfo USER_INFO = new AppUserInfo();

    private static final String ALL_PROJECTS = "//app-nav-vertical-item [@at = 'projectsDashboard']";
    private static final String DASHBOARD_BUTTON = "//a[@app-event-id = 'Dashboard']";
    private static final String DASHBOARD_PAGE_PATH = "//div [contains (@class, 'project-allProjectsPage-2__header')]";
    private static final String BACKLINK_TRACKER_PATH = "//*[@at='backlinkTracker']";
    private static final SelenideElement AUDIT_EXPANDER_PATH = $x("//span[contains(text(), 'Site Audit')]/..");
    private static final SelenideElement SITE_AUDIT_BUTTON = $x("//a [@app-event-id = 'Site Audit']");
    private static final String COLLAPSED_PROJECTS_PATH = "//div[contains(@class, 'navbar-content')]/project-select-button/div";
    private static final String EXPANDED_PROJECT_SELECTOR = "//div[@class = 'cdk-overlay-pane']";
    private static final String PROJECT_LIST = "//div[contains(@class, 'select__project-name')]";
    private static final String CHOOSE_PROJECT = "//div[contains(@class, 'select__project-name') and text() = '%s']";
    private static final String SEARCH_PROJECT_INPUT_FIELD = "//input[@placeholder = 'Enter website or id']";
    private static final String ASSISTANT_PAGE_LINK = "//a[@app-event-id = 'Assistant']";
    private static final String EXPAND_SIDEBAR_PATH = "//mat-icon[text() = 'menu']";
    private static final SelenideElement RANK_TRACKER_BUTTON = $x("//a[@app-event-id = 'Rank Tracker']");
    private static final String INSIGHTS_BUTTON = "//a[@app-event-id = 'Insights']";
    private static final String SITE_MONITORING_BUTTON = "//a[@app-event-id = 'Site Monitoring']";
    private static final String EDIT_PROJECT_IN_LIST = "//div [contains (@class, 'select__project-edit-button')]";
    private static final String EXTRA_TOOLS = "//a[@app-event-id = 'Extra tools']";
    private static final String ONE_TIME_SITE_AUDIT = "//span[text() = 'One time Site Audit']";
    private static final String ON_PAGE_CHECKER = "//span[text() = 'On Page Checker']";
    private static final String ORGANIC_TRAFFIC_CHECKER = "//span[text() = 'Organic traffic checker']";
    private static final String RESTRICT_MESSAGE_CLOSE_BUTTON = "//app-general-notification-message//mat-icon [@data-mat-icon-name = 'closeIcon']";

    //Onboarding pop-up
    private static final SelenideElement ONBOARDING_CLOSE_BUTTON = $x("//app-user-experience-container//button[contains(@class, 'close-button')]");
    private static final SelenideElement ONBOARDING_BUTTON = $x("//app-nav-vertical-item [@at = 'userExperience']");
    private static final String ONBOARDING_BOOK_DEMO_BUTTON = "//app-user-experience-container//a/span[text() = 'Book a live demo']/parent::a";
    private static final ElementsCollection ONBOARDING_LINKS = $$x("//app-user-experience-container//ul//a");
    private static final String ONBOARDING_NEXT_LEVEL_BUTTON = "//app-user-experience-container//button [contains (@class, 'user-experience-modal__complete-level-button')]";
    private static final String ONBOARDING_TITLE = "//div [contains (@class, 'user-experience-modal__title')]";

//    @Step("Click 'All project' button")
//    public void clickAllProjects() {
//        isLoaderPresent();
//        WaitUntil.elementToBeClickable(ALL_PROJECTS).click();
//    }
//
//    @Step("Click backlink tracker")
//    public void clickBacklinkTracker() {
//        WebElement backlinkTracker = WaitUntil.visibilityOfElementLocated(BACKLINK_TRACKER_PATH);
//        app.moveToElement(backlinkTracker);
//        backlinkTracker.click();
//    }
//
    @Step("Close onBoarding pop-up")
    public void closeOnBoarding() {
        if(ONBOARDING_CLOSE_BUTTON.isDisplayed()){
            ONBOARDING_CLOSE_BUTTON.shouldBe(Condition.interactable,Duration.ofSeconds(20)).click();
        }
    }

    @Step("Close restriction Pop-up")
    public static void closeRestrictPopup() {
        if($x(RESTRICT_MESSAGE_CLOSE_BUTTON).isDisplayed()){
            $x(RESTRICT_MESSAGE_CLOSE_BUTTON).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        }
    }

//    public void openRTAndSelectProject(String url, String id) {
//        closeOnBoarding();
//        clickAllProjects();
//        expandProjectsList();
//        selectDomain(url, id);
//        clickRankTracker();
//    }
//
//    @Step("Open 'Extra tools' page")
//    public void openExtraToolPage() {
//        WaitUntil.visibilityOfElementLocated(EXTRA_TOOLS).click();
//    }
//
//    @Step("Open OneTimeSiteAudit")
//    public void chooseOneTimeAudit() {
//        try {
//            WebElement extraTool = WaitUntil.visibilityOfElementLocated(EXTRA_TOOLS);
//            app.moveToElement(extraTool);
//            WaitUntil.elementToBeClickable(ONE_TIME_SITE_AUDIT).click();
//        } catch (TimeoutException | ElementClickInterceptedException ex) {
//            app.wd.get("https://sitechecker.pro/app/main/one-time-check/site-audit");
//            app.sleep(Duration.ofSeconds(30).toMillis());
//        }
//    }
//
//    @Step("Open On Page")
//    public void chooseOnPageChecker() {
//        try {
//            WebElement extraTool = WaitUntil.visibilityOfElementLocated(EXTRA_TOOLS);
//            app.moveToElement(extraTool);
//            WaitUntil.elementToBeClickable(ON_PAGE_CHECKER).click();
//        } catch (TimeoutException | ElementClickInterceptedException ex) {
//            app.wd.get("https://sitechecker.pro/app/main/seo-reports-land");
//            app.sleep(Duration.ofSeconds(30).toMillis());
//        }
//    }
//
//    @Step("Open Organic Traffic Checker")
//    public void chooseOrganicTrafficChecker() {
//        try {
//            WebElement extraTool = WaitUntil.visibilityOfElementLocated(EXTRA_TOOLS);
//            app.moveToElement(extraTool);
//            WaitUntil.elementToBeClickable(ORGANIC_TRAFFIC_CHECKER).click();
//        } catch (TimeoutException | ElementClickInterceptedException ex) {
//            app.wd.get("https://sitechecker.pro/app/main/traffic-checker-land");
//            app.sleep(Duration.ofSeconds(30).toMillis());
//        }
//    }
//
//    @Step("Click 'Edit Project' on AllProjectsPage")
//    public void editActiveProjectInList() {
//        WaitUntil.visibilityOfElementLocated(EDIT_PROJECT_IN_LIST).click();
//    }
//
//    @Step("Click on 'Dashboard' button")
//    public void clickDashboard() {
//        WaitUntil.visibilityOfElementLocated(DASHBOARD_BUTTON).click();
//        if (!isDashboardPresent()) {
//            WaitUntil.visibilityOfElementLocated(DASHBOARD_BUTTON).click();
//        }
//    }
//
    @Step("Click on 'SiteAudit' button")
    public void clickOnAudit() {
        isLoaderPresent();
        if(AUDIT_EXPANDER_PATH.isDisplayed()){
            AUDIT_EXPANDER_PATH.shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        }
        if(SITE_AUDIT_BUTTON.isDisplayed()){
            SITE_AUDIT_BUTTON.shouldBe(Condition.visible).click();
        }
    }
//
//    @Step("Click on 'SiteMonitoring' button")
//    public void clickOnMonitoring() {
//        WaitUntil.elementToBeClickable(SITE_MONITORING_BUTTON).click();
//    }
//
    @Step("Click on 'RankTracker' button")
    public void clickRankTracker() {
        RANK_TRACKER_BUTTON.shouldBe(Condition.interactable).click();
        isLoaderPresent();
    }
//
//    @Step("Click on 'Insights' button")
//    public void clickInsights() {
//        WaitUntil.elementToBeClickable(INSIGHTS_BUTTON).click();
//    }
//
//    @Step("'Hover On' Project name")
//    public void expandProjectsList() {
//        WebElement projectsDropdownButton;
//        isLoaderPresent();
//        try {
//            projectsDropdownButton = WaitUntil.waitToInSecondsPresenceOfElementLocated(COLLAPSED_PROJECTS_PATH, 20);
//        } catch (TimeoutException ex) {
//            app.sleep(Duration.ofSeconds(30).toMillis());
//            isLoaderPresent();
//            projectsDropdownButton = WaitUntil.presenceOfElementLocated(COLLAPSED_PROJECTS_PATH);
//        }
//        app.moveToElement(projectsDropdownButton);
//        try {
//            WaitUntil.waitToInSecondsPresenceOfElementLocated(EXPANDED_PROJECT_SELECTOR, 20);
//        } catch (TimeoutException ex) {
//            new HeaderApp().clickOnLogo();
//            isLoaderPresent();
//            WaitUntil.presenceOfElementLocated(COLLAPSED_PROJECTS_PATH).click();
//            WaitUntil.waitToInSecondsPresenceOfElementLocated(EXPANDED_PROJECT_SELECTOR, 20);
//        }
//    }
//
//    @Step("Click on 'Expand' button")
//    public void expandSidebar() {
//        WebElement expander = WaitUntil.elementToBeClickable(EXPAND_SIDEBAR_PATH);
//        expander.click();
//    }
//
//    @Step("Search and select domain from the list by domainName")
//    public void selectDomain(String domain) {
//        try {
//            WebElement inputField = WaitUntil.visibilityOfElementLocated(SEARCH_PROJECT_INPUT_FIELD);
//            inputField.click();
//            inputField.clear();
//            inputField.sendKeys(domain);
//            app.sleep(Duration.ofSeconds(10).toMillis());
//            WaitUntil.presenceOfElementLocated(String.format(CHOOSE_PROJECT, domain)).click();
//        } catch (TimeoutException tex) {
//            WaitUntil.presenceOfElementLocated(String.format(CHOOSE_PROJECT, domain)).click();
//        }
//    }
//
//    @Step("Search and select domain from the list by domainID")
//    public void selectDomain(String domain, String domainId) {
//        WebElement inputField = WaitUntil.visibilityOfElementLocated(SEARCH_PROJECT_INPUT_FIELD);
//        inputField.click();
//        inputField.clear();
//        inputField.sendKeys(domainId);
//        WaitUntil.presenceOfElementLocated(String.format(CHOOSE_PROJECT, domain)).click();
//    }
//
//    @Step("Get Domains list From")
//    public List<String> getProjectsFromProjectList() {
//        List<WebElement> projectElements = WaitUntil.presenceOfAllElements(PROJECT_LIST);
//        return projectElements.stream().map(x -> x.getText().replaceAll("Demo", "").trim()).collect(Collectors.toList());
//    }
//
//    @Step("Choose assistant page")
//    public void clickOnAssistantPage() {
//        WaitUntil.visibilityOfElementLocated(ASSISTANT_PAGE_LINK).click();
//    }
//
    @Step("Click on 'OnBoarding' button")
    public void clickOnboarding() {
        ONBOARDING_BUTTON.shouldBe(Condition.visible).click();
    }

//
//    @Step("Check All Steps is passed on OnBoarding pop-up")
//    public boolean checkOnboarding1stLevelIsPassed() {
//        boolean titleContains1stLVL = WaitUntil.visibilityOfElementLocated(ONBOARDING_TITLE).getText().contains("Level 1");
//        boolean buttonIsPresent = WaitUntil.visibilityOfElementLocated(ONBOARDING_NEXT_LEVEL_BUTTON).isDisplayed();
//        return buttonIsPresent && titleContains1stLVL;
//    }
//
    @Step("Check All links in OnBoarding")
    public boolean checkLinksInOnboarding1stLvl() {
        ONBOARDING_CLOSE_BUTTON.shouldBe(Condition.visible);
        List<SelenideElement> links = ONBOARDING_LINKS;
        for (SelenideElement link : links) {
            try {
                if (!onboardingLinksIsEquals(link) || !link.getAttribute("target").equals("_blank")) {
                    return false;
                }
            } catch (NullPointerException ignored) {
            }
        }
        return true;
    }

    @Step("Check if links has correct url")
    private boolean onboardingLinksIsEquals(SelenideElement link) {
        if (link.getText().contains("Create first project")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#1");
        } else if (link.getText().contains("Verify email address")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#2");
        } else if (link.getText().contains("Add more than 10 keywords")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#4");
        } else if (link.getText().contains("Visit issues page")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#5");
        } else if (link.getText().contains("View page details")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#8");
        } else if (link.getText().contains("View Rank Tracker report")) {
            return link.getAttribute("href").equals("https://help.sitechecker.pro/article/100-getting-started-to-do#61");
        } else {
            return false;
        }
    }
//
//    @Step("Check 'Book a live demo' on OnBoarding pop-up")
//    public boolean checkBookDemoOnOnboarding() {
//        return WaitUntil.visibilityOfElementLocated(ONBOARDING_BOOK_DEMO_BUTTON).getAttribute("href").equals("https://calendly.com/denys-kutsenko/product-demo");
//    }
//
//    @Step("Click 'Next level' on OnBoarding pop-up")
//    public void clickNextOnboardingLevel() {
//        WaitUntil.visibilityOfElementLocated(ONBOARDING_NEXT_LEVEL_BUTTON).click();
//    }
//
//    @Step("Check if 'AllProjectsPage' tab is present")
//    private boolean isDashboardPresent() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(DASHBOARD_PAGE_PATH, 30);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }

}
