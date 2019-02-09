package com.run;


import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureCurrentURL {

	public static void main(String[] args) {
		
		/*System.setProperty("webriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		//WebDriver driver = null;
		//driver= new FirefoxDriver();
		FirefoxDriver driver = new FirefoxDriver();*/
System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("http:\\facebook.com");
		driver.navigate().to("http:\\facebook.com");
		String actual_URL = driver.getCurrentUrl();
		String actual_Title = driver.getTitle();
		System.out.println("The Title of the Facebook Page is : "+actual_Title);
		System.out.println("The url of Facebook Home page is : "+actual_URL);
		driver.quit();
	}

}
