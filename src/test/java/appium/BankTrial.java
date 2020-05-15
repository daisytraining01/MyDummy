package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BankTrial {

  private AndroidDriver driver;
  
  @BeforeSuite
  public void beforeSuiteMethod() {
	  System.out.println("Before Suite method");
  }
  
  @BeforeTest
  public void beforeTestMethod() {
	  System.out.println("Before Test Method");
  }
  
  @BeforeClass
  public void beforeClassMethod() {
	  System.out.println("Before Class Method");
  }

  @Parameters({"testname","accesskey","devicequery"})
  @BeforeMethod
  public void setUp(String testname,String accesskey,String devicequery) throws MalformedURLException {
	    
//	  String accessKey="eyJ4cC51Ijo0NTU2OTcsInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yTnprMU1EQXlNdyIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3Mjc5NTAsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.9PEKvslTXNVQjibm_oLIBni8iknsIwo1etQfjBMQ8ME";
	 
	  DesiredCapabilities dc = new DesiredCapabilities();	   
	  dc.setCapability("testName", testname);
      dc.setCapability("accessKey", accesskey);
      dc.setCapability("deviceQuery", devicequery);
//    dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
      driver = new AndroidDriver(new URL("https://demo.experitest.com/wd/hub"), dc);
  
	
  }

  @Test
  public void sampleTest() {
    MobileElement el2 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
    el2.sendKeys("company");
    MobileElement el3 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
    el3.sendKeys("company");
    MobileElement el4 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/phoneTextField");
    el6.sendKeys("123434");
    MobileElement el7 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/nameTextField");
    el7.sendKeys("kavi");
    
    TouchAction touch = new TouchAction(driver);
    touch.press(PointOption.point(481,788)).moveTo(PointOption.point(470,795)).release().perform();
    
    MobileElement el8 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/countryButton");
    el8.click();
   
    TouchAction touch1 = new TouchAction(driver);
    touch1.press(PointOption.point(721,1905)).moveTo(PointOption.point(766,1380)).release().perform();
    
 
    MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[10]");
    el10.click();
    MobileElement el11 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/sendPaymentButton");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementById("android:id/button1");
    el12.click();
    MobileElement el13 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/logoutButton");
    el13.click();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
   }
  
  @AfterClass
  public void afterClassMethod() {
	  System.out.println("After Class method");
  }
  
  @AfterTest
  public void afterTestMethod() {
	  System.out.println("After Test method");
  }
  
  @AfterSuite
  public void afterSuiteMethod() {
	  System.out.println("After Suite method");
  }
}
