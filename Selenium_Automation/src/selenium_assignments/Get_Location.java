package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement find= driver.findElement(By.linkText("Canada"));
		Point a1= find.getLocation();
		int xaxis= a1.getX();
		int yaxis=a1.getY();
		System.out.println("X-Axis="  +xaxis);
		System.out.println("Y-Axis="  +yaxis);
		Thread.sleep(3000);
		driver.close();
		
	}

}
