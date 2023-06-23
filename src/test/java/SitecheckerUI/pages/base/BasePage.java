package SitecheckerUI.pages.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.switchTo;

public class BasePage {


    public void clearAndSendText(SelenideElement element, String text) {
        element.clear();
        element.setValue(text);
    }

    public void moveToElement(SelenideElement element) {
        actions().moveToElement(element).perform();
    }

    public void switchToFrameByElement(SelenideElement element) {
        Selenide.switchTo().frame(element);
    }

    public void switchToDefault() {
        switchTo().defaultContent();
    }

    public void acceptAlert() {
        switchTo().alert().accept();
    }
}
