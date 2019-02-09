package com.OrangHRM_Validation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_Login_fun_positive {

	public static void main(String[] args) throws IOException {

				//launch browser
				System.out.println("***********************************************************");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
				ChromeDriver chromeDriver = new ChromeDriver();
				
				//hit the url
				String hrm_url = "http://localhost/orangehrm/orangehrm-2.6/login.php";
				chromeDriver.get(hrm_url);
				
				System.out.println("******************************************************************");

				//click login without entering login name
				System.out.println("click login without entering login name");
				//<input name="txtUserName" type="text" class="loginText" tabindex="1">
				//login  button; <input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
				
				WebElement submit=chromeDriver.findElement(By.name("Submit"));
				//submit.click();
				
				//String actualalarttxt =chromeDriver.switchTo().alert().getText();
				//System.out.println("alart text  :  "+actualalarttxt);
				//String expectedalttxt = "User Name not given!";
				//if(actualalarttxt.equals(expectedalttxt))
				//{
				//	System.out.println("is displaying error alart --as expected--- test pass");
				////}else {
				//	System.out.println("not displaying error alart--not as expected--- test fail");
				//}
				
				
				//validate login button function with valid user name passwrd blank
				System.out.println("validate login button function with valid user name passwrd blank");
				
				FileInputStream file = new FileInputStream(".\\src\\com\\Hrm_Test_Input_Files\\login_Validation_Input.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				Row r=sheet.getRow(0);
				System.out.println(r.getCell(0).getStringCellValue());
				
				//WebElement loginname=chromeDriver.findElement(By.name(r));
				//loginname.sendKeys("admin");
				//submit.click();
				
				

				//chromeDriver.quit();

	}

}
