package com.OrangHRM_Validation_Framwork;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn_Functionality_Validation {
	
	WebDriver driver_hrm = null;
	String url = "http://localhost/orangehrm/orangehrm-2.6/login.php";
	
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver_hrm = new ChromeDriver();
		driver_hrm.get(url);
		driver_hrm.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_hrm.manage().window().maximize();
		
	}
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\src\\com\\Hrm_Test_Input_Files\\login_Validation_Input.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		for (int i=1;i<=rowcount;i++)
		{
			Row r =sheet.getRow(i);
			//name="txtUserName"
			driver_hrm.findElement(By.name("txtUserName")).sendKeys(r.getCell(0).getStringCellValue());
			//txtPassword
			driver_hrm.findElement(By.name("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			//Submit
			driver_hrm.findElement(By.name("Submit")).click();
			
			String expected_Title = "OrangeHRM";
			System.out.println("The Expected Title is : "+expected_Title);
			String actual_title = driver_hrm.getTitle();
			System.out.println("The Actual Title is : "+actual_title);
			
			if(actual_title.equals(expected_Title))
			{
				System.out.println("login successfull --pass");
				r.createCell(2).setCellValue("login successfull --pass");
			}
			else
			{
				System.out.println("login unsuccessfull --fail");
				r.createCell(2).setCellValue("login unsuccessfull --fail");
				
			}
			
			FileOutputStream file2 =new FileOutputStream(".\\src\\com\\hrm_output_Files\\Login_validation_output1.xlsx");
			workbook.write(file2);
			driver_hrm.navigate().back();
			
			
		}
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver_hrm.quit();
	}
	
	
	

}
