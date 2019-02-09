package om.orangehrmTry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.run.ScreenShot;

public class WithScreenshot {
	WebDriver driver_hrm = null;
	String url = "http://localhost/orangehrm/orangehrm-2.6/login.php";
	WebElement username_textbox;
	WebElement poss_txtbox;
	WebElement login_Button;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver_hrm = new ChromeDriver();
		driver_hrm.get(url);
		driver_hrm.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_hrm.manage().window().maximize();
		
	}
	
	@Test(priority=0)
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\OrangHRM_Input_Data_Validation\\InpuValidation_EmployeeValidationData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("login_data");
		
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
			
			/*String expected_Title = "OrangeHRM";
			System.out.println("The Expected Title is : "+expected_Title);
			String actual_title = driver_hrm.getTitle();
			System.out.println("The Actual Title is : "+actual_title);
			
			if(actual_title.equals(expected_Title))
			{
				System.out.println("login successfull --pass");
				r.createCell(2).setCellValue("login successfull --pass");
				r.createCell(3).setCellValue("test_Pass");
			}
			else
			{
				System.out.println("login unsuccessfull --fail");
				r.createCell(2).setCellValue("login unsuccessfull --fail");
				r.createCell(3).setCellValue("test_Pass");
				
				
			}*/
			
			try {
				String expected_text ="Welcome admin";
						System.out.println("expected tect  : "+expected_text);
						String actual_text=driver_hrm.findElement(By.xpath("//*[text()='Welcome admin']")).getText();
						if(actual_text.contains(expected_text))
						{
							System.out.println("login successfull --pass");
							r.createCell(2).setCellValue("login successfull --pass");
							r.createCell(3).setCellValue("test_Pass"); 
						}}
						
			catch(Exception e)
						{
							if(driver_hrm.findElement(By.xpath("//*[text()='Invalid Login']")).getText().equals("Invalid Login"))
							{
								File screenshot =((TakesScreenshot)driver_hrm).getScreenshotAs(OutputType.FILE);
								FileUtils.copyFile(screenshot,new File("./screenshot/img.png"));
								
								System.out.println("login unsuccessfull --fail");
								r.createCell(2).setCellValue("login unsuccessfull --fail");
								r.createCell(3).setCellValue("test_Pass");
							}
						}
			
			
			FileOutputStream file2 =new FileOutputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\OrangHRM_Test_Case_Validation_Output\\OrangHRM_Test_Case_Validation_output_login1.xlsx");
			workbook.write(file2);
			driver_hrm.navigate().back();
		}	
		driver_hrm.findElement(By.name("txtUserName")).clear();
		}
		
		
		
		@Test(priority=1)
		public void addEmployee() throws IOException
		{

			FileInputStream file = new FileInputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\OrangHRM_Input_Data_Validation\\InpuValidation_EmployeeValidationData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet_login = workbook.getSheet("login_data");
			
			Row login_row=sheet_login.getRow(1);
			
			//username_textbox.sendKeys(login_row.getCell(0).getStringCellValue());
			
			driver_hrm.findElement(By.name("txtUserName")).sendKeys(login_row.getCell(0).getStringCellValue());
			//txtPassword
			
			driver_hrm.findElement(By.name("txtPassword")).sendKeys(login_row.getCell(1).getStringCellValue());
			//Submit
			driver_hrm.findElement(By.name("Submit")).click();
			
			/*
			//<a href="./index.php?menu_no_top=hr" class="l1_link">
			//<span class="drop current">PIM</span>
			//</a>
			Actions moveTo = new Actions(driver_hrm);
			
			WebElement pmi_Module=driver_hrm.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a/span"));
			moveTo.moveToElement(pmi_Module);
			
			//<span>Add Employee</span>
			//<a href="./lib/controllers/CentralController.php?reqcode=EMP&amp;capturemode=addmode" target="rightMenu" class="l2_link empadd" onclick="menuclicked(this);">
			//<span>Add Employee</span>
			//</a>
			
			driver_hrm.findElement(By.linkText("Add Employee")).click();
			*/
			
			FileInputStream file2 =new FileInputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\OrangHRM_Input_Data_Validation\\InpuValidation_EmployeeValidationData.xlsx");
			XSSFWorkbook workbook2 =new XSSFWorkbook(file2);
			XSSFSheet sheet2 =workbook2.getSheet("employee_data");
			
			//<input type="button" class="plainbtn" onclick="returnAdd();" onmouseover="this.className='plainbtn plainbtnhov'" onmouseout="this.className='plainbtn'" value="Add">
			
					////*[@id="rightMenu"]
			
					WebElement frame =driver_hrm.findElement(By.xpath("//*[@id='rightMenu']"));
					driver_hrm.switchTo().frame(frame);
					
					////*[@id="standardView"]/div[3]/div[1]/input[1]
					
					////*[@id="rightMenu"]
					////*[@id="txtEmployeeId"]
			
			int rowcount_emp =sheet2.getLastRowNum();
			
			for(int i=1;i<=rowcount_emp;i++)
			{
			
			
			driver_hrm.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
			
			Row r_s1=sheet2.getRow(i);
			
			/*driver_hrm.switchTo().frame(frame);
			WebElement idbox=driver_hrm.findElement(By.cssSelector("#txtEmployeeId"));
			idbox.clear();
			idbox.sendKeys(r_s1.getCell(0).getStringCellValue());*/
			System.out.println(driver_hrm.findElement(By.xpath("//*[@id='txtEmployeeId']")).getText());
			
			//<input type="text" name="txtEmpLastName" id="txtEmpLastName" class="formInputText" maxlength="100" value="">
			driver_hrm.findElement(By.id("txtEmpLastName")).sendKeys(r_s1.getCell(1).getStringCellValue());
		
			//<input type="text" name="txtEmpFirstName" id="txtEmpFirstName" class="formInputText" maxlength="100" value="">
			driver_hrm.findElement(By.name("txtEmpFirstName")).sendKeys(r_s1.getCell(2).getStringCellValue());
			
			//<input type="button" class="savebutton" id="btnEdit" onclick="addEmpMain(); return false;" onmouseover="moverButton(this);" onmouseout="moutButton(this);" value="Save" title="Save">
			driver_hrm.findElement(By.id("btnEdit")).click();
			
			////*[@id="personal"]
			////*[@id="personal"]/div[1]
			////*[@id="personal"]
			////*[@id="personal"]/div[1]/div[2]
			////*[@id="personal"]/div[1]/div[2]
			
			//#personal
			
			//WebElement form_block = driver_hrm.findElement(By.cssSelector("#personal"));
			
			
		////*[@id="txtEmployeeId"]
			String inputEmID =driver_hrm.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).getAttribute("value");
			System.out.println("Input Employee ID : "+inputEmID);
			
			//<input type="button" class="backbutton" value="Back" onclick="goBack()">
			driver_hrm.findElement(By.xpath("//*[@class='backbutton' and @value='Back']")).click();
			
			String employ_lanam=driver_hrm.findElement(By.partialLinkText(r_s1.getCell(1).getStringCellValue())).getText();
			
			////*[@id="standardView"]/table/tbody/tr[4]/td[2]
			//<input name="txtEmployeeId" id="txtEmployeeId" class="formInputText" type="text" value="0080" maxlength="50">
			
			////*[@id="standardView"]/table/tbody/tr[1]/td[2]
			////*[@id="standardView"]/table/tbody/tr[2]/td[2]
			
			String input_lastnam= r_s1.getCell(1).getStringCellValue();
			
			
			String employ_ID=driver_hrm.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("OutputEmployeeID  : "+employ_ID);
			r_s1.createCell(0).setCellValue(employ_ID);
			
			if(inputEmID.equals(employ_ID))
			{
				System.out.println(r_s1.getCell(2).getStringCellValue()+"   :Added to the List");
				r_s1.createCell(3).setCellValue("Added to the List");
				r_s1.createCell(4).setCellValue("pass");
			}
			else
			{
				System.out.println(r_s1.getCell(2).getStringCellValue()+"   :Not Added to the List");
				r_s1.createCell(3).setCellValue("Not Added to the List");
				r_s1.createCell(4).setCellValue("fail");
			}
			
			
			FileOutputStream fil_out =new FileOutputStream("C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\src\\com\\OrangHRM_Test_Case_Validation_Output\\OrangHRM_Test_Case_Validation_output1.xlsx");
			workbook2.write(fil_out);
			}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver_hrm.quit();
	}

}
