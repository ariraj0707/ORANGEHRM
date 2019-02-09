package com.run;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("hhtp:\\facebook.com");
	}

}
