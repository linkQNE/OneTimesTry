package sitechecker.createProjectPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class CreateProjectPage extends BasePage
{
    public CreateProjectPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final By START_PROJECT = By.xpath("//span[contains(text(),'Start Project')]");
    private final By VERIFIED_FRAME = By.xpath("//iframe[@]");



}
