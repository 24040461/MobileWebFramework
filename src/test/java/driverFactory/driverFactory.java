package driverFactory;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class driverFactory {

	private static AndroidDriver driver;


	public AndroidDriver setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:DeviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:Udid", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "UIAutomator2");
		desiredCapabilities.setCapability("browserName", "Chrome");
		desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\callu\\driver\\chromedriver.exe");
		desiredCapabilities.setCapability("chomeOptions", ImmutableMap.of("w3c", false));
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub/");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);

		return driver;
	}
		public static synchronized AndroidDriver getdriver() {
			return driver;
		}
}
//	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), desiredCapabilities);
//		desiredCapabilities.setCapability("platformName", "Android");
//				desiredCapabilities.setCapability("appium:DeviceName", "emulator-5554");
//				desiredCapabilities.setCapability("appium:Udid", "emulator-5554");
//				desiredCapabilities.setCapability("browser:name", "chrome");
//				desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\callu\\driver\\chromedriver.exe");
//				desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
//				desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
//				desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//				desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);