package SitecheckerUI.tests.userFlow.onboarding;

import SitecheckerUI.pages.AppPages.SummaryPage;
import SitecheckerUI.tests.base.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class OnBoardingFirstLvlSteps extends BaseTest {

    private static final String TEST_DOMAIN = "boosta.biz";
    private static final String KEYWORDS_LIST = "boosta key\n" +
            "boosta вакансии\n" +
            "boosta отзывы\n" +
            "copywritely\n" +
            "junior seo\n" +
            "kparser\n" +
            "linkbuilder\n" +
            "баклан белый\n" +
            "boosta\n" +
            "boosta biz\n" +
            "буста";

    @BeforeClass
    @Parameters({"url"})
    public void before(@Optional("https://sitechecker.pro/") String url) {
        open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        try {
            authPopup.openStartFreeTrialSignUp();
        } catch (TimeoutException ex) {
            authPopup.openStartFreeTrialSignUp();
        }
    }

    @Test(description = "Check close onboarding Step: Verify email address")
    @Description("https://boosta.testrail.io/index.php?/cases/view/4664")
    public void registrationAndVerificationSteps() {
        testEmailApp.registrationUserForOnBoardingTest();
    }

    @Test(description = "Check close onboarding Step: Create first project")
    @Description("https://boosta.testrail.io/index.php?/cases/view/4665")
    public void createFirstProjectStep() {
        authPopup.confirmRegistration();
        createProjectPage.createProjectSkipEnterDomainOnly(TEST_DOMAIN);
        SummaryPage.waitUntilRecrawlingFinished(5);
        Assert.assertFalse(summaryPage.crawlingProgressIsPresent(), "Crawling Progress is present after 5 min");
    }

    @Test(description = "Check all links how to onboarding")
    @Description("https://boosta.testrail.io/index.php?/cases/view/4694")
    public void checkOnboardingLinks() {
        sideBar.closeOnBoarding();
        allProjectsPage.closeSimonNotificationPopUp();
        sideBar.clickOnAudit();
        sideBar.clickOnboarding();
        Assert.assertTrue(sideBar.checkLinksInOnboarding1stLvl(), "Links in Onboarding pop-up is not expected");
        sideBar.closeOnBoarding();
    }

    @Test(description = "Check close onboarding Step: Add more than 10 keywords")
    @Description("https://boosta.testrail.io/index.php?/cases/view/4666")
    public void add10KeywordsStep() {
        sideBar.clickOnAudit();
        allProjectsPage.openSettingProject("Site Audit");
        editProjectPage.clickKeywordsEdit();
        editProjectPage.addGroupOfKeywords(KEYWORDS_LIST);
        editProjectPage.clickSaveButtonEdit();
    }

    @Test(description = "Check close onboarding Step: Visit issues page")
    @Description("https://boosta.testrail.io/index.php?/cases/view/4667")
    public void viewIssuePagesStep() {
        sideBar.clickOnAudit();
        summaryPage.clickViewAllIssuesButton();
        issuesPage.urlsArePresent();
    }

    @Test(description = "Check close onboarding Step: View page details")
    @Description("https://boosta.testrail.io/index.php?/cases/view/")
    public void viewPageDetailsStep() {
        sideBar.clickOnAudit();
        summaryPage.clickViewAllIssuesButton();
        pageAuditPage.clickViewPageAudit();
        pageAuditPage.isIssuesTabPresent();
        pageAuditPage.closePageAudit();
    }

    @Test(description = "Check close onboarding Step: View Rank Tracker report")
    @Description("https://boosta.testrail.io/index.php?/cases/view/")
    public void viewRankTrackerStep() {
        sideBar.clickRankTracker();
        if (rankTrackerPage.isInProgressPagePresent()) {
            rankTrackerPage.waitUntilPositionsGathered(5);
        }
        rankTrackerPage.isRankTrackerPageOpened();
    }


    @AfterClass
    public void logout() {
            headerApp.clickOnLogo();
            sideBar.closeOnBoarding();
            sideBar.USER_INFO.logout();
    }

}
