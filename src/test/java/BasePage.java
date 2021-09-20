
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import java.io.IOException;

public class BasePage {
    public AndroidDriver driver = AppLaunch.getInstance().driver;
    public BasePage() throws IOException, InterruptedException {
    }

  @AfterTest
    public void stop(){
        driver.quit();
  }
}
