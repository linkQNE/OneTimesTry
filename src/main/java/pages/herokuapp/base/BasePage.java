package pages.herokuapp.base;

import com.beust.jcommander.Parameter;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

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

    protected List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    protected void click(By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).click();
    }

    protected void type(String text, By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOUTinSecond) {
        timeOUTinSecond = timeOUTinSecond != null ? timeOUTinSecond : 30;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOUTinSecond));
        wait.until(condition);
    }

    protected void waitForVisibilityOf(By locator, Integer... timeOUTinSecond) {
        int attempt = 0;
        while (attempt < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeOUTinSecond.length > 0 ? timeOUTinSecond[0] : null));
                break;
            } catch (StaleElementReferenceException e) {
                Assert.fail("Element wasn`t find after 30 second");
            }
            attempt++;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected Alert switchToAlert(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }
}
