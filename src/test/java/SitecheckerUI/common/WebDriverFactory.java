
package SitecheckerUI.common;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebDriverFactory {

    public static String BROWSER_NAME = "chrome";

    public static void setupDefaultDriver() {
        // Set default browser
        Configuration.browser = BROWSER_NAME;

        Selenide.open("https://sitechecker.pro/");
        // Set default timeout (in milliseconds)
        Configuration.timeout = 20000;
        // Set default polling interval (in milliseconds)
        Configuration.pollingInterval = 200;
        //
//        Configuration.browserCapabilities.setCapability("key", "value");
    }

}
