package testngpackage;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class DoubleClick 
{
	public void rclick() throws AWTException, InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mob= driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.doubleClick(mob).perform();
		
		
		
		
}
}
