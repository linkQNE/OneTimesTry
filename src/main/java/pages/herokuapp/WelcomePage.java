package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String WELCOME_PAGE_URL = "https://the-internet.herokuapp.com/";
    private final By FORM_AUTHENTICATION_LINK = By.linkText("Form Authentication");
    private final By JAVA_SCRIPT_ALERT_LINK = By.xpath("//a[contains(text(),'JavaScript Alerts')]");
    private final By DROP_DOWN_LINK = By.xpath("//a[contains(text(),'Dropdown')]");
    private final By CHECK_BOXES_LINK = By.xpath("//a[contains(text(),'Checkboxes')]");
    public void openPage() {
        openURL(WELCOME_PAGE_URL);
    }

    public LoginPage clickFormAuthentication() {
        click(FORM_AUTHENTICATION_LINK);
        return new LoginPage(driver, log);
    }

    public CheckBoxesPage goToCheckBoxesPage() {
        click(CHECK_BOXES_LINK);
        return new CheckBoxesPage(driver, log);
    }

    public DropDownPage goToDropDownPage() {
        click(DROP_DOWN_LINK);
        return new DropDownPage(driver, log);
    }

    public JavaScriptAlertPage goToJavaScriptAlertPage() {
        click(JAVA_SCRIPT_ALERT_LINK);
        return new JavaScriptAlertPage(driver, log);
    }
}
