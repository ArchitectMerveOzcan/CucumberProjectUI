package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage extends BasePage {

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy(id = "secondPassword")
    public WebElement passwordConfirm;

    @FindBy(id = "strengthBar")
    public WebElement strengthBar;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement strengthBar1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement strengthBar2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement strengthBar3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement strengthBar4;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement strengthBar5;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(linkText = "Your username is invalid." )
    public WebElement usernameInvalid;
    @FindBy(linkText = "Your username is required." )
    public WebElement usernameRequired;
    @FindBy(linkText = "Your email is required." )
    public WebElement emailRequired;

    @FindBy (id= "ssn")
    public WebElement ssnBox;

    @FindBy (id= "firstName")
    public WebElement firstNameBox;

    @FindBy(id="lastName")
    public WebElement lastNameBox;

    @FindBy(id="username")
    public WebElement userNameBox;

    @FindBy(id="email")
    public WebElement emailBox;

    @FindBy(id="register-submit")
    public WebElement registerButton;
    @FindBy(linkText = "This field is invalid" )
    public WebElement emailInvalid;

    public RegistrationPage(){
        PageFactory.initElements(driver, this);
    }
}
