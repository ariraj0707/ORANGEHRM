package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\webdrivers\\geckodriver.exe");
		
		WebDriver driver = null;
		driver = new FirefoxDriver();
	}

}
