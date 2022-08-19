package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.herokuapp.base.BasePage;

import java.util.List;

public class CheckBoxesPage extends BasePage {
    public CheckBoxesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String CHECK_BOXES_PAGE_URL = "https://the-internet.herokuapp.com/checkboxes";
    private final By CHECKBOX = By.xpath("//input[@type='checkbox']");

    public void selectAllCheckboxes() {
        List<WebElement> checkboxes = findElements(CHECKBOX);
        for (WebElement box : checkboxes) {
            if (!box.isSelected()) {
                box.click();
            }
        }
    }

    public boolean checkBoxesIsSelected() {
        List<WebElement> checkboxes = findElements(CHECKBOX);
        for (WebElement box : checkboxes) {
            if (!box.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public String getCheckBoxesPageUrl() {
        return CHECK_BOXES_PAGE_URL;
    }
}
