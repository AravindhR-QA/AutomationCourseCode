package Facebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Testcase_1 extends LaunchandQuit
{
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException
	{
		exceldata();
		WebElement Uname =driver.findElement(By.id("email"));
		Uname.sendKeys(Username);
		WebElement Pass =driver.findElement(By.id("pass"));
		Pass.sendKeys(Password);
		WebElement Login =driver.findElement(By.xpath("//button[@name='login']"));
		Login.click();
	}
	
}
