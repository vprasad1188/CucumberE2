package stepDefs;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStepDef {
	
	WebDriver driver;
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://the-internet.herokuapp.com/login");

	}
	@When("User enters login credentials")
	public void user_enters_login_credentials() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.cssSelector(".radius")).click();
	}
	
	@Then("Should display success page")
	public void should_display_success_page() {
	    boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	    Assert.assertTrue(isValid);
	    //assertTrue(isValid);
	    driver.close();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String user, String pwd) {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.cssSelector(".radius")).click();
	}
	
	@When("User enters login creds")
	public void user_enters_login_credentials(DataTable datatable) {
		List<List<String>> data = datatable.asLists();
		String user = data.get(0).get(0);
		String pwd = data.get(0).get(1);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.cssSelector(".radius")).click();
	}
	
	@When("User enters login creds map")
	public void user_enters_login_credentials_map(DataTable datatable) {
		List<Map<String,String>> data = datatable.asMaps();
		String user = data.get(0).get("username");
		String pwd = data.get(0).get("password");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.cssSelector(".radius")).click();
	}
	

	
	

}
