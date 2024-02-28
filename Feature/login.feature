Feature: login page

  @sanity @regression
  Scenario: Capture the error message when invalid mail is entered
    Given User navigate to the homepage again
    Then User clicks the login and clicks the google and enters the mail id and capture error message
