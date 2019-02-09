package com.FirefoxBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunh {

	public static void main(String[] args) {
		
		//System.getProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\webdrivers\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver fire_driver = new FirefoxDriver();
		fire_driver.quit();

	}

}
