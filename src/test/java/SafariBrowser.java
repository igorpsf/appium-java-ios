import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SafariBrowser {

    IOSDriver<IOSElement>driver;

    @Test
    public void brows() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://gmail.com");
        driver.findElementByName("Email").sendKeys("Igor");
        driver.findElementByName("Passwd").sendKeys("Igor");
        driver.findElementByName("signIn").click();

    }
}
