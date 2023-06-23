package SitecheckerUI.pages.AppPages;

import SitecheckerUI.pages.AppPages.Components.AuthPopup;
import SitecheckerUI.pages.AppPages.Components.SideBar.SideBar;
import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    private SideBar sideBar = new SideBar();
    private AuthPopup authPopup = new AuthPopup();



    private static final String PAGE_NOT_FOUND_ERROR = "//img[@title='404']";
    private static final String FREE_TRIAL_BANNER = "//app-free-trial-banner";
    private static final String UPGRADE_PLAN_BANNER_BUTTON = "//app-free-trial-banner//div[@class = 'notification-button']/button";
    private static final String DOMAIN_FIELD_MAIN_PAGE = "//input[@id='siteAuditForm']";
    private static final String LOGIN_POPUP_MAIN_PAGE = "//div[@class='signup__block animated bounceInRight']//div[@class='login__popup-form']";
    private static final String EMAIL_POPUP_FIELD_MAIN_PAGE = "//input[@id='registerFormEmail']";
    private static final String PASSWORD_POPUP_FIELD = "//input[@id='registerFormPass']";
    private static final String POP_ABOUT_EMAIL_VERIFICATION = "//div[@class='resetpass__popup-block']";
    private static final String INPUT_FOR_DOMAIN = "//input[contains(@placeholder, 'Enter your domain')]";
    private static final String INPUT_FOR_RU_DOMAIN = "//input[contains(@placeholder, 'Введите ваш домен')]";
    private static final String ANALYZE_BUTTON = "(//button[@type = 'submit'])[2]";
    private static final String PROJECT = "//div[contains(text(), '%s')]/ancestor::app-dashboard-project";
    private static final String PROJECT_DATA = PROJECT + "//div[contains(@class, 'score-widget__date')]/span";
    private static final String WEBSITE_SPEED_BLOCK = "//div[contains(@class, 'knbs')]/a[contains(@href, 'website-speed')]";
    private static final String SIGN_IN_BUTTON_PATH = "//button[contains(@class, 'signin__btn')]";

//    public static String getSignInButtonPath(){
//        return SIGN_IN_BUTTON_PATH;
//    }
//
//    public void clickSignInButton() {
//        WaitUntil.elementToBeClickable(SIGN_IN_BUTTON_PATH).click();
//    }
//
//    public String getFreeTrialBanner() {
//        return FREE_TRIAL_BANNER;
//    }
//
//    public String getProjectData(String text) {
//        DateFormat dateFormat = new SimpleDateFormat("MMM d", Locale.ENGLISH);
//        WebElement data = WaitUntil.visibilityOfElementLocated(String.format(PROJECT_DATA, text));
//        String currentDate = data.getText().split(",")[1].trim();
//        try {
//            return dateFormat.format(dateFormat.parse(currentDate));
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return "";
//        }
//    }
//
//    private Integer selectDomainStatus() {
//        String select = "SELECT is_done " +
//                "FROM flags " +
//                "WHERE project = 'recrawl'";
//        try {
//            ResultSet resultSet = config.getMyDbConfig().executeQuery(select);
//            if (resultSet.next()) {
//                return resultSet.getInt("is_done");
//            }
//            return -1;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return -1;
//        }
//    }
//
//    private void updateDomainStatus(int status) {
//        String update = "UPDATE flags\n" +
//                "SET is_done = " + status +
//                " WHERE project = 'recrawl'";
//        try {
//            config.getMyDbConfig().executeUpdate(update);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void selectNextDomain(String domain1, String domain2, String domain3) {
//        updateDomainStatus(selectDomainStatus() + 1);
//
//        if (selectDomainStatus() > 3) {
//            updateDomainStatus(1);
//        }
//
//        switch (selectDomainStatus()) {
//            case 1:
//                sideBar.selectDomain(domain1);
//                break;
//            case 2:
//                sideBar.selectDomain(domain2);
//                break;
//            case 3:
//                sideBar.selectDomain(domain3);
//                break;
//        }
//    }
//
//    public boolean isBannerPresent() {
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(FREE_TRIAL_BANNER, 5);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public void clickUpgradePlanOnBanner() {
//        WebElement upgrade = WaitUntil.elementToBeClickable(UPGRADE_PLAN_BANNER_BUTTON);
//        app.moveToElement(upgrade);
//        upgrade.click();
//    }
//
//    public void login(String email, String password) {
//        clickSignInButton();
//        authPopup.login(email, password);
//    }
//
//    public void login(Account account) {
//        login(account.getLogin(), account.getPassword());
//    }
//
//
    public void register(String email, String password) {
        SelenideElement emailField = $x(EMAIL_POPUP_FIELD_MAIN_PAGE);
        emailField.clear();
        emailField.setValue(email);
        SelenideElement passField = $x(PASSWORD_POPUP_FIELD);
        passField.clear();
        passField.setValue(password);
        passField.submit();
        $x(POP_ABOUT_EMAIL_VERIFICATION).shouldBe(Condition.visible);
    }
//
//    public void enterDomainToSearch(String url) {
//        WebElement domainField = WaitUntil.visibilityOfElementLocated(DOMAIN_FIELD_MAIN_PAGE);
//        domainField.clear();
//        domainField.sendKeys(url);
//        domainField.submit();
//        WaitUntil.visibilityOfElementLocated(LOGIN_POPUP_MAIN_PAGE);
//    }
//
//    @Step("Page not found error")
//    public By pageNotFoundError() {
//        return By.xpath(PAGE_NOT_FOUND_ERROR);
//    }
//
//    public void crawlDomain(String domain) {
//        WebElement websiteSpeed = WaitUntil.presenceOfElementLocated(WEBSITE_SPEED_BLOCK);
//        app.scrollToElement(websiteSpeed);
//        try {
//            WebElement input = app.findElement(INPUT_FOR_DOMAIN);
//            input.clear();
//            input.sendKeys(domain);
//        } catch (NoSuchElementException ex) {
//            WebElement input = app.findElement(INPUT_FOR_RU_DOMAIN);
//            input.clear();
//            input.sendKeys(domain);
//        }
//        app.findElement(ANALYZE_BUTTON).click();
//    }
}
