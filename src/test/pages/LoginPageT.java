package pages;

import base.BasePage;
import base.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static base.BasePage.driver;


public class LoginPageT extends LoginPage {

    BasePage basePage = new BasePage();

    @Step("Open SignIN portal and enter invalid credentials")
    public void signInToIrctcPortal() throws Exception {
        String username = basePage.readExcelData(0, "Username");
        String password = basePage.readExcelData(0, "Password");
        System.out.println(username);
        System.out.println(password);
        if(loginOnHomeScreen.isDisplayed()){

            loginOnHomeScreen.click();
            Thread.sleep(5000);
            enterUsername(username);
            enterPassword(password);
            Thread.sleep(10000);
            clickOnSignInBtn();
            Thread.sleep(5000);
            Assert.assertEquals(getErrorMessage(), "Bad credentials");
            BasePage.getScreenShot(driver, "Error_In_Login");

        }

    }


}
