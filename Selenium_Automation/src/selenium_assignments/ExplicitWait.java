package selenium_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		driver.quit();
		}

	}
