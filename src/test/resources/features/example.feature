Feature: Test

  Scenario Outline: Google search for animals
    Given User is on google page
    When User types for <animal>
    And User clicks on "Google Search" button
    Then The system browses for the animal

    Examples: 
      | animal |
      | cat    |
      | dog    |
