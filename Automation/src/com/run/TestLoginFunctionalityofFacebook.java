package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginFunctionalityofFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		String url ="http:\\facebook.com";
		
		driver.get(url);
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		driver.findElement(By.id("email")).sendKeys("ariraj0707@gmail.com");
		
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver.findElement(By.id("pass")).sendKeys("swathiari");
		
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
		//<label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		driver.findElement(By.id("royal_login_button")).click();
		
		
	}

}
