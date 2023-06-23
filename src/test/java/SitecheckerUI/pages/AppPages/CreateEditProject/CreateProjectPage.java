package SitecheckerUI.pages.AppPages.CreateEditProject;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static SitecheckerUI.pages.AppPages.AllProjectsPage.closeAllSetPopUp;
import static com.codeborne.selenide.Selenide.$x;


public class CreateProjectPage extends BasePage {

    private static final SelenideElement PROGRESS_SPINNER_PATH = $x("//mat-spinner");
    private static final String ACCOUNT_CONFIRMATION_GET_STARTED_BUTTON = "//a[text() = 'Get started']";
    private static final SelenideElement INPUT_DOMAIN_PATH = $x("//input[@placeholder = 'Enter your domain']");
    private static final String TABS = "//mat-step-header";
    private static final String TAB_POSITION = "//mat-step-header[@aria-posinset = %d]";
    private static final String FINISH_STEP_PATH = "//span[text() = 'Finish']/..";
    private static final String START_PROJECT_BUTTON = "//span [text() = 'Start Project']";
    private static final String SUGGEST_KEYWORDS_CLOSE_BUTTON = "//app-keyword-suggest-dialog-create//mat-icon[text() = 'close']";
    private static final String NEXT_BUTTON_ON_CREATE = "//div [contains (@style, 'inherit')]//span[contains (text(), 'Next ')]";
    private static final String HTTP_HTTPS_PARAM_DROPDOWN = "//span [text() = ' http + https ']";
    private static final String HTTP_PARAM = "//span [text() = 'http']";
    private static final String HTTPS_PARAM = "//span [text() = 'https']";
    private static final SelenideElement CONTINUE_STEP_PATH = $x("//span[contains(text(), 'Continue')]/..");
    //Questionnaire
    private static final String SELECT_YOUR_ROLE = "//span[text()='Select your role...']";
    private static final String FREELANCER_ROLE = "//div[contains(text(), 'Freelancer')]";
    private static final String SELECT_YOUR_DEPARTMENT = "//span[text()='Select your department...']";
    private static final String DEVELOPMENT = "//div[text() = 'Development']";
    private static final String SELECT_AMOUNT_OF_WEBSITES = "//span[text()='Select amount of websites...']";
    private static final String FIVE_HUNDRED_SITES = "//div[contains(text(), '500+')]";
    private static final String SELECT_YOUR_EXPERIENCE = "//span[text()='Select your experience...']";
    private static final String USED_SEO_TOOL_BEFORE = "//div[text()='I used SEO tools before']";
    private static final String GO_TO_THE_APP_BUTTON = "//span[text() = 'Go to the app ']";
    private static final String NEXT_BUTTON = "(//span[contains(text(), 'Next')])[%d]";
    private static final String RESTRICT_NOTIFICATION_MESSAGE = "//p [contains (text(), 'Another user already has a project')]";


//    public void createProjectWithIntegration(String domain, boolean useGA, boolean useSc) {
//        createProject(domain, useGA, useSc);
//    }
//
//    public void createProjectWithCustomParam(String domain, String protocolParam, int limitPages) {
//        createDomainWithScopeParameter(domain, protocolParam, limitPages);
//    }
//
//    public void createProjectSkipWithDomainAndIntegrationOnlyWithDomain(String domain) {
//        createProjectSkipWithDomainAndIntegrationOnly(domain);
//        closeAllSetPopUp();
//    }
//
//    public void createProjectSkipWithDomainAndIntegrationOnlyWithDomain() {
//        createProjectSkipWithDomainAndIntegrationOnly();
//        closeAllSetPopUp();
//    }


    //todo
    public void createProjectSkipEnterDomainOnly(String domain) {
        createProjectSkipWithEnterDomainOnly(domain);
        closeAllSetPopUp();
    }

    //
//    @Step("Create Project with Integration")
//    public void createProject(String domain, boolean useGa, boolean useSc) {
//        createCustomProject(domain);
//        doIntegrationsStep(useGa, useSc);
//        doSiteAuditStep();
//        doRankTrackerStep();
//        doFinishStep();
//    }
//
//    @Step("Create Project")
//    public void createProject(String domain) {
//        createCustomProject(domain);
//        clickNextButton();
//        passSiteAuditStep();
//        doSiteAuditStep();
//        clickOnTheNextTab(6);
//        doRankTrackerStep();
//        WaitUntil.elementToBeClickable(SUGGEST_KEYWORDS_CLOSE_BUTTON).click();
//        clickNextButton();
//        clickNextButton();
//        clickFinishStepButton();
//        WaitUntil.urlContains("/audit/summary");
//    }
//
//    @Step("Input Domain name on 1st Step")
//    public void inputDomainForCreateFirstProject(String domain) {
//        try {
//            clickStartProject();
//        } catch (TimeoutException ignored) {
//        }
//        inputDomainNameToField(domain);
//        app.sleep(20000);
//    }
//
//    @Step("Create Project with Custom Scope 'http-https'")
//    public void createDomainWithScopeParameter(String domain, String protocolParam, int limitPages) {
//        passInputDomainStepWithParameter(domain, protocolParam);
//        clickNextButton();
//        passSiteAuditStep();
//        doSiteAuditStep(limitPages);
//        clickOnTheNextTab(6);
//        doRankTrackerStep();
//        WaitUntil.elementToBeClickable(SUGGEST_KEYWORDS_CLOSE_BUTTON).click();
//        clickNextButton();
//        clickNextButton();
//        clickFinishStepButton();
//        WaitUntil.urlContains("/audit/summary");
//    }
//
//    @Step("Create Project for RankTracker Flow")
//    public void createProjectForRankTracker() {
//        createEnteredProject();
//        try {
//            clickOnTheNextTab(2);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(1);
//        }
//
//        try {
//            clickOnTheNextTab(3);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(2);
//        }
//
//        try {
//            clickOnTheNextTab(4);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(3);
//        }
//        app.sleep(10000);
//        clickFinishStepButton();
//    }
//
//    @Step("Create Project 'flow: with integration only' with custom DomainName")
//    public void createProjectSkipWithDomainAndIntegrationOnly(String domain) {
//        createCustomProject(domain);
//        app.sleep(10000);
//        clickFinishStepButton();
//    }
//
    @Step("Create Project 'flow: only domain input' with custom DomainName")
    public void createProjectSkipWithEnterDomainOnly(String domain) {
        createCustomProject(domain);
    }

    //
//    @Step("Create Project 'flow: with integration only'")
//    public void createProjectSkipWithDomainAndIntegrationOnly() {
//        createEnteredProject();
//        app.sleep(10000);
//        clickFinishStepButton();
//    }
//
//    @Step("Create Project 'flow: only domain input'")
//    public void createProjectSkipWithDomainOnly() {
//        createEnteredProject();
//        app.sleep(10000);
//        closeAllSetPopUp();
//    }
//
//    @Step("Create Project for RankTracker Flow with custom DomainName")
//    public void createProjectForRankTracker(String domain) {
//        createCustomProject(domain);
//        try {
//            clickOnTheNextTab(2);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(1);
//        }
//
//        try {
//            clickOnTheNextTab(3);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(2);
//        }
//
//        try {
//            clickOnTheNextTab(4);
//        } catch (TimeoutException ex) {
//            clickOnTheNextButton(3);
//        }
//        app.sleep(10000);
//        clickFinishStepButton();
//    }
//
    @Step("Create Project: Step 1. Enter url and press Continue")
    public void createCustomProject(String domain) {
        inputDomainNameToField(domain);
        PROGRESS_SPINNER_PATH.shouldBe(Condition.hidden);
        CONTINUE_STEP_PATH.shouldBe(Condition.interactable).click();
    }
//
//    @Step("Create Project: Step 1. Select Protocol param, Enter url and press Continue")
//    public void passInputDomainStepWithParameter(String domain, String param) {
//        selectDomainScopeParam(param);
//        inputDomainNameToField(domain);
//        WaitUntil.invisibilityOfElementLocated(PROGRESS_SPINNER_PATH);
//        WaitUntil.elementToBeClickable(CONTINUE_STEP_PATH).click();
//    }
//
//    public void createEnteredProject() {
//        WaitUntil.visibilityOfElementLocated(INPUT_DOMAIN_PATH);
//        WaitUntil.elementToBeClickable(CONTINUE_STEP_PATH).click();
//    }

    //todo
    public void inputDomainNameToField(String domain) {
        SelenideElement inputElement = INPUT_DOMAIN_PATH.shouldBe(Condition.visible);
        inputElement.click();
        inputElement.clear();
        inputElement.setValue(domain);
        if (inputElement.getAttribute("value").isEmpty()) {
            inputElement.click();
            inputElement.clear();
            inputElement.setValue(domain);
        }
    }
//
//    @Step("Create Project: Site Audit settings")
//    private void doSiteAuditStep() {
//        clickNextButton();
//        WebElement tabElement = WaitUntil.presenceOfElementLocated(TABS);
//        app.moveToElement(tabElement);
//        clickOnTheNextTab(6);
//    }
//
//    @Step("Create Project: Site Audit settings with specific limitPages")
//    private void doSiteAuditStep(int limitPages) {
//        inputCrawlingLimitsAmount(limitPages);
//        clickNextButton();
//        WebElement tabElement = WaitUntil.presenceOfElementLocated(TABS);
//        app.moveToElement(tabElement);
//        clickOnTheNextTab(6);
//    }
//
//    @Step("Create project: Site Audit")
//    private void passSiteAuditStep() {
//        clickOnTheNextTab(4);
//    }
//
//    @Step("Create Project: Rank Tracker settings: Set country, searcher domain, device")
//    public void doRankTrackerStep() {
//        app.sleep(2000);
//        selectSearchEngine();
//        selectSearcher();
//        selectLanguage();
//        selectLabel();
//        clickNextButton();
//    }
//
//    @Step("Create Project: Integrations")
//    private void doIntegrationsStep(boolean useGa, boolean useSc) {
//        connectGoogleAccount();
//        if (useGa) connectGA();
//        if (useSc) connectSearchConsole();
//        clickNextButton();
//        clickOnTheNextTab(4);
//    }
//
//    @Step("Create Project: Keywords setting: Enter keywords then press Finish")
//    public void doFinishStep() {
//        WaitUntil.elementToBeClickable(SUGGEST_KEYWORDS_CLOSE_BUTTON).click();
//        addOneKeyword("website audit report pdf");
//        clickNextButton();
//        clickNextButton();
//        Assert.assertTrue(notificationsCheckBoxesIsDisplay(), "Not all Email notifications checkboxes is display");
//        clickFinishStepButton();
//    }
//
//    @Step("Click finish step button")
//    public void clickFinishStepButton() {
//        app.sleep(1000);
//        WebElement finishButton = WaitUntil.elementToBeClickable(FINISH_STEP_PATH);
//        app.moveToElement(finishButton);
//        finishButton.click();
//        isSpinnerPresent();
//    }
//
//    private void connectGA() {
//        GaPopup gaPopup = new GaPopup();
//        gaPopup.choseGaProfile();
//    }
//
//    private void connectSearchConsole() {
//        new SearchConsolePopup().chooseSearchConsoleProfile();
//    }
//
//    @Step("Click on 'Next' button")
//    private void clickNextButton() {
//        WaitUntil.presenceOfElementLocated(NEXT_BUTTON_ON_CREATE).click();
//    }
//
//    @Step("Click on 'Next' button")
//    public void clickOnTheNextButton(int button) {
//        WebElement next = WaitUntil.presenceOfElementLocated(String.format(NEXT_BUTTON, button));
//        app.moveToElement(next);
//        WaitUntil.elementToBeClickable(String.format(NEXT_BUTTON, button)).click();
//    }
//
//    @Step("Click on tab: {step}")
//    public void clickOnTheNextTab(int step) {
//        WebElement tab = WaitUntil.elementToBeClickable(String.format(TAB_POSITION, step));
//        tab.click();
//    }
//
//    public void clickStartProject() {
//        WaitUntil.visibilityOfElementLocated(START_PROJECT_BUTTON).click();
//    }
//
//    @Step("Click Get Started Button")
//    public void clickGetStartedButton() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(ACCOUNT_CONFIRMATION_GET_STARTED_BUTTON, 120);
//            WaitUntil.elementToBeClickable(ACCOUNT_CONFIRMATION_GET_STARTED_BUTTON).click();
//        } catch (TimeoutException | NoSuchElementException | ElementClickInterceptedException e) {
//            app.wd.navigate().refresh();
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(ACCOUNT_CONFIRMATION_GET_STARTED_BUTTON, 120);
//            WaitUntil.elementToBeClickable(ACCOUNT_CONFIRMATION_GET_STARTED_BUTTON).click();
//        }
//    }
//
//    public void selectDomainScopeParam(String param) {
//        switch (param) {
//            case "http":
//                WaitUntil.visibilityOfElementLocated(HTTP_HTTPS_PARAM_DROPDOWN).click();
//                WaitUntil.visibilityOfElementLocated(HTTP_PARAM).click();
//                break;
//            case "https":
//                WaitUntil.visibilityOfElementLocated(HTTP_HTTPS_PARAM_DROPDOWN).click();
//                WaitUntil.visibilityOfElementLocated(HTTPS_PARAM).click();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public boolean continueButtonIsEnabled() {
//        return WaitUntil.visibilityOfElementLocated(CONTINUE_STEP_PATH).isEnabled();
//    }
//
//    public boolean restrictMessageIsDisplayed() {
//        try {
//            WaitUntil.visibilityOfElementLocated(RESTRICT_NOTIFICATION_MESSAGE).isDisplayed();
//            return true;
//        } catch (TimeoutException e) {
//            return false;
//        }
//    }
//
//    @Step("Pass poll after payment")
//    public void pollQuestionsSkip() {
//        WaitUntil.elementToBeClickable(SELECT_YOUR_ROLE).click();
//        WaitUntil.elementToBeClickable(FREELANCER_ROLE).click();
//
//        WaitUntil.elementToBeClickable(SELECT_YOUR_DEPARTMENT).click();
//        WaitUntil.elementToBeClickable(DEVELOPMENT).click();
//
//        WaitUntil.elementToBeClickable(SELECT_AMOUNT_OF_WEBSITES).click();
//        WaitUntil.elementToBeClickable(FIVE_HUNDRED_SITES).click();
//
//        WaitUntil.elementToBeClickable(SELECT_YOUR_EXPERIENCE).click();
//        WaitUntil.elementToBeClickable(USED_SEO_TOOL_BEFORE).click();
//
//        WaitUntil.elementToBeClickable(GO_TO_THE_APP_BUTTON).click();
//        WaitUntil.invisibilityOfElementLocated(PROGRESS_SPINNER_PATH);
//    }
}
