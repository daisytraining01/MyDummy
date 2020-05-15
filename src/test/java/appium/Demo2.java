package appium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");			
	
	 driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	
	@Test
	public void search() throws AWTException, InterruptedException{	
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Yahoo");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	}
	
	@Test
	public void print() throws AWTException, InterruptedException{	
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("instagram");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
