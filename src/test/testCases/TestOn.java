package testCases;

import base.BasePage;
import base.BaseTest;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPageT;

import java.io.IOException;


public class TestOn extends BaseTest {

    @Test
    @Description("Invalid login scenario with invalid username and password")
    public void runTest() throws Exception {
        LoginPageT loginpaget = PageFactory.initElements(driver, LoginPageT.class);
        loginpaget.signInToIrctcPortal();
    }
}

