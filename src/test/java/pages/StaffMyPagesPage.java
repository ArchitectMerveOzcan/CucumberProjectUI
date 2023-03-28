package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaffMyPagesPage {

    @FindBy(id = "entity-menu")
    public WebElement myPagesDropdown;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement SearchPatient;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement PatientSSN;

    @FindBy(id= "jh-create-entity")
    public WebElement createANewStaffButton;

    @FindBy (id="useSSNSearch")
    public WebElement SsnSearchRadioButton;

    @FindBy (id="searchSSN")
    public WebElement SsnBox;

    @FindBy (xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;

    @FindBy (xpath = "//div[contains(text(),'User found with search SSN')]")
    public WebElement alert;

    @FindBy(id="appointment-heading")
    public WebElement appointmentsHead;

    @FindBy(xpath = "//a[@href='/appointment-update/24475']")
    public WebElement editAppointment;

    @FindBy(xpath = "//span[contains(text(),'Show Appointments')]")
    public WebElement showAppointments;

    @FindBy(xpath = "//span[contains(text(),'Create or Edit an Appointment')]")
    public WebElement editAppointmentsHead;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement status;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement treatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosis;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'The Appointment is updated with identifier 24475')]")
    public WebElement alertSave;

    @FindBy (id = "appointment-physician")
    public WebElement physician;

    @FindBy(xpath = "//a[@href='/tests/appointment/24475']")
    public WebElement showTests;

    @FindBy (xpath = "//*[@href= '/tests/appointment/10566']")
    public WebElement showTestsEczema;

    @FindBy(xpath = "//*[@href= '/testresult/test/14616']")
    public WebElement viewResutEczama;

    @FindBy(xpath = "//*[@href='/c-test-result-update/14327']")
    public WebElement editEczamaGlucoseTest;

    @FindBy(xpath = "//*[@id='c-test-result-result']")
    public WebElement TestResutBarEczamaGlucoseTest;

    @FindBy(xpath = "//span[contains(text(),'Tests')]")
    public WebElement testsHead;





}
