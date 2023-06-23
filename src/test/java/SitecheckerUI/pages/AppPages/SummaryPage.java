package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class SummaryPage extends BasePage {

    public static final String CRITICAL_ERRORS_PATH = "//span [contains (@class, 'value-criticals')]";
    private static final String WARNINGS_PATH = "//span [contains (@class, 'value-warnings')]";
    private static final String NOTICES_PATH = "//span [contains (@class, 'value-notices')]";
    private static final String OPPORTUNITIES_PATH = "//span [contains (@class, 'value-opportunities')]";
    private static final String LAST_DATE_GRAPH = "//div [contains (@class, 'secondary-text')]";
    private static final String CRAWLED_PAGES_GRAPH = "(//app-chart-js [contains (@class, 'info-charts__chart-block__chart')]//canvas [@class = 'chartjs-render-monitor'])[1]";
    private static final String RECRAWL_BUTTON_PATH = "//span[text() = 'Recrawl']";
    private static final SelenideElement CRAWL_IN_PROGRESS_PATH = $x("//div[@class = 'crawling-progress']");
    private static final String WEBSITE_SCORE_VALUE = "//div [contains (@class, 'value-score')]";
    public static final String GOOGLE_INDEXED_PAGES_COUNT = "//span [contains (@class, 'value-google-indexed-pages')]";
    private static final String ISSUE_PATH = "(//li[contains(@class, 'issues-list')])[%s]";
    private static final String CRAWLED_PAGES = "//span [contains (@class, 'value-crawled-pages')]";
    private static final String WEBSITE_SCORE = "//div[@class='progress-score__progress-value-title value-score']";
    private static final String WEBSITE_SCORE_DASHBOARD_V2 = "//div[@class='site-audit-top__score__progress-value-title value-score']";
    private static final String CRITICAL_DIFFERENCE = "(//div[contains(text(),'Criticals')]/span)[1]";
    private static final String DELETE_POP_UP_YES_BUTTON = "//span[contains(text(), 'Yes')]";
    private static final String RECRAWL_IN_POP_UP_BUTTON = "//app-re-crawl-dialog//span[contains(text(), 'Recrawl')]";
    private static final String ISSUE_WITH_TEXT = "//span[text() = '%s']";
    private static final String ISSUE_TITLE = ISSUE_PATH + "/span[contains(@class, 'title')]";
    private static final String ISSUE_COUNT = ISSUE_PATH + "/span[contains(@class, 'issues-list__issues-item-count')]";
    private static final String VIEW_ISSUE_BUTTON = ISSUE_PATH + "//span[contains(text(), 'View issue')]";
    private static final SelenideElement VIEW_ALL_ISSUES_BUTTON = $x("//span[text() = ' View all affected pages ']");
    private static final String IGNORE_ISSUE_BUTTON = "//mat-icon [@data-mat-icon-name = 'visibilityOff']";
    private static final String ADVANCED_CHECKS_BLOCK = "//app-cell[contains(@class, 'advanced-checks-interview')]";
    private static final String ADVANCED_CHECKS_CARD_BUTTON = "//div[@class = 'advanced-checks-interview__card__title'][text() = '%s']/../button";
    private static final String ADVANCED_CHECKS_POP_UP_ENTER_THE_WEBSITE_INPUT = "//input[contains(@placeholder, 'Enter the website')]";
    private static final String ADVANCED_CHECKS_POP_UP_SUBMIT_BUTTON = "//mat-dialog-container//span[text() = 'Order']";
    private static final String ORDER_THANK_YOU_POP_UP = "//app-order-form//div[contains(text(), 'Thank you')]";
    private static final String ADVANCED_POP_UP_CLOSE_BUTTON = "//button[@aria-label = 'Close dialog']";
    private static final String CROSS_USER_EXPERIENCE_POP_UP = "//mat-icon[text() = 'close']";
    private static final String BLUR_TEXT = "//div[contains(text(),'This category isn’t available for your plan. Please, upgrade plan to view issues.')]";
    private static final String CURRENT_CRAWLING = "//div[@class='site-audit-summary-v3__content__header-info-crawling-item-value']";
    private static final String NEXT_AUTO_CRAWLING = "(//div[contains(@class,'site-audit-summary-v3')])[9]";
    private static final SelenideElement PROGRESS_BAR = $x("//mat-progress-bar [@role='progressbar']");
    private static final String THREE_DOTS_PROGRESS_SPINNER = "//app-progress-spinner";
    private static final String SUCCESS_IGNORE_ISSUE_MESSAGE = "//snack-bar-container//span [text() = 'Ignore Issues']";
    private static final String CRAWLING_LIST_URLS = "//div[contains(@class,'crawling-progress__issues-item-link')]";
    private static final String FREE_TRIAL_BANNER_BOOK_DEMO_BUTTON = "//app-free-trial-banner//a";
    private static final String VIEW_ISSUES_BUTTON = "//span[contains(text(), ' View all affected pages ')]";

    //IssuesList
    private static final String ISSUES_LIST_PATH = "//app-issues-list";
    private static final String CRITICAL_FILTER_PATH = ISSUES_LIST_PATH + "//li [contains (@class, 'error')]";
    private static final String WARNINGS_FILTER_PATH = ISSUES_LIST_PATH + "//li [contains (@class, 'warning')]";
    private static final String OPPORTUNITIES_FILTER_PATH = ISSUES_LIST_PATH + "//li [contains (@class, 'opportunity')]";
    private static final String NOTICES_FILTER_PATH = ISSUES_LIST_PATH + "//li [contains (@class, 'notice')]";
    private static final String ALL_ISSUES_BUTTON = ISSUES_LIST_PATH + "//div [text()= 'All issues']";
    private static final String ALL_ISSUES_ACTIVE_BUTTON = ISSUES_LIST_PATH + "//div [contains (@class,'active') and text()= 'All issues']";
    private static final String CRITICAL_BUTTON = ISSUES_LIST_PATH + "//div [text()= 'Criticals']";
    private static final String CRITICAL_ACTIVE_BUTTON = ISSUES_LIST_PATH + "//div [contains (@class,'active') and text()= 'Criticals']";
    private static final String WARNINGS_BUTTON = ISSUES_LIST_PATH + "//div [text()= 'Warnings']";
    private static final String WARNINGS_ACTIVE_BUTTON = ISSUES_LIST_PATH + "//div [contains (@class,'active') and text()= 'Warnings']";
    private static final String OPPORTUNITIES_BUTTON = ISSUES_LIST_PATH + "//div [text()= 'Opportunities']";
    private static final String OPPORTUNITIES_ACTIVE_BUTTON = ISSUES_LIST_PATH + "//div [contains (@class,'active') and text()= 'Opportunities']";
    private static final String NOTICES_BUTTON = ISSUES_LIST_PATH + "//div [text()= 'Notices']";
    private static final String NOTICES_ACTIVE_BUTTON = ISSUES_LIST_PATH + "//div [contains (@class,'active') and text()= 'Notices']";

    private static final String CATEGORIES_PATH = "//div [contains (@class, 'issues-list__affected-pages-category-name')]";

    //
//    public String getCurrentCrawlingText() {
//        return WaitUntil.visibilityOfElementLocated(CURRENT_CRAWLING).getText();
//    }
//
//    public Integer getErrorsCount() {
//        return getCount(CRITICAL_ERRORS_PATH);
//    }
//
//    public Integer getWarningCount() {
//        return getCount(WARNINGS_PATH);
//    }
//
//    public Integer getNoticeCount() {
//        return getCount(NOTICES_PATH);
//    }
//
//    public Integer getOpportunitiesCount() {
//        return getCount(OPPORTUNITIES_PATH);
//    }
//
//    public void checkSummaryIssueValues() {
//        int errorCount = getErrorsCount();
//        int warningCount = getWarningCount();
//        int noticeCount = getNoticeCount();
//        int opportunitiesCount = getOpportunitiesCount();
//        String message = String.format("Error: %d, Warning: %d, Notice: %d, Opportunities: %d", errorCount, warningCount, noticeCount, opportunitiesCount);
//        Assert.assertTrue(errorCount + warningCount + noticeCount + opportunitiesCount > 0, "Все значения ошибок = 0\n" + message);
//        Assert.assertTrue(errorCount > 0, "Error = 0\n" + message);
//        Assert.assertTrue(warningCount > 0, "Warning = 0\n" + message);
//        Assert.assertTrue(noticeCount > 0, "Notice = 0\n" + message);
//        Assert.assertTrue(opportunitiesCount > 0, "Opportunities = 0\n" + message);
//    }
//
//    public String getIssueText() {
//        return getIssuesTitleForIgnore();
//    }
//
//    public String getCrawledPagesCount() {
//        return WaitUntil.visibilityOfElementLocated(CRAWLED_PAGES).getText().trim();
//    }
//
//    public int getWebsiteScore() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(WEBSITE_SCORE).getText().trim());
//    }
//
//    public int getWebsiteScoreDashboardV2() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(WEBSITE_SCORE_DASHBOARD_V2).getText().trim());
//    }
//
//    public int getCriticalDiff() {
//        return Integer.parseInt(WaitUntil.visibilityOfElementLocated(CRITICAL_DIFFERENCE).getText().trim());
//    }
//
//
//    public static Integer getCount(String xpath) {
//        isLoaderPresent();
//        WebElement count;
//        count = app.wd.findElement(By.xpath(xpath));
//        try {
//            return Integer.parseInt(count.getText().trim());
//        } catch (NumberFormatException ex) {
//            String[] text = count.getText().trim().split("k|M");
//            if (text[0].contains(".")) {
//                String[] parsedText = text[0].split("\\.");
//                return Integer.parseInt(parsedText[0] + parsedText[1] + "00");
//            } else {
//                return Integer.parseInt(text[0] + "000");
//            }
//        }
//    }
//
//    @Step("Click on 'View all affected pages' button")
//    public void clickOnViewIssuesButton() {
//        SummaryPage.waitUntilRecrawlingFinished(1);
//        isLoaderPresent();
//        WaitUntil.elementToBeClickable(VIEW_ISSUES_BUTTON).click();
//    }
//
//    public void moveToLastDataOnGraph(WebElement webElement) {
//        Dimension dimension = webElement.getSize();
//        app.sleep(1000);
//        int x = dimension.width / 2;
//        int y = dimension.height / 2;
//        try {
//            Capabilities capabilities = ((RemoteWebDriver) app.wd).getCapabilities();
//            if (capabilities.getBrowserName().equalsIgnoreCase("firefox")) {
//                return;
//            }
//            new Actions(app.wd).moveToElement(webElement, (x * 50) / 50, (y * 2) / 5).perform();
//        } catch (MoveTargetOutOfBoundsException e) {
//            throw new MoveTargetOutOfBoundsException(e.getMessage() + dimension);
//        }
//        app.sleep(5000);
//    }
//
//    public String getCrawlingDataFromGraph() {
//        String dateInGraph;
//        WebElement crawlingGraph = WaitUntil.visibilityOfElementLocated(CRAWLED_PAGES_GRAPH);
//        moveToLastDataOnGraph(crawlingGraph);
//        try {
//            dateInGraph = app.findElement(LAST_DATE_GRAPH).getText().split(",")[1].trim();
//        } catch (TimeoutException ex) {
//            moveToLastDataOnGraph(crawlingGraph);
//            dateInGraph = app.findElement(LAST_DATE_GRAPH).getText().split(",")[1].trim();
//        }
//        return dateInGraph;
//    }
//
//    public boolean isBlurPresent() {
//        try {
//            WebElement blurText = WaitUntil.presenceOfElementLocated(BLUR_TEXT);
//            app.scrollToElement(blurText);
//            WaitUntil.visibilityOfElementLocated(BLUR_TEXT);
//            return true;
//        } catch (TimeoutException e) {
//            return false;
//        }
//    }
//
//    public void clickViewIssueButton() {
//        isLoaderPresent();
//        WaitUntil.elementToBeClickable(String.format(VIEW_ISSUE_BUTTON, getIndexOfIssue())).click();
//    }
//
    public void clickViewAllIssuesButton() {
        isLoaderPresent();
        VIEW_ALL_ISSUES_BUTTON.shouldBe(Condition.interactable).click();
    }

    //
//    private void clickIgnoreIssueButton() {
//        isLoaderPresent();
//        WaitUntil.elementToBeClickable(IGNORE_ISSUE_BUTTON).click();
//    }
//
//    @Step("Click ignore issue on 1st issue from the list")
//    public void clickIgnoreIssue() {
//        WebElement issue = WaitUntil.visibilityOfElementLocated(getIssuesForIgnore());
//        app.moveToElement(issue);
//        clickViewIssueButton();
//        clickIgnoreIssueButton();
//        WaitUntil.elementToBeClickable(DELETE_POP_UP_YES_BUTTON).click();
//        checkSuccessIgnoreMessage();
//        WaitUntil.elementToBeClickable(RECRAWL_IN_POP_UP_BUTTON).click();
//    }
//
//    @Step("Get issue PATH for ignore")
//    public String getIssuesForIgnore() {
//        return String.format(ISSUE_PATH, getIndexOfIssue());
//    }
//
//    @Step("Get Issue Title for Ignore")
//    public String getIssuesTitleForIgnore() {
//        return WaitUntil.visibilityOfElementLocated(String.format(ISSUE_TITLE, getIndexOfIssue())).getText();
//    }
//
//    @Step("Select index of issue for ignore where count of pages more than 3")
//    public int getIndexOfIssue() {
//        boolean match = true;
//        int index;
//        for (index = 1; match; index++) {
//            String[] issuePagesCount = WaitUntil.visibilityOfElementLocated(String.format(ISSUE_COUNT, index)).getText().trim().split(" ");
//            match = Integer.parseInt(issuePagesCount[0]) < 3;
//        }
//        return index - 1;
//    }
//
//    @Step("Check if success ignore message is present")
//    public void checkSuccessIgnoreMessage() {
//        WaitUntil.visibilityOfElementLocated(SUCCESS_IGNORE_ISSUE_MESSAGE).isDisplayed();
//    }
//
//    public boolean checkIssueAbsent(String issue) {
//        try {
//            WaitUntil.invisibilityOfElementLocated(String.format(ISSUE_WITH_TEXT, issue));
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public boolean checkIssuePresent(String issue) {
//        try {
//            WaitUntil.visibilityOfElementLocated(String.format(ISSUE_WITH_TEXT, issue));
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Click to recrawl button")
//    public void recrawlDomain() {
//        isLoaderPresent();
//        WaitUntil.elementToBeClickable(RECRAWL_BUTTON_PATH).click();
//        if (!crawlingProgressIsPresent()) {
//            WaitUntil.elementToBeClickable(RECRAWL_BUTTON_PATH).click();
//        }
//    }
//
//    @Step("Waiting for crawling finished during: 5 min")
//    public boolean waitUntilRecrawlingFinished() {
//        WaitUntil.visibilityOfElementLocated(CRAWL_IN_PROGRESS_PATH);
//        return waitForRecrawlFinished(5);
//    }
//
//    @Step("Check 'Book a demo' button on free trial banner")
//    public boolean checkBookDemoButtonOnBanner() {
//        return WaitUntil.visibilityOfElementLocated(FREE_TRIAL_BANNER_BOOK_DEMO_BUTTON).
//                getAttribute("href").equals("https://calendly.com/denys-kutsenko/product-demo");
//    }
//
    @Step("Check is Crawling progress Present")
    public boolean crawlingProgressIsPresent() {
        return CRAWL_IN_PROGRESS_PATH.shouldBe(hidden).isDisplayed();
    }

    @Step("Waiting for crawling finished during: {minutes} min")
    public static void waitUntilRecrawlingFinished(int minutes) {
        CRAWL_IN_PROGRESS_PATH.shouldBe(visible, Duration.ofSeconds(20));
        CRAWL_IN_PROGRESS_PATH.shouldBe(hidden, Duration.ofSeconds(minutes * 60L));
    }

//
//    public void checkUserExperiencePopUP() {
//        try {
//            if (app.findElement(CROSS_USER_EXPERIENCE_POP_UP).isDisplayed()) {
//                app.findElement(CROSS_USER_EXPERIENCE_POP_UP).click();
//            }
//        } catch (TimeoutException | NoSuchElementException ignored) {
//        }
//    }
//
//    public String getScoreWidgetValuePath() {
//        return WEBSITE_SCORE_VALUE;
//    }
//
//    public boolean isScoreWidgetPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(WEBSITE_SCORE_VALUE);
//            return true;
//        } catch (TimeoutException e) {
//            return false;
//        }
//    }
//
//    public void scrollToAdvancedChecks() {
//        WebElement advancedChecks = WaitUntil.presenceOfElementLocated(ADVANCED_CHECKS_BLOCK);
//        app.scrollToElement(advancedChecks);
//        app.scrollToElement(advancedChecks);
//        app.moveToElement(advancedChecks);
//        WaitUntil.visibilityOfElementLocated(ADVANCED_CHECKS_BLOCK);
//    }
//
//    public void orderAdvancedCheck(String title) {
//        WaitUntil.elementToBeClickable(String.format(ADVANCED_CHECKS_CARD_BUTTON, title)).click();
//        WebElement input = WaitUntil.visibilityOfElementLocated(ADVANCED_CHECKS_POP_UP_ENTER_THE_WEBSITE_INPUT);
//        input.clear();
//        input.sendKeys("test.com");
//        WaitUntil.elementToBeClickable(ADVANCED_CHECKS_POP_UP_SUBMIT_BUTTON).click();
//    }
//
//    public boolean isOrderPopUpPresent() {
//        try {
//            WaitUntil.visibilityOfElementLocated(ORDER_THANK_YOU_POP_UP);
//            WaitUntil.elementToBeClickable(ADVANCED_POP_UP_CLOSE_BUTTON).click();
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public int getScoreWidget() {
//        int score;
//        try {
//            score = Integer.parseInt(WaitUntil.presenceOfElementLocated(WEBSITE_SCORE_VALUE).getText().trim());
//        } catch (NumberFormatException ex) {
//            score = Integer.parseInt(WaitUntil.presenceOfElementLocated(WEBSITE_SCORE_VALUE).getText().trim());
//        }
//        return score;
//    }
//
//    public int getIndexedCount() {
//        ChecklistHelper.createFailMessageWithDomainID(app.getDomainIdByUrl(), "Indexation not collected");
//        try {
//            return Integer.parseInt(WaitUntil.presenceOfElementLocated(GOOGLE_INDEXED_PAGES_COUNT).getText().trim());
//        } catch (NumberFormatException ex) {
//            String[] text = WaitUntil.presenceOfElementLocated(GOOGLE_INDEXED_PAGES_COUNT).getText().trim().split("k");
//            if (text[0].contains(".")) {
//                String[] parsedText = text[0].split("\\.");
//                return Integer.parseInt(parsedText[0] + parsedText[1] + "00");
//            } else {
//                return Integer.parseInt(text[0] + "000");
//            }
//        }
//    }
//
//    public int currentCrawling() {
//        return WaitUntil.visibilityOfElementLocated(CURRENT_CRAWLING).getText().length();
//    }
//
//    public int nextAutoCrawling() {
//        return WaitUntil.visibilityOfElementLocated(NEXT_AUTO_CRAWLING).getText().length();
//    }
//
//    progress bar wait
//    public static void isLoaderPresent() {
//        if (progressBarIsVisible()) {
//            try {
//                WaitUntil.waitToInSecondsInvisibilityOfElementLocated(PROGRESS_BAR, 40);
//            } catch (TimeoutException ignored) {
//                System.out.println("Progress bar is visible");
//            }
//        }
//    }

    public static void isLoaderPresent() {
        if (PROGRESS_BAR.isDisplayed()) {
            PROGRESS_BAR.shouldBe(hidden, Duration.ofSeconds(50));
        }
    }

    //    public static void isLoaderPresent(int sec) {
//        try {
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(PROGRESS_BAR, sec);
//        } catch (TimeoutException ignored) {
//        }
//    }
//
//    //3-dots spinner wait
//    public static void isSpinnerPresent() {
//        if (progressSpinnerIsVisible()) {
//            try {
//                WaitUntil.waitToInSecondsInvisibilityOfElementLocated(THREE_DOTS_PROGRESS_SPINNER, 40);
//            } catch (TimeoutException ignored) {
//                System.out.println("Three dots Progress spinner is visible");
//            }
//        }
//    }
//
//    private static boolean progressBarIsVisible() {
//        try {
//            PROGRESS_BAR.shouldBe(hidden, Duration.ofSeconds(10));
//            return false;
//        } catch (NoSuchElementException ex) {
//            return true;
//        }
//    }

//    private static boolean progressSpinnerIsVisible() {
//        try {
//            WaitUntil.waitToInSecondsInvisibilityOfElementLocated(THREE_DOTS_PROGRESS_SPINNER, 10);
//            return false;
//        } catch (TimeoutException ex) {
//            return true;
//        }
//    }
//
//    public static boolean crawlingUrlsArePresent() {
//        try {
//            List<WebElement> urlsList = WaitUntil.waitToInSecondsVisibilityOfAllElements(CRAWLING_LIST_URLS, 120);
//            int count = urlsList.size();
//            Assert.assertTrue(count > 0);
//            return true;
//        } catch (TimeoutException | NoSuchElementException | ElementClickInterceptedException ignored) {
//            return false;
//        }
//    }
//
//    @Step("Get List of all Category on Summary Page")
//    public List<String> getCategoriesList() {
//        List<WebElement> categoriesList = WaitUntil.visibilityOfAllElements(CATEGORIES_PATH);
//        List<String> categorisTitlesList = new ArrayList<>();
//        for (WebElement e : categoriesList) {
//            categorisTitlesList.add(e.getText());
//        }
//        return categorisTitlesList;
//    }
//
//    public void scrollToIssuesList() {
//        app.scrollToElement(WaitUntil.visibilityOfElementLocated(ALL_ISSUES_BUTTON));
//    }
//
//    @Step("Click 'All issues' Button (Issues List)")
//    public void selectAllIssuesList() {
//        WaitUntil.visibilityOfElementLocated(ALL_ISSUES_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(ALL_ISSUES_ACTIVE_BUTTON, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(ALL_ISSUES_BUTTON).click();
//        }
//        scrollToIssuesList();
//    }
//
//    @Step("Click 'Criticals' Button (Issues List)")
//    public void selectCriticalList() {
//        WaitUntil.visibilityOfElementLocated(CRITICAL_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(CRITICAL_ACTIVE_BUTTON, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(CRITICAL_BUTTON).click();
//        }
//        scrollToIssuesList();
//    }
//
//    @Step("Click 'Warnings' Button (Issues List)")
//    public void selectWarningsList() {
//        WaitUntil.visibilityOfElementLocated(WARNINGS_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(WARNINGS_ACTIVE_BUTTON, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(WARNINGS_BUTTON).click();
//        }
//        scrollToIssuesList();
//    }
//
//    @Step("Click 'Opportunities' Button (Issues List)")
//    public void selectOpportunitiesList() {
//        WaitUntil.visibilityOfElementLocated(OPPORTUNITIES_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(OPPORTUNITIES_ACTIVE_BUTTON, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(OPPORTUNITIES_BUTTON).click();
//        }
//        scrollToIssuesList();
//    }
//
//    @Step("Click 'Notices' Button (Issues List)")
//    public void selectNoticesList() {
//        WaitUntil.visibilityOfElementLocated(NOTICES_BUTTON).click();
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(NOTICES_ACTIVE_BUTTON, 20).isDisplayed();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(NOTICES_BUTTON).click();
//        }
//        scrollToIssuesList();
//    }
//
//    @Step("Check is 'Critical' filters present (Issues List)")
//    public boolean isCriticalFiltersPresent() {
//        try {
//            List<WebElement> criticalFilters = WaitUntil.waitToInSecondsPresenceOfAllElements(CRITICAL_FILTER_PATH, 20);
//            return criticalFilters.size() > 1;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check is 'Warnings' filters present (Issues List)")
//    public boolean isWarningFiltersPresent() {
//        try {
//            List<WebElement> warningFilters = WaitUntil.waitToInSecondsPresenceOfAllElements(WARNINGS_FILTER_PATH, 20);
//            return warningFilters.size() > 1;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check is 'Opportunities' filters present (Issues List)")
//    public boolean isOpportunitiesFiltersPresent() {
//        try {
//            List<WebElement> opportunitiesFilters = WaitUntil.waitToInSecondsPresenceOfAllElements(OPPORTUNITIES_FILTER_PATH, 20);
//            return opportunitiesFilters.size() > 1;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    @Step("Check is 'Notice' filters present (Issues List)")
//    public boolean isNoticeFiltersPresent() {
//        try {
//            List<WebElement> noticeFilters = WaitUntil.waitToInSecondsPresenceOfAllElements(NOTICES_FILTER_PATH, 20);
//            return noticeFilters.size() > 1;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }

}