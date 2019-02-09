package com.run;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitleOfBingHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:\\bing.com");
		String actual_Title = driver.getTitle();
		
		String expected_Title = "sing";
		System.out.println("The Expected_Title is: "+expected_Title);
		System.out.println("The Actual_Title is: "+actual_Title);
		
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println("Title is matched----PASS");
			
		}
		else{
		
			System.out.println("Title is not matched-----FAIL");
		}
	}

}
