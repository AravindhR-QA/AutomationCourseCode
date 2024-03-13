package amazon_testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Login amazon->search product->cart->CreditCard

public class Scenario3 extends LaunchandQuit
{
	@Test
	public void testcase3() throws InterruptedException
	{
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
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
		
	}
}
