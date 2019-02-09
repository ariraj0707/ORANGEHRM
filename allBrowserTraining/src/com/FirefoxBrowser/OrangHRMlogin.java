package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangHRMlogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String orangurl = "https://opensource-demo.orangehrmlive.com";
		
		driver_Firefox.get(orangurl);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		driver_Firefox.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		driver_Firefox.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver_Firefox.findElement(By.id("btnLogin")).click();
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String expected_Text = "Welcom Admin";
		System.out.println("expected text :"+expected_Text);
		
		String login_Text=driver_Firefox.findElement(By.id("welcome")).getText();
		System.out.println("actual text : "+login_Text);
		
		if(login_Text.contains(expected_Text))
		{
			System.out.println("succesfully login");
			
		}
		else
		{
			System.out.println("login unsuccesfull");
		}
		driver_Firefox.close();
	}

}
