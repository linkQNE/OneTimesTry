package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class JavaScriptAlertPage extends BasePage {
    public JavaScriptAlertPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final By JS_ALERT = By.xpath("//button[@onclick = 'jsAlert()']");
    private final By JS_CONFIRM = By.xpath("//button[@onclick = 'jsConfirm()']");
    private final By JS_PROMPT = By.xpath("//button[@onclick = 'jsPrompt()']");
    private final By RESULT_TEXT = By.xpath("//p[@id='result']");

    public void clickJSAlert() {
        find(JS_ALERT).click();
    }

    public void clickJSPrompt() {
        find(JS_PROMPT).click();
    }

    public void clickJSConfirm() {
        find(JS_CONFIRM).click();
    }

    public void acceptAlert(){
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert(){
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public String getAlertText(){
        Alert alert = switchToAlert();
        return alert.getText();
    }

    public void inputTextToAlert(String text){
        Alert alert = switchToAlert();
        alert.sendKeys(text);
    }

    public String getResultText(){
        return find(RESULT_TEXT).getText();
    }


}
