package daily_quest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questautomate {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome","D:\\Download's\\chromedriver_win32");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://internal.app.capx.fi/");
	WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
	loginbtn.isDisplayed();
	loginbtn.click();
	WebElement enterusername = driver.findElement(By.xpath("//input[@id='email']"));
	enterusername.isDisplayed();
	enterusername.sendKeys("aravindh694@gmail.com");
	WebElement submit= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
	submit.click();
	Thread.sleep(5000);
	WebElement enterpassword = driver.findElement(By.xpath("//input[@id='password']"));
	enterpassword.sendKeys("Nopassword@123");
	WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	login.click();
	Thread.sleep(10000);
	driver.close();
	driver.quit();
	}
	}
	
	