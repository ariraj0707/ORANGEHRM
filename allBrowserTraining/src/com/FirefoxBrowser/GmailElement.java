package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailElement {

	public static void main(String[] args) {


			//<a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		//<a class="gb_P" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
				
		String googleurl="http:\\google.com";
		driver_Firefox.get(googleurl);
		driver_Firefox.findElement(By.className("gb_P")).click();
		
		//driver_Firefox.findElement(By.linkText("Image"));
	}

}
