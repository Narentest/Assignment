package Step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Scenario2_Steps extends BaseClass {

    @When("^User landed on the Home Screen of OI Shopping List app and tapped on Overflow menu icon on the right hand side screen$")
    public void user_landed_on_the_Home_Screen_of_OI_Shopping_List_app_and_tapped_on_Overflow_menu_icon_on_the_right_hand_side_screen() throws Throwable {

        if (driver == null) {
            super.setup();
            driver = super.getDriver();
        }
        driver.findElementByAccessibilityId("More options").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Select the \"([^\"]*)\" option$")
    public void select_the_option(String arg1) throws Throwable {
        driver.findElementByXPath("//android.widget.TextView[@text = 'Settings']").click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^User select the \"([^\"]*)\" option$")
    public void user_select_the_option(String arg1) throws Throwable {
        driver.findElementByXPath("//android.widget.TextView[@text = 'Sort order']").click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Select \"([^\"]*)\" option$")
    public void select_option(String arg1) throws Throwable {
        driver.findElementByXPath("//android.widget.CheckedTextView[@text = 'alphabetical']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @And("^Return to the \"([^\"]*)\" by tapping the \"([^\"]*)\" of mobile device$")
    public void return_to_the_by_tapping_the_of_mobile_device(String arg1, String arg2) throws Throwable {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Tap on the Hamburger menu icon on left hand side screen$")
    public void tap_on_the_Hamburger_menu_icon_on_left_hand_side_screen() throws Throwable {
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Tap on the \"([^\"]*)\" list$")
    public void tap_on_the_list(String arg1) throws Throwable {
        driver.findElementByXPath("android.widget.TextView[@text = 'Iceland']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^The Items should be displayed in chosen sorting oder$")
    public void the_Items_should_be_displayed_in_chosen_sorting_oder() throws Throwable {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text = 'Laptop']");
        Assert.assertEquals(el1.getText(), "LapTop");
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text ='Mobile']");
        Assert.assertEquals(el2.getText(), "Mobile");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.Need to verify .TextView[@text ='Watch']");
        Assert.assertEquals(el3.getText(), "Watch");
    }

}

