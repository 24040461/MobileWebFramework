Feature: Test reddit options
  Scenario: getting to trello
    Given I am on trello page
    When user sees boards
    Then user clicks board

#  Scenario: checking default print orientation is portrait
#    Given notepad is open2
#    When user clicks on print
#    And user clicks on preferences
#    Then default print orientation is "Portrait"


