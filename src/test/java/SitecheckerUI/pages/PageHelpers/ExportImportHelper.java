package SitecheckerUI.pages.PageHelpers;

import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;


public class ExportImportHelper {

//    private static final String COPY_SNACK_BAR = "//snack-bar-container";
//
//    @Step("Check Copy SnackBar is present")
//    public static boolean isCopySnackBarPresent() {
//        try {
//            return WaitUntil.visibilityOfElementLocated(COPY_SNACK_BAR).isDisplayed();
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }
//
//    public static String getStringFromBuffer() {
//        String stringFromBuffer = "";
//        try {
//            stringFromBuffer = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
//        } catch (UnsupportedFlavorException | IOException e) {
//            e.printStackTrace();
//        }
//        return stringFromBuffer;
//    }
//
//    public static boolean isFileDownloaded(String fileName) {
//        File dir = new File(
//                System.getProperty("user.home") + File.separator +
//                        "Downloads" + File.separator);
//        File[] dirContents = dir.listFiles();
//        if (dirContents != null) {
//            for (File content : dirContents) {
//                if (content.getName().contains(fileName)) {
//                    // File has been found, it can now be deleted:
//                    content.delete();
//                    return true;
//                }
//            }
//            //delete all files if false
//            for (File dirContent : dirContents) {
//                dirContent.delete();
//            }
//        }
//        return false;
//    }
//
//    public static void sentFileToImport(String locator, File file) {
//        WebElement chooseFile = app.findElement(locator);
//        app.executeScriptForElement("arguments[0].style.display = 'inline';", chooseFile);
//        chooseFile.sendKeys(file.getAbsolutePath());
//    }
//
//    public static String getOpenedPageTitleAndClose() {
//        app.waitNewTabAndSwitch(20, 6);
//        String title = app.getCurrentWindowTitle();
//        app.switchToLastTabAndClosePrevious();
//        app.restartWS();
//        return title;
//    }

//    public static String getOpenedPageURLAndClose() {
//        app.waitNewTabAndSwitch(20, 6);
//        String url = app.getCurrentUrl();
//        app.switchToLastTabAndClosePrevious();
//        app.restartWS();
//        return url;
//    }
}
