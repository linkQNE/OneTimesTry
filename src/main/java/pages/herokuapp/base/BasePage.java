package pages.herokuapp.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class BasePage {

    protected WebDriver driver;
    protected Logger log;

    public BasePage(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    public void openURL(String url) {
        driver.navigate().to(url);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).click();
    }

    public void type(String text, By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    public void waitFor(ExpectedCondition<WebElement> condition, Integer timeOUTinSecond) {
        timeOUTinSecond = timeOUTinSecond != null ? timeOUTinSecond : 30;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOUTinSecond));
        wait.until(condition);
    }

    public void waitForVisibilityOf(By locator, Integer... timeOUTinSecond) {
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

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

    public Alert switchToAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }

    public void switchToNewWindowByTitle(String title) {
        String firstWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> windowsIteration = allWindows.iterator();

        while (windowsIteration.hasNext()) {
            String windowHandle = windowsIteration.next().toString();
            if (!windowHandle.equals(firstWindow)) {
                driver.switchTo().window(windowHandle);
                if (getCurrentPageTitle().contains(title)) {
                    break;
                }
            }
        }
    }

    public void switchToTabByIndex(int index) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public void createNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
//        js.executeScript("document.getElementById('').style.visibility='visible'");   MAKE ELEMENT VISIBLE (FOR INPUT FIELDS)
    }

    public void switchToFrame(By FrameLocator) {
        driver.switchTo().frame(find(FrameLocator));
    }

    public void pressKey(By locator, Keys key) {
        find(locator).sendKeys(key);
    }

    public void pressKeyWithAction(Keys key) {
        Actions action = new Actions(driver);
        action.sendKeys(key).build().perform();
    }

    public void scrollPageToElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", find(locator));
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void dragAndDropElementFromAtoB(By locatorA, By locatorB) {
        //          doesnt work in this case
        //        Actions actions = new Actions(driver);
        //        actions.dragAndDrop(find(locatorA),find(locatorB)).build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n" + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n" + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n" + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n" + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n" + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n" + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n" + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n" + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n" + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n" + "var dropEvent = createEvent('drop');\n" + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" + "var dragEndEvent = createEvent('dragend');\n" + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n" + "var source = arguments[0];\n" + "var destination = arguments[1];\n" + "simulateHTML5DragAndDrop(source,destination);", find(locatorA), find(locatorB));
    }

    public String getSeconds() {
        return (new SimpleDateFormat("SSS").format(new Date()));
    }

    public void openNewTabAndSwitchTo() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
