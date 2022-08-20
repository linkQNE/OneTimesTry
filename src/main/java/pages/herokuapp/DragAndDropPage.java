package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String DRAG_AND_DROP_PAGE_URL = "https://the-internet.herokuapp.com/drag_and_drop";
    private final By ELEMENT_A = By.xpath("//div[@id='column-a']");
    private final By ELEMENT_B = By.xpath("//div[@id='column-b']");


    public void openPage(){
        openURL(DRAG_AND_DROP_PAGE_URL);
    }
    public void dragElementAtoElementB(){
        dragAndDropElementFromAtoB(ELEMENT_A,ELEMENT_B);
    }

    public String getHeaderOfElementA(){
        return find(ELEMENT_A).getText();
    }
}
