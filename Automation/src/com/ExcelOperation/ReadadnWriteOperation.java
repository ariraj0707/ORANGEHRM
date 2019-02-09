package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadadnWriteOperation {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String orangurl = "http://localhost/orangehrm/orangehrm-2.6/login.php";
		
		driver_Firefox.get(orangurl);
		driver_Firefox.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES );
		
		FileInputStream file =new FileInputStream(".\\src\\com\\readfile\\readandwrite.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet");
		
		Row r =sheet.getRow(1);
		
		
		
		
		
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		driver_Firefox.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		driver_Firefox.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		
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
