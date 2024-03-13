package selenium_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Jspopup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
