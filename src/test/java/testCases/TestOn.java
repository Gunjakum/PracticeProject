package testCases;

import constants.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestOn extends BasePage {

    @Test
    public void runTest() throws InterruptedException {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.signInToIrctcPortal();

    }
}

