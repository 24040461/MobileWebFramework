package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class mainNotepadElements {
    AndroidDriver driver;

    public commonElement save;


    public mainNotepadElements(AndroidDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        save = new commonElement(MobileBy.AccessibilityId("3"),driver);
    }
}
