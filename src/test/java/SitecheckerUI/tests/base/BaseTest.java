package SitecheckerUI.tests.base;

import SitecheckerUI.common.TestEmail.TestEmailApp;
import SitecheckerUI.common.WebDriverFactory;
import SitecheckerUI.pages.AppPages.*;
import SitecheckerUI.pages.AppPages.Components.AuthPopup;
import SitecheckerUI.pages.AppPages.Components.HeaderApp;
import SitecheckerUI.pages.AppPages.Components.SideBar.SideBar;
import SitecheckerUI.pages.AppPages.CreateEditProject.CreateProjectPage;
import SitecheckerUI.pages.AppPages.CreateEditProject.EditProjectPage;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    //Page Objects
    public CreateProjectPage createProjectPage = new CreateProjectPage();
    public SummaryPage summaryPage = new SummaryPage();
    public AllProjectsPage allProjectsPage = new AllProjectsPage();
    public EditProjectPage editProjectPage = new EditProjectPage();
    public PageAuditPage pageAuditPage = new PageAuditPage();
    public IssuesPage issuesPage = new IssuesPage();
    public RankTrackerPage rankTrackerPage = new RankTrackerPage();
    public AccountPage accountPage = new AccountPage();

    //Components
    public AuthPopup authPopup = new AuthPopup();
    public HeaderApp headerApp = new HeaderApp();
    public SideBar sideBar = new SideBar();
    public TestEmailApp testEmailApp = new TestEmailApp();


    @BeforeClass(alwaysRun = true)
    public void setUp(){
        WebDriverFactory.setupDefaultDriver();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));

    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
    }


}
