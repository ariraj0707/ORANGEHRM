package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		String newtoursurl="http:\\newtours.demoaut.com";
		driver_Firefox.get(newtoursurl);
		
		driver_Firefox.findElement(By.linkText("REGISTER"));
		
		System.out.println(driver_Firefox.getTitle());
		System.out.println(driver_Firefox.getCurrentUrl());
		driver_Firefox.quit();
	
	}

}
