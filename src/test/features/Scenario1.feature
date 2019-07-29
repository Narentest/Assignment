Feature: Add and delete new lists of items under the List

  Scenario Outline: Create 1st list of items under the List
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
                                          # 3 line menu bar or Navigation icon
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "Sainsbury"
    Then  Add the items to list "<Items>" should be added to list and saved
    Examples:
      | Items   |
      | Grocery |
      | Fruit   |
      | Dairy   |


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
    When Add the items to list "<Items>" should be added to list and saved
    And  Select "Del1" from the list
    And  Click on the Cleanup option
    Then The Item should be deleted from the list
    Examples:
      | Items |
      | Del1  |
      | Del2  |
      | Del3  |




