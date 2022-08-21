package pages.herokuapp;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.base.BasePage;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private final String FILE_UPLOAD_PAGE = "https://the-internet.herokuapp.com/upload";
    private final By CHOOSE_FILE_INPUT = By.xpath("//input[@id='file-upload']");
    private final By UPLOAD_BUTTON = By.xpath("//input[@id='file-submit']");
    private final By UPLOADED_FILE_NAME_FIELD = By.xpath("//div[@id='uploaded-files']");

    public void openPage() {
        openURL(FILE_UPLOAD_PAGE);
    }

    public void sendFile(String fileName) {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\files\\" + fileName;
        type(filePath, CHOOSE_FILE_INPUT);
    }

    public void pushUploadFile() {
        find(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        return find(UPLOADED_FILE_NAME_FIELD).getText();
    }

}
