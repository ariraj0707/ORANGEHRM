package com.FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCurrentUrlofApplications {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		WebDriver driver_Firefox = new FirefoxDriver();
		
		String ut_URL= "http:\\youtube.com";
		driver_Firefox.get(ut_URL);
		
		String actual_url_ut=driver_Firefox.getCurrentUrl();
		System.out.println("the Current URL of Facebook :"+actual_url_ut);
		
		driver_Firefox.close();
	}

}
