Feature: Property Manager and Resident Login

  Background: : Verify the login scenario for Property Manager and Resident Login
    Given User launches Chrome browser
    When User clicks on Signup button

    Scenario: Test Property Manager Login
    Then click on PropertyManagerLogin
    Then user provides username and password

  Scenario: Test Resident Login
    Then click on ResidentLogin
    Then user view Resident App and App Features


