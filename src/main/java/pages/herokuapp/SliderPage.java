package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String SLIDER_PAGE_URL = "https://the-internet.herokuapp.com/horizontal_slider";
    private final By SLIDER = By.xpath("//input[@type = 'range']");

    public void openPage() {
        openURL(SLIDER_PAGE_URL);
    }

    public void setSliderTo(String value) {
//        First way doesnt work in this case;
//        int width = find(SLIDER).getSize().getWidth();
//        double percent = Double.parseDouble(value)/5;
//        int xOffSet= (int) (width*percent);
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(find(SLIDER),xOffSet,0).build().perform();

        int steps = (int) (Double.parseDouble(value) / 0.5);
        pressKey(SLIDER, Keys.ENTER);
        for (int i = 0; i < steps; i++) {
            pressKey(SLIDER, Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        return find(SLIDER).getAttribute("value");
    }
}
