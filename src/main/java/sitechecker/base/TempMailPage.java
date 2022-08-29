package sitechecker.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;
import sitechecker.createProjectPages.CreateProjectPage;
import sitechecker.landPages.SitecheckerHome;

import java.util.Date;

public class TempMailPage extends BasePage {
    public TempMailPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final By EMAIL_FIELD = By.xpath("//input[@id='pre_button']");
    private final By CONFIRM_EMAIL = By.xpath("//span[contains(text(),'Please confirm your email')]");
    private final By VERIFY_EMAIL_BUTTON = By.xpath("//a[contains(text(),'Verify Email')]");
    private final String TEMP_MAIL_URL = "https://tempmail.plus/ru/#!";
    private final String EMAIL_TEMPLATE = "_mini_tool";
    private final String EMAIL_DOMAIN = "@mailto.plus";




    public void openPage() {
        openURL(TEMP_MAIL_URL);
    }

    public String getEmail() {
        Date d = new Date();
        find(EMAIL_FIELD).sendKeys(Keys.LEFT_CONTROL + "a");
        find(EMAIL_FIELD).sendKeys(Keys.DELETE);
        find(EMAIL_FIELD).sendKeys(getSeconds() + EMAIL_TEMPLATE);
        return find(EMAIL_FIELD).getAttribute("value") + EMAIL_DOMAIN;
    }

    public SitecheckerHome goToSitecheckerHome(){
        openNewTabAndSwitchTo();
        return new SitecheckerHome(driver,log);
    }

    public CreateProjectPage userVerify(){

        waitForVisibilityOf(CONFIRM_EMAIL,60);
        find(CONFIRM_EMAIL).click();

        waitForVisibilityOf(VERIFY_EMAIL_BUTTON,10);

        scrollPageToElement(VERIFY_EMAIL_BUTTON);

        find(VERIFY_EMAIL_BUTTON).click();

        switchToTabByIndex(1);

        return new CreateProjectPage(driver,log);

    }
}
