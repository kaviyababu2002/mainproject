Feature: Bike Page

  @sanity @regression
  Scenario: Displays the bikes name and price with in 4 lakhs
    Given User navigates to the homepage
    When User clicks on to the upcoming bikes
    And User clicks on to the Honda in manufacturers
    And User scroll to bottom and clicks on to the view more bikes and scroll back up
    Then User displays the bikes name and price with in 4 lakhs
