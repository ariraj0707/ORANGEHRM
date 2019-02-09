package com.run;

import org.openqa.selenium.edge.EdgeDriver;

public class CaptureTitle_Bing {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http:\\bing.com");
		String actual_Title =driver.getTitle();
		System.out.println("title of the current page is: "+actual_Title);
		
		driver.quit();
	}

}
