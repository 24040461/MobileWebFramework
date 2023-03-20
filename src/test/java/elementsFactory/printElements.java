package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class printElements {
    AndroidDriver driver;

    public commonElement skipBtn;
    public commonElement userIcon;



    public printElements(AndroidDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        skipBtn = new commonElement(By.xpath("//android.widget.TextView[@text='Skip']"),driver);
        userIcon = new commonElement(By.id("com.reddit.frontpage:id/nav_icon"),driver);
//        landscape = new winiumElement(MobileBy.AccessibilityId("2"),driver);
    }
}
