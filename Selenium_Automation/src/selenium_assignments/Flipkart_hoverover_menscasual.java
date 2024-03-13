package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverover_menscasual {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		WebElement fashion= driver.findElement(By.xpath("(//div[.='Fashion'])[2]")); 
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashion).perform();
		driver.findElement(By.linkText("Men's Casual Shirts")).click();
	}

}
