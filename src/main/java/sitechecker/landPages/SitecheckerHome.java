package sitechecker.landPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class SitecheckerHome extends BasePage {
    public SitecheckerHome(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private final String SITECHECKER_HOME_URL = "https://sitechecker.pro/";
    private final By START_FREE_TRIAL_BUTTON = By.xpath("//button[contains(text(),'Start 7-day free trial')]");

    public void openPage(){
        openURL(SITECHECKER_HOME_URL);
    }

    public SignUP openSignUpForm() {
        find(START_FREE_TRIAL_BUTTON).click();
        return new SignUP(driver, log);
    }

}
