package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.AppPages.Components.SideBar.SideBar;
import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class RankTrackerPage extends BasePage {

    private SideBar sideBar = new SideBar();

    private static final SelenideElement RANK_TRACKER_MAIN_CONTAINER = $x("//app-rank-tracker-view");
    private static final SelenideElement SEARCH_KEYWORDS_INPUT = $x("//input[contains(@placeholder, 'Search keywords...')]");
    private static final String VOLUME_FILTER = "//div[contains(text(), 'Volume')]/..";
    public static final String VOLUME_SORT_BUTTON = "//span[contains(text(), 'Volume')]";
    private static final String FROM_VOLUME_VALUE_FIELD = "//input[contains(@placeholder, 'From')]";
    private static final String TO_VOLUME_VALUE_FIELD = "//input[contains(@placeholder, 'To')]";
    private static final String APPLY_VOLUME_BUTTON = "//span [contains(text(), 'Apply')]";
    private static final String INDEXATION_PROGRESS_GRAPH_BUTTON = "//div [contains (text(),'Indexation progress')]";
    private static final String ALL_RANKINGS = "//span[contains(text(), 'All rankings')]";
    private static final String TOP50_LABEL = "//app-select-option/mat-checkbox//span[text() = 'Top 50']/..";
    private static final String CANVAS_GRAPH = "//app-analysis-of-serp-chart//canvas";
    private static final String INDEXATION_PROGRESS_GRAPH = "//app-indexation-progress-chart//canvas";
    private static final String INDEXATION_LAST_DATA_PATH = "//app-indexation-progress-chart//thead";
    private static final String LAST_GRAPH_DATE_PATH = "//app-analysis-of-serp-chart//thead";
    private static final String ADVANCED_MENU = "//span[text() = 'Advanced']";
    private static final String COLUMNS_MENU = "//span[contains(text(), 'Columns')]";
    private static final String POSITION_CHECKBOX = "//div[text() = ' Position ']/preceding-sibling::mat-checkbox";
    private static final String POSITION_CHECKBOX_CHECKED = "//div[text() = ' Position ']/preceding-sibling::mat-checkbox [contains (@class, 'mat-checkbox-checked')]";
    public static final String POSITION_TABLE_POINT = "//span[text() = 'Position']";
    private static final String URL_TABLE_POINT = "//span[text() = 'URL']";
    private static final String KEYWORD_IN_TABLE = "//span[text() = '%s']";
    private static final String SHOW_GRAPH_BUTTON = "//button[@mattooltip = 'Show graph']";
    private static final String ADD_KEYWORDS_BUTTON = "//span[text() = 'Add keywords ']";
    private static final String TOOLTIP_VALUES = "//tbody/tr//span";
    private static final String KEYWORDS = "//datatable-row-wrapper";
    private static final String KEYWORD = "//span[text() = '%s']//ancestor::datatable-row-wrapper";
    private static final String SHOW_ALL_BUTTON = "//button/span[contains(text(), 'Show all')]";
    private static final String DYGRAPHS_TABLE = "//app-chart-dygraphs/div[1]";
    private static final String DYGRAPHS_DATE = "//app-chart-dygraphs//div[contains(@class, 'chart-dygraphs__custom-tooltip')]/div[1]";
    private static final String KEYWORDS_VOLUME = KEYWORDS + "//datatable-body-cell[3]/div/div[contains(@mattooltip, 'Search volume')]";
    private static final String KEYWORD_ANALYSIS_OF_SERP_BUTTON = KEYWORD + "//button[@mattooltip = 'Keywords SERP analysis']";
    private static final String BASIC_TABLE = "//span[text() = 'Basic']";
    private static final SelenideElement IN_PROGRESS_PAGE = $x("//div[contains(@class, 'rank-tracker-progress')][contains(text(), 'checking website positions')]");
    private static final String LOADER_SPINNER = "//app-progress-spinner";
    private static final String CLOSE_BUTTON = "//mat-icon[text() = 'close']";
    private static final String CLOSE_BUTTON_SECOND_LOCATOR = "//app-one-keyword-allProjectsPage-dialog//button [@aria-label = 'Close dialog']";
    private static final String BACKDROP = "//sitechecker-layout";
    private static final String NO_POSITIONS_CHECKBOX = "";

    //Exports
    private static final String EXPORT_BUTTON = "//app-keywords-container//span[text() = 'Export']";
    private static final String PDF_BUTTON = "//div [@class = 'cdk-overlay-pane']//span[text() = 'PDF']";
    private static final String CSV_BUTTON = "//div [@class = 'cdk-overlay-pane']//span[text() = 'CSV']";
    private static final String GOOGLE_SHEETS_BUTTON = "//div [@class = 'cdk-overlay-pane']//span[text() = 'Google Sheets']";
    public static final String KEYWORDS_PRESENT = "//span[contains(@class,'keywords-advanced-table__keyword-span')]";
    public static final String LOOKER_STUDIO_URL = "lookerstudio.google.com";
    public static final String SORT_BUTTON = "//datatable-header-cell[contains(@class,'datatable-header-cell center sortable')]//mat-icon[@svgicon='tool:link-tracker']";
    public static final String ONE_DAY_SORTING_BUTTON = "//datatable-header-cell[contains(@class,'datatable-header-cell center sortable')]//mat-icon[@svgicon='tool:link-tracker']";

    //span[contains(text(),'1 day')]
    //first five keywords for checking positions
    private static final String FIRST_KEYWORD = "(//div[@class='datatable-body-cell-label']//span[@class='ng-star-inserted'])[1]";
    private static final String SECOND_KEYWORD = "(//div[@class='datatable-body-cell-label']//span[@class='ng-star-inserted'])[2]";
    private static final String THIRD_KEYWORD = "(//div[@class='datatable-body-cell-label']//span[@class='ng-star-inserted'])[3]";
    private static final String FORTH_KEYWORD = "(//div[@class='datatable-body-cell-label']//span[@class='ng-star-inserted'])[4]";
    private static final String FIFTH_KEYWORD = "(//div[@class='datatable-body-cell-label']//span[@class='ng-star-inserted'])[5]";
    private static final String SERP_ICON = "//span[contains(text(),' SERP ')]";
    private static final String FIRST_KEYWORD_URL = "(//span[contains(@class,'link-decorator__link-text')]//span)[1]";
    private static final String PAGE_DETAILS_ISSUES = "//span[contains(text(),'Issues')]";
    private static final String PAGE_DETAILS_URL = "//a[@class='page-audit__url']";
    private static final String PAGES_TAB = "//a[contains(text(),' Pages ')]";
    private static final String LOOKER_STUDIO = "//span[contains(text(),'Looker Studio')]";
    private static final String ADDITIONAL_BUTTON = "//button[contains(@class,'mat-focus-indicator mat-icon-button mat-button-base small')]";
    private static final String OPEN_URL_BUTTON = "(//mat-icon[contains(@class,'mat-icon notranslate primary')])";
    private static final String KEYWORD_PAGES_TAB = "//span[contains(@class,'page-detail-table__keyword-span')]";
    //all search engines for checking positions
    private static final String GOOGLE_MOBILE = "3212825";
    private static final String GOOGLE_DESKTOP = "3212830";
    private static final String BING = "3212832";
    private static final String YAHOO = "3212834";
    private static final String URL_HELP_SITECHECKER = "help.sitechecker.pro";
    private static final String NO_POSITION_VALUE = "//div[contains(text(),'No Position')]";
    private static final String NO_POSITION_VALUE_DASHBOARD_V2 = "//div[contains(text(),'No position')]";
    private static final String TOP_1_VALUE = "//div[contains(text(),'Top 1:')]";
    private static final String TOP_2_3_VALUE = "//div[contains(text(),'Top 2,3:')]";
    private static final String TOP_2_3_VALUE_DASHBOARD_V2 = "//div[contains(text(),'Top 2-3:')]";
    private static final String TOP_4_10_VALUE = "//div[contains(text(),'Top 4-10:')]";
    private static final String TOP_11_30_VALUE = "//div[contains(text(),'Top 11-30:')]";
    private static final String TOP_31_50_VALUE = "//div[contains(text(),'Top 31-50:')]";
    public static final String TOP_51_100_VALUE = "//div[contains(text(),'Top 51-100:')]";


    //    public int getNoPositionValue() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(NO_POSITION_VALUE).getText().replaceAll("No Position: ", "").trim());
//    }
//
//    public int getNoPositionValueDashboardV2() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(NO_POSITION_VALUE_DASHBOARD_V2).getText().replaceAll("No position: ", "").trim());
//    }
//
//    public int getTop1Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_1_VALUE).getText().replaceAll("Top 1: ", "").trim());
//    }
//
//    public int getTop2And3Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_2_3_VALUE).getText().replaceAll("Top 2,3: ", "").trim());
//    }
//
//    public int getTop2And3ValueDashboardV2() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_2_3_VALUE_DASHBOARD_V2).getText().replaceAll("Top 2-3: ", "").trim());
//    }
//
//    public int getTop4And10Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_4_10_VALUE).getText().replaceAll("Top 4-10: ", "").trim());
//    }
//
//    public int getTop11And30Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_11_30_VALUE).getText().replaceAll("Top 11-30: ", "").trim());
//    }
//
//    public int getTop31And50Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_31_50_VALUE).getText().replaceAll("Top 31-50: ", "").trim());
//    }
//
//    public int getTop51And100Value() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(TOP_51_100_VALUE).getText().replaceAll("Top 51-100: ", "").trim());
//    }
//
//    private String keyWordValue;
//    public String currentDateInTable = UsefulFeatures.getCurrentDate("MMM d");
//    public String dateInGraph = "";
//    private int success = 0;
//
//    MT.Sitechecker.NewSC.pages.AllProjectsPage allProjectsPage = new AllProjectsPage();
//
//    public int getSuccess() {
//        return success;
//    }
//
//    public String getKeywordInTable(String keyword) {
//        return String.format(KEYWORD_IN_TABLE, keyword);
//    }
//
//    public String getPositionTablePoint() {
//        return POSITION_TABLE_POINT;
//    }
//
//    public String getDateInKeyword() {
//        WebElement dateInKeyword = WaitUntil.visibilityOfElementLocated(DYGRAPHS_DATE);
//        return dateInKeyword.getText().trim();
//    }
//
//    @Step("Check keyword Volume")
//    public boolean isVolumePresent() {
//        chooseBasicTable();
//        List<WebElement> volumes = WaitUntil.presenceOfAllElements(KEYWORDS_VOLUME);
//        for (WebElement volume : volumes) {
//            app.moveToElement(volume);
//            if (volume.getText().trim().equals("-")) {
//                continue;
//            }
//            if (Integer.parseInt(volume.getText().trim()) != 0) {
//                success++;
//            }
//        }
//        return success >= 2;
//    }
//
//    @Step("Select Basic Table")
//    public void chooseBasicTable() {
//        WebElement basic = WaitUntil.presenceOfElementLocated(BASIC_TABLE);
//        basic.click();
//    }
//
//
//    @Step("Search keyword: {keyword}")
//    public boolean searchKeyword(String keyword) {
//        app.sleep(5000);
//        WebElement keywordInput = WaitUntil.visibilityOfElementLocated(SEARCH_KEYWORDS_INPUT);
//        keywordInput.clear();
//        keywordInput.sendKeys(keyword);
//        app.sleep(5000);
//        clickBackdrop();
//        try {
//            WaitUntil.visibilityOfElementLocated(getKeywordInTable(keyword));
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check Serp Stat")
//    public boolean isKeywordSERPStatPresent() {
//        WaitUntil.elementToBeClickable(SHOW_ALL_BUTTON).click();
//        try {
//            WebElement dygraphs = WaitUntil.visibilityOfElementLocated(DYGRAPHS_TABLE);
//            allProjectsPage.moveToLastDataOnGraph(dygraphs);
//            return !getDateInKeyword().equals("");
//        } catch (TimeoutException exception) {
//            return false;
//        }
//    }
//
//    @Step("Check Serp icon is Visible after hover on")
//    public boolean isSerpIconVisibility() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(SERP_ICON, 180);
//            return true;
//        } catch (TimeoutException e) {
//            return false;
//        }
//    }
//
//    @Step("Open Serp For Keyword")
//    public void clickKeywordSERP(String keyword) {
//        WebElement keywordInTable = WaitUntil.presenceOfElementLocated(String.format(RankTrackerPage.KEYWORD, keyword));
//        app.scrollToElement(keywordInTable);
//        app.moveToElement(keywordInTable);
//        WaitUntil.elementToBeClickable(String.format(KEYWORD_ANALYSIS_OF_SERP_BUTTON, keyword)).click();
//        isProgressSpinnerPresent();
//    }
//
//    @Step("Click Open Graph if its Close")
//    public void clickOpenGraphIfClose() {
//        try {
//            WaitUntil.waitToInSecondsElementToBeClickable(SHOW_GRAPH_BUTTON, 20).click();
//        } catch (TimeoutException ignored) {
//        }
//    }
//
//    @Step("Click Export button on RankTracker Tab")
//    private void clickExportButton() {
//        try {
//            WaitUntil.elementToBeClickable(EXPORT_BUTTON).click();
//        } catch (StaleElementReferenceException ex) {
//            app.sleep(5000);
//            WaitUntil.elementToBeClickable(EXPORT_BUTTON).click();
//        }
//    }
//
//    @Step("Click export pdf")
//    public void clickExportPDF() {
//        app.closeTabsExceptCurrent();
//        clickExportButton();
//        WaitUntil.visibilityOfElementLocated(PDF_BUTTON).click();
//    }
//
//    @Step("Open pages tab")
//    public void openPagesTab() {
//        WaitUntil.visibilityOfElementLocated(PAGES_TAB).click();
//        WaitUntil.visibilityOfElementLocated(OPEN_URL_BUTTON);
//
//    }
//
//    @Step("Open url")
//    public void openUrl(int number) {
//        WaitUntil.visibilityOfElementLocated(String.format(OPEN_URL_BUTTON + "[%d]", number)).click();
//    }
//
//    @Step("Check keywords in pages tab")
//    public boolean areKeywordsInPagesTabPresent() {
//        List<WebElement> elements = WaitUntil.presenceOfAllElements(KEYWORD_PAGES_TAB);
//        return elements.size() > 0;
//    }
//
//    @Step("Click download csv")
//    public void clickDownloadCSV() {
//        clickExportButton();
//        WaitUntil.visibilityOfElementLocated(CSV_BUTTON).click();
//        app.sleep(Duration.ofSeconds(20).toMillis());
//    }
//
//    @Step("Click Google Sheets on Rank Tracker Tab")
//    public void clickGoogleSheets() {
//        app.closeTabsExceptCurrent();
//        clickExportButton();
//        WaitUntil.visibilityOfElementLocated(GOOGLE_SHEETS_BUTTON).click();
//    }
//
//    @Step("Check is Rank Tracker CSV File Downloaded")
//    public boolean isCSVDownloaded(String title) {
//        return isFileDownloaded(title);
//    }
//
//    @Step("Get Rank Tracker PDF report url")
//    public String getPDFReportURL() {
//        return getOpenedPageURLAndClose();
//    }
//
//    @Step("Get Rank Tracker GoogleSheets title")
//    public String getGoogleSheetsTitle() {
//        return getOpenedPageTitleAndClose();
//    }
//
//    @Step("Check if plug present")
//    public boolean isPlugPresent() {
//        try {
//            WaitUntil.elementToBeClickable(ADD_KEYWORDS_BUTTON);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public void openAdditionalMenu() {
//        WaitUntil.visibilityOfElementLocated(ADDITIONAL_BUTTON).click();
//    }
//
//    public void openLookerStudio() {
//        WaitUntil.visibilityOfElementLocated(LOOKER_STUDIO).click();
//    }
//
//    public String lookerStudioIsOpened() {
//        app.switchToLastTabAndClosePrevious();
//        return app.wd.getCurrentUrl();
//
//    }
//
    @Step("Check if in progress page present")
    public boolean isInProgressPagePresent() {
        return IN_PROGRESS_PAGE.isDisplayed();
    }

    //
//    @Step("20 sec waiting for spinner invisible")
//    public static void isProgressSpinnerPresent() {
//        try {
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(LOADER_SPINNER, 40);
//        } catch (TimeoutException ignored) {
//
//        }
//    }
//
//    public int getTooltipValuesSum() {
//        List<WebElement> elements = WaitUntil.visibilityOfAllElements(TOOLTIP_VALUES);
//        int sum = 0;
//        for (WebElement element : elements) {
//            sum += Integer.parseInt(element.getText().split(":")[1].trim());
//        }
//        return sum;
//    }
//
//    @Step("Choose volume from: {from}, to: {to}")
//    public void chooseVolume(String from, String to) {
//        WaitUntil.elementToBeClickable(VOLUME_FILTER).click();
//        WebElement fromField = WaitUntil.visibilityOfElementLocated(FROM_VOLUME_VALUE_FIELD);
//        fromField.clear();
//        fromField.sendKeys(from);
//        WebElement toField = WaitUntil.visibilityOfElementLocated(TO_VOLUME_VALUE_FIELD);
//        toField.clear();
//        toField.sendKeys(to);
//        WaitUntil.elementToBeClickable(APPLY_VOLUME_BUTTON).click();
//    }
//
//    @Step("Select or undone top 1 label")
//    public void chooseRanking() {
//        WaitUntil.elementToBeClickable(ALL_RANKINGS).click();
//        app.sleep(500);
//        WaitUntil.visibilityOfElementLocated(TOP50_LABEL).click();
//        app.sleep(1000);
//        closePopUpByClickBackdrop();
//    }
//
//    @Step("scroll to the Columns")
//    public void scrollToColumns() {
//        app.scrollToElement(WaitUntil.elementToBeClickable(COLUMNS_MENU));
//    }
//
//    public void selectIndexationProgressGraph() {
//        clickOpenGraphIfClose();
//        WebElement graph = WaitUntil.presenceOfElementLocated(INDEXATION_PROGRESS_GRAPH_BUTTON);
//        app.moveToElement(graph);
//        graph.click();
//    }
//
    @Step("Check is RankTracker Page present")
    public void isRankTrackerPageOpened() {
        RANK_TRACKER_MAIN_CONTAINER.shouldBe(Condition.exist.because("RankTracker Page is not present"));
    }

    //
//    @Step("Compare current date with date in graph")
//    public boolean isDateInGraphCorrect() {
//        clickOpenGraphIfClose();
//        WebElement graph = WaitUntil.visibilityOfElementLocated(CANVAS_GRAPH);
//        allProjectsPage.moveToLastDataOnGraph(graph);
//        try {
//            dateInGraph = app.getTooltipDate(LAST_GRAPH_DATE_PATH);
//        } catch (TimeoutException ex) {
//            allProjectsPage.moveToLastDataOnGraph(graph);
//            dateInGraph = app.getTooltipDate(LAST_GRAPH_DATE_PATH);
//        }
//        return dateInGraph.contains(currentDateInTable);
//    }
//
//
//    @Step("Compare current date with date in indexation graph")
//    public boolean isDateInIndexationGraphCorrect() {
//        clickOpenGraphIfClose();
//        WebElement graph = WaitUntil.visibilityOfElementLocated(INDEXATION_PROGRESS_GRAPH);
//        allProjectsPage.moveToLastDataOnGraph(graph);
//        try {
//            dateInGraph = app.getTooltipDate(INDEXATION_LAST_DATA_PATH);
//        } catch (TimeoutException ex) {
//            allProjectsPage.moveToLastDataOnGraph(graph);
//            dateInGraph = app.getTooltipDate(INDEXATION_LAST_DATA_PATH);
//        }
//        return dateInGraph.contains(currentDateInTable);
//    }
//
//    @Step("Click on advanced menu")
//    public void clickAdvancedMenu() {
//        WaitUntil.elementToBeClickable(ADVANCED_MENU).click();
//        WaitUntil.visibilityOfElementLocated(URL_TABLE_POINT);
//    }
//
//    @Step("Filter position column")
//    public void chooseColumn(boolean status) {
//        scrollToColumns();
//        WaitUntil.elementToBeClickable(COLUMNS_MENU).click();
//        app.setCheckBoxByStatus(status, POSITION_CHECKBOX, POSITION_CHECKBOX_CHECKED);
//        closePopUpByClickBackdrop();
//        app.sleep(5000);
//    }
//
//    @Step("Click backdrop")
//    public void clickBackdrop() {
//        WaitUntil.presenceOfElementLocated(BACKDROP).click();
//    }
//
//    public void clickCloseButton() {
//        try {
//            WaitUntil.elementToBeClickable(CLOSE_BUTTON).click();
//        } catch (ElementClickInterceptedException ex) {
//            WaitUntil.elementToBeClickable(CLOSE_BUTTON_SECOND_LOCATOR).click();
//        }
//    }
//
//    public String getKeyWordValue() {
//        return keyWordValue;
//    }
//
//
//    public void checkKeywordPosition(String keyword) {
//        try {
//            WebElement key = WaitUntil.visibilityOfElementLocated(keyword);
//            keyWordValue = key.getText();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
    public void waitUntilPositionsGathered(int minutes) {
            SEARCH_KEYWORDS_INPUT.shouldBe(Condition.visible.because("Position still in progress after 5 minutes of waiting"),
                    Duration.ofSeconds(minutes*60L));
    }
//
//    public void openPageDetails() {
//        WebElement element = WaitUntil.visibilityOfElementLocated(FIRST_KEYWORD_URL);
//        element.click();
//        WaitUntil.visibilityOfElementLocated(PAGE_DETAILS_ISSUES);
//    }
//
//    public boolean isPageDetailsCorrectUrlOpened() {
//        try {
//            String openedUrl = WaitUntil.visibilityOfElementLocated(PAGE_DETAILS_URL).getText();
//            String rankTrackerUrl = WaitUntil.presenceOfElementLocated(FIRST_KEYWORD_URL).getText();
//            return openedUrl.contains(rankTrackerUrl);
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    public int getKeywordsPresent() {
//        app.sleep(3000);
//        return WaitUntil.visibilityOfAllElements(KEYWORDS_PRESENT).size();
//    }
//
//    public String getGoogleMobile() {
//        return GOOGLE_MOBILE;
//    }
//
//    public String getGoogleDesktop() {
//        return GOOGLE_DESKTOP;
//    }
//
//    public String getBing() {
//        return BING;
//    }
//
//    public String getYahoo() {
//        return YAHOO;
//    }
//
//    public String getUrlHelpSitechecker() {
//        return URL_HELP_SITECHECKER;
//    }
//
//    public String getFIRST_KEYWORD() {
//        return FIRST_KEYWORD;
//    }
//
//    public String getSECOND_KEYWORD() {
//        return SECOND_KEYWORD;
//    }
//
//    public String getTHIRD_KEYWORD() {
//        return THIRD_KEYWORD;
//    }
//
//    public String getFORTH_KEYWORD() {
//        return FORTH_KEYWORD;
//    }
//
//    public String getFIFTH_KEYWORD() {
//        return FIFTH_KEYWORD;
//    }
}
