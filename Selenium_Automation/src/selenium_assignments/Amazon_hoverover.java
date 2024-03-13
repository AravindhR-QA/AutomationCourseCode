package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hoverover {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountslist=	driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountslist).perform();
		
	}

}
