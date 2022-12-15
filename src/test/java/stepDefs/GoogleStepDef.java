package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepDef {
	WebDriver driver;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	    WebElement searchBox = driver.findElement(By.className("gLFyf"));
	    searchBox.sendKeys("Java Tutorial");
	    searchBox.submit();
	}
	@Then("Should display Java Tutorial")
	public void should_display_java_tutorial() {
	   Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	   driver.quit();
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
	    WebElement searchBox = driver.findElement(By.className("gLFyf"));
	    searchBox.sendKeys("Selenium Tutorial");
	    searchBox.submit();
	}
	
	@Then("Should display Selenium Tutorial")
	public void should_display_selenium_tutorial() {
		   Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search--");
		   driver.quit();
	}


}
