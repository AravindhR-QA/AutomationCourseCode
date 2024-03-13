import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowappSignup {
	 String apiKey = "rGXSZG0mFE5xvaRIb59lEfnokYewHUOq";
	 String serverId = "yfdddx8c";
	 String serverDomain = "yfdddx8c.mailosaur.net";
	 
	 public String getRandomEmail() {
		return "user" + System.currentTimeMillis() + "@" + serverDomain;
		 
	 }
	 @Test
	 public void testMailExample() {
		 String emailid= getRandomEmail();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://groww.in/login");
		 driver.findElement(By.id("login_email1")).sendKeys(emailid);
		 driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
		 
	 }
	 
	 
	 
	 
	 
}
