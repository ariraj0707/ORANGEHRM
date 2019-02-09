package com.FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateFacebookURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		WebDriver driver_Firefox = null;
		driver_Firefox = new FirefoxDriver();
		
		String fburl="http:\\facebook.com";
		driver_Firefox.get(fburl);
		
		String expected_url = "facebook.com";
		System.out.println("expected url of Facebook home : "+expected_url);
		
		String actual_url = driver_Firefox.getCurrentUrl();
		System.out.println("actual url of facebook home : "+actual_url);
		
		if(actual_url.contains(expected_url)) 
		{
			System.out.println("succesfully navigate to Facebook --pass");
			
		}
		else
		{
			System.out.println("not Succesfully navigate to Facebook --fail");
		}
		
	}

}
