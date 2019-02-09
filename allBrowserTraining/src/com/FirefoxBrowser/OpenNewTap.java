package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTap {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http:\\google.com");
		
//driver.findElement(By.cssSelector("#gbw > div > div > div.gb_Oe.gb_R.gb_mh.gb_dh > div:nth-child(1) > a")).sendKeys(Keys.CONTROL+"t");		
			//
//<a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>

driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL +"t");
	}

}
