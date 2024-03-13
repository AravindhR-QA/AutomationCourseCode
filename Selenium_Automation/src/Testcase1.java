import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listners.class)
public class Testcase1 
{
	@Test
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.cssSelector("textarea.gLFyf"));
		searchbar.sendKeys("India");
		searchbar.sendKeys(Keys.ENTER);
		
	}
}
