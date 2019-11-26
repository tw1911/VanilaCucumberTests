@createList @Enabled
Feature: Creating list inside board

  Scenario: user creates two lists
    Given user open trello page
    Then user login with name "mail@mail.com" and password "password"
    And he creates new board
    Then he sees create list dialog
    When he create list with name "list 1"
    Then checks list with name "list 1" existence
    When he create list with name "list 2"
    Then checks list with name "list 2" existence
    Then user closes browser