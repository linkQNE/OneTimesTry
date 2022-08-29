package base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;
    protected Logger log;
    protected String testName;
    protected String testSuiteName;
    protected String testMethodName;


    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUP(Method method, @Optional("chrome_win") String browser, ITestContext ctx) {

        String testName = ctx.getCurrentXmlTest().getName();
        log = LogManager.getLogger(testName);

        DriverFactory factory = new DriverFactory(browser, log);
        driver = factory.createDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        log.info("Start Driver" + browser);

        this.testSuiteName = ctx.getSuite().getName();
        this.testName = testName;
        this.testMethodName = method.getName();
    }

    @AfterMethod(alwaysRun = true)
    public void shutDown() {
//        driver.quit();
        log.info("Quit driver");
    }
    
}
