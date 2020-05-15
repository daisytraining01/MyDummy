package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EriBank {

  private AndroidDriver driver;

  @Parameters({"platformname","platformversion","devicename",})
  @BeforeMethod
  public void setUp(String platformname,String  platformversion,String devicename) throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", platformname);
    desiredCapabilities.setCapability("platformVersion", platformversion);
    desiredCapabilities.setCapability("deviceName",devicename);
    desiredCapabilities.setCapability("udid", "db18013");
    desiredCapabilities.setCapability("appPackage", "com.experitest.ExperiBank");
    desiredCapabilities.setCapability("appActivity", ".LoginActivity");
    desiredCapabilities.setCapability("automationName", "UiAutomator1");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
    el1.sendKeys("company");
    MobileElement el2 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
    el2.sendKeys("company");
    MobileElement el3 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/phoneTextField");
    el5.sendKeys("7358307433");
    MobileElement el6 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/nameTextField");
    el6.sendKeys("parkavi");
    MobileElement el7 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/countryButton");
    el7.click();
    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]");
    el8.click();
    el8.click();
    el8.click();
    
    TouchAction touch = new TouchAction(driver);
    touch.press(PointOption.point(485,788)).moveTo(PointOption.point(485,788)).release().perform();
    
   /* (new TouchAction(driver))
      .press({x: 485, y: 788})
      .moveTo({x: 485: y: 788})
      .release()
      .perform()*/
    MobileElement el9 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/sendPaymentButton");
    el9.click();
    MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
    el10.click();
    MobileElement el11 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/logoutButton");
    el11.click();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
