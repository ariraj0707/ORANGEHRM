package com.getIntValue_FromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursRegistration_Validation 
{

	WebDriver driver_c = null;
	String url = "http://newtours.demoaut.com/";
	
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver_c = new ChromeDriver();
		driver_c.get(url);
		driver_c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_c.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void navigateToRegister()
	{

		//<a href="mercuryregister.php?osCsid=2a20dbc9b76a0e598cd06db9c0c49c74">REGISTER</a>
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a
		
		
		driver_c.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void newToursRegisterFunction() throws IOException
	{
		
		FileInputStream newTours = new FileInputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\All_Input_Excel_Files\\NewTours_Input_File_Excel.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(newTours);
		XSSFSheet reg_sheet = Workbook.getSheet("Register");
		
		
		FileInputStream pro_File = new FileInputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\NewTours.properties");
		Properties pr =new Properties();
		pr.load(pro_File);
		
		int rowCount=reg_sheet.getLastRowNum();
		
		for(int j=1;j<=rowCount;j++)
		{
			Row r=reg_sheet.getRow(j);
			
			
			//<input maxlength="60" name="c" size="20">
			///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input
			//name="firstName"
			driver_c.findElement(By.name(pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
			
			double d=r.getCell(2).getNumericCellValue();
			long x=(long)d;
			String phoneNumber =Long.toString(x);
			
			driver_c.findElement(By.xpath(pr.getProperty("Phone"))).sendKeys(phoneNumber);
			
			driver_c.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
			
			driver_c.findElement(By.xpath(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("State/Province"))).sendKeys(r.getCell(6).getStringCellValue());
			
			double f=r.getCell(7).getNumericCellValue();
			long y=(long)f;
			String postalCode =Long.toString(y);
			
			
			driver_c.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys(postalCode);
			
			driver_c.findElement(By.name(pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
			driver_c.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
			
			driver_c.findElement(By.name(pr.getProperty("SubmitButton"))).click();
			
			String expected_UserName = r.getCell(9).getStringCellValue();
			System.out.println("ExpectedUserName Is : "+expected_UserName);
			
			///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
			//body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(3) > a > font > b
			///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
			
			String actual_UserName = driver_c.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]")).getText();
			System.out.println("Actual username is : "+actual_UserName);
			
			
			
			if(actual_UserName.contains(expected_UserName))
			{
				System.out.println("User Registraion Succesfully-- Pass");
				r.createCell(12).setCellValue("Registraion Succesfully-- Pass");
			}
			else
			{
				System.out.println("User Registraion UnSuccesfully-- Fail");
				r.createCell(12).setCellValue("Registraion UnSuccesfully-- Fail");
			}
			driver_c.findElement(By.linkText("REGISTER")).click();
			
			FileOutputStream output_file = new FileOutputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\All_output_Excel_Files\\NewTours_output_Registration_File_Excel.xlsx");
			Workbook.write(output_file);
		}
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver_c.quit();
	}
	}
