Feature: Test

  Scenario Outline: Google search for animals
    Given User is on google page
    When User types for "animal"
    Then The system browses for the animal
    Example:
    |animal|
    |cat|
    |dog|

	