package base;

import io.qameta.allure.Step;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import java.util.HashMap;
import java.util.Map;

public class BaseTest extends BasePage {


    @Step("Launch Chrome Browser")
    public void launchBrowser(String browserName){

        if(browserName.equals("Chrome")){
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);
            driver.get("https://www.irctc.co.in/nget/train-search");
            driver.manage().window().maximize();

        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
            driver.get("https://www.irctc.co.in/nget/train-search");
            driver.manage().window().maximize();
        }

    }

    @AfterSuite
    @Step("Quit Browser")
    public void closeBrowser(){
        driver.quit();
    }
}
