package SitecheckerUI.pages.AppPages.Components;


import SitecheckerUI.pages.base.BasePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;

import static com.codeborne.selenide.Selenide.$x;


public class HeaderApp extends BasePage {

    private static final String HEADER_LOGO = "//a[contains(@class, 'logo')]";
    private static final String SHARE_PROJECT_BUTTON = "//span[contains(text(), 'Share')]/../..";
    private static final String ALERTS_BUTTON = "//app-tool-action-button [@id = 'alerts']";
    private static final String TYPES_OF_DATA = "//mat-radio-button[%s]";
    private static final String CREATE_PROJECT_BUTTON_IN_HEADER = "//button//span [text() = 'Create Project']";

    //EXPORT
    private static final String EXPORT_BUTTON = "//app-project-tool-panel//span[text() = 'Export']";
    private static final String GENERATE_SITEMAP_TAB_BUTTON = "//div [@class = 'mat-tab-list']//div [text() = 'Generate sitemap']";
    private static final String EXPORT_DATA_TAB_BUTTON = "//div [@class = 'mat-tab-list']//div [text() = 'Export data']";
    private static final String PDF_BUTTON = "//app-project-tool-panel//span[text() = 'PDF']";
    private static final String EXPORT_PDF_BUTTON = "//button//span[text() = ' Export PDF ']";
    private static final String SUMMARY_PDF_RADIO_BUTTON = "//mat-radio-button//span [text() = ' Site Audit Summary ']";
    private static final String FULL_PDF_RADIO_BUTTON = "//mat-radio-button//span [text() = ' Site Audit Full Report ']";
    private static final String CSV_BUTTON = "//button/span[text() = ' CSV ']";
    private static final String GOOGLE_SHEETS_BUTTON = "//button/span[text() = ' Google Sheets ']";
    private static final String COPY_URLS_BUTTON = "//button/span[text() = ' Copy URLs ']";
    private static final String GENERATE_SITEMAP_BUTTON = "//button//span [text() = ' Generate sitemap ']";
    private static final String UPLOAD_LOGO_POP_UP_CONTENT = "//app-loader-logo-modal//div [text() = ' Add a logo to brand your PDF reports ']";
    private static final String UPLOAD_LOGO_INPUT = "//app-loader-logo-modal//input";
    private static final String LOGO_IMAGE = "//app-loader-logo-modal//img";
    private static final String SAVE_LOGO_BUTTON = "//app-loader-logo-modal//span [text() = ' Save ']";
    private static final String COMPANY_LOGO_IMG = "//img[@alt = 'Brand your report']";
    private static final String UPLOAD_LOGO_BUTTON = "//span[text() = ' Upload logo ']";

//    @Step("Click -create project- button on header")
//    public void clickCreateProjectInHeader() {
//        WaitUntil.elementToBeClickable(CREATE_PROJECT_BUTTON_IN_HEADER).click();
//        isLoaderPresent();
//    }

    @Step("Click on allProjectsPage to Projects button")
    public void clickOnLogo() {
        if($x(HEADER_LOGO).isDisplayed()){
            $x(HEADER_LOGO).shouldBe(Condition.interactable).click();
        }
        if($x("(" + HEADER_LOGO + ")[2]").isDisplayed()){
            $x("(" + HEADER_LOGO + ")[2]").shouldBe(Condition.interactable).click();
        }
    }

//    @Step("Click share project")
//    public void clickShareProject() {
//        WebElement share = WaitUntil.elementToBeClickable(SHARE_PROJECT_BUTTON);
//        app.scrollToElement(share);
//        share.click();
//    }
//
//    @Step("Click Export button")
//    private void clickExportButton() {
//        isLoaderPresent();
//        try {
//            WebElement exportButton = WaitUntil.elementToBeClickable(EXPORT_BUTTON);
//            app.scrollToElement(exportButton);
//            exportButton.click();
//        } catch (StaleElementReferenceException ex) {
//            app.sleep(Duration.ofSeconds(5).toMillis());
//            WaitUntil.elementToBeClickable(EXPORT_BUTTON).click();
//        }
//    }
//
//    @Step("Select Tab 'Generate Sitemap' on Export pop-up")
//    private void selectSitemapExportTab() {
//        WaitUntil.elementToBeClickable(GENERATE_SITEMAP_TAB_BUTTON).click();
//    }
//
//    @Step("Select Tab 'Export data' on Export pop-up")
//    private void selectExportDataTab() {
//        try {
//            WaitUntil.waitToInSecondsElementToBeClickable(EXPORT_DATA_TAB_BUTTON, 20).click();
//        } catch (TimeoutException ignored) {
//        }
//    }
//
//    @Step("Click 'PDF' button on header")
//    public void clickPDFButton() {
//        app.closeTabsExceptCurrent();
//        isLoaderPresent();
//        try {
//            WebElement exportButton = WaitUntil.elementToBeClickable(PDF_BUTTON);
//            app.scrollToElement(exportButton);
//            exportButton.click();
//        } catch (StaleElementReferenceException ex) {
//            app.sleep(Duration.ofSeconds(5).toMillis());
//            WaitUntil.elementToBeClickable(PDF_BUTTON).click();
//        }
//    }
//
//    @Step("Select 'Site Audit Summary' radio button")
//    public void selectSummaryReportPDF() {
//        WaitUntil.visibilityOfElementLocated(SUMMARY_PDF_RADIO_BUTTON).click();
//    }
//
//    @Step("Select 'Site Audit Full Report' radio button")
//    public void selectFullReportPDF() {
//        WaitUntil.visibilityOfElementLocated(FULL_PDF_RADIO_BUTTON).click();
//    }
//
//    @Step("Export 'PDF'")
//    public void exportSummaryPDF() {
//        clickPDFButton();
//        selectSummaryReportPDF();
//        WaitUntil.elementToBeClickable(EXPORT_PDF_BUTTON).click();
//    }
//
//    @Step("Export 'Full PDF report'")
//    public void exportFullPDF() {
//        clickPDFButton();
//        selectFullReportPDF();
//        WaitUntil.elementToBeClickable(EXPORT_PDF_BUTTON).click();
//    }
//
//    @Step("Export 'CSV'")
//    public void exportCSV() {
//        clickExportButton();
//        if (!isExportDataTabActive()) {
//            selectExportDataTab();
//        }
//        WaitUntil.visibilityOfElementLocated(CSV_BUTTON).click();
//        //wait for download CSV report file
//        app.sleep(Duration.ofSeconds(20).toMillis());
//    }
//
//    /* types:
//       1 -  All HTML pages
//       2 -  All Issues
//       3 -  Errors and Warnings
//    */
//    @Step("Export 'CSV'")
//    public void chooseTypeAndExportCSV(int type) {
//        clickExportButton();
//        if (!isExportDataTabActive()) {
//            selectExportDataTab();
//        }
//        WaitUntil.visibilityOfElementLocated(String.format(TYPES_OF_DATA, type)).click();
//        app.sleep(Duration.ofSeconds(10).toMillis());
//        WaitUntil.visibilityOfElementLocated(CSV_BUTTON).click();
//        //wait for download CSV report file
//        app.sleep(Duration.ofSeconds(20).toMillis());
//    }
//
//    @Step("Export 'Google Sheets'")
//    public void exportGoogleSheets() {
//        app.closeTabsExceptCurrent();
//        app.sleep(Duration.ofSeconds(10).toMillis());
//        clickExportButton();
//        if (!isExportDataTabActive()) {
//            selectExportDataTab();
//        }
//        WebElement googleSheet = WaitUntil.visibilityOfElementLocated(GOOGLE_SHEETS_BUTTON);
//        googleSheet.click();
//    }
//
//
//    /* types:
//       1 -  All HTML pages
//       2 -  All Issues
//       3 -  Errors and Warnings
//    */
//    @Step("Export 'Google Sheets'")
//    public void chooseTypeAndExportGoogleSheets(int type) {
//        app.closeTabsExceptCurrent();
//        clickExportButton();
//        if (!isExportDataTabActive()) {
//            selectExportDataTab();
//        }
//        WaitUntil.visibilityOfElementLocated(String.format(TYPES_OF_DATA, type)).click();
//        WaitUntil.visibilityOfElementLocated(GOOGLE_SHEETS_BUTTON).click();
//    }
//
//    @Step("Export 'Copy URLs'")
//    public void exportCopy() {
//        clickExportButton();
//        if (!isExportDataTabActive()) {
//            selectExportDataTab();
//        }
//        WaitUntil.visibilityOfElementLocated(COPY_URLS_BUTTON).click();
//        isCopySnackBarPresent();
//    }
//
//    @Step("Export 'Sitemap'")
//    public void exportSitemapExportAll() {
//        clickExportButton();
//        if (isExportDataTabActive()) {
//            selectSitemapExportTab();
//        }
//        WaitUntil.visibilityOfElementLocated(GENERATE_SITEMAP_BUTTON).click();
//        //wait for download Sitemap file
//        app.sleep(Duration.ofSeconds(20).toMillis());
//    }
//
//    @Step("Click Alerts Button")
//    public void clickAlertsButton() {
//        WaitUntil.visibilityOfElementLocated(ALERTS_BUTTON).click();
//    }
//
//    @Step("Get report name")
//    public String getReportName() {
//        return getOpenedPageTitleAndClose();
//    }
//
//    @Step("Get report URL")
//    public String getReportURL() {
//        return getOpenedPageURLAndClose();
//    }
//
//    @Step("Click 'Save' button in upload logo pop-up")
//    public void clickSaveLogo() {
//        WaitUntil.elementToBeClickable(SAVE_LOGO_BUTTON).click();
//        WaitUntil.waitToInSecondsInvisibilityOfElementLocated(UPLOAD_LOGO_POP_UP_CONTENT, 20);
//    }
//
//    @Step("Click 'Export PDF' on ExportPDF pop-up")
//    public void clickExportPDFinPopUp() {
//        WaitUntil.visibilityOfElementLocated(EXPORT_PDF_BUTTON).click();
//    }
//
//    @Step("Click 'Company Logo' on ExportPDF pop-up")
//    public void clickCompanyLogo() {
//        try {
//            WaitUntil.visibilityOfElementLocated(COMPANY_LOGO_IMG).click();
//        } catch (TimeoutException ex) {
//            WaitUntil.visibilityOfElementLocated(UPLOAD_LOGO_BUTTON).click();
//        }
//    }
//
//    @Step("Upload logo file")
//    public void uploadLogoFile(File file) {
//        sentFileToImport(UPLOAD_LOGO_INPUT, file);
//    }
//
//    @Step("Check logo is Uploaded")
//    public boolean isLogoFileUploaded() {
//        return WaitUntil.visibilityOfElementLocated(LOGO_IMAGE).isDisplayed();
//    }
//
//    @Step("Check PDF logo Pop up is present")
//    public boolean isPDFLogoUploadPopUpPresent() {
//        return WaitUntil.visibilityOfElementLocated(UPLOAD_LOGO_POP_UP_CONTENT).isDisplayed();
//    }
//
//    @Step("Check is Site Audit CSV File Downloaded")
//    public boolean isCSVDownloaded(String title) {
//        return isFileDownloaded(title);
//    }
//
//    @Step("Check is Site Audit Sitemap File Downloaded")
//    public boolean isXMLDownloaded(String title) {
//        return isFileDownloaded(title);
//    }
//
//    @Step("Check if 'Export data' is selected on Export-popup")
//    private boolean isExportDataTabActive() {
//        String activeState = "//parent::div[contains (@class, 'mat-tab-label-active')]";
//        try {
//            WaitUntil.waitToInSecondsVisibilityOfElementLocated(EXPORT_DATA_TAB_BUTTON + activeState, 20);
//            return true;
//        } catch (TimeoutException ex) {
//            return false;
//        }
//    }


}
