package tests.smokeTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.FileUploadPage;

public class UploadFileTest extends TestUtilities {

    @Test(dataProvider = "files")
    public void checkFileUploading(int number, String fileName) {
        FileUploadPage fileUploadPage = new FileUploadPage(driver, log);
        fileUploadPage.openPage();

        fileUploadPage.sendFile(fileName);
        fileUploadPage.pushUploadFile();

        String checkFileName = fileUploadPage.getUploadedFileName();
        Assert.assertTrue(checkFileName.contains(fileName), "Not that file is selected");
    }
}
