package com.FirefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayOrangHRMVisibleLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_FireFox = new FirefoxDriver();
		
		String orangeurl="https://opensource-demo.orangehrmlive.com";
		driver_FireFox.get(orangeurl);
		
		driver_FireFox.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver_FireFox.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver_FireFox.findElement(By.id("btnLogin")).click();
		
		List<WebElement>links = driver_FireFox.findElements(By.tagName("a"));
		int linkcounts= links.size();
		System.out.println("total nomber of links in orang hrm admin home : "+linkcounts);
		
		for(int n=0;n<linkcounts;n++)
		{
			if(links.get(n).isDisplayed())
			{
				String linknames=links.get(n).getText();
				System.out.println(n+" "+linknames);
				
			}
		}
		driver_FireFox.quit();
	}

}
