package selenium_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	//driver.findElement(By.linkText("Mobiles")).click();	
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	driver.quit();
	}

}
