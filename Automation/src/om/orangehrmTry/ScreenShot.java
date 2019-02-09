package om.orangehrmTry;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{

	public static void takeSnapShot(WebDriver webdriver,String FileWithPath) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File scrFile= scrShot.getScreenshotAs(OutputType.FILE);
		 
		File destFile =new File(FileWithPath);
		
		FileUtils.copyDirectory(scrFile, destFile);
		
		
		
	}
}
