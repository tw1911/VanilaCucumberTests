@createList @Enabled
Feature: Creating list inside board

  Scenario: user creates list inside board with maximum length name
    Given user open trello page
    Then user login with name "mail@mail.com" and password "password"
    And he creates new board
    Then he sees create list dialog
    When he create list with random name with length 512 and store in's name
    Then he checks that the list has been created
    Then user closes browser