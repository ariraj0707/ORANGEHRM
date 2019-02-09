package com.FirefoxBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigateToApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver fire_driver = new FirefoxDriver();
		String facebookurl = "http:\\facebook.com";
		String googleURL= "http://google.com";
		fire_driver.get(googleURL);
		fire_driver.navigate().to(facebookurl);

	}

}
