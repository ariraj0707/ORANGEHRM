package faceBookFinalScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PomFacebookHome
{
	WebDriver driver=null;
	
	
	public void launchFierBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");

		driver=new ChromeDriver();
	}
	
	public void launchEdgeDriver()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\MicrosoftWebDriver.exe");

		driver=new EdgeDriver();
	}
	
	public void logInasUserNameBlank()
	{
		try {
			driver.findElement(By.xpath("//*[text()='Log In']")).click();
			
			String actuat_Message =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
			String expected_Message="The email address or phone number that you've entered doesn't match any account.";
			if(actuat_Message.equals(expected_Message))
			{
				System.out.println("test pass");
				
			}
			else{
				System.out.println("testfail");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void takeSnapShot(WebDriver webdriver,String filewithPath) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile= new File(filewithPath);
		
		FileUtils.copyFile(scrFile, DestFile);
	}
	
	
	
	
}
