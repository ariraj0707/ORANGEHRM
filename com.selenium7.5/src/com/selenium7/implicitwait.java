package com.selenium7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class implicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1547971744954&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-globalnav-bookhotels-Q12019-home-tr");
		driver.findElement(By.name("Location")).sendKeys("nyc");
		//driver.findElement(By.name("Location")).sendKeys(Keys.ENTER);
		
		
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ENTER);
		 act.sendKeys(Keys.ENTER);
		 /*int i=0;
		 while(i<6)
		 {
			 act.sendKeys(Keys.TAB);
			 i++;
		 }
		 */
	}

}
