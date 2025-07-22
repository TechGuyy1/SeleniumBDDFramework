
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
      Then User clicks on the register button, registration page displayed
      And User select the gender and enters the first name, last name, email, password and confirm password "<firstname>","<lastname>","<email>" "<password>" "<confirmPass>"
      And User clicks on register button
      And Verify success message for registration

Examples:
      |setRegistrationPage                 |firstname|lastname|email                     |password | confirmPass
      |Register functionality              |Kiran    |  Sutar |kiranrsutar8347@gmail.com |test@123 | test@123







