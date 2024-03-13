package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled_handling {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aravi/Downloads/learningHTML1.html");
		WebElement Lname= driver.findElement(By.id("121"));
		Boolean L1=Lname.isDisplayed();
		System.out.println(L1);
		Boolean L= Lname.isEnabled();
		//System.out.println(L);
		if(L==true)
		{
			Lname.sendKeys("R");
		}
		else
		{
			System.out.println("The element is disabled");
		}
		try
		{
		Lname.sendKeys("R");//Element not interactable exception
		}
		catch(Exception e)
		{
		System.out.println("Element is Not Interactable");
		}
		WebElement select= driver.findElement(By.id("123"));
		Boolean s1= select.isSelected();
		System.out.println(s1);
		Thread.sleep(2000);
		driver.quit();
	}

}
