package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String MULTIPLE_WINDOWS_PAGE_URL = "https://the-internet.herokuapp.com/windows";
    private By clickHere = By.xpath("//a[contains(text(),'Click Here')]");
    private final String MULTIPLE_PAGE_URL = "https://the-internet.herokuapp.com/windows";

    public void openNewWindow() {
        find(clickHere).click();
    }

    public void openPage() {
        openURL(MULTIPLE_WINDOWS_PAGE_URL);
    }

    public WindowPage switchToNewWindowTab() {
        switchToNewWindowByTitle("New Window");
        return new WindowPage(driver, log);
    }
}
