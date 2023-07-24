package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdef {
	WebDriver driver;
	
	@Given("User launch google page")
	public void user_launch_google_page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    
	}
	@When("User search Java tutorial")
	public void user_search_java_tutorial() {
		
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
	    
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		AssertJUnit.assertEquals(driver.getTitle() , "Java Tutorial - Google Search");
	   
	}

}
