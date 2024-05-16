package pages;

import constants.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class LoginPage {

    WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy (xpath = "//div[@class = 'row col-sm-12 h_head1']//following-sibling::a[@class = 'search_btn loginText ng-star-inserted']")
    public WebElement loginOnHomeScreen;
    @FindBy (xpath = "//input[@placeholder='User Name']")
    public WebElement username;
    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy (xpath = "//button[text() = 'SIGN IN']")
    public WebElement signInBtn;

    @FindBy (xpath = "//div[text()='Bad credentials']")
    public WebElement signInError;


    public void signInToIrctcPortal() throws InterruptedException {
        if(loginOnHomeScreen.isDisplayed()){
           try
            {
                loginOnHomeScreen.click();
                Thread.sleep(5000);
                username.sendKeys("username");
                password.sendKeys("password");
                Thread.sleep(15000);
                signInBtn.click();
                Thread.sleep(5000);
                if(signInError.isDisplayed()){
                    BasePage.getScreenShot(driver, "Error_In_Login");
                    Assert.fail("Bad Credentials");
                }

            } catch (Exception e){
               e.printStackTrace();
            }
        }

    }




}
