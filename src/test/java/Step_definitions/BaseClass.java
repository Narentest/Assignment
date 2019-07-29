package Step_definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;


public class BaseClass {


    AndroidDriver driver;
    // public AndroidDriver driver;

    @Before
    public void setup() {
        try {


            File f = new File("src/test/java/utils");
            File fs = new File(f, "org.openintents.shopping_100213.apk");


            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_271");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.openintents.shopping");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.openintents.shopping.ShoppingActivity");


            //AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            // AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } catch (Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is :" + exp.getMessage());
            exp.printStackTrace();

        }
    }

    @Test
    public void test() {

        driver.findElementById("org.openintents.shopping:id/layout_choice_bottom").click();

    }

    @After
    public void teardown() {
        driver.closeApp();
    }

    public AndroidDriver getDriver() {
        return driver;
    }


}


