package faceBookFinalScripts;

import java.sql.Driver;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Alert {

	WebDriver driver=null;
	
	public void accept()
	{
		try {
			driver.switchTo().alert().accept();
			
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void dessmis()
	{
		try {
			driver.switchTo().alert().dismiss();
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void sentKeys(String sendText )
	{
		try {
			driver.switchTo().alert().sendKeys(sendText);
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void getText()
	{
		try {
			driver.switchTo().alert().getText();
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
