package pages.herokuapp.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected Logger log;

    public BasePage(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    protected void openURL(String url) {
        driver.navigate().to(url);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator){
        waitForVisibilityOf(locator,5);
        find(locator).click();
    }

    protected void type(String text, By locator){
        waitForVisibilityOf(locator,5);
        find(locator).sendKeys(text);
    }

    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOUTinSecond) {
        timeOUTinSecond = timeOUTinSecond != null ? timeOUTinSecond : 30;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOUTinSecond));
        wait.until(condition);
    }

    protected void waitForVisibilityOf(By locator, Integer... timeOUTinSecond){
        int attempt = 0;
        while (attempt<2){
            try{
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeOUTinSecond.length>0 ? timeOUTinSecond[0] : null));
                break;
            }
            catch (StaleElementReferenceException e){
            }
            attempt++;
        }
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
