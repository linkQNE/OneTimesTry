package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.herokuapp.base.BasePage;

import java.util.List;

public class HoverPage extends BasePage {
    public HoverPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private final String HOVER_PAGE_URL = "https://the-internet.herokuapp.com/hovers";
    private final By AVATARS_ELEMENTS = By.xpath("//div[@class = 'figure']");
    private final By USERS = By.xpath(".//a[contains(text(),'View profile')]");
    public void openPage(){
        openURL(HOVER_PAGE_URL);
    }

    public void selectAvatarByIndex(int index){
        List<WebElement> avatarsList = findElements(AVATARS_ELEMENTS);
        WebElement avatar = avatarsList.get(index-1);
        hoverOverElement(avatar);
        avatar.findElement(USERS).click();
    }
}
