package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaginFunctionalityofNewTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		String url = "http:\\newtours.demoaut.com";
		
		driver.get(url);
		
		//<input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		//<input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">

		driver.findElement(By.name("login")).click();
		
		//String expected_Title = "find";
		//System.out.println("the expected Title is : "+expected_Title);
		
		String actual_Title = driver.getTitle();
		System.out.println("the Actual_Title is : "+actual_Title);
		String expected_Title = "find";
		System.out.println("the expected Title is : "+expected_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("login succesfully Pass");
			
		}
		else
		{
			System.out.println("login unsuccesfulll Fail");
		}
	}

}
