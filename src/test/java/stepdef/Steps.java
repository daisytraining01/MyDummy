package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("User is able to launch the application")
	public void user_is_able_to_launch_the_application() {
		  System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");			
			
		    driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    }

	@When("User provides the neccessary details")
	public void user_provides_the_neccessary_details() throws InterruptedException {
		
			
		WebElement firstname=driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("SeleniumTestUser");
		
		WebElement lastname=driver.findElement(By.name("lastName"));
				
		lastname.sendKeys("Terrain");
		
		WebElement phone=driver.findElement(By.name("phone"));
				
		phone.sendKeys("3456789325");
		
		WebElement email=driver.findElement(By.name("userName"));
		
		email.sendKeys("demo@gmail.com");
		
		WebElement address=driver.findElement(By.name("address1"));
		
		address.sendKeys("saravana stores");
		
		WebElement city=driver.findElement(By.name("city"));
		
		city.sendKeys("chennai");
		
		WebElement state=driver.findElement(By.name("state"));
		
		state.sendKeys("tamilnadu");
		
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		
		postalcode.sendKeys("600001");
		
		 Select country=new Select(driver.findElement(By.name("country")));
		   
		country.selectByValue("AUSTRALIA");
		
       WebElement userName=driver.findElement(By.name("email"));
		
       userName.sendKeys("TestUser1");		

       WebElement password=driver.findElement(By.name("password"));
		
       password.sendKeys("test@01");
		
       WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
		
       confirmPassword.sendKeys("test@01");
		
	    }

	@Then("User clicks submit button")
	public void user_clicks_submit_button() throws InterruptedException {
		
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 driver.close();
			
	  }

}
