package stepDefinitions;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RegistrationPage;

public class US02 {
        private final RegistrationPage registrationPage = new RegistrationPage();

        @Then("Enter valid username {string} with letters and numbers")
        public void enter_valid_username_with_letters_and_numbers(String input) {
            registrationPage.username.sendKeys(input);
        }

        @Then("Enter valid email address {string}")
        public void enter_valid_email_address(String input) {
            registrationPage.sendKey(registrationPage.email, input);
        }

        @Then("Leave username box blank")
        public void leave_username_box_blank() {
            registrationPage.clickWithWait(registrationPage.username);
            registrationPage.clickWithWait(registrationPage.email);
        }
        @Then("Assert that username is not accepted")
        public void assert_that_username_is_not_accepted() throws InterruptedException {
            for (int i = 0; i < 5; i++) {
                try {
                    Assert.assertTrue(registrationPage.isDisplayed(registrationPage.usernameRequired));
                } catch (Exception e) {
                    registrationPage.sleep(1);
                }
            }
        }
        @Then("Enter invalid {string}")
        public void enter_invalid(String input) {
            registrationPage.sendKey(registrationPage.email, input);
            registrationPage.clickWithWait(registrationPage.username);
        }
        @Then("Assert that email is not accepted")
        public void assert_that_email_is_not_accepted() throws InterruptedException {
            for (int i = 0; i < 5; i++) {
                try {
                    Assert.assertTrue(registrationPage.isDisplayed(registrationPage.emailInvalid));
                } catch (Exception e) {
                    registrationPage.sleep(1);
                }
            }
        }
        @Then("Leave email address box  blank")
        public void leave_email_address_box_blank() {
            registrationPage.clickWithWait(registrationPage.email);
            registrationPage.clickWithWait(registrationPage.username);
        }

        @Then("Assert that user gets error message")
        public void assert_that_user_gets_error_message() throws InterruptedException {
//        Assert.assertTrue(registrationPage.emailRequired.isDisplayed());
//        ReusableMethods.waitFor(5);
            for (int i = 0; i < 5; i++) {
                try {
                    Assert.assertTrue(registrationPage.isDisplayed(registrationPage.emailRequired));
                } catch (Exception e) {
                    registrationPage.sleep(1);
                }
            }
        }
}
