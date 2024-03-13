package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Fileupload {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fileupload= driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.sendKeys("C:\\Users\\aravi\\Desktop\\Hey.pdf");

	}

}
