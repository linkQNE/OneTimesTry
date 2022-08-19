package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final By LoginFieldId = By.id("username");
    private final By PasswordFieldId = By.id("password");
    private final By LoginButtonClass = By.className("radius");
    private final By ErrorMessage = By.xpath("//div[@class = 'flash error']");

    public SecurePage logIN(String username, String password) {
        type(username, LoginFieldId);
        type(password, PasswordFieldId);
        click(LoginButtonClass);
        return new SecurePage(driver, log);
    }

    public String getErrorMessage() {
        return find(ErrorMessage).getText();
    }

    public boolean LoginButtonIsDisplayed() {
        return find(LoginButtonClass).isDisplayed();
    }


}
