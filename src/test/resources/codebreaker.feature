Feature: Play the code breaker

Scenario: Start the game
    Given a mistery number 4567
    When we start the game
    Then the game must be initialized