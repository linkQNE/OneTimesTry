package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class WindowPage extends BasePage {
    public WindowPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getSourceOfWindowPage(){
        return getPageSource();
    }
}
