package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsertesting {
static WebDriver driver;
public static void chromebrowser()
{
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.quit();
}
public static void Edgebrowser()
{
	driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.quit();
}
public static void Firefoxbrowser()
{
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.quit();
}
	public static void main(String[] args) 
	{
		chromebrowser();
		Edgebrowser();
		Firefoxbrowser();
	}

}
