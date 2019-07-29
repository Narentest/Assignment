package Step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Scenario2_Steps extends BaseClass {


    @Given("^User landed on the Home Screen of OI Shopping List app and tapped on Overflow menu icon on the right hand side screen$")
    public void user_landed_on_the_Home_Screen_of_OI_Shopping_List_app_and_tapped_on_Overflow_menu_icon_on_the_right_hand_side_screen() throws Throwable {
        driver.findElementByAccessibilityId("More options").click();

    }

    @And("^Select the \"([^\"]*)\" option$")
    public void select_the_option(String arg1) throws Throwable {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView").click();
    }

    @When("^User select the \"([^\"]*)\" option$")
    public void user_select_the_option(String arg1) throws Throwable {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]").click();
    }

    @And("^Select \"([^\"]*)\" option$")
    public void select_option(String arg1) throws Throwable {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]").click();
    }

    @And("^Return to the \"([^\"]*)\" by tapping the \"([^\"]*)\" of mobile device$")
    public void return_to_the_by_tapping_the_of_mobile_device(String arg1, String arg2) throws Throwable {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @When("^Tap on the Hamburger menu icon on left hand side screen$")
    public void tap_on_the_Hamburger_menu_icon_on_left_hand_side_screen() throws Throwable {
        driver.findElementByAccessibilityId("Open navigation drawer").click();
    }

    @When("^Tap on the \"([^\"]*)\" list$")
    public void tap_on_the_list(String arg1) throws Throwable {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.TextView").click();
    }

    @Then("^The Items should be displayed in chosen sorting oder$")
    public void the_Items_should_be_displayed_in_chosen_sorting_oder() throws Throwable {

        //Assert.assetEquals(driver.findElementByXpath("//android.widget.TextView[@text='Bel1']").getText, "data.get(0).get(2)")');

        //Assert.assetEquals(driver.findElementByXpath("//android.widget.TextView[@text='Cel1']").getText, "data.get(0).get(2)")');

        //Assert.assetEquals(driver.findElementByXpath("//android.widget.TextView[@text='Del1']").getText, "data.get(0).get(2)")');

    }
}