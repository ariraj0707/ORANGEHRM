package faceBookFinalScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PomFaceBook_TestCases 
{

	WebDriver driver =null;
	String url="http://www.newtours.demoaut.com/";
	
@Test
public void setUp() throws IOException
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);

	File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot,new File("C:\\\\Users\\\\ARIVAZHAGAN\\\\Desktop\\\\maven\\\\Training\\\\screenShots\\\\first.png"));
	
	//PomFacebookHome face = new PomFacebookHome();
	//face.takeSnapShot(driver, "C:\\Users\\ARIVAZHAGAN\\Desktop\\maven\\Training\\screenShots\\first.png");
	
}
}
