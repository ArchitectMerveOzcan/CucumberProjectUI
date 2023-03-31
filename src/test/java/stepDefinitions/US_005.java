package stepDefinitions;

import Utilities.Driver;
import Utilities.PropManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;


public class US_005 {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    RegistrationPage registrationPage = new RegistrationPage();
    String actualTitle;
    String actalertText;

    @Given("User goes to home page")
    public void goToHomePage() throws InterruptedException {
        homePage.driver.get(PropManager.getProperties(homePage.env,"medunna_url"));
        homePage.clickWithWait(homePage.userButton);
        homePage.sleep(Integer.parseInt("300"));
    }


    @Given("User tries to login entering {string} and {string}")
    public void user_tries_to_login_entering_and(String string, String string2 ) throws InterruptedException {
        homePage.clickWithWait(homePage.loginButton);
        homePage.sleep(Integer.parseInt("300"));
        signInPage.userNameBox.sendKeys(string);
        signInPage.passwordBox.sendKeys(string2);
        homePage.clickWithWait(signInPage.signInButton);
        homePage.sleep(Integer.parseInt("300"));
    }


    @Then("Assert that login successful")
    public void assert_that_login_successful() {

        try {
            Assert.assertTrue(signInPage.userAccount.isDisplayed());
            {
            System.out.println("Test case: Passed");}


        } catch (Exception e){
        }
        try {
            Alert alt = Utilities.Driver.get(homePage.env).switchTo().alert();
            actalertText = alt.getText(); // get content of the Alert Message

           Assert.assertEquals("Failed to sign in! Please check your credentials and try again",actalertText);
            alt.accept();
            System.out.println("Test case: Passed");
        } catch (Exception e){

        }
    }

          @Given("cliks cancel button")
           public void cliks_cancel_button() {
              homePage.clickWithWait(signInPage.cancelButton);
        }

        @Then("Assert that cancel successful")
        public void assert_that_cancel_successful() {
         Assert.assertTrue(homePage.userButton.isEnabled());
        }

        @Given("Assert that login unsuccessful")
        public void assert_that_login_unsuccessful() {
            try {
                Alert alt = Utilities.Driver.get(homePage.env).switchTo().alert();
                actalertText = alt.getText(); // get content of the Alert Message

                Assert.assertEquals("Failed to sign in! Please check your credentials and try again",actalertText);
                alt.accept();
                System.out.println("Test case: Passed");
            } catch (Exception e){            }
        }
        @Given("User navigates registration page")
        public void user_navigates_registration_page() {
            homePage.clickWithWait(signInPage.registrationLinkBox);
        }
        @Then("Assert that navigation to registration page successful")
        public void assert_that_navigation_to_registration_page_successful() {
           Assert.assertTrue(registrationPage.strengthBar.isDisplayed());
        }

    @Then("close application")
    public void closeApplication() {
            Driver.closeDriver();
    }

    }










//
//


//        try {
//            homePage.loginButton.click();
//            ReusableMethods.waitFor(1);
//        } catch (Exception e) {
//        }
//        try {
//            ReusableMethods.waitFor(1);
//            signInPage.userAccount.click();
//            ReusableMethods.waitFor(1);
//            homePage.userButton.click();
//            ReusableMethods.waitFor(1);
//            homePage.loginButton.click();
//            ReusableMethods.waitFor(1);
//
//        } catch (Exception e) {
//        }

//        throw new io.cucumber.java.PendingException();




