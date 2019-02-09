package com.run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoginWithKeyboard_v {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		WebDriver driver = null;
		driver=new FirefoxDriver();
		
		driver.get("http:\\facebook.com");
		System.out.println("testcase 1");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ariraj0707@gmail.com");
		
		Actions keyboard = new Actions(driver);
		keyboard.sendKeys(Keys.TAB).perform();
		
		keyboard.sendKeys("swathiari").perform();
		
		keyboard.sendKeys(Keys.ENTER).perform();
		
		////*[@id="navItem_100011673793054"]/a/div
		////*[@id="navItem_100011673793054"]/a/div

List<WebElement>login_hone=driver.findElements(By.xpath("//*[@id=\"fbRequestsJewel\"]/a/div"));
		int available = login_hone.size();
		System.out.println("size"+" "+available);
		
		if(available>0)
		{
			System.out.println("succesfully login to given credential--pass");
		}
		else
		{
			System.out.println("login with given credential is unsuccesful--fail");
		}
		
		driver.quit();
		
		

	}

}
