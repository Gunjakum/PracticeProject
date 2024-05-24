package testCases;

import base.BaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPageT;


public class TestOn extends BaseTest {

    @BeforeTest
    @Parameters ("browserName")
    public void launch(String browserName) {
        launchBrowser(browserName);
    }

    @Test
    @Description("Invalid login scenario with invalid username and password")
    public void runTest() throws Exception {
        LoginPageT loginpaget = PageFactory.initElements(driver, LoginPageT.class);
        loginpaget.signInToIrctcPortal();
    }
}

