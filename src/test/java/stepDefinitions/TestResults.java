package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.RegistrationPage;
import pages.StaffMyPagesPage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestResults extends BasePage {
    HomePage homePage = new HomePage();
    StaffMyPagesPage myPagesPage= new StaffMyPagesPage();
    RegistrationPage registrationPage= new RegistrationPage();


    @Then("Click the sign in button")
    public void click_the_sign_in_button() {
         homePage.homePageDropDownSignInButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User tries to login entering {string} and {string}")
    public void user_tries_to_login_entering_and(String string, String string2) {
        registrationPage.usernameBar.sendKeys(string,string2);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks my pages")
    public void user_clicks_my_pages() {
        registrationPage.signInButton.click();
    throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks search patient bar")
    public void user_clicks_search_patient_bar() {
        myPagesPage.SearchPatient.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User enters  {string} number into search box")
    public void user_enters_number_into_search_box(String string) {
        myPagesPage.PatientSSN.sendKeys(string);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks show appointments")
    public void user_clicks_show_appointments() {
        myPagesPage.showAppointments.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks show tests")
    public void user_clicks_show_tests() {
        myPagesPage.showTestsEczema.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks view the results")
    public void user_clicks_view_the_results() {
         myPagesPage.viewResutEczama.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks edit button")
    public void user_clicks_edit_button() {
         myPagesPage.editEczamaGlucoseTest.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user sends value to result bar")
    public void user_sends_value_to_result_bar() {
        myPagesPage.TestResutBarEczamaGlucoseTest.clear();
        myPagesPage.TestResutBarEczamaGlucoseTest.sendKeys("75");
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        myPagesPage.saveButton.click();

        throw new io.cucumber.java.PendingException();
    }

    @Then("user verifies if the changes is succesfull")
    public void user_verifies_if_the_changes_is_succesfull(){
        // Wait for the alert to be present

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());


// Get the text of the alert
        String alertText = alert.getText();

// Get the link text from the alert text
        Pattern pattern = Pattern.compile("LinkText:(A Test Result is updated with identifier 14328)");
        Matcher matcher = pattern.matcher(alertText);
        matcher.find();
        String linkText = matcher.group(1);

// Assert the link text
        Assert.assertEquals("A Test Result is updated with identifier 14328", linkText);

// Accept or dismiss the alert
        alert.accept(); // or alert.dismiss();
    }

}
