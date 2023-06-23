package SitecheckerUI.pages.AppPages.CreateEditProject;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class EditProjectPage extends BasePage {

    //GENERAL
    private static final SelenideElement SAVE_BUTTON_EDIT = $x("//span[contains(text(), 'Save')]");
    private static final SelenideElement SAVE_BUTTON_DISABLE_STATE = $x("//button [contains (@class, 'mat-button-disabled')]//span[contains(text(), 'Save')]");
    private static final SelenideElement PROJECT_EDITED_POPUP = $x("//*[contains(text(),'Project edited')]");
    private static final String DISCARD_CHANGED_POP_UP = "//app-unsaved-changes-dialog";
    private static final String DISCARD_AND_LEAVE_BUTTON = "//app-unsaved-changes-dialog//span [text() = ' Yes, discard and leave ']";
    private static final SelenideElement SAVE_AND_RE_CRAWL_BUTTON = $x("//span[contains(text(),' Save and re-crawl ')]");
    private static final String DELETE_PROJECT = "//span[contains(text(),'Delete project')]";
    private static final String CONFIRM_YES_BUTTON = "//span[contains(text(),'Yes')]";
    private static final SelenideElement KEYWORDS_TAB_BUTTON = $x("//span[text() = 'Keywords']");
    private static final String SITE_AUDIT_TAB_BUTTON = "//li//span[text() = 'Site Audit']";
    private static final String MONITORING_TAB_BUTTON = "//li//span[text() = 'Site Monitoring']";
    private static final String INTEGRATIONS_TAB_BUTTON = "//span[text() = 'GA / GSC setup']";
    private static final String RANK_TRACKER_TAB_BUTTON = "//app-editor-nav[contains(@class, 'project-editor')]//span[text() = 'Rank Tracker']";
    private static final String INTEGRATION_TAB_TITLE = "//h2[text() = 'GA / GSC Setup']";
    private static final String SITE_AUDIT_TAB_TITLE = "//h2[text() = 'Site Audit']";
    private static final String RANK_TRACKER_TAB_TITLE = "//h2[text() = 'Rank Tracker']";
    private static final String SITE_MONITORING_TAB_TITLE = "//h2[text() = 'Site Monitoring']";
    private static final String ALERTS_AND_REPORTS_TAB_TITLE = "//h2[text() = 'Alerts and Reports']";
    private static final String ATTENTION_POP_UP_YES_BUTTON = "//span[text() = 'Yes']";
    private static final String ATTENTION_POP_UP_OK_BUTTON = "//span[text() = 'Ok']";
    private static final String ATTENTION_POP_UP = "//mat-dialog-container";
    //GA/GSC
    private static final String GOOGLE_ACCOUNT = "autotest@boosta.co";
    private static final String SUBMIT_POP_UP_BUTTON = "//button/span[contains(text(), 'Got it')]";
    private static final String CONNECT_GOOGLE_ACCOUNT_BUTTON = "//span[contains(text(), 'Connect Google Account')]/..";
    private static final String ACCOUNT_PROFILE = "//div[contains(@class, 'google-account-email')][text() = '%s']";
    //RANK TRACKER
    private static final String SELECT_SEARCH_ENGINE = "//mat-select[@placeholder = 'Select searcher']";
    private static final String SELECT_SEARCHER = "//mat-select[@placeholder = 'Select domain searcher']";
    private static final String SELECT_LANGUAGE = "//mat-select[@placeholder = 'Select language']";
    private static final String INPUT_LANGUAGE = "//input[contains(@placeholder, 'Language name')]";
    private static final String DESKTOP_LABEL = "//*[contains(text(), 'desktop')]";
    private static final String GOOGLE_IN_SEARCH = "//span/span[contains(text(), 'Google')]";
    private static final String INPUT_SEARCHER = "//input[contains(@placeholder, 'Country name')]";
    private static final String GOOGLE_SEARCHER_DOMAIN = "//span[@class = 'mat-option-text']//span[text() = 'www.google.com']";
    private static final String ENGLISH_SELECT_LANGUAGE = "//span[contains(text(), ' English')]";
    private static final String KEYWORD_TEXT_ELEMENT = "//div[contains(@class, 'keyword-view')]/span[contains(text(), '%s')]";
    //Ownership
    private static final String OWNERSHIP_EDIT = "//span[text() = 'Ownership']";
    private static final String OWNERSHIP_CONNECT_BUTTON = "//span[text() = ' Connect ']";
    //SITE AUDIT TAB
    private static final String RESTORE_ISSUE_BUTTON = "//span[contains(text(), 'Restore')]";
    private static final String CRAWL_AMOUNT_PAGE_LIMIT_INPUT = "//input[contains(@class, 'crawl-limits')]";
    private static final String CRAWL_EXTERNAL_CHECK_BOX = "//span [text() = 'Crawl external links ']";
    private static final String CRAWL_EXTERNAL_CHECK_BOX_CHECKED = "//mat-checkbox [contains (@class, 'mat-checkbox-checked')]//span [text() = 'Crawl external links ']";
    private static final String CRAWL_NO_INDEX_PAGES_CHECK_BOX = "//span[contains(text(), 'Crawl noindex pages')]";
    private static final String CRAWL_NO_INDEX_PAGES_CHECK_BOX_CHECKED = "//mat-checkbox [contains (@class, 'mat-checkbox-checked')]//span[contains(text(), 'Crawl noindex pages')]";
    private static final String CRAWL_LINKS_WITH_PARAMETERS_CHECK_BOX = "//span[contains(text(), 'Crawl links with parameters ')]";
    private static final String CRAWL_LINKS_WITH_PARAMETERS_CHECK_BOX_CHECKED = "//mat-checkbox [contains (@class, 'mat-checkbox-checked')]//span[contains(text(), 'Crawl links with parameters ')]";
    private static final String ADD_SITEMAPS_MANUALLY_CHECKBOX = "//span [contains (text(), 'Add sitemaps manually')]";
    private static final String SITEMAP_INPUT_FIELD = "//input [@placeholder = 'Insert sitemap url...']";
    private static final String ADD_SITEMAP_LINK_BUTTON = "//button [contains (@class, 'crawling-settings-step__sitemap-url-input-add-button')]";
    private static final String SITEMAP_LIST = "//a [@class = 'crawling-settings-step__sitemap-url-list-item-url']";
    //KEYWORDS TAB
    private static final String KEYWORD_IN_LIST_WITH_NAME = "//span[@class='keyword ng-star-inserted' and text() = '[%s]']";
    private static final String KEYWORD_IN_LIST_WITH_INDEX = "(//span[@class='keyword ng-star-inserted'])[%d]";
    private static final String KEYWORD_CHECKBOX = KEYWORD_IN_LIST_WITH_INDEX + "//ancestor::app-grid-row-item/mat-checkbox";
    private static final String KEYWORD_CHECKBOX_CHECKED = KEYWORD_IN_LIST_WITH_INDEX + "//ancestor::app-grid-row-item/mat-checkbox[contains (@class, 'mat-checkbox-checked')]";
    private static final String KEYWORDS_TOOLS_PANEL = "//app-keywords-table-editor/div [contains (@class, 'keywords-table-tools')]";
    private static final String KEYWORDS_TOOLS_COLLAPSE_BUTTON = KEYWORDS_TOOLS_PANEL + "/div [contains (@class, 'keywords-table-tools')]";
    private static final String KEYWORDS_TOOLS_SEARCH_FIELD = KEYWORDS_TOOLS_PANEL + "/div [contains (@class, 'app-input-field')]/input";
    private static final String KEYWORDS_TOOLS_URL_CHECKBOX = KEYWORDS_TOOLS_PANEL + "//mat-checkbox [@formcontrolname = 'groupByUrl']";
    private static final String KEYWORDS_TOOLS_URL_CHECKBOX_CHECKED = KEYWORDS_TOOLS_PANEL + "//mat-checkbox [@formcontrolname = 'groupByUrl' and contains (@class, 'mat-checkbox-checked')]";
    private static final String KEYWORDS_TOOLS_GROUP_CHECKBOX = KEYWORDS_TOOLS_PANEL + "//mat-checkbox [@formcontrolname = 'groupByGroup']";
    private static final String KEYWORDS_TOOLS_GROUP_CHECKBOX_CHECKED = KEYWORDS_TOOLS_PANEL + "//mat-checkbox [@formcontrolname = 'groupByGroup' and contains (@class, 'mat-checkbox-checked')]";
    private static final String KEYWORDS_TOOLS_DELETE_KEYWORD_BUTTON = KEYWORDS_TOOLS_PANEL + "//mat-icon[text() = 'delete']";
    private static final String KEYWORDS_TOOLS_ALL_KEYWORDS_CHECKBOX = KEYWORDS_TOOLS_PANEL + "//mat-checkbox[contains(@class, 'select-all')]";
    private static final String ACTION_KEYWORDS_BUTTONS = KEYWORD_IN_LIST_WITH_INDEX + "//ancestor::app-grid-row-item//div[contains (@class , 'actions-wrapper')]";
    private static final String GROUP_KEYWORDS_GROUP = "//app-grid-group-item//mat-icon[text() = ' folder ']";
    private static final String URL_KEYWORDS_GROUP = "//app-grid-group-item//mat-icon[text() = ' link ']";
    private static final String MANAGE_KEYWORD_BUTTON = "//span[text() = 'Manage keywords']";
    private static final String EMPTY_KEYWORDS_TITLE = "//div[contains(@class, 'no-keywords-message')]";
    private static final SelenideElement INPUT_KEYWORDS = $x("//textarea");
    private static final SelenideElement ADD_KEYWORD_BUTTON = $x("//div[contains(@class, 'keywords-step__add-buttons')]//span[text() = ' Add ']");
    private static final SelenideElement DELETE_ALL_KEYWORDS_BUTTON = $x("//span [text() = 'Delete all']");
    private static final String SAVE_BUTTON_IN_SUGGEST = "//mat-dialog-container//span[text() = 'Save ']";
    private static final String CANCEL_BUTTON_IN_SUGGEST = "//mat-dialog-container//span[contains (text(), 'Cancel')]";
    private static final String RESEARCH_KEYWORDS_BUTTON = "//span [text() = 'Research keywords']";
    private static final String YOUR_WEBSITE_KEYWORDS_BUTTON = "//span [text() = 'Your website keywords']";
    private static final String KEYWORDS_IN_SUGGEST_LIST = "//datatable-body//div [contains (@class, 'datatable-row-center')]";
    private static final String KEYWORDS_IN_LIST = "//span [contains (@class,'keyword ng-star-inserted')]";
    private static final String LONG_TAIL_KEYWORDS_BUTTON = "//span [text() = 'Long-tail keywords']";
    private static final String ENTER_KEYWORDS_SUGGEST_TEXT_AREA = "//textarea [contains (@data-placeholder, 'seed ')]";
    private static final String FIND_LONG_TAIL_KEYWORDS_BUTTON = "//span [text() = 'Find long-tail keywords']";
    private static final String RELATED_KEYWORDS_BUTTON = "//span [text() = 'Related keywords']";
    private static final String FIND_RELATED_KEYWORDS_BUTTON = "//span [text() = 'Find related keywords']";
    private static final String COMPETITORS_KEYWORDS_BUTTON = "//span [text() = 'Competitor’s keywords']";
    private static final String COMPETITORS_DOMAIN_INPUT = "//input [contains (@placeholder, 'competitor’s domain')]";
    private static final String FIND_RANKED_KEYWORDS_BUTTON = "//span [text() = 'Find ranked keywords']";
    private static final String GSC_SUGGEST_BUTTON = "//span [text() = 'From Google Search Console']";
    private static final String EXCEL_IMPORT_BUTTON = "//span [text() = 'From Exсel file']";
    private static final String IMPORT_EXCEL_FILE_INPUT = "//input [@name = 'keywordsXlsx']";
    private static final String KEYWORDS_COUNT_DATA = "(//span[contains(@class, 'keywords-counter')])[3]";
    private static final String IMPORT_KEYWORDS_BUTTON = "//span[text() = 'Import keywords']";
    private static final String GSC_KEYWORDS_IMPORT_VALUE = "//span[text() = 'From Google Search Console']";
    private static final String FIRST_SUGGEST_KEYWORD_NAME = "(//div[@class = 'datatable-body-cell-label'])[1]";
    private static final String FIRST_SUGGEST_KEYWORD_ADD_BUTTON = "(//div[@class = 'datatable-body-cell-label']//button)[1]";
    private static final String FIRST_SUGGEST_REMOVE_BUTTON = "(//div[@class = 'datatable-body-cell-label']//button/span[contains(text(), 'Remove')])[1]";
    private static final String SAVE_SUGGEST_KEYWORD_BUTTON = "//div[@class = 'mat-dialog-actions footer']//span[contains(text(), 'Save')]";
    private static final String SUGGEST_KEYWORD_ADD_ALL_BUTTON = "//span[text() = ' Add all ']";
    private static final String SUGGEST_KEYWORD_REMOVE_ALL_BUTTON = "//span[text() = ' Remove All ']";
    //SITE MONITORING TAB
    private static final String DISABLED_SITE_MONITORING_INTERVAL = "//mat-radio-button[contains (@class,'mat-radio-disabled')]";
    private static final String EVERY_12_HOURS_MONITORING_INTERVAL = "//span [text() = ' every 12 hours ']";
    private static final String DAILY_MONITORING_INTERVAL = "//span [text() = ' daily ']";
    private static final String CHECKED_SITE_MONITORING_INTERVAL = "//mat-radio-button[contains (@class,'mat-radio-checked')]//span [@class = 'mat-radio-label-content']";
    //ALERTS_AND_REPORTS
    private static final String NOTIFICATION_REPORTS_TAB_BUTTON = "//span [text() = 'Alerts and Reports']";
    private static final String EMAIL_NOTIFICATION_CHECKBOX = "//mat-checkbox [contains(@class,  'mat-checkbox-checked')]";
    private static final String EMAIL_NOTIFICATION_CHECKBOX_CREATE_PROJECT = "//div[contains(@class, ('notifications-table__cell'))]//mat-checkbox [contains(@class,  'mat-checkbox-checked')]";
    //UPGRADE POP_UPS
    private static final String UPGRADE_YOUR_PLAN_BUTTON = "//button//span [text() = 'Upgrade your plan']";
    private static final String UPGRADE_PLAN_MONITORING_BUTTON = "//app-project-setting-item//button//span [text() = ' Upgrade plan ']";
    private static final String UPGRADE_PLAN_SLACK_BUTTON = "//app-slack-connect-banner//button//span [text() = ' Upgrade plan ']";
    private static final SelenideElement CLOSE_NOTIFICATION_CRAWL_POP_UP = $x("//div [contains (@class, 'notification-message-close')]");

    //    @Step("Get counter of Keywords")
//    public static String getKeywordsCountData() {
//        return KEYWORDS_COUNT_DATA;
//    }
//
//    @Step("Get Keywords Button Path")
//    public static String getKeywordsTabButton() {
//        return KEYWORDS_TAB_BUTTON;
//    }
//
//    @Step("Check is First Keyword present")
//    public boolean isFirstKeywordPresent() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(String.format(KEYWORD_IN_LIST_WITH_INDEX, 1)).isDisplayed();
//        } catch (TimeoutException | NoSuchElementException n) {
//            return false;
//        }
//    }
//
//    @Step("Delete All Keywords by button")
//    public void deleteAllKeywords() {
//        WaitUntil.elementToBeClickable(MANAGE_KEYWORD_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(KEYWORDS_TOOLS_ALL_KEYWORDS_CHECKBOX).click();
//        WaitUntil.elementToBeClickable(KEYWORDS_TOOLS_DELETE_KEYWORD_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(EMPTY_KEYWORDS_TITLE);
//        clickSaveButtonEdit();
//    }
//
//    @Step("Add all GSC suggested keywords")
//    public void addAllGSCKeywords() {
//        clickSaveButtonEdit();
//        WebElement importSelect = WaitUntil.visibilityOfElementLocated(IMPORT_KEYWORDS_BUTTON);
//        importSelect.click();
//        WebElement suggest = WaitUntil.visibilityOfElementLocated(GSC_KEYWORDS_IMPORT_VALUE);
//        suggest.click();
//        addAllGCSKeywords();
//        WebElement saveButtonSuggestKeywords = WaitUntil.presenceOfElementLocated(SAVE_BUTTON_IN_SUGGEST);
//        saveButtonSuggestKeywords.click();
//        app.sleep(5000);
//        clickSaveButtonEdit();
//        app.sleep(5000);
//    }
//
//    @Step("Approve popUp")
//    public void approvePopUp() {
//        WebElement approveButton = WaitUntil.elementToBeClickable(SUBMIT_POP_UP_BUTTON);
//        approveButton.click();
//    }
//
//    @Step("Press 'Restore issue' from ignore")
//    public void turnIssueBack() {
//        WebElement saveButton = WaitUntil.presenceOfElementLocated(SAVE_BUTTON_EDIT);
//        app.scrollToElement(saveButton);
//        WebElement restoreButton = WaitUntil.presenceOfElementLocated(RESTORE_ISSUE_BUTTON);
//        app.moveToElement(restoreButton);
//        restoreButton.click();
//        clickSaveButtonEdit();
//    }
//
//    public void editProject() {
//        clickSiteAuditEdit();
//        clickMonitoringEdit();
//        clickIntegrationsEdit();
//        connectGoogleAccount();
//        editProjectGA();
//        editProjectGSC();
//        clickRankTrackerEdit();
//        app.sleep(10000);
//        selectSearchEngine();
//        selectSearcher();
//        selectLanguage();
//        selectLabel();
//        clickSaveButtonEdit();
//        clickKeywordsEdit();
//        app.sleep(5000);
//        String keyword = "help sitechecker";
//        addOneKeyword(keyword);
//        addGscSuggestKeyword();
//        app.sleep(5000);
//    }
//
//    @Step("Click on Site Audit setting tab")
//    public void clickSiteAuditEdit() {
//        WaitUntil.visibilityOfElementLocated(SITE_AUDIT_TAB_BUTTON).click();
//    }
//
//    @Step("Click on Monitoring setting tab")
//    public void clickMonitoringEdit() {
//        WaitUntil.visibilityOfElementLocated(MONITORING_TAB_BUTTON).click();
//    }
//
//    @Step("Click on Integration setting tab")
//    public void clickIntegrationsEdit() {
//        WaitUntil.visibilityOfElementLocated(INTEGRATIONS_TAB_BUTTON).click();
//    }
//
//    @Step("Click on Ownership setting tab")
//    public void clickOwnerShipEdit() {
//        WaitUntil.visibilityOfElementLocated(OWNERSHIP_EDIT).click();
//    }
//
//    @Step("Click on RankTracker setting tab")
//    public void clickRankTrackerEdit() {
//        WaitUntil.visibilityOfElementLocated(RANK_TRACKER_TAB_BUTTON).click();
//    }
//
    @Step("Click on Keywords setting tab")
    public void clickKeywordsEdit() {
        KEYWORDS_TAB_BUTTON.shouldBe(Condition.visible).click();
    }

    //    @Step("Click on Keywords setting tab")
//    public void clickNotificationsTab() {
//        WaitUntil.visibilityOfElementLocated(NOTIFICATION_REPORTS_TAB_BUTTON).click();
//    }
//
//    @Step("Select search engine")
//    public void selectSearchEngine() {
//        WebElement searchSelect = WaitUntil.visibilityOfElementLocated(SELECT_SEARCH_ENGINE);
//        app.moveToElement(searchSelect);
//        searchSelect.click();
//        WebElement google = WaitUntil.visibilityOfElementLocated(GOOGLE_IN_SEARCH);
//        google.click();
//    }
//
//    @Step("Select searcher")
//    public void selectSearcher() {
//        WebElement searcher = WaitUntil.visibilityOfElementLocated(SELECT_SEARCHER);
//        new Actions(app.wd).moveToElement(searcher).click().perform();
//        WebElement inputSearcher = WaitUntil.visibilityOfElementLocated(INPUT_SEARCHER);
//        inputSearcher.click();
//        inputSearcher.clear();
//        inputSearcher.sendKeys("google.com");
//        WaitUntil.visibilityOfElementLocated(GOOGLE_SEARCHER_DOMAIN).click();
//    }
//
//    @Step("Select language")
//    public void selectLanguage() {
//        WebElement language = WaitUntil.visibilityOfElementLocated(SELECT_LANGUAGE);
//        language.click();
//        WebElement inputLan = WaitUntil.visibilityOfElementLocated(INPUT_LANGUAGE);
//        inputLan.clear();
//        inputLan.sendKeys("En");
//        WebElement englishLanguage = WaitUntil.visibilityOfElementLocated(ENGLISH_SELECT_LANGUAGE);
//        englishLanguage.click();
//    }
//
//    @Step("Select label")
//    public void selectLabel() {
//        WebElement desktop = WaitUntil.visibilityOfElementLocated(DESKTOP_LABEL);
//        app.scrollToElement(desktop);
//        desktop.click();
//    }
//
    @Step("Click on 'Delete All Keywords' button")
    public void clickDeleteAllKeywords() {
        SelenideElement saveButton = DELETE_ALL_KEYWORDS_BUTTON.shouldBe(Condition.visible);
        saveButton.scrollTo();
        saveButton.click();
    }

    @Step("Click on 'Save' button")
    public void clickSaveButtonEdit() {
        SelenideElement saveButton = SAVE_BUTTON_EDIT.shouldBe(Condition.exist);
        saveButton.scrollTo();
        if (CLOSE_NOTIFICATION_CRAWL_POP_UP.is(Condition.visible)) {
            closeCrawlPopUpIfPresent();
            saveButton.scrollTo().click();
        } else {
            saveButton.scrollTo().click();
        }
        checkProjectEditedPopUp();
        checkRecrawlPopUp();
        checkSaveButtonState();
    }

    //
    public void closeCrawlPopUpIfPresent() {
        if (CLOSE_NOTIFICATION_CRAWL_POP_UP.isDisplayed()) {
            CLOSE_NOTIFICATION_CRAWL_POP_UP.click();
        }
    }


    public void checkSaveButtonState() {
        if(!SAVE_BUTTON_DISABLE_STATE.is(Condition.visible)){
            SAVE_BUTTON_EDIT.shouldBe(Condition.visible).click();
            checkProjectEditedPopUp();
            checkRecrawlPopUp();
        }
    }

    public void checkRecrawlPopUp() {
        if(SAVE_AND_RE_CRAWL_BUTTON.isDisplayed()){
            SAVE_AND_RE_CRAWL_BUTTON.shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
            checkProjectEditedPopUp();
        }
    }


    public void checkProjectEditedPopUp() {
        if (PROJECT_EDITED_POPUP.isDisplayed()) {
            PROJECT_EDITED_POPUP.shouldBe(Condition.appear, Duration.ofSeconds(20));
            PROJECT_EDITED_POPUP.shouldBe(Condition.disappear);
        }
    }
//
//    @Step("Click 'Your WebSite Suggest' keywords")
//    public void clickWebsiteSuggest() {
//        WaitUntil.visibilityOfElementLocated(RESEARCH_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(YOUR_WEBSITE_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Click 'Long-tail Suggest' keywords")
//    public void clickLongTailSuggest() {
//        WaitUntil.visibilityOfElementLocated(RESEARCH_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(LONG_TAIL_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Click 'Related Suggest' keywords")
//    public void clickRelatedSuggest() {
//        WaitUntil.visibilityOfElementLocated(RESEARCH_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(RELATED_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Click 'Competitors Suggest' keywords")
//    public void clickCompetitorsSuggest() {
//        WaitUntil.visibilityOfElementLocated(RESEARCH_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(COMPETITORS_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Click 'Excel Import' keywords")
//    public void clickExcelImport() {
//        WaitUntil.visibilityOfElementLocated(IMPORT_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(EXCEL_IMPORT_BUTTON).click();
//    }
//
//    @Step("Click 'GSC suggest' keywords")
//    public void clickGSCSuggest() {
//        WaitUntil.visibilityOfElementLocated(IMPORT_KEYWORDS_BUTTON).click();
//        WaitUntil.visibilityOfElementLocated(GSC_SUGGEST_BUTTON).click();
//    }
//
//    @Step("Push XML file to Import")
//    public void sentXmlFileToImport(File file) {
//        sentFileToImport(IMPORT_EXCEL_FILE_INPUT, file);
//        try {
//            WaitUntil.invisibilityOfElementLocated(ATTENTION_POP_UP);
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(CANCEL_BUTTON_IN_SUGGEST).click();
//        }
//    }
//
//    @Step("Search Long-Tail suggest by Keywords")
//    public void searchLongTailSuggest(String keyword) {
//        WebElement longTailTextArea = WaitUntil.visibilityOfElementLocated(ENTER_KEYWORDS_SUGGEST_TEXT_AREA);
//        longTailTextArea.sendKeys(keyword);
//        app.sleep(Duration.ofSeconds(10).toMillis());
//        WaitUntil.elementToBeClickable(FIND_LONG_TAIL_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Search Related suggest by Keywords")
//    public void searchRelatedSuggest(String keyword) {
//        WebElement relatedTextArea = WaitUntil.visibilityOfElementLocated(ENTER_KEYWORDS_SUGGEST_TEXT_AREA);
//        relatedTextArea.sendKeys(keyword);
//        app.sleep(Duration.ofSeconds(10).toMillis());
//        WaitUntil.elementToBeClickable(FIND_RELATED_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Search Competitors suggest by Keywords")
//    public void searchCompetitorsSuggest(String domain) {
//        WebElement competitorsDomainInput = WaitUntil.visibilityOfElementLocated(COMPETITORS_DOMAIN_INPUT);
//        competitorsDomainInput.sendKeys(domain);
//        app.sleep(Duration.ofSeconds(30).toMillis());
//        WaitUntil.visibilityOfElementLocated(FIND_RANKED_KEYWORDS_BUTTON).click();
//    }
//
//    @Step("Check suggested keywords is present")
//    public boolean suggestKeywordsIsDisplayed() {
//        int keywordsCount = 0;
//        try {
//            List<WebElement> keywords = WaitUntil.visibilityOfAllElements(KEYWORDS_IN_SUGGEST_LIST);
//            keywordsCount = keywords.size();
//        } catch (TimeoutException ignored) {
//        }
//        if (keywordsCount > 1) {
//            WaitUntil.visibilityOfElementLocated(SAVE_BUTTON_IN_SUGGEST).click();
//            return true;
//        } else {
//            WaitUntil.visibilityOfElementLocated(CANCEL_BUTTON_IN_SUGGEST).click();
//            return false;
//        }
//    }
//
//    @Step("Check if xml file is imported")
//    public boolean importedKeywordsIsAdded() {
//        List<WebElement> keywords;
//        try {
//            keywords = WaitUntil.visibilityOfAllElements(KEYWORDS_IN_LIST);
//        } catch (TimeoutException ex) {
//            keywords = WaitUntil.visibilityOfAllElements(KEYWORDS_IN_LIST);
//        }
//        return keywords.size() == 3;
//    }
//
//    public void searchKeyword(String keyword) {
//        WebElement searchField = WaitUntil.visibilityOfElementLocated(KEYWORDS_TOOLS_SEARCH_FIELD);
//        searchField.click();
//        searchField.sendKeys(keyword);
//    }
//
//    @Step("Add one keyword")
//    public void addOneKeyword(String keyword) {
//        WebElement inputKeywords = WaitUntil.visibilityOfElementLocated(INPUT_KEYWORDS);
//        inputKeywords.click();
//        inputKeywords.clear();
//        inputKeywords.sendKeys(keyword);
//        app.sleep(5000);
//        clickAddKeywordButton();
//        WaitUntil.presenceOfElementLocated(String.format(KEYWORD_TEXT_ELEMENT, keyword));
//    }

    @Step("Add keywords")
    public void addGroupOfKeywords(String keywords) {
        clickDeleteAllKeywords();
        SelenideElement inputKeywords = INPUT_KEYWORDS.shouldBe(Condition.visible);
        inputKeywords.click();
        inputKeywords.clear();
        inputKeywords.setValue(keywords);
        clickAddKeywordButton();
    }

    //    @Step("Check if Keywords Tools Panel is Opened")
//    public boolean isKeywordsToolsPanelPresent() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(KEYWORDS_TOOLS_PANEL).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Select checkBox of 1st keyword")
//    public void selectCheckboxOnFirstKeyword() {
//        WaitUntil.visibilityOfElementLocated(String.format(KEYWORD_CHECKBOX, 1)).click();
//        WaitUntil.visibilityOfElementLocated(String.format(KEYWORD_CHECKBOX_CHECKED, 1));
//    }
//
//    @Step("Select checkBox of URL keywords group: {status}")
//    public void selectUrlKeywordsGroup(boolean status) {
//        app.setCheckBoxByStatus(status, KEYWORDS_TOOLS_URL_CHECKBOX, KEYWORDS_TOOLS_URL_CHECKBOX_CHECKED);
//    }
//
//    @Step("Select checkBox of Group keywords group {status}")
//    public void selectGroupKeywordsGroup(boolean status) {
//        app.setCheckBoxByStatus(status, KEYWORDS_TOOLS_GROUP_CHECKBOX, KEYWORDS_TOOLS_GROUP_CHECKBOX_CHECKED);
//    }
//
//    @Step("Check  URL keywords group is present")
//    public boolean isUrlKeywordsGroupPresent() {
//        try {
//            return WaitUntil.waitToInSecondsVisibilityOfElementLocated(URL_KEYWORDS_GROUP, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check Group keywords group is present")
//    public boolean isGroupKeywordsGroupPresent() {
//        try {
//            return WaitUntil.waitToInSecondsVisibilityOfElementLocated(GROUP_KEYWORDS_GROUP, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check the keyword is present in the list {keyword}")
//    public boolean isKeywordPresentInEditList(String keyword) {
//        try {
//            return WaitUntil.waitToInSecondsVisibilityOfElementLocated(String.format(KEYWORD_IN_LIST_WITH_NAME, keyword), 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check if edit and delete buttons is present after hover on keyword")
//    public boolean checkActionButtonsAfterHoverOnKeyword() {
//        hoverOverKeyword(1);
//        return editAndDeletePresentOnHover(1);
//    }
//
//    private void hoverOverKeyword(int index) {
//        WebElement firstKeyword = WaitUntil.visibilityOfElementLocated(String.format(KEYWORD_IN_LIST_WITH_INDEX, index));
//        app.moveToElement(firstKeyword);
//    }
//
//    private boolean editAndDeletePresentOnHover(int index) {
//        try {
//            return WaitUntil.waitToInSecondsVisibilityOfElementLocated(String.format(ACTION_KEYWORDS_BUTTONS, index), 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Collapse Keywords tools panel")
//    public void closeKeywordsToolsPanel() {
//        WaitUntil.visibilityOfElementLocated(KEYWORDS_TOOLS_COLLAPSE_BUTTON).click();
//        WaitUntil.invisibilityOfElementLocated(KEYWORDS_TOOLS_PANEL);
//    }
//
//    @Step("Get Count of keywords from the list")
//    public int getCountOfKeywordsInList() {
//        List<WebElement> keywords;
//        try {
//            keywords = WaitUntil.visibilityOfAllElements(KEYWORDS_IN_LIST);
//        } catch (TimeoutException ex) {
//            keywords = WaitUntil.visibilityOfAllElements(KEYWORDS_IN_LIST);
//        }
//        return keywords.size();
//    }
//
    @Step("Click Add Keyword Button")
    public void clickAddKeywordButton() {
        ADD_KEYWORD_BUTTON.shouldBe(Condition.interactable).click();
    }
//
//    @Step("Connect ownership by GoogleAccount")
//    public void editProjectOwnerShip() {
//        clickOwnerShipEdit();
//        WebElement connectButton = WaitUntil.elementToBeClickable(OWNERSHIP_CONNECT_BUTTON);
//        connectButton.click();
//        connectGoogleAccount();
//        SearchConsolePopup scPopup = new SearchConsolePopup();
//        scPopup.chooseSearchConsoleProfile();
//        clickSaveButtonEdit();
//    }
//
//    @Step("Disconnect GSC")
//    public void disconnectGSC() {
//        clickIntegrationsEdit();
//        SearchConsolePopup searchConsolePopup = new SearchConsolePopup();
//        searchConsolePopup.unSelectGSCAccount();
//        clickSaveButtonEdit();
//    }
//
//    public void editProjectGA() {
//        GaPopup gaPopup = new GaPopup();
//        gaPopup.choseGaProfile();
//        clickSaveButtonEdit();
//    }
//
//    @Step("Connect Google Account")
//    public void connectGoogleAccount() {
//        boolean hasAccount;
//        try {
//            WaitUntil.visibilityOfElementLocated(String.format(ACCOUNT_PROFILE, GOOGLE_ACCOUNT));
//            hasAccount = true;
//        } catch (TimeoutException ex) {
//            hasAccount = false;
//        }
//        if (!hasAccount) {
//            clickConnectGoogleAccountButton();
//            approvePopUp();
//            approveGoogleAccess();
//        }
//    }
//
//    public void editProjectGSC() {
//        SearchConsolePopup scPopup = new SearchConsolePopup();
//        scPopup.chooseSearchConsoleProfile();
//        clickSaveButtonEdit();
//    }
//
//    @Step("Changing Crawler limits")
//    public void changeCrawlerLimits(int limits) {
//        inputCrawlingLimitsAmount(limits);
//        clickSaveButtonEdit();
//    }
//
//    @Step("Input amount of crawled pages limit")
//    public void inputCrawlingLimitsAmount(int limits) {
//        WebElement input = WaitUntil.visibilityOfElementLocated(CRAWL_AMOUNT_PAGE_LIMIT_INPUT);
//        input.clear();
//        WaitUntil.waitToInSecondsVisibilityOfElementLocated(ATTENTION_POP_UP, 20);
//        try {
//            WaitUntil.elementToBeClickable(ATTENTION_POP_UP_YES_BUTTON).click();
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(ATTENTION_POP_UP, 20);
//        } catch (TimeoutException ex) {
//            WaitUntil.elementToBeClickable(ATTENTION_POP_UP_OK_BUTTON).click();
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(ATTENTION_POP_UP, 20);
//        }
//        app.sleep(Duration.ofSeconds(5).toMillis());
//        input.sendKeys(String.valueOf(limits));
//    }
//
//    @Step("Add GSC Suggest Keyword")
//    public void addGscSuggestKeyword() {
//        try {
//            WebElement keywords = WaitUntil.visibilityOfElementLocated(KEYWORDS_TAB_BUTTON);
//            keywords.click();
//        } catch (Exception ignored) {
//        }
//
//        try {
//            WebElement importKeywords = WaitUntil.elementToBeClickable(IMPORT_KEYWORDS_BUTTON);
//            importKeywords.click();
//            WebElement fromGSC = WaitUntil.elementToBeClickable(GSC_KEYWORDS_IMPORT_VALUE);
//            fromGSC.click();
//            WebElement keywordName = WaitUntil.visibilityOfElementLocated(FIRST_SUGGEST_KEYWORD_NAME);
//            String popUpName = keywordName.getText();
//            WebElement addButton = WaitUntil.elementToBeClickable(FIRST_SUGGEST_KEYWORD_ADD_BUTTON);
//            addButton.click();
//            WaitUntil.visibilityOfElementLocated(FIRST_SUGGEST_REMOVE_BUTTON);
//            WebElement saveButtonKeyword = WaitUntil.elementToBeClickable(SAVE_SUGGEST_KEYWORD_BUTTON);
//            saveButtonKeyword.click();
//            WaitUntil.presenceOfElementLocated(String.format(KEYWORD_TEXT_ELEMENT, popUpName));
//            clickSaveButtonEdit();
//
//        } catch (TimeoutException ex) {
//            ex.printStackTrace();
//            Assert.fail("Тест по GSC не прошел проверку: " + ex.getMessage());
//        }
//    }
//
//    @Step("Add all GSC keywords")
//    public void addAllGCSKeywords() {
//        WaitUntil.visibilityOfElementLocated(SUGGEST_KEYWORD_ADD_ALL_BUTTON).click();
//        WebElement removeAllButton = WaitUntil.visibilityOfElementLocated(SUGGEST_KEYWORD_REMOVE_ALL_BUTTON);
//        Assert.assertTrue(removeAllButton.isDisplayed(), "Remove button is not displaying");
//    }
//
//    @Step("Select 'Crawl External Links' option")
//    public void selectCrawlExternalLinks(boolean status) {
//        app.setCheckBoxByStatus(status, CRAWL_EXTERNAL_CHECK_BOX, CRAWL_EXTERNAL_CHECK_BOX_CHECKED);
//    }
//
//    @Step("Select 'Crawl links with parameters' option")
//    public void selectCrawlLinksWithParameters(boolean status) {
//        app.setCheckBoxByStatus(status, CRAWL_LINKS_WITH_PARAMETERS_CHECK_BOX, CRAWL_LINKS_WITH_PARAMETERS_CHECK_BOX_CHECKED);
//        clickSaveButtonEdit();
//    }
//
//    @Step("Select 'Crawl noIndex pages' option")
//    public void selectCrawlNoIndexPages(boolean status) {
//        app.setCheckBoxByStatus(status, CRAWL_NO_INDEX_PAGES_CHECK_BOX, CRAWL_NO_INDEX_PAGES_CHECK_BOX_CHECKED);
//        clickSaveButtonEdit();
//    }
//
//    @Step("Add Sitemap Manually")
//    public void addSitemapManually(String sitemap) {
//        WebElement addSitemapManuallyCheckbox = WaitUntil.visibilityOfElementLocated(ADD_SITEMAPS_MANUALLY_CHECKBOX);
//        addSitemapManuallyCheckbox.click();
//        WebElement insertSitemapUrl = WaitUntil.visibilityOfElementLocated(SITEMAP_INPUT_FIELD);
//        insertSitemapUrl.click();
//        insertSitemapUrl.sendKeys(sitemap);
//        WaitUntil.visibilityOfElementLocated(ADD_SITEMAP_LINK_BUTTON).click();
//    }
//
//    @Step("Check is Sitemap added")
//    public boolean isSitemapAdded() {
//        return app.isElementPresent(By.xpath(SITEMAP_LIST));
//    }
//
//    public void setKeywords(String... keyword) {
//        StringJoiner stringJoiner = new StringJoiner("\n");
//        Arrays.asList(keyword).forEach(stringJoiner::add);
//        WaitUntil.presenceOfElementLocated(KEYWORD_TEXT_ELEMENT).sendKeys(stringJoiner.toString());
//    }
//
//    @Step("Click connect google account")
//    private void clickConnectGoogleAccountButton() {
//        WebElement connectGaButton = WaitUntil.elementToBeClickable(CONNECT_GOOGLE_ACCOUNT_BUTTON);
//        app.sleep(2000);
//        connectGaButton.click();
//    }
//
//    private void connectGSCFreeTrial() {
//        connectGoogleAccount();
//        new SearchConsolePopup().chooseSearchConsoleProfile();
//    }
//
//    public void connectGSCFromEditProject() {
//        connectGSCFreeTrial();
//    }
//
//    @Step("Approve GoogleAccess")
//    private void approveGoogleAccess() {
//        app.sleep(5000);
//        String windowHandle = app.wd.getWindowHandle();
//        app.switchToLastTab();
//        LoginViaAccount loginViaAccount = new LoginViaAccount();
//        app.sleep(5000);
//        try {
//            loginViaAccount.clickChoseEmail();
//            loginViaAccount.approveAccess();
//        } catch (TimeoutException tiex) {
//            app.wd.close();
//        }
//
//        app.sleep(5000);
//        app.wd.switchTo().window(windowHandle);
//    }
//
//    @Step("Click 'Yes, discard and leave'")
//    public void passLeaveAndDiscardForm() {
//        WaitUntil.visibilityOfElementLocated(DISCARD_CHANGED_POP_UP).isDisplayed();
//        WaitUntil.visibilityOfElementLocated(DISCARD_AND_LEAVE_BUTTON).click();
//    }
//
//    public void clickOnElementAtEditProjectPage(String locator) {
//        WaitUntil.elementToBeClickable(locator).click();
//    }
//
//    public int getKeywordsValueAtEditProjectPage(String locator) {
//        try {
//            WebElement element = app.wd.findElement(By.xpath(locator));
//            String keywordsCountText = element.getText().trim();
//            String keywordsOne = keywordsCountText.split("keywords")[0].trim();
//            String keywords = keywordsOne.split("\\(")[1];
//            return Integer.parseInt(keywords);
//        } catch (NumberFormatException ne) {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException ie) {
//                ie.printStackTrace();
//            }
//            WebElement element = app.wd.findElement(By.xpath(locator));
//            String keywordsCountText = element.getText().trim();
//            StringBuilder keywordsCount = new StringBuilder();
//            for (char c : keywordsCountText.toCharArray()) {
//                if (c == '/') {
//                    break;
//                }
//                keywordsCount.append(c);
//            }
//            return Integer.parseInt(keywordsCount.toString().trim());
//        }
//    }
//
//    @Step("Check 'Integration' tab is opened")
//    public boolean isIntegrationTabOpen() {
//        WaitUntil.visibilityOfElementLocated(INTEGRATION_TAB_TITLE);
//        return app.getCurrentUrl().contains("?step=integrations");
//    }
//
//    @Step("Check 'Site Audit' tab is opened")
//    public boolean isSiteAuditTabOpen() {
//        WaitUntil.visibilityOfElementLocated(SITE_AUDIT_TAB_TITLE);
//        return app.getCurrentUrl().contains("?step=crawling-settings");
//    }
//
//    @Step("Check 'Monitoring' tab is opened")
//    public boolean isSiteMonitoringTabOpen() {
//        WaitUntil.visibilityOfElementLocated(SITE_MONITORING_TAB_TITLE);
//        return app.getCurrentUrl().contains("?step=monitoring-settings");
//    }
//
//    @Step("Check 'RankTracker' tab is opened")
//    public boolean isRankTrackerTabOpen() {
//        WaitUntil.visibilityOfElementLocated(RANK_TRACKER_TAB_TITLE);
//        return app.getCurrentUrl().contains("?step=rank-tracker-settings");
//    }
//
//    @Step("Check 'Alerts and Report' tab is opened")
//    public boolean isAlertsAndReportsTabOpen() {
//        WaitUntil.visibilityOfElementLocated(ALERTS_AND_REPORTS_TAB_TITLE);
//        return app.getCurrentUrl().contains("?step=notifications-and-reports");
//    }
//
//    @Step("Check Monitoring Interval is disable")
//    public boolean isMonitoringIntervalDisable() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(DISABLED_SITE_MONITORING_INTERVAL).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check 12 hours monitoring is disable")
//    public boolean is12hoursMonitoringDisable() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(DISABLED_SITE_MONITORING_INTERVAL + EVERY_12_HOURS_MONITORING_INTERVAL).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check daily monitoring is disable")
//    public boolean isDailyMonitoringDisable() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(DISABLED_SITE_MONITORING_INTERVAL + DAILY_MONITORING_INTERVAL).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public String getSelectedIntervalName() {
//        return WaitUntil.visibilityOfElementLocated(CHECKED_SITE_MONITORING_INTERVAL).getText().trim();
//    }
//
//    @Step("Waiting for Audit finished")
//    public boolean waitForAuditFinished(String locator, int minutes) {
//        if (minutes == 0) {
//            ChecklistHelper.createFailMessageWithToken(app.getDomainTokenByID(), "Crawling not finished");
//            return false;
//        }
//        try {
//            WaitUntil.visibilityOfElementLocated(locator);
//            return true;
//        } catch (TimeoutException e) {
//            return waitForAuditFinished(locator, minutes - 1);
//        }
//    }
//
//
//    public boolean notificationsCheckBoxesIsEnable() {
//        List<WebElement> keywords = WaitUntil.presenceOfAllElements(EMAIL_NOTIFICATION_CHECKBOX);
//        return keywords.size() >= 10;
//    }
//
//    public boolean notificationsCheckBoxesIsDisplay() {
//        List<WebElement> checkbox = WaitUntil.presenceOfAllElements(EMAIL_NOTIFICATION_CHECKBOX_CREATE_PROJECT);
//        return checkbox.size() >= 10;
//    }
//
//    @Step("Click Upgrade your plan on SiteAudit tab/Monitoring")
//    public void clickUpgradeYourPlanButton() {
//        app.sleep(1000);
//        WebElement upgradePlanButton = WaitUntil.presenceOfElementLocated(UPGRADE_YOUR_PLAN_BUTTON);
//        app.scrollToElement(upgradePlanButton);
//        upgradePlanButton.click();
//    }
//
//    @Step("Click Upgrade  plan on Monitoring")
//    public void clickUpgradeMonitoringPlanButton() {
//        app.sleep(1000);
//        WebElement upgradePlanButton = WaitUntil.visibilityOfElementLocated(UPGRADE_PLAN_MONITORING_BUTTON);
//        app.scrollToElement(upgradePlanButton);
//        upgradePlanButton.click();
//    }
//
//    @Step("Click Upgrade plan on Notifications")
//    public void clickUpgradeSlackPlanButton() {
//        app.sleep(1000);
//        WebElement upgradePlanButton = WaitUntil.visibilityOfElementLocated(UPGRADE_PLAN_SLACK_BUTTON);
//        app.scrollToElement(upgradePlanButton);
//        upgradePlanButton.click();
//    }
//
//    @Step("Delete project")
//    public void deleteProject() {
//        WaitUntil.visibilityOfElementLocated(DELETE_PROJECT).click();
//        WaitUntil.visibilityOfElementLocated(CONFIRM_YES_BUTTON).click();
//    }
}