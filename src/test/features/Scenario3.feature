@wif
Feature: Add and delete new lists of items under the List

  Background: app get launched choose the
  #  Given  Once app got launched on the right side radiobutton to choose the preferable layout

  Scenario Outline: Create lists of items under the List and delete one item among them
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
                                          # 3 line menu bar or Navigation icon
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "<Lists>"
    Then  Add the items to list "<Items>" should be added to list and saved
  #  When  Checked the "Dairy" item to delete an item
   # And   User tapped on the Clean up list icon on the top menu bar
    #And   Tap on the "Shopping" option to delete the first one item
   # Then  The item should be deleted from the list

    Examples:
      | Lists     | Items                |
      | Sainsbury | Grocery:Fruit:Dairy  |
      | Tesco     | Grocery:Fruit:Dairy  |
      |           | Dairy:Milk:Chocolate |


  Scenario Outline: Adding new items list, sorting and validating the list of items
    Given User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen
    When  Tap on the "New list" option under the List header
    And   Enter name of new shopping list  name as "<List>"
    Then  Add the items to list "<Items>" should be added to list and saved
    And Select the "Settings" option
    When  User select the "Sort order" option
    And   Select "alphabetical" option
    And   Return to the "Home Screen" by tapping the "Back button" of mobile device
    And   Tap on the Hamburger menu icon on left hand side screen
    And   Tap on the "Iceland" list
    Then  The Items should be displayed in chosen sorting oder
    Examples:
      | List    | Items               |
      | Iceland | Grocery:Fruit:Dairy |



