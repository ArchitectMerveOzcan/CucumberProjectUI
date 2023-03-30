package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy (id = "account-menu")
    public WebElement userButton;

    @FindBy (id="login-item")
    public WebElement loginButton;

    @FindBy (xpath = "//span[contains(text(),'Register')]")
    public WebElement homePageDropDownRegisterButton;

    @FindBy (id= "login-item")
    public WebElement SignInButton;



    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public WebElement homePageSignInButton;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

}
