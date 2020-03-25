import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Practise {

    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {
        IOSDriver<IOSElement>driver;
        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST); // After version 10.2
        d.setCapability(MobileCapabilityType.APP, "/Users/igor/Library/Developer/Xcode/DerivedData/UICatalog-fsluztwozomaqngcoqlcoidvxxzn/Build/Products/Debug-iphonesimulator/UICatalog.app");

        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), d);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
