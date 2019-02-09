package com.mavenFirst;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Row;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4j
{
	public static Logger logger = Logger.getLogger("Log4j");
	WebDriver driver_hrm = null;
	String url = "http://localhost/orangehrm/orangehrm-2.6/login.php";
	
	
	
	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver_hrm = new ChromeDriver();
		logger.info("firefox browser woke");
		
		driver_hrm.get(url);
		logger.info("url launch");
		driver_hrm.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_hrm.manage().window().maximize();
		
	}
	
	@Test(priority=0)
	public void logIn() throws IOException

		
	
		{
			driver_hrm.findElement(By.name("txtUserName")).sendKeys("admin");
			logger.info("username entred");
			
			//txtPassword
			driver_hrm.findElement(By.name("txtPassword")).sendKeys("admin");
			//Submit
			driver_hrm.findElement(By.name("Submit")).click();
			
			String expected_Title = "OrangeHRM";
			System.out.println("The Expected Title is : "+expected_Title);
			String actual_title = driver_hrm.getTitle();
			System.out.println("The Actual Title is : "+actual_title);
			
			if(actual_title.equals(expected_Title))
			{
				System.out.println("login successfull --pass");
				
			}
			else
			{
				System.out.println("login unsuccessfull --fail");
			
				
				
			}
			
			
			driver_hrm.navigate().back();
		}	
		
		}
		

