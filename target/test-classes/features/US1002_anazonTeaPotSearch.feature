Feature: US 1002 Tea Pot Search
  Scenario: User will search for Tea Pot in Amazon


    Given user goes to anazon webpage
    Then  user searches for TeaPot in search box
    And   tests that result text contains TeaPot word
    Then  closes the page
