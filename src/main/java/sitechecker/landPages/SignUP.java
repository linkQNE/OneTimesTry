package sitechecker.landPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.herokuapp.base.BasePage;

public class SignUP extends BasePage {
    public SignUP(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private final By EMAIL_FIELD = By.xpath("//input[@name='user_email']");
    private final By PASSWORD_FIELD = By.xpath("//input[@name='pass1']");
    private final By SIGN_UP_BUTTON = By.xpath("//input[@value='Sign up']");
    private final By VERIFICATION_MESSAGE = By.xpath("//div[@class='trial-register-popup']");

    public void signUpByEmail(String email,String password){
        find(EMAIL_FIELD).sendKeys(email);
        find(PASSWORD_FIELD).sendKeys(password);
        find(SIGN_UP_BUTTON).click();
    }

    public boolean VerificationMessageIsDisplayed(){
        waitFor(ExpectedConditions.visibilityOfElementLocated(VERIFICATION_MESSAGE),10);
        return find(VERIFICATION_MESSAGE).isDisplayed();
    }

    public void switchToTempMail(){
        driver.close();
        switchToTabByIndex(0);
    }
}
