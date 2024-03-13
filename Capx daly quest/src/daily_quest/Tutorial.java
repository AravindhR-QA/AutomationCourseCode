package daily_quest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome", "D:\\Download's\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.capx.fi/");
		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		loginbtn.isDisplayed();
		loginbtn.click();
		WebElement enterusername = driver.findElement(By.xpath("//input[@id='email']"));
		enterusername.isDisplayed();
		enterusername.sendKeys("narutoshin3213@gmail.com");
		WebElement submit= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		submit.click();
		Thread.sleep(3000);
		WebElement enterpassword = driver.findElement(By.xpath("//input[@id='password']"));
		enterpassword.sendKeys("Nopassword@123");
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		Thread.sleep(5000);
		//WebElement maybenextime = driver.findElement(By.xpath("//span[normalize-space()='Maybe next time']"));
		//maybenextime.click();
		Thread.sleep(5000);
		WebElement dailystreak = driver.findElement(By.xpath("//button[@class='daily-claim-btn fixed flex items-center xl:right-32 lg:right-24 md:right-16 right-6 text-start']"));
		dailystreak.click();
		Thread.sleep(5000);
		WebElement markyourstrek = driver.findElement(By.xpath("//body//div[@id='headlessui-portal-root']//div//div//button[1]"));
		markyourstrek.click();
		Thread.sleep(5000);
		driver.quit();	
		
	}

}
