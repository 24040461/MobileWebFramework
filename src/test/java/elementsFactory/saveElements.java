package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class saveElements {
    AndroidDriver driver;

    public commonElement saveLabelExp;

    public saveElements(AndroidDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
//        cancelBtn = new winiumElement(By.name("Cancel"),driver);
        saveLabelExp = new commonElement(MobileBy.AccessibilityId("1001"),driver);
    }
}
