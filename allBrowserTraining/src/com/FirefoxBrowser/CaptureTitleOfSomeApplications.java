package com.FirefoxBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTitleOfSomeApplications {

	public static void main(String[] args) {
		
		//System.getProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_fire = new FirefoxDriver();
		
		String bingURL= "http:\\bing.com";
		String instaUrl="http:\\instagran.com";
		
		driver_fire.get(instaUrl);
		String actual_Title_Insta = driver_fire.getTitle();
		System.out.println("ActualTitle Of Instagram : "+actual_Title_Insta);
		
		driver_fire.get(bingURL);
		String actual_Title_Bing = driver_fire.getTitle();
		System.out.println("ActualTitle of Bing : "+actual_Title_Bing);
		
		driver_fire.quit();
		
	}

}
