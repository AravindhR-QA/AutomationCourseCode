package Stepdefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.Loginlocators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class loginpagesteps {

	WebDriver driver;
	Loginlocators login = new Loginlocators();

	@Given("user navigate to website")
	public void user_navigate_to_website() {

		driver = new ChromeDriver();
		driver.get("https://internal.app.capx.fi/explore");
		driver.manage().window().maximize();

		login.signbtn();

	}

	@And("click on the login button")
	public void click_on_the_login_button() {

		String title = driver.getTitle();
		System.out.println(title);

	}

}
