Feature: Search by keyword

  Scenario: Searching for a term
    Given User is on Ebay home page
    When he searches for "Pilas"
    Then the amount of results is displayed
