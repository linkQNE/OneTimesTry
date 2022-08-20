package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class WYSIWYGEditorPage extends BasePage {
    public WYSIWYGEditorPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String  WYSIWYG_EDITOR_PAGE_URL = "https://the-internet.herokuapp.com/tinymce";
    private By iFrame = By.xpath("//iframe [@id='mce_0_ifr']");
    private By inputField = By.xpath("//p");

    public void openPage(){
        openURL(WYSIWYG_EDITOR_PAGE_URL);
    }
    public void switchToFrame(){
        switchToFrame(iFrame);
    }

    public String getTextFromField(){
        return find(inputField).getText();
    }

    public void typeSomeTextToField(String text){
        find(inputField).clear();
        find(inputField).sendKeys(text);
    }
}
