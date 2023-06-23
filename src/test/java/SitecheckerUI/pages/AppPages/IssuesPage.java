package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class IssuesPage extends BasePage {

    private static final String ALL_URLS = "//div[contains(@class, 'cursor-pointer')]/../div[text() = 'Links:']";
    private static final String ALL_HTML_PAGES_COUNT = "//div [contains (@class, 'checks-navigation__all-pages')]/div [contains (@class, 'checks-navigation__item-count')]";
    private static final String ACTIVE_FILTER_PATH = "//li[contains(@class, 'is-active')]";
    private static final String ACTIVE_FILTER_COUNT_PATH = "//li[contains(@class, 'is-active')]/span[2]";
    private static final String UPGRADE_YOUR_PLAN_BUTTON = "//button[contains(text(), 'Upgrade your plan')]";
    private static final String NEW_PAGES_TITLE = "//div [text() = 'New pages']";
    private static final String NEW_PAGES_FOR_LAST_90_DAYS_BUTTON = "//app-checks-navigation//div[text() = 'New pages for last 90 days']";
    private static final String PAGES_URL_COUNTER_PATH = "//span [contains (@class, 'crawler-filter-table__header__name') and contains (text(), 'Page URL')]";

    //issues Search
    private static final String ERROR_PRIORITY_TITLE = "//div [contains (text(), 'Criticals')]";
    private static final String SEARCH_ISSUES_INPUT_FIELD = "//app-checks-navigation//input";
    private static final String SEARCH_BY_PRIORITY_BUTTON = "//app-checks-navigation//span [text() = ' by Priority ']";
    private static final String SEARCH_BY_CATEGORY_BUTTON = "//app-checks-navigation//span [text() = ' by Category ']";
    private static final String ISSUES_TITLE = "//app-checks-navigation//div [contains (@class, 'checks-navigation__item-title')]";
    private static final String CLEAR_SEARCH_INPUT_FIELD_BUTTON = "//app-checks-navigation//mat-icon [contains (@class, 'checks-navigation__searcher-cleaner-btn')]";
    private static final String CLOSE_SEARCH = "//app-checks-navigation//mat-icon [text() = 'arrow_back']";
    private static final String PAGINATION = "//app-pagination";
    private static final String BREAD_CRUMB = "//button[text () = '%d']";
    private static final String FIRST_ISSUE = "(//span[contains(@class, 'link-decorator__link-text')]/span)[1]";
    private static final String CLOSE_BUTTON = "//mat-icon[text() = 'close']";
    private static final String AUDIT_ISSUE_PROGRESS_BAR = "//div [contains (@class, 'audit-issues__progress')]";

    //SearchFilter
    private static final String FILTER_POP_UP = "//app-advanced-filters";
    private static final String FILTER_BUTTON = "//button[contains (@class, 'crawler-filter-table__filter-url-button')]/span[text() = ' Filter URLs ']";
    private static final String ADD_CONDITION_BUTTON = "//button/span [text() = ' Add condition ']";
    private static final String FIRST_CONDITION_PATH = "(//div [contains (@class, 'advanced-crawler-issues-filters__filter-item')])[1]";
    private static final String SECOND_CONDITION_PATH = "(//div [contains (@class, 'advanced-crawler-issues-filters__filter-item')])[2]";
    private static final String THIRD_CONDITION_PATH = "(//div [contains (@class, 'advanced-crawler-issues-filters__filter-item')])[3]";
    private static final String FOURTH_CONDITION_PATH = "(//div [contains (@class, 'advanced-crawler-issues-filters__filter-item')])[4]";
    private static final String TYPES_DROPDOWN = "//span [text() = 'Page URL']";
    private static final String PAGE_TITLE_OPTION = "//app-select-option//div [text() = 'Page Title']";
    private static final String RULES_DROPDOWN = "//span [text() = 'contains']";
    private static final String DOES_NOT_CONTAINS_OPTION = "//app-select-option//div [text() = 'does not contain']";
    private static final String IS_OPTION = "//app-select-option//div [text() = 'is']";
    private static final String IS_NOT_OPTION = "//app-select-option//div [text() = 'is not']";
    private static final String DELETE_FILTER_CONDITION_BUTTON = "//mat-icon [text() = 'delete']";
    private static final String ENTER_A_VALUE_SEARCH_INPUT = "//input[@placeholder='Enter a value']";
    private static final String APPLY_BUTTON = "//span[contains(text(),'Apply')]";
    private static final String CLOSE_BUTTON_DOMAIN_INFO = "//div[@class='cdk-overlay-pane large']//mat-icon[text() = 'close']";
    private static final String EXTERNAL_LINKS_SIDEBAR = "//div[contains(text(),'External links')]";
    private static final String PAGES_BY_FOLDERS_SIDEBAR = "//div[contains(text(),'Pages by folders')]";
    private static final String PAGES_BY_FOLDERS_URL = "(//div[contains(@class, 'mat-tooltip-trigger checks-navigation__item-title')])[%s]";

    private static final String EXTERNAL_LINKS_SIDEBAR_BUTTON = "//div[contains(text(),'External Links')]";
    private static final String EXTERNAL_LINKS_COUNT = "//datatable-header-cell//span [contains (text(), 'Page URL')]";
    private static final String EXTERNAL_LINKS_LIST = "//a[contains(@href,'http')]";
    private static final String BACKLINKS_LIST = "//span[contains(text(),'http')]";
    private static final String VIEW_BACKLINKS_BUTTON = "(//span[contains(text(),' View backlinks ')])[%s]";
    private static final String VIEW_BACKLINKS = "//div[@class='backlinks-sidebar__sidebar-header']";
    private static final ElementsCollection SEARCHING_URLS = $$x("//span[@class='ng-star-inserted']");
    private static final String NO_DATA = "//div[contains(text(),'No data to display')]";
    public static final String FIRST_URL = "(//span[contains(@class, 'link-decorator__link-text')]/span)[1]";
    public static final String NO_DATA_TO_DISPLAY = "//div[contains(text(),'No data to display')]";
    private static final String URLS_DISPLAYING = "//span[contains(text(),'http')]";
    private static final String URLS_DISPLAYING_EXTERNAL_LINKS = "//a[contains(text(),'http')]";
    private String firstSearchedUrl;
    private String urlNamePagesByFolders;

//    public String getUrlNamePagesByFolders() {
//        return urlNamePagesByFolders;
//    }
//
//    public void setUrlNamePagesByFolders(String urlNamePagesByFolders) {
//
//        clearAndSendText();
//        this.urlNamePagesByFolders = urlNamePagesByFolders;
//    }
//
//    public int getUrlsDisplayingCount() {
//        return WaitUntil.presenceOfAllElements(URLS_DISPLAYING).size();
//    }
//
//    public int getUrlsDisplayingCountOnExternalLinks() {
//        return WaitUntil.presenceOfAllElements(URLS_DISPLAYING_EXTERNAL_LINKS).size();
//    }
//
//    @Step("Get count from 'Page URL (count)'")
//    public int getFilterCount() {
//        String pageURLCount = WaitUntil.visibilityOfElementLocated(EXTERNAL_LINKS_COUNT).getText();
//        return Integer.parseInt(pageURLCount.replaceAll("[^\\d]", ""));
//    }
//
//    public void openExternalLinksSideBar() {
//        WaitUntil.visibilityOfElementLocated(EXTERNAL_LINKS_SIDEBAR).click();
//        WaitUntil.visibilityOfElementLocated(EXTERNAL_LINKS_SIDEBAR_BUTTON).click();
//    }
//
//    public void openPagesByFoldersSideBar(int urlNumber) {
//        WaitUntil.visibilityOfElementLocated(PAGES_BY_FOLDERS_SIDEBAR).click();
//        app.sleep(3000);
//        WaitUntil.visibilityOfElementLocated(String.format(PAGES_BY_FOLDERS_URL, urlNumber)).click();
//        app.sleep(3000);
//        setUrlNamePagesByFolders(WaitUntil.visibilityOfElementLocated(String.format(PAGES_BY_FOLDERS_URL, urlNumber)).getText().replace("/", ""));
//    }
//
//    public int countExternalLinks() {
//        return WaitUntil.presenceOfAllElements(EXTERNAL_LINKS_LIST).size();
//    }
//
//    public void clickViewBackLinks(int urlNumber) {
//        WaitUntil.visibilityOfElementLocated(String.format(VIEW_BACKLINKS_BUTTON, urlNumber)).click();
//    }
//
//    public int countViewBacklinks() {
//        WaitUntil.visibilityOfElementLocated(VIEW_BACKLINKS);
//        return WaitUntil.presenceOfAllElements(BACKLINKS_LIST).size();
//    }
//
//    public String getFirstUrl() {
//        String firstUrl = WaitUntil.visibilityOfElementLocated(FIRST_URL).getText();
//        setFirstSearchedUrl(firstUrl);
//        return firstUrl;
//    }
//
//    public static void closeDomainInfo() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(CLOSE_BUTTON_DOMAIN_INFO, 10).click();
//        } catch (TimeoutException | ElementClickInterceptedException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public String getFirstSearchedUrl() {
//        return firstSearchedUrl;
//    }
//
//    public void setFirstSearchedUrl(String firstSearchedUrl) {
//        this.firstSearchedUrl = firstSearchedUrl;
//    }
//
//    public String getFirstIssueText() {
//        return WaitUntil.visibilityOfElementLocated(FIRST_ISSUE).getText().trim();
//    }
//
//    public void scrollOnTheFirstIssue() {
//        WebElement issue = WaitUntil.presenceOfElementLocated(FIRST_ISSUE);
//        app.scrollToElement(issue);
//        app.moveToElement(issue);
//    }
//
//    @Step("Click on pagination")
//    public void clickOnThePaginationPage(int page) {
//        WebElement pageBottom = WaitUntil.presenceOfElementLocated(PAGINATION);
//        app.scrollToElement(pageBottom);
//        app.moveToElement(pageBottom);
//        WebElement breadCrumbPage = WaitUntil.elementToBeClickable(String.format(BREAD_CRUMB, page));
//        breadCrumbPage.click();
//        app.sleep(10000);
//    }
//
//    public boolean isUpgradeButtonPresent() {
//        try {
//            app.sleep(10000);
//            WebElement paginationElement = app.wd.findElement(By.xpath(PAGINATION));
//            app.scrollToElement(paginationElement);
//            WaitUntil.visibilityOfElementLocated(UPGRADE_YOUR_PLAN_BUTTON);
//            WebElement banner = app.wd.findElement(By.xpath(new MainPage().getFreeTrialBanner()));
//            app.scrollToElement(banner);
//            return true;
//        } catch (NoSuchElementException ex) {
//            return false;
//        }
//    }
//
//    public boolean isBlurPresent() {
//        try {
//            app.sleep(10000);
//            WaitUntil.presenceOfElementLocated(UPGRADE_YOUR_PLAN_BUTTON);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check filter contains some pages")
//    public boolean isPagesContains() {
//        WaitUntil.visibilityOfElementLocated(ALL_URLS);
//        List<WebElement> pages = app.wd.findElements(By.xpath(ALL_URLS));
//        return pages.size() > 0;
//    }
//
//    @Step("Open 'New pages' block")
//    public void expandNewPages() {
//        WaitUntil.visibilityOfElementLocated(NEW_PAGES_TITLE).click();
//    }
//
//    @Step("'New Pages for last 90 days' button click")
//    public void clickNewPagesFor90daysFilter() {
//        WaitUntil.visibilityOfElementLocated(NEW_PAGES_FOR_LAST_90_DAYS_BUTTON).click();
//    }
//
//    public boolean isCopiedTextInBuffer(String text) {
//        String copiedText = getStringFromBuffer();
//        return copiedText.contains(text);
//    }
//
//    @Step("Get count of Copied links")
//    public int getCountOfCopiedLinks() {
//        String copiedLinks = getStringFromBuffer();
//        String[] links = copiedLinks.trim().split("\n");
//        return links.length - 2;
//    }
//
//    @Step("Get report name")
//    public String getReportName() {
//        return getOpenedPageTitleAndClose();
//    }
//
//    @Step("Check is Site Audit CSV File Downloaded")
//    public boolean isCSVDownloaded(String title) {
//        return isFileDownloaded(title);
//    }
//
//    @Step("Check is filter active")
//    public boolean isFilterActive() {
//        try {
//            WebElement activeFilterPathWebElement = WaitUntil.presenceOfElementLocated(ACTIVE_FILTER_PATH);
//            app.scrollToElement(activeFilterPathWebElement);
//            WaitUntil.visibilityOfElementLocated(ACTIVE_FILTER_PATH);
//            return true;
//        } catch (TimeoutException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Step("Input Text to the Search Filters Field")
//    public void inputTextInSearchFiltersField(String text) {
//        isLoaderPresent();
//        app.sleep(Duration.ofSeconds(5).toMillis());
//        WaitUntil.elementToBeClickable(SEARCH_ISSUES_INPUT_FIELD).sendKeys(text);
//        isClearButtonPresent();
//    }
//
//    @Step("Switch to the search by Category")
//    public void clickSearchFieldByCategory() {
//        WaitUntil.visibilityOfElementLocated(SEARCH_BY_CATEGORY_BUTTON).click();
//    }
//
//    @Step("Switch to the search by Priority")
//    public void clickSearchFieldByPriority() {
//        WaitUntil.visibilityOfElementLocated(SEARCH_BY_PRIORITY_BUTTON).click();
//    }
//
//    @Step("Click Close search button")
//    public void clickCloseSearchButton() {
//        WaitUntil.visibilityOfElementLocated(CLOSE_SEARCH).click();
//    }
//
//    @Step("Click Clear searchInput button")
//    public void clickClearSearchInputField() {
//        WaitUntil.visibilityOfElementLocated(CLEAR_SEARCH_INPUT_FIELD_BUTTON).click();
//    }
//
//    @Step("Check text from Search Filters Field")
//    public boolean checkTextFromSearchFiltersInput(String text) {
//        return WaitUntil.visibilityOfElementLocated(SEARCH_ISSUES_INPUT_FIELD).getText().contains(text);
//    }
//
//    @Step("Check if resulted filters contain expected text")
//    public boolean checkFiltersTitleFromSearchResult(String text) {
//        WaitUntil.presenceOfAllElements(ISSUES_TITLE);
//        List<WebElement> resultFilters = app.findElements(ISSUES_TITLE);
//        for (WebElement filter : resultFilters) {
//            if (!filter.getText().toLowerCase().contains(text) && !filter.getText().isEmpty()) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    @Step("Check if All HTML Pages counter is Present")
//    public boolean isAllHTMLPagesCountPresent() {
//        try {
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(ALL_HTML_PAGES_COUNT, 20);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public boolean isClearButtonPresent() {
//        try {
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(CLEAR_SEARCH_INPUT_FIELD_BUTTON, 20);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public boolean isCriticalPriorityPresent() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(ERROR_PRIORITY_TITLE, 20);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check is SiteAudit loader is absent")
//    public void filterPageIsLoaded() {
//        try {
//            WaitUntil.invisibilityOfElementLocated(AUDIT_ISSUE_PROGRESS_BAR);
//        } catch (TimeoutException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    @Step("Get site audit active filter count")
//    public int getSiteAuditFilterCount() {
//        WebElement activeFilterCountPathWebElement = WaitUntil.presenceOfElementLocated(ACTIVE_FILTER_COUNT_PATH);
//        app.scrollToElement(activeFilterCountPathWebElement);
//        WaitUntil.visibilityOfElementLocated(ACTIVE_FILTER_COUNT_PATH);
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(ACTIVE_FILTER_COUNT_PATH).getText().trim());
//    }
//
//    @Step("Get filter from current url")
//    public String getFilterFromUrl() {
//        String[] regexUrl = app.getCurrentUrl().split("=");
//        return regexUrl[1];
//    }
//
//    public void openUrlWithFilter(String filter) {
//        String[] currentUrlRegex = app.getCurrentUrl().split("=");
//        String currentUrl = currentUrlRegex[0];
//        app.wd.get(currentUrl + "=" + filter);
//    }
//
//    public void closeAQuickSuggestionPopUp() {
//        try {
//            app.sleep(5000);
//            WaitUntil.elementToBeClickable(CLOSE_BUTTON).click();
//        } catch (TimeoutException ignored) {
//        }
//    }
//
//    @Step("Select Filter from the search filters results")
//    public void selectFilterFromSearch(String filterName) {
//        List<WebElement> resultFilters = WaitUntil.visibilityOfAllElements(ISSUES_TITLE);
//        for (WebElement filter : resultFilters) {
//            if (filter.getText().contains(filterName)) {
//                filter.click();
//            }
//        }
//        isLoaderPresent();
//    }
//
//    @Step("Get count from Page URL (*)")
//    public int getFilterCounter() {
//        String pageUrlCount = WaitUntil.visibilityOfElementLocated(PAGES_URL_COUNTER_PATH).getText();
//        int count = 0;
//        Matcher matcher = Pattern.compile("\\((.*)\\)").matcher(pageUrlCount);
//        while (matcher.find()) {
//            count = Integer.parseInt(matcher.group(1));
//        }
//        return count;
//    }
//
//    @Step("Get counter of all HTML pages")
//    public int getPageCountAllHTMLPages() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(ALL_HTML_PAGES_COUNT).getText().trim());
//    }
//
//    @Step("Click on Search Filter button")
//    public void clickSearchFilterButton() {
//        WaitUntil.visibilityOfElementLocated(FILTER_BUTTON).click();
//        try {
//            WaitUntil.visibilityOfElementLocated(FILTER_POP_UP);
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(FILTER_BUTTON).click();
//        }
//    }
//
//    @Step("Click Page URL Dropdown in filter condition")
//    public void clickTypeDropdownFilterCondition(int indexOfFilterCondition) {
//        WaitUntil.visibilityOfElementLocated(filterConditionByIndex(TYPES_DROPDOWN, indexOfFilterCondition)).click();
//    }
//
//    @Step("Select Page Title option in Type Dropdown")
//    public void selectPageTitleOption(int indexOfFilterCondition) {
//        clickTypeDropdownFilterCondition(indexOfFilterCondition);
//        WaitUntil.visibilityOfElementLocated(PAGE_TITLE_OPTION).click();
//    }
//
//    @Step("Click RuleOption Dropdown in filter condition")
//    public void clickRuleDropdownFilterCondition(int indexOfFilterCondition) {
//        WaitUntil.visibilityOfElementLocated(filterConditionByIndex(RULES_DROPDOWN, indexOfFilterCondition)).click();
//    }
//
//    @Step("Select 'does not contain' option in Rule Dropdown")
//    public void selectDoesNotContainsOption(int indexOfFilterCondition) {
//        clickRuleDropdownFilterCondition(indexOfFilterCondition);
//        WaitUntil.visibilityOfElementLocated(DOES_NOT_CONTAINS_OPTION).click();
//    }
//
//    @Step("Select 'is' option in Rule Dropdown")
//    public void selectIsOption(int indexOfFilterCondition) {
//        clickRuleDropdownFilterCondition(indexOfFilterCondition);
//        WaitUntil.visibilityOfElementLocated(IS_OPTION).click();
//    }
//
//    @Step("Select 'is not' option in Rule Dropdown")
//    public void selectIsNotOption(int indexOfFilterCondition) {
//        clickRuleDropdownFilterCondition(indexOfFilterCondition);
//        WaitUntil.visibilityOfElementLocated(IS_NOT_OPTION).click();
//    }
//
//    @Step("Click Delete in filter condition")
//    public void clickDeleteFilterCondition(int indexOfFilterCondition) {
//        WaitUntil.visibilityOfElementLocated(filterConditionByIndex(DELETE_FILTER_CONDITION_BUTTON, indexOfFilterCondition)).click();
//    }
//
//    @Step("Click Add Condition Button")
//    public void clickAddConditionButton() {
//        WaitUntil.visibilityOfElementLocated(ADD_CONDITION_BUTTON).click();
//    }
//
//    @Step("Send a text for search condition")
//    public void sendTextForFilterCondition(String text, int indexOfFilterCondition) {
//        WebElement enterValue = WaitUntil.visibilityOfElementLocated(filterConditionByIndex(ENTER_A_VALUE_SEARCH_INPUT, indexOfFilterCondition));
//        enterValue.click();
//        enterValue.clear();
//        enterValue.sendKeys(text);
//    }
//
//    @Step("Click Apply filters button")
//    public void clickApply() {
//        WaitUntil.presenceOfElementLocated(APPLY_BUTTON).click();
//        if (!checkFilterPopUpIsPresent()) {
//            WaitUntil.visibilityOfElementLocated(APPLY_BUTTON).click();
//        }
//        isLoaderPresent();
//        closePopUpByClickBackdrop();
//    }
//
//    @Step("Search page by the Filter")
//    public void searchPageURLThroughFilter(String text, int indexOfFilterCondition) {
//        clickSearchFilterButton();
//        clickDeleteFilterCondition(1);
//        clickAddConditionButton();
//        sendTextForFilterCondition(text, indexOfFilterCondition);
//        clickApply();
//    }
//
//    @Step("No Data on issue filter page")
//    public static boolean noDataIsDisplayed() {
//        try {
//            WaitUntil.visibilityOfElementLocated(NO_DATA);
//            return true;
//        } catch (TimeoutException | NoSuchElementException | ElementClickInterceptedException e) {
//            return false;
//        }
//    }
//
    @Step("Check Urls > 0 are present")
    public void urlsArePresent() {
        SEARCHING_URLS.shouldBe(CollectionCondition.sizeGreaterThan(0).because( "Pages is not present on filter = 1"));
    }
//
//    @Step("Check Urls > counter are present")
//    public boolean urlsArePresent(int counter) {
//        try {
//            List<WebElement> urls = WaitUntil.presenceOfAllElements(SEARCHING_URLS);
//            return urls.size() <= counter;
//        } catch (TimeoutException | NoSuchElementException | ElementClickInterceptedException e) {
//            return false;
//        }
//    }
//
//    @Step("Check the filter pop-up is present")
//    public boolean checkFilterPopUpIsPresent() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(FILTER_POP_UP, 20);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    private String filterConditionByIndex(String locator, int indexOfCondition) {
//        String finalLocator = null;
//        switch (indexOfCondition) {
//            case 1:
//                finalLocator = FIRST_CONDITION_PATH + locator;
//                break;
//            case 2:
//                finalLocator = SECOND_CONDITION_PATH + locator;
//                break;
//            case 3:
//                finalLocator = THIRD_CONDITION_PATH + locator;
//                break;
//            case 4:
//                finalLocator = FOURTH_CONDITION_PATH + locator;
//        }
//        return finalLocator;
//    }
}
