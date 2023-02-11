Feature: BellyFeature

  Scenario: eaten many cukes
    Given I have eaten 42 cukes
    When I wait 2 hour
    Then my Belly should growl

  Scenario: eaten not much and not waited
    Given I have eaten 9 cukes
    When I wait 1 hour
    Then my Belly should not growl

  Scenario: eaten normal amount of cukes
    Given I have eaten 2 cukes
    When I wait 3 hour
    Then my Belly should not growl

  Scenario: eaten too many cukes
    Given I have eaten 4200 cukes
    When I wait 2 hour
    Then my Belly should growl

  Scenario: eaten no cukes
    Given I have eaten 0 cukes
    When I wait 2 hour
    Then my Belly should not growl

  Scenario: eaten cukes but not waited
    Given I have eaten 50 cukes
    When I wait 0 hour
    Then my Belly should not growl

  Scenario: eaten 10 cukes
    Given I have eaten 10 cukes
    When I wait 2 hour
    Then my Belly should not growl

