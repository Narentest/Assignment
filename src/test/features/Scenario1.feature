Feature: Add and delete new lists of items under the List

  #Background: app get launched choose the
  #Given  Once app got launched on the right side radiobutton to choose the preferable layout


  Scenario Outline: Create 1st list of items under the List
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
                                          # 3 line menu bar or Navigation icon
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Sainsbury"
    Then  Add the items to list "<Items>" should be added to list and saved
    Examples:
      | Items |
      | Apple |
      | Fruit |
      | Dairy |


  Scenario Outline: Create 2nd list of items under the List
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Tesco"
    Then Add the items to list "<Items>" should be added to list and saved
    Examples:
      | Items   |
      | Grocery |
      | Fruit   |
      | Dairy   |

  Scenario Outline: Delete an item from the list
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Delete"
    And Add the items to list "<Items>" should be added to list and saved
    And  Select "Del1" from the list
    Then  Click on the Cleanup option and the Item should be deleted from the list
    Examples:
      | Items |
      | Del1  |
      | Cel2  |
      | Bel3  |




