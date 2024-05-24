package base;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BasePage {
    public static WebDriver driver = null;
    FileInputStream fis = null;
    String keyValue = null;
    String cellValue = null;
    int count = 0;

    public static void getScreenShot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
    }

    public String readExcelData(int sheetNo, String key) throws IOException {

        fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(sheetNo);
        int columnCount = sheet.getRow(0).getLastCellNum();
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;

        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            for(int j = 0; j < rowCount; j++) {
                XSSFCell cell = row.getCell(j);
                keyValue = cell.getStringCellValue();
                if(keyValue.equalsIgnoreCase(key)) {
                    for(int k = 1; k < columnCount; k++) {
                        cellValue = sheet.getRow(k).getCell(j).getStringCellValue();
                    }

                }
            }
        }
        return cellValue;

    }

    public void waitForElement(WebElement ElementLocator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ZERO);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) ElementLocator));
    }

}
