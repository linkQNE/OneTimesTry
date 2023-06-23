package SitecheckerUI.tests.userFlow.onboarding;//package SitecheckerUI.tests.userFlow.onboarding;
//
//import MT.BasePackage.TestBase;
//import MT.Sitechecker.NewSC.testData.Account;
//import SitecheckerUI.tests.base.BaseTest;
//import com.testRail.TestRailSet;
//import io.qameta.allure.Description;
//import org.openqa.selenium.TimeoutException;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.*;
//
//import static com.codeborne.selenide.Selenide.open;
//
//public class OnboardingLevelsTest extends BaseTest {
//
//    @BeforeClass
//    @Parameters({"url"})
//    public void before(@Optional("https://sitechecker.pro/") String url) {
//        open(url);
//        try {
//            authPopup.login(Account.ONBOARDING_TEST_USER.getLogin(),Account.ONBOARDING_TEST_USER.getPassword());
//        } catch (TimeoutException e) {
//            authPopup.login(Account.ONBOARDING_TEST_USER.getLogin(),Account.ONBOARDING_TEST_USER.getPassword());
//        }
//        sideBar.closeOnBoarding();
//    }
//
//    @Test(description = "Проверка на закрытие Первого уровня Онбординга")
//    @Description("https://boosta.testrail.io/index.php?/cases/view/4626")
//    public void onboardingFirstLevelTest() {
//        headerApp.clickOnLogo();
//        sideBar.clickOnboarding();
//        Assert.assertTrue(sideBar.checkOnboarding1stLevelIsPassed(), "1st level of Onboarding is not passed");
//        sideBar.clickNextOnboardingLevel();
//        sideBar.closeOnBoarding();
//    }
//
//    @AfterClass
//    public void deleteUser() {
//        sideBar.USER_INFO.clickSettings();
//        accountPage.switchToFrame();
//        accountPage.deleteAccount();
//    }
//
//}
