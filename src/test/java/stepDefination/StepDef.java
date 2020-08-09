package stepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver; 
	@Given("^Flipkart website is loaded\\.$")
	public void flipkart_website_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	   
	}

	@When("^user enters UserName and Password and login$")
	public void user_enters_UserName_and_Password() throws Throwable {
		
		driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("Anushka");
		
		driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
	}
	
	

	@Then("^Login should be successful and verify the error message$")
	public void login_should_be_successful_and_verify_the_error_message() throws Throwable {
		assertEquals("Please enter valid email/mobile number" , driver.findElement(By.xpath("//span[2]/span")).getText());
	   
	}



}
