package selenium_assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

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
		
		/*
		WebElement getittommorw= driver.findElement(By.xpath("//li[@aria-label='Get It by Tomorrow']//i[@class='a-icon a-icon-checkbox']"));
		getittommorw.click();                                 
		Boolean select= getittommorw.isSelected();
		System.out.println(select);
		getittommorw.click();
		*/
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.linkText("Memory Foam Men's Shoes for Walking Gym Training,Casual, Sports,Slip-On,Lightweight Comfortable Lace up Athletics Slipon Sneaker Moccasins for Gent's and Boy's ART-2001")).click();
		WebElement shoe= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		shoe.click();
		Set<String> selectshoe =driver.getWindowHandles();
		Iterator<String>a=selectshoe.iterator();
		String b= a.next();
		String c=a.next();
		driver.switchTo().window(c);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("aravindh694@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Nopassword@123");
		driver.findElement(By.xpath("(//input[@id='signInSubmit'])[1]")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();
		
		//driver.close();
		
	}

}
