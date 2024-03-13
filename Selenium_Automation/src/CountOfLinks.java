
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountOfLinks {
	@Test
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement links=driver.findElement(By.tagName("a"));
		Dimension count=links.getSize();
		System.out.println(count);
	}
}
