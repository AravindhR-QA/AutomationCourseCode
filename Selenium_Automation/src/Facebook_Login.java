import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Login {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("aravindh1142@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nopass@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
