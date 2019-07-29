Feature: Adding new items list, sorting and validating the list of items

  Scenario Outline: Create a list of items under the List
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Iceland"
    Then Add the items to list "<Items>" should be added to list and saved
    Examples:
      | Items   |
      | Grocery |
      | Fruit   |
      | Dairy   |


  Scenario: Sort the list and validate the sorting of the list items
    Given User landed on the Home Screen of OI Shopping List app and tapped on Overflow menu icon on the right hand side screen
    And   Select the "Settings" option
    When  User select the "Sort order" option
    And   Select "alphabetical" option
    And   Return to the "Home Screen" by tapping the "Back button" of mobile device
    And   Tap on the Hamburger menu icon on left hand side screen
    And   Tap on the "Iceland" list
    Then  The Items should be displayed in chosen sorting oder

