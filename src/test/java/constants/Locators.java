package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {
    public WebDriver driver;

    @FindBy (xpath = "//div[@class = 'row col-sm-12 h_head1']//following-sibling::a[@class = 'search_btn loginText ng-star-inserted']")
    public WebElement loginOnHomeScreen;
    @FindBy (xpath = "//input[@id = '2712411']")
    public WebElement username;
    @FindBy (xpath = "//input[@id = '4121490']")
    public WebElement password;
    @FindBy (xpath = "//button[text() = 'SIGN IN']")
    public WebElement signInBtn;
    @FindBy (xpath = "//input[@aria-controls = 'pr_id_1_list']")
    protected WebElement fromStation;
    @FindBy (xpath = "//input[@aria-controls = 'pr_id_2_list']")
    protected WebElement toStation;
    @FindBy (xpath = "//span[@class = 'ng-tns-c58-10 ui-calendar']")
    protected WebElement journeyCalendar;
    @FindBy (xpath = "//span[contains(text(), 'Results for')]")
    protected WebElement searchResult;
    @FindBy (xpath = "//strong[contains(text(),' KUMBHA EXPRESS (12369)')]//following::strong[contains(text(), 'AC 3 Economy (3E)')][1]")
    protected WebElement thirdACAvailability;

    public Locators(WebDriver driver){
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }



}
