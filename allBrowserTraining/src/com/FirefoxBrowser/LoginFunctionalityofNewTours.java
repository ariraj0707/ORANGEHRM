package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionalityofNewTours {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox =new FirefoxDriver();
		
		String newtoursurl="http:\\newtours.demoaut.com";
		driver_Firefox.get(newtoursurl);
		
		//<input type="text" name="userName" size="10">
		
		driver_Firefox.findElement(By.name("userName")).sendKeys("tutorial");
		
		//<input type="password" name="password" size="10">
		
		driver_Firefox.findElement(By.name("password")).sendKeys("tutorial");
		
		//<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		
		driver_Firefox.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		System.out.println("The Expected Title : "+expected_Title);
		
		String actual_Title=driver_Firefox.getTitle();
		System.out.println("The Actual Title : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("login succesfull ---pass");
		}
		else
		{
			System.out.println("login unsuccesfull  --fail");
			
		}
		driver_Firefox.quit();
	}

}
