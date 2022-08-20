package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class KeyPressesPage extends BasePage {
    public KeyPressesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String KEY_PRESS_PAGE_URL = "https://the-internet.herokuapp.com/key_presses";
    private final By PAGE_BODY = By.xpath("//body");
    private final By RESULT = By.xpath("//p[@id = 'result']");

    public void openPage() {
        openURL(KEY_PRESS_PAGE_URL);
    }

    public void pressTabKey() {
        pressKey(PAGE_BODY, Keys.TAB);
    }

    public void pressShiftKeyByAction() {
        pressKeyWithAction(Keys.LEFT_SHIFT);
    }

    public String getResultMessage() {
        return find(RESULT).getText();
    }
}
