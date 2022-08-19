package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.herokuapp.base.BasePage;

public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String URL = "https://the-internet.herokuapp.com/";
    private final By formText = By.linkText("Form Authentication");

    public void openPage(){
        openURL(URL);
    }

    public LoginPage clickFormAuthentication(){
        click(formText);
        return new LoginPage(driver,log);
    }


}
