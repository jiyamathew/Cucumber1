package stepdefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remeber {
	WebDriver driver;
	@Given("User must be on homepage by clicking url  {string}")
	public void user_must_be_on_homepage_by_clicking_url(String url) {
		System.setProperty("webdriver.geckodriver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
	}

	@When("User clicks on Remember me Checkbox")
	public void user_clicks_on_remember_me_checkbox() {
	    driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label")).click();
	}

	@Then("Remember me checkbox must get selected")
	public void remember_me_checkbox_must_get_selected() {
	boolean a=	driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label")).isSelected();
	System.out.println(a);
	}


}
