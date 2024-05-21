package base;

import io.qameta.allure.Step;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.Map;

public class BaseTest extends BasePage {

    @BeforeSuite
    @Step("Launch Chrome Browser")
    public void launchBrowser(){

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
    }

    @AfterSuite
    @Step("Quit Chrome Browser")
    public void closeBrowser(){
        driver.quit();
    }
}
