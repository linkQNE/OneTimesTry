package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class JSErrorPage extends BasePage {

    public JSErrorPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String JS_ERROR_PAGE_URL = "https://the-internet.herokuapp.com/javascript_error";

    public void openPage(){
        openURL(JS_ERROR_PAGE_URL);
    }
}
