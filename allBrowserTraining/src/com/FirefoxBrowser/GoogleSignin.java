package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSignin {

	public static void main(String[] args) {

		//<a class="gb_We gb_Ba gb_Ub" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/" target="_top">Sign in</a>		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox =new FirefoxDriver();
		
		String googleurl="http:\\google.com";
		driver_Firefox.get(googleurl);
		
		//driver_Firefox.findElement(By.partialLinkText("Sign")).click();
		//driver_Firefox.findElement(By.id("gb_70")).click();
		//driver_Firefox.findElement(By.linkText("Sign in")).click();
		WebElement signin=driver_Firefox.findElement(By.partialLinkText("Sign"));
		signin.click();
		
		System.out.println(driver_Firefox.getTitle());
		System.out.println(driver_Firefox.getCurrentUrl());
		driver_Firefox.quit();
	
	}

}
