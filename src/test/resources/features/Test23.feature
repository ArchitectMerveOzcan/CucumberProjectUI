@TestResults

Feature: TestResults

  Background: Sign In Medunna as an Staff
    Given Go to home page
    When Click Signin button at the top
    Then Click the sign in button
    And User tries to login entering "ShiningStaff" and "Shiningstaff1"




  Scenario:
#    And user clicks sign in
    And User clicks my pages
    And User clicks search patient bar
    And User enters  "patient_ssn" number into search box
    And User clicks show appointments
    And user clicks show tests
    And user clicks view the results
    And user clicks edit button
    And user sends value to result bar
    And user clicks save button
    Then user verifies if the changes is succesfull
