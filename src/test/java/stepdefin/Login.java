package stepdefin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Login {
	WebDriver driver;
	@Given("user must be on homepage clicking url {string}")
	public void  user_must_be_on_homepage_clicking_url (String url) {
		System.setProperty("webdriver.geckodriver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
	
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.id("username")).sendKeys(username);
	    Thread.sleep(5000);
	    driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Signin button")
	public void click_on_signin_button() {
	   driver.findElement(By.id("log-in")).click();       
	}

	
	@Then("User must be navigate on his or her account")
	 public void user_must_be_navigate_on_his_or_her_account() {
		String actualresult=  driver.getCurrentUrl();
		Assert.assertEquals("https://demo.applitools.com/app.html",actualresult );
	  }
		 
	 


}
