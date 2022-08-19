package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class SecurePage extends BasePage {
    public SecurePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String SECURE_PAGE_URL = "https://the-internet.herokuapp.com/secure";
    private final By flashMessage = By.id("flash");
    private final By LogoutButton = By.xpath("//a[@class='button secondary radius']");

    public String getFlashMessage() {
        return find(flashMessage).getText();
    }

    public String getSecurePageUrl() {
        return SECURE_PAGE_URL;
    }

    public boolean isLogoutButtonDisplayed() {
        return find(LogoutButton).isDisplayed();
    }

}
