package base;

import constants.Locators;


public class LoginPage extends Locators {

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickOnSignInBtn() {
        signInBtn.click();
    }

    public String getErrorMessage() {
        return signInError.getText();
    }
}
