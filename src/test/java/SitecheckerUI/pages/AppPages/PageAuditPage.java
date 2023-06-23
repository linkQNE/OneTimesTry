package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PageAuditPage extends BasePage {

    private static final SelenideElement CLOSE_ICON = $x("//div[@class='page-audit__top']//mat-icon[@data-mat-icon-name = 'closeIcon']");
    private static final SelenideElement VIEW_PAGE_AUDIT_LINK = $x("(//app-link-decorator/a)[1]");
    private static final String CONTENT_TAB = "//span[text() = 'Content']";
    private static final String PAGE_MONITORING_TAB = "//span[text() = 'Page monitoring']";
    private static final String OVERVIEW_TAB = "//span[text() = 'Overview']";
    private static final String ISSUES_TAB = "//span[text() = 'Issues']";
    private static final String KEYWORDS_GAP_TAB = "//span[text() = 'Keywords gap']";
    private static final String SEARCH_METRICS_TAB = "//span[text() = 'Search metrics']";

    private static final String URL_INSPECTION_TAB = "//span[text() = 'URL inspection']";
    private static final String INTERNAL_BACKLINKS_TAB = "//span[text() = 'Internal backlinks']";
    private static final String INTERNAL_BACKLINKS_ANCHORS_TAB = "//span[text() = 'Internal backlinks anchors']";
    private static final String INTERNAL_LINKS_TAB = "//span[text() = 'Internal links']";
    private static final String EXTERNAL_LINKS_TAB = "//span[text() = 'External links']";
    private static final String MOBILE_PAGE_SPEED_TAB = "//span[text() = 'Mobile PageSpeed']";
    private static final String DESKTOP_PAGE_SPEED = "//span[text() = 'Desktop PageSpeed']";
    private static final String IMAGES_TAB = "//span[text() = 'Images']";
    private static final String CSS_FILES_TAB = "//span[text() = 'CSS files']";
    private static final String JAVA_SCRIPT_FILES_TAB = "//span[text() = 'JavaScript files']";
    private static final String HTML_SOURCE = "//span[text() = 'HTML source']";
    private static final String OVERVIEW_CONTENT = "//app-http-headers-check";
    private static final ElementsCollection ISSUES_CONTENT = $$x("//div[contains(@class, 'page-audit-issues__list-item-check-title')]");
    private static final String H1_STRUCTURE = "//div[contains(@class, 'check-title')]/div[contains(text(), 'H1')]";
    private static final String ISSUES_UPDATES = "//div[contains(@class, 'page-monitoring-check')]";
    private static final String KEYWORDS_GAP_CONTENT = "//div [contains (@class, 'page-audit__content')]//div [@class = 'page-audit__title-group-name']";
    private static final String URL_INSPECTOR_CONTENT = "//app-url-inspection-check//span[text() = 'Connect Google Search Console']";
    private static final String INTERNAL_BACKLINKS_CONTENT = "//app-internal-backlinks-check//a";
    private static final String INTERNAL_BACKLINKS_ANCHORS_CONTENT = "//app-internal-backlinks-anchors-check//datatable-row-wrapper";
    private static final String INTERNAL_LINKS_CONTENT = "//app-internal-links-check//a";
    private static final String EXTERNAL_LINKS_CONTENT = "//app-external-links-check//a";
    private static final String MOBILE_PAGE_SPEED_CONTENT = "(//div[contains(@class, 'check-title')]/div[contains(text(), 'Lab data')])[2]";
    private static final String DESKTOP_FIELD_DATA = "(//div[text() = 'Field data'])[1]";
    private static final String IMAGES_DATA = "//app-images-check//a";
    private static final String CSS_DATA = "//app-css-files-check//a";
    private static final String JAVA_SCRIPT_DATA = "//app-javascript-files-check//a";
    private static final String HTML_DATA = "//span[text() = 'html']";
    private static final String EXTERNAL_STATUS_CODES = "//app-external-links-check//span [contains (@class, 'status-code-chips')]";
    private static final String EXPORT_POP_UP = "//div [@role = 'menu']";
    private static final String INTERNAL_BACKLINKS_EXPORT_BUTTON = "//app-internal-backlinks-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String INTERNAL_LINKS_EXPORT_BUTTON = "//app-internal-links-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String EXTERNAL_LINKS_EXPORT_BUTTON = "//app-external-links-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String IMAGES_EXPORT_BUTTON = "//app-images-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String CSS_EXPORT_BUTTON = "//app-css-files-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String JAVA_SCRIPT_EXPORT_BUTTON = "//app-javascript-files-group//app-button[contains(@class,'page-audit-table__export-button')]";
    private static final String CSV_EXPORT_BUTTON = "//app-button [@text = 'CSV']";
    private static final String COPY_EXPORT_BUTTON = "//app-button [@text = 'Copy']";
    private static final String GOOGLE_SHEETS_EXPORT_BUTTON = "//app-button [@text = 'Google Sheets']";
    private static final String EXPORT_SPINNER = "//mat-spinner";
    //Counters
    private static final String COUNTER_INTERNAL_BACKLINKS = "//app-page-audit-navigation//span [text() = 'Internal backlinks']//following-sibling::span";
    private static final String COUNTER_INTERNAL_LINKS = "//app-page-audit-navigation//span [text() = 'Internal links']//following-sibling::span";
    private static final String COUNTER_EXTERNAL_LINKS = "//app-page-audit-navigation//span [text() = 'External links']//following-sibling::span";
    private static final String COUNTER_IMAGES = "//app-page-audit-navigation//span [text() = 'Images']//following-sibling::span";
    private static final String COUNTER_CSS = "//app-page-audit-navigation//span [text() = 'CSS files']//following-sibling::span";
    private static final String COUNTER_JAVA_SCRIPT = "//app-page-audit-navigation//span [text() = 'JavaScript files']//following-sibling::span";
    private static final String SITE_IVANHOE_PRO = "//span[contains(text(),'site:ivanhoe.pro')]";
    private static final String LOCALIZATION_URLS = "//app-localization-check[@class='page-audit__check-container ng-star-inserted']//span[@class='mat-tooltip-trigger link-decorator__link-text ng-star-inserted']";

    @Step("Click on link to open Page Audit")
    public void clickViewPageAudit() {
        VIEW_PAGE_AUDIT_LINK.shouldBe(Condition.interactable).click();
        ISSUES_CONTENT.first().shouldBe(Condition.visible);
    }

    @Step("Close pageAudit")
    public void closePageAudit() {
        CLOSE_ICON.shouldBe(Condition.visible).click();
    }

    //    @Step("Click 'Export'")
//    public void openExportPopUP(String tab) {
//        WaitUntil.visibilityOfElementLocated(getExportButtonByTabTitle(tab)).click();
//        isExportPopUpOpened();
//    }
//
//    @Step("Click on export 'CSV'")
//    public void clickCSVExport(String tab) {
//        openExportPopUP(tab);
//        WaitUntil.visibilityOfElementLocated(CSV_EXPORT_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(EXPORT_SPINNER, 20).isDisplayed();
//        } catch (TimeoutException e) {
//            openExportPopUP(tab);
//            WaitUntil.visibilityOfElementLocated(CSV_EXPORT_BUTTON).click();
//        }
//        app.sleep(Duration.ofSeconds(30).toMillis());
//    }
//
//    @Step("Click on export 'Copy'")
//    public void clickCopyExport(String tab) {
//        openExportPopUP(tab);
//        app.sleep(1000);
//        WaitUntil.visibilityOfElementLocated(COPY_EXPORT_BUTTON).click();
//        isCopySnackBarPresent();
//    }
//
//    @Step("Click on export 'Google Sheets'")
//    public void clickGoogleSheetsExport(String tab) {
//        app.closeTabsExceptCurrent();
//        app.sleep(Duration.ofSeconds(10).toMillis());
//        openExportPopUP(tab);
//        app.sleep(1000);
//        WaitUntil.visibilityOfElementLocated(GOOGLE_SHEETS_EXPORT_BUTTON).click();
//    }
//
//    @Step("Click 'Issues' tab")
//    public void clickIssues() {
//        isElementPresentWait(ISSUES_TAB);
//    }
//
//    @Step("Click 'Overview' tab")
//    public void clickOverview() {
//        isElementPresentWait(OVERVIEW_TAB);
//    }
//
//    @Step("Click 'Content' tab")
//    public void clickContent() {
//        isElementPresentWait(CONTENT_TAB);
//    }
//
//    @Step("Click 'Page monitoring' tab")
//    public void clickPageMonitoring() {
//        isElementPresentWait(PAGE_MONITORING_TAB);
//    }
//
//    @Step("Click 'keywords gap' tab")
//    public void clickKeywordsGap() {
//        isElementPresentWait(KEYWORDS_GAP_TAB);
//    }
//
//    @Step("Click 'search metrics' tab")
//    public void clickSearchMetrics() {
//        isElementPresentWait(SEARCH_METRICS_TAB);
//    }
//
//    @Step("Click 'URL Inspection' tab")
//    public void clickUrlInspection() {
//        isElementPresentWait(URL_INSPECTION_TAB);
//    }
//
//    @Step("Click 'Internal backlinks' tab")
//    public void clickInternalBacklinks() {
//        isElementPresentWait(INTERNAL_BACKLINKS_TAB);
//    }
//
//    @Step("Click 'Internal backlinks anchors' tab")
//    public void clickInternalBacklinksAnchors() {
//        isElementPresentWait(INTERNAL_BACKLINKS_ANCHORS_TAB);
//    }
//
//    @Step("Click 'Internal links' tab")
//    public void clickInternalLinks() {
//        isElementPresentWait(INTERNAL_LINKS_TAB);
//    }
//
//    @Step("Click 'External links' tab")
//    public void clickExternalLinks() {
//        isElementPresentWait(EXTERNAL_LINKS_TAB);
//    }
//
//    @Step("Click 'Mobile Page Speed' tab")
//    public void clickMobilePageSpeed() {
//        isElementPresentWait(MOBILE_PAGE_SPEED_TAB);
//    }
//
//    @Step("Click 'Desktop PageSpeed' tab")
//    public void clickDesktopPageSpeed() {
//        isElementPresentWait(DESKTOP_PAGE_SPEED);
//    }
//
//    @Step("Click 'Images' tab")
//    public void clickImages() {
//        isElementPresentWait(IMAGES_TAB);
//    }
//
//    @Step("Click 'CSS files' tab")
//    public void clickCSSFiles() {
//        WaitUntil.visibilityOfElementLocated(CSS_FILES_TAB).click();
//    }
//
//    @Step("Click 'JavaScript files' tab")
//    public void clickJavaScriptFiles() {
//        WaitUntil.visibilityOfElementLocated(JAVA_SCRIPT_FILES_TAB).click();
//    }
//
//    @Step("Find and check all status codes > 0")
//    public boolean checkAllStatusCodes() {
//        List<WebElement> statusCodes;
//        try {
//            statusCodes = WaitUntil.presenceOfAllElements(EXTERNAL_STATUS_CODES);
//        } catch (TimeoutException ex) {
//            return false;
//        }
//        for (WebElement code : statusCodes) {
//            try {
//                if (Integer.parseInt(code.getText()) == 0) {
//                    return false;
//                }
//            } catch (NumberFormatException ignore) {
//            }
//        }
//        return true;
//    }
//
//    @Step("Check status code is present on External Backlinks Tab")
//    public boolean statusCodeIsNotPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(EXTERNAL_STATUS_CODES).isDisplayed();
//            return false;
//        } catch (TimeoutException ex) {
//            return true;
//        }
//    }
//
//    @Step("Click 'HTML source")
//    public void clickHTMLSource() {
//        isElementPresentWait(HTML_SOURCE);
//    }
//
//    @Step("Check Page Audit 'Overview' tab is Present")
//    public boolean isOverviewTabPresent() {
//        try {
//            WaitUntil.presenceOfAllElements(OVERVIEW_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
    @Step("Check Page Audit 'Issues' tab is Present")
    public void isIssuesTabPresent() {
            ISSUES_CONTENT.shouldBe(CollectionCondition.sizeGreaterThan(0).because("Issues tab on PageDetail is not present"));
    }
//
//    @Step("Check Page Audit 'Structure' tab is Present")
//    public boolean isStructureTabPresent() {
//        try {
//            WaitUntil.presenceOfElementLocated(H1_STRUCTURE);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page monitoring 'Issues Updates' are Present")
//    public boolean isIssuesUpdatesPresent() {
//        try {
//            WaitUntil.presenceOfElementLocated(ISSUES_UPDATES);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//
//    @Step("Check Page Audit 'Keyword Gap' tab is Present")
//    public boolean isKeywordGapTabPresent() {
//        try {
//            String tabTitle = WaitUntil.visibilityOfElementLocated(KEYWORDS_GAP_CONTENT).getText();
//            return tabTitle.equals("Keywords gap");
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Search metrics' tab is Present")
//    public boolean isSearchMetricsTabPresent() {
//        try {
//            String tabTitle = WaitUntil.visibilityOfElementLocated(KEYWORDS_GAP_CONTENT).getText();
//            return tabTitle.equals("Search metrics");
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check if data in Page Audit 'Keywords Gap' tab is Present")
//    public boolean isDataKeywordsGapTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(SITE_IVANHOE_PRO);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'URL inspection' tab is Present")
//    public boolean isUrlInspectionTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(URL_INSPECTOR_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Internal Backlinks' tab is Present")
//    public boolean isInternalBacklinksTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(INTERNAL_BACKLINKS_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Internal Backlinks Anchors Tab' tab is Present")
//    public boolean isInternalBacklinksAnchorsTabPresent() {
//        try {
//            WaitUntil.presenceOfElementLocated(INTERNAL_BACKLINKS_ANCHORS_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Internal Links' tab is Present")
//    public boolean isInternalLinksTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(INTERNAL_LINKS_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'External Links' tab is Present")
//    public boolean isExternalLinksTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(EXTERNAL_LINKS_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Mobile Speed' tab is Present")
//    public boolean isMobilePageSpeedTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(MOBILE_PAGE_SPEED_CONTENT);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Desktop Speed' tab is Present")
//    public boolean isDesktopDataTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(DESKTOP_FIELD_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Localization' tab data is Present")
//    public int isLocalizationDataTabPresent() {
//        return WaitUntil.visibilityOfAllElements(LOCALIZATION_URLS).size();
//    }
//
//
//    @Step("Check Page Audit 'Images' tab is Present")
//    public boolean isImagesTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(IMAGES_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'CSS files' tab is Present")
//    public boolean isCSSTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(CSS_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'Java Script Files' tab is Present")
//    public boolean isJavaScriptTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(JAVA_SCRIPT_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Check Page Audit 'HTML' tab is Present")
//    public boolean isHtmlTabPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(HTML_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    public int getNumberOfLinks() {
//        String URLs = getCopiedText();
//        String[] lines = URLs.split("\n");
//        return lines.length;
//    }
//
//    @Step("Compare links from Copy with Tab: '{tab}' Counter")
//    public boolean compareCounter(String tab) {
//        int counter = getCounterOfLinksByTab(tab);
//        int counterLinksFromCopy = getNumberOfLinks();
//        return counterLinksFromCopy == counter || counterLinksFromCopy == 1000;
//    }
//
//    @Step("Compare count of 'External links' from list with Tab Counter")
//    public boolean compareCounterExternalLinksInTable() {
//        int counter = getCounterOfLinksByTab("EXTERNAL_LINKS");
//        int counterLinksInTab = countLinksInExternalLinksTab();
//        return counterLinksInTab == counter;
//    }
//
//    @Step("Check count 'External links' in tab more than: {count}")
//    public boolean checkCountOfPagesInExternalLinksTab(int count) {
//        int counterLinksInTab = countLinksInExternalLinksTab();
//        return count < counterLinksInTab;
//    }
//
//    @Step("Get Count of links from External links tab")
//    public int countLinksInExternalLinksTab() {
//        List<WebElement> links = WaitUntil.presenceOfAllElements(EXTERNAL_LINKS_CONTENT);
//        return links.size();
//    }
//
//    public String getGoogleSheetsTitle() {
//        return getOpenedPageTitleAndClose();
//    }
//
//    @Step("Waiting specific element by locator and click")
//    public void isElementPresentWait(String locator) {
//        try {
//            app.sleep(500);
//            WaitUntil.visibilityOfElementLocated(locator).click();
//        } catch (StaleElementReferenceException ex) {
//            app.sleep(500);
//            WaitUntil.visibilityOfElementLocated(locator).click();
//        }
//    }
//
//    @Step("Check Export Pop-up is Opened")
//    public void isExportPopUpOpened() {
//        try {
//            WaitUntil.visibilityOfElementLocated(EXPORT_POP_UP).isDisplayed();
//        } catch (TimeoutException ignored) {
//        }
//    }
//
//    public String getCopiedText() {
//        return getStringFromBuffer();
//    }
//
//    public boolean isCSVDownloaded(String title) {
//        return isFileDownloaded(title);
//    }
//
//    public int getCounterOfLinksByTab(String tab) {
//        switch (tab) {
//            case "INTERNAL_BACKLINKS":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_INTERNAL_BACKLINKS).getText());
//            case "INTERNAL_LINKS":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_INTERNAL_LINKS).getText());
//            case "EXTERNAL_LINKS":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_EXTERNAL_LINKS).getText());
//            case "IMAGES":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_IMAGES).getText());
//            case "CSS_FILES":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_CSS).getText());
//            case "JAVA_SCRIPT_FILES":
//                return Integer.parseInt(WaitUntil.visibilityOfElementLocated(COUNTER_JAVA_SCRIPT).getText());
//            default:
//                return 0;
//        }
//    }
//
//    public String getExportButtonByTabTitle(String page) {
//        switch (page) {
//            case "INTERNAL_BACKLINKS":
//                return INTERNAL_BACKLINKS_EXPORT_BUTTON;
//            case "INTERNAL_LINKS":
//                return INTERNAL_LINKS_EXPORT_BUTTON;
//            case "EXTERNAL_LINKS":
//                return EXTERNAL_LINKS_EXPORT_BUTTON;
//            case "IMAGES":
//                return IMAGES_EXPORT_BUTTON;
//            case "CSS_FILES":
//                return CSS_EXPORT_BUTTON;
//            case "JAVA_SCRIPT_FILES":
//                return JAVA_SCRIPT_EXPORT_BUTTON;
//            default:
//                return null;
//        }
//    }

}
