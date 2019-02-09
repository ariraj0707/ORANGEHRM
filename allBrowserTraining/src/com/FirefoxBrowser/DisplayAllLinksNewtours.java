package com.FirefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAllLinksNewtours {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String newtoursurl="http:\\newtours.demoaut.com";
		//http://newtours.demoaut.com
		driver_Firefox.get(newtoursurl);
		
		
		List<WebElement>links = driver_Firefox.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("total no of newtours home pages are : "+linkscount);
		
		for(int k=0;k<linkscount;k++)
		{
			String linknames=links.get(k).getText();
			System.out.println(k+" "+linknames);
			
		}
		driver_Firefox.close();
	}

}
