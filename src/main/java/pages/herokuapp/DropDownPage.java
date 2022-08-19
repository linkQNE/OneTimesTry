package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.herokuapp.base.BasePage;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private final By DROP_DOWN_SELECTOR = By.xpath("//select[@id='dropdown']");

    public void selectOption(int index){
        WebElement dropDownElement = find(DROP_DOWN_SELECTOR);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByIndex(index);
    }

    public String getSelectedOption(){
        WebElement dropDownElement = find(DROP_DOWN_SELECTOR);
        Select dropDown = new Select(dropDownElement);
        String selectedOption = dropDown.getFirstSelectedOption().getText();
        return selectedOption;
    }
}
