package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends BasePage {


    @FindBy(id="username")
    public WebElement userNameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="rememberMe")
    public WebElement rememberMeCheckBox;

    @FindBy(linkText = "Register a new account")
    public WebElement registrationLinkBox;

    @FindBy(xpath = "//*[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    public WebElement signinButton;

    @FindBy(id="account-menu")
    public WebElement userAccount;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button//span[.='Sign in']")
    public WebElement signInButton;

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }


}
