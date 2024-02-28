Feature: car page

  @sanity @regression
  Scenario: Displays the car names and price
    Given User navigates to the main homepage
    When User clicks the used cars and selects Chennai
    And User navigates to the popular brand and selects maruthi 800
    And User displays the car name and car prices
    And User unselects maruti 800 and clicks maruthi dzire and displays the car name and car prices
    Then User Displays the car names and price for all popular brands
