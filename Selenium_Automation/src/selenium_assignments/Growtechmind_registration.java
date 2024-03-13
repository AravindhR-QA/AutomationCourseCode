package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechmind_registration {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.name("your-name")).sendKeys("Aravindh");
		driver.findElement(By.id("2")).sendKeys("Hello");
		driver.findElement(By.name("Password")).sendKeys("Nopassword");
		driver.findElement(By.name("text-397")).sendKeys("AravindhR");
		driver.findElement(By.name("text-398")).sendKeys("R");
		driver.findElement(By.name("radio-45")).click();
		driver.findElement(By.name("checkbox-833[]")).click();
		
		
		
	}

}
