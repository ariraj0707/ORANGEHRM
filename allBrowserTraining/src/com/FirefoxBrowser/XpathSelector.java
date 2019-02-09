package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathSelector {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		String fburl = "http:\\facebook.com";
		driver_Firefox.get(fburl);
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		//<label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		////*[@id="loginbutton"]
		
		driver_Firefox.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("ariraj0707@gmail.com");
		driver_Firefox.findElement(By.xpath("//*[@class='inputtext' and @type='password']")).sendKeys("swathiari");
		driver_Firefox.findElement(By.xpath("//*[@id='loginbutton']")).click();
	}

}
