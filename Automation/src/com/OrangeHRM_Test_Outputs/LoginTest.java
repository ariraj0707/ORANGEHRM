package com.OrangeHRM_Test_Outputs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OrangeHRM_methods.LoginKeyWord;

public class LoginTest
{
	@Test
	public void login() throws IOException
	{
		LoginKeyWord keys =new LoginKeyWord();
		
		FileInputStream file =new FileInputStream(".\\src\\com\\KeyWord_Driven_Excel\\HRM_keyWord_Driven_pom_excel.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r=null;
		
		int rowcount = ws.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			r=ws.getRow(i);
			String runMode =r.getCell(4).getStringCellValue();
			if(runMode.equals("y"))
					{
					String keyWord =r.getCell(3).getStringCellValue();
					if(keyWord.equals("launchBrowser"))
					{
						keys.launchBrowser();
					}
					else if(keyWord.equals("navigate"))
					{
						keys.navigate();
					}
					else if(keyWord.equals("enterUserName"))
					{
						keys.enterUserName();
					}
					else if(keyWord.equals("enterPassWord"))
					{
						keys.enterPassWord();
					}
					else if(keyWord.equals("clickLogin"))
					{
						keys.clickLogin();
					}
		}
		
		
		
	}
	}}
