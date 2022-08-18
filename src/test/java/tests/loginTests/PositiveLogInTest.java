package tests.loginTests;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

import java.time.Duration;

public class PositiveLogInTest extends TestUtilities {

    @Test
    public void checkInputField() {
        String URL = "https://the-internet.herokuapp.com/";
        String formText = "Form Authentication";
        String LoginFieldId = "username";
        String PasswordFieldId = "password";
        String LoginButtonClass = "radius";
        driver.navigate().to(URL);
        driver.findElement(By.linkText(formText)).click();

        driver.findElement(By.id(LoginFieldId)).sendKeys("tomsmith");
        driver.findElement(By.id(PasswordFieldId)).sendKeys("SuperSecretPassword!");

        sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginButton = driver.findElement(By.className(LoginButtonClass));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();


        String ExpectedURL = "https://the-internet.herokuapp.com/secure";
        Assert.assertEquals(ExpectedURL, driver.getCurrentUrl());
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class = 'button secondary radius']")).isDisplayed(),
                "The LogOutButton in not Visible");

        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage: " + actualSuccessMessage + ", not equals to expectedSuccessMessage: " + expectedSuccessMessage);
    }
}
