package com.run;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver f = new ChromeDriver();
		
		f.navigate().to("http:\\instagram.com");
		f.navigate().to("http:\\youtube.com");
	}

}
