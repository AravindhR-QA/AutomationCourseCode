package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlPage_automate_using_Abxpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aravi/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("Aravindh");
		driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("Nopassword");
		driver.findElement(By.xpath("((html/body/form)[1]/input)[1]")).sendKeys("Aravindh");
		//driver.findElement(By.xpath("((html/body/form)[1]/input)[3]")).click();  //submit button
		driver.findElement(By.xpath("((html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((html/body/form)[2]/input)[3]")).click();
		//driver.findElement(By.xpath("((html/body/form)[2]/input)[4]")).click();  //submit button
		driver.findElement(By.xpath("(html/body/input)[4]")).click();
		driver.findElement(By.xpath("(html/body/input)[6]")).click();
		driver.findElement(By.xpath("(html/body/select/option)[1]")).click();
		//driver.findElement(By.xpath("(html/body/input)[7]")).click();  //signup buton
		
		
		
	}

}
