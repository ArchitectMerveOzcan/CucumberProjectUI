package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(id = "account-menu")
    public WebElement userButton;

    @FindBy (xpath = "//span[contains(text(),'Register')]")
    public WebElement homePageDropDownRegisterButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (id="//*[@id='login-item']")
    public WebElement homePageDropDownSignInButton;


}
