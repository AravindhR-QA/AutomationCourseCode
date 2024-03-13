package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.linkText("Men's Casual Shirts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[3]")).click();
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		//WebElement searchtext = driver.findElement(By.name("q"));
		//searchtext.sendKeys("shoe");
		//driver.findElement(By.className("oleBil")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("shoe");
		//driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoe");
		driver.findElement(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//form[@autocomplete='on']//input[@type='text']")).sendKeys("9841265700");
		driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();*/
	
	}

}
