package com.OrangeHRM_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKeyWord 
{
	WebDriver driver_h =null;

	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver_h= new ChromeDriver();
		
	}
	
	public void navigate()
	{
		driver_h.get("http://localhost/orangehrm/orangehrm-2.6/login.php");
		driver_h.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_h.manage().window().maximize();
	}
	
	public void enterUserName()
	{
		driver_h.findElement(By.name("txtUserName")).sendKeys("admin");
	}
	
	public void enterPassWord()
	{
		driver_h.findElement(By.name("txtPassword")).sendKeys("admin");
	}
	public void clickLogin()
	{
		
		
		driver_h.findElement(By.name("Submit")).click();
		String expected_Text = "Welcom admin";
		System.out.println("Expected Text : "+expected_Text);
		
		String actual_Text =driver_h.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		System.out.println("ActualText : "+actual_Text);
		
		if(actual_Text.equals(expected_Text))
		{
			System.out.println("Login Seccesfull --Pass");
		}
		else
		{
			System.out.println("Login Unsuccesfull --Fail");
		}
	}
}
