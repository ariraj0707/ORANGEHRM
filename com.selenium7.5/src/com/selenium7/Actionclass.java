package com.selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions e = new Actions(driver);
		
		WebElement move =driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2"));

		e.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pendrive").doubleClick().build().perform();
		
		
		e.moveToElement(move).contextClick().build().perform();
	}
}
