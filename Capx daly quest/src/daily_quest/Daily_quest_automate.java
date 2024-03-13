package daily_quest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daily_quest_automate {
		
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome","D:\\Download's\\chrome-win64");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://app.capx.fi/explore");
			driver.manage().window().maximize();

			WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", loginBtn);

			WebElement loginPageLoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));

			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", loginPageLoginBtn);

			driver.findElement(By.id("email")).sendKeys("aravindh694@gmail.com");

			WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

			JavascriptExecutor jsub = (JavascriptExecutor) driver;
			jsub.executeScript("arguments[0].click();", submitBtn);
			System.out.println("Start");

			Thread.sleep(4000);

			driver.findElement(By.id("password")).sendKeys("Nopassword@123");

			System.out.println("End");
			WebElement finalLoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

			JavascriptExecutor jlog = (JavascriptExecutor) driver;
			jlog.executeScript("arguments[0].click();", finalLoginBtn);
			
			Thread.sleep(10000);

			WebElement claimYourDailyStreak = driver.findElement(By.xpath("//*[contains(text(),'Claim your')]"));

			JavascriptExecutor streak = (JavascriptExecutor) driver;
			streak.executeScript("arguments[0].click();", claimYourDailyStreak);

		}
}