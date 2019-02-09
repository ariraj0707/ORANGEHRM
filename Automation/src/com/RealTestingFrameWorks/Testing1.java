package com.RealTestingFrameWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing1 {

	@Test
	public void Testcase_1()
	{
		//launch browser
				System.out.println("***********************************************************");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
				ChromeDriver chromeDriver = new ChromeDriver();
				
				//hit the url
				String hrm_url = "http://localhost/orangehrm/orangehrm-2.6/login.php";
				chromeDriver.get(hrm_url);
				
				System.out.println("******************************************************************");

				
				
				//validate the title
				 System.out.println("VALIDATION OF TITLE    :");
				String actualTitle_Home= chromeDriver.getTitle();
				String expectedTitle_Home = "OrangeHRM - New Level of HR Management";
				System.out.println(actualTitle_Home);
				System.out.println(expectedTitle_Home);
				if(actualTitle_Home.contains(expectedTitle_Home))
				{
					System.out.println("Home Page Title Validated - Result as Expected -Test case pass ");
				}
				else
				{
					System.out.println("Home Page Title Validated - Result as NOT Expected -Test case fail ");
				}
				
				
				
				
				//validate static text
				System.out.println("VALIDATION OF STATIC CONDENT   :");
				////*[@id="Table_01"]/tbody/tr[5]/td[2]/table/tbody/tr/td/font[3]
				String actual_Static_Text=chromeDriver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[5]/td[2]/table/tbody/tr/td/font[3]")).getText();
				String expected_Static_Text="comes as a comprehensive solution for the efficient management and development of your Human Resource. It will assist you in the complex and strategic process of managing this crucial resource of your enterprise. Based on modular architecture, it facilitates a vast range of HR activities, with features that reflect the main HR management activities. It comes as a web-enabled application and considering the available flexibility, OrangeHRM is a perfect platform for reengineering your HR processes and achieving a new level of HR Management.";
				System.out.println(actual_Static_Text);
				System.out.println(expected_Static_Text);
				if(actual_Static_Text.contains(expected_Static_Text))
				{
					System.out.println("Static text validated -Result as expected --pass");
				}
				else {System.out.println("Static text validated -Result NOT as expected --fail");
					
				}
				
				System.out.println("******************************************************************");

				
				//validate the text boxes
				System.out.println("VALIDATION OF TEXTBOXES     :");
				//<input name="txtUserName" type="text" class="loginText" tabindex="1">
				//<input name="txtPassword" type="password" class="loginText" tabindex="2">
				
				List<WebElement>textboxes=chromeDriver.findElements(By.className("loginText"));
				int total_textbBoxes=textboxes.size();
				System.out.println(total_textbBoxes);
				
				if(total_textbBoxes==2)
				{
					System.out.println("login textboxes are displaying- as expected --step pass");
				}
				else {
					System.out.println("login textboxes are not displaying- not as expected --step fail");
				}
				
				System.out.println("******************************************************************");

				
				
				//validate textboxes lable name
				System.out.println("VALIDATION OF TEXT BOXES LABLE    :");
				
				////*[@id="Table_01"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]
				////*[@id="Table_01"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input
				////*[@id="Table_01"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]
				
				WebElement loginNamelabletxt = chromeDriver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]"));
				WebElement passwordLabltxt = chromeDriver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]"));
				String actualtextname=loginNamelabletxt.getText();
				System.out.println("actual name lable  : "+actualtextname);
				String exp_nt_lable = "Login Name :";
				System.out.println("expected lable name  : "+exp_nt_lable);
				String actualpasstext=passwordLabltxt.getText();
				String exp_pt_lable ="Password :";
				System.out.println("expacated password lable  : "+exp_pt_lable);
				System.out.println("actual password lable  : "+actualpasstext);
				if(actualtextname.equals(exp_nt_lable) & actualpasstext.equals(exp_pt_lable)) {
					System.out.println("step pass --as expected Result");
				}
				else {
					System.out.println("step fail --as NOT expected Result");
				}
				
				System.out.println("******************************************************************");

					
				
				//validate buttons on login block
				System.out.println("VALIDATION OF BUTTONS ON LOGIN BLOCK   :");
				//<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
				//<input type="reset" name="clear" value="Clear" class="button" tabindex="4">
				
				////*[@id="Table_01"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input
				//<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
				//<td height="40" valign="bottom" align="center"><input type="Submit" name="Submit" value="Login" class="button" tabindex="3"> </td>
				
				List<WebElement>buttons=chromeDriver.findElements(By.className("button"));
				
				int totalbutton=buttons.size();
				System.out.println("total buttons  : "+totalbutton);
				//System.out.println(chromeDriver.findElement(By.name("Submit")));
				if(totalbutton==2) {
					System.out.println("two buttons are available --as expected -- pass");
				}else {
					System.out.println("two buttons not are available --NOT as expected -- fail");
				}
				
				
				/*
				for(int i=0;i<totalbutton;i++)
				{
					 String buttonsnames=buttons.get(i).getText();
					 System.out.println("button names  : "+buttonsnames);
				}
				*/
				System.out.println("******************************************************************");

				
				//validate fooder Static condent text
				System.out.println("VALIDATION OF FOODER STATIVC CONDENT   :");
				//<td align="center"><a href="http://www.orangehrm.com" target="_blank">OrangeHRM</a> ver 2.6 © OrangeHRM Inc. 2005 - 2010 All rights reserved.</td>
				
				String actualstaticfoodertext=chromeDriver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td")).getText();
				String expectedfoodertext = "OrangeHRM ver 2.6 © OrangeHRM Inc. 2005 - 2010 All rights reserved.";
				System.out.println("actual  : "+actualstaticfoodertext);
				System.out.println("expexted  : "+expectedfoodertext);
				if(actualstaticfoodertext.equals(expectedfoodertext))
				{
					System.out.println("test pass");
				}
				else
				{
					System.out.println("test fails");
				}
				
				System.out.println("******************************************************************");

				
				//validate availale links
				System.out.println("VALIDATION OF AVILABLE LINK   :");
				//<a href="http://www.orangehrm.com" target="_blank">OrangeHRM</a>
				
				String actuallinkText =chromeDriver.findElement(By.linkText("OrangeHRM")).getText();
				String expectedlinkText = "OrangeHRM";
				System.out.println("actual link text  : "+actuallinkText);
				System.out.println("expected link text  : "+expectedlinkText);
				if(actuallinkText.equals(expectedlinkText))
				{
					System.out.println("test pass");
					
				}
				else {
					System.out.println("test fail");
				}
				
				System.out.println("******************************************************************");
				chromeDriver.quit();
	}
}
