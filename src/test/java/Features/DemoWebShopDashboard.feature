
  Feature: Dashboard page funct
    Scenario: Verify that user is able to see registration option in the dashboard page.
      Given  User navigate to the demoweb shop
      Then Verify that register option is displayed
      When User clicks on the register button, registration page displayed

    Scenario: Verify that user is able to see login option in the dashboard page.
        Given  User navigate to the demoweb shop
        Then Verify that login option is displayed
        When User clicks on the login button, login page displayed

    Scenario Outline: Verify that the user is able register
      Given  User navigate to the demoweb shop
      Then User clicks on the registration option
      And User select the gender "<gender>"
      And User enters the first name, last name, and email "<firstname>","<lastname>","<email>"
      And User enters the password and confirm password
      And User clicks on register button
      Then Verify that success message "Registration completed" is displayed

Examples:
      |TestName                 |gender|firstname|lastname|email      |password |
      | Register functionality  | Male |Pavan    |  Kumar |test@gmail |test@123#|







