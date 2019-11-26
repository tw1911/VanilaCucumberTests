@createList
Feature: Creating list inside board

  Scenario: user creates list with invalid(very long, over 512) name
    Given user open trello page
    Then user login with name "mail@mail.com" and password "password"
    And he creates new board
    Then he sees create list dialog
    When he create list with name ""