package com.selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver drive =new FirefoxDriver();
		String url = "http:\\spicejet.com";
		
		drive.get(url);
		
		drive.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		int radiocounts=drive.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).size();
			
		for (int i=0;i<radiocounts;i++)
		{
			String attributes=drive.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			System.out.println(attributes);
		}
	}//ctl00$mainContent$rbtnl_Trip

}
