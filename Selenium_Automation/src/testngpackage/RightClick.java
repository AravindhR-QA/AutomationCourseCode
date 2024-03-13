package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class RightClick 
{
	public void rclick() throws AWTException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mob= driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.contextClick(mob).perform();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
		
}
}
