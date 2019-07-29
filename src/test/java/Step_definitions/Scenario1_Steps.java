package Step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.List;


public class Scenario1_Steps extends BaseClass {

 //driver.findElementById("org.openintents.shopping:id/layout_choice_bottom").click();
 // AndroidDriver driver =

 @Given("User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen")
 public void user_launched_the_OI_Shopping_List_app_and_tapped_on_Hamburger_menu_icon_on_left_hand_side_screen() throws
         Throwable {
  if (driver == null) {
   super.setup();
   driver = super.getDriver();
  }
  driver.findElement(By.id("org.openintents.shopping:id/layout_choice_bottom")).click();
  driver.findElementByAccessibilityId("Open navigation drawer").click();
 }


 @When("Tap on the \"([^\"]*)\" option under the List header")
 public void tap_on_the_option_under_the_List_header(String arg1) throws Throwable {

  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView").click();

 }

 @And("Enter name of new shopping list  name as \"([^\"]*)\"")
 public void enter_name_of_new_shopping_list_name_as(String arg1) throws Throwable {

  driver.findElementById("org.openintents.shopping:id/edittext").sendKeys(arg1);
  driver.findElementById("android:id/button1").click();
 }

 @Then("Add the items to list \"([^\"]*)\" should be added to list and saved")
 public void add_the_items_to_list_should_be_added_to_list_and_saved(DataTable Items) throws Throwable {

  List<List<String>> data = Items.raw();

  driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys(data.get(0).get(0));

  driver.findElementById("org.openintents.shopping:id/button_add_item").click();
  driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys(data.get(0).get(1));
  driver.findElementById("org.openintents.shopping:id/button_add_item").click();
  driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys(data.get(0).get(2));
  driver.findElementById("org.openintents.shopping:id/button_add_item").click();
 }

 @And("^Select \"([^\"]*)\" from the list$")
 public void select_from_the_list(String arg1) throws Throwable {
  driver.findElementById("org.openintents.shopping:id/button_add_item").click();

 }

 @And("^Click on the Cleanup option$")
 public void click_on_the_Cleanup_option() throws Throwable {
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.CheckBox").click();


 }

 @Then("^The Item should be deleted from the list$")
 public void the_Item_should_be_deleted_from_the_list() throws Throwable {
  driver.findElementByAccessibilityId("Clean up list").click();

 }


}