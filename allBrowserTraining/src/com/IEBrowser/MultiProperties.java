package com.IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultiProperties {

	public static void main(String[] args) {

		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\IEDriverServer.exe");
		//InternetExplorerDriver driver_ie =new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver driver_ie =new ChromeDriver();
		String yturl="http://youtube.com";
		//String yturl = "http://localhost/orangehrm/orangehrm-2.6/login.php";
		driver_ie.get(yturl);
		
		//<input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" tabindex="0" type="text" spellcheck="false" placeholder="Search" aria-label="Search" aria-haspopup="false" role="combobox" aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;">
		//driver_ie.findElement(By.xpath("//input[@type='text' and @id='search']")).sendKeys("tamil");
		driver_ie.findElement(By.id("search")).sendKeys("tamil");
	//id="search-icon-legacy"
		driver_ie.findElement(By.id("search-icon-legacy")).click();
	
	}

}
