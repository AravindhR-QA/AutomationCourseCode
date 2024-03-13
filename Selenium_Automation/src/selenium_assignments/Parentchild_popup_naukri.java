package selenium_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild_popup_naukri {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement signin= driver.findElement(By.xpath("//button[@name='google-register']"));
		signin.click();
		//System.out.println(driver.getWindowHandles());;
		//System.out.println(driver.getWindowHandle());;
		//String parent= driver.getWindowHandle();
		Set<String> parentAndChild = driver.getWindowHandles();//both parent and child window id
		System.out.println(parentAndChild);
		Iterator<String> a=	parentAndChild.iterator();
		String parentid= a.next();//parent id seperate
		String childid=	a.next();//child id seperate
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
	
	

}
