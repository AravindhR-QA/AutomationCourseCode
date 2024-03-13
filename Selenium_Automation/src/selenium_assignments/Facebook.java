package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("hellos@gmail.com");
	//	driver.findElement(By.id("email")).sendKeys("helloworld@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Nopassword");
		driver.findElement(By.name("login")).click();
	}

}
