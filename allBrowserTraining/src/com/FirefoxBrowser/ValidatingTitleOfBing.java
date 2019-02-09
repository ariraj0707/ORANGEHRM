package com.FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitleOfBing {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		WebDriver driver_Firefox = null;
		driver_Firefox = new FirefoxDriver();
		
		String bingurl= "http:\\bing.com";
		driver_Firefox.get(bingurl);
		String expected_Title = "Bing";
		System.out.println("Expected Title of bing : "+expected_Title);
		String actual_Title = driver_Firefox.getTitle();
		System.out.println("Actual Title of Bing Home Page is : "+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("The Titles are Matched --- case passed");
		}
		else
		{
			System.out.println("the Titles are not Matched --- case Failed");
		}
		
		driver_Firefox.close();

	}

}
