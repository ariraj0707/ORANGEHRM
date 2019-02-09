package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginfunctionalityOfFacebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String fburl = "http:\\facebook.com";
		driver_Firefox.get(fburl);
		
		//<input type="email" class="inputtext" name="email" id="email" value="ariraj0707@gmail.com" data-testid="royal_email">
		
		driver_Firefox.findElement(By.id("email")).sendKeys("ariraj0707@gmail.com");
		
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver_Firefox.findElement(By.id("pass")).sendKeys("swathiari");
		
		//<label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_8"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_8"></label>
		
		driver_Firefox.findElement(By.id("loginbutton")).click();
	}

}
