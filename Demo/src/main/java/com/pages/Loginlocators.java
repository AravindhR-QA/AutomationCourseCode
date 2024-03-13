/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 */
public class Loginlocators {
	WebDriver driver;
	By ologin = By.xpath("//button[contains(text(),'Login')]");

	public void Loginlocators(WebDriver driver) {
		this.driver = driver;

	}

	public void signbtn() {
		driver.findElement(ologin).click();
	}
}
