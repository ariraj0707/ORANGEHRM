package com.IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\IEDriverServer.exe");
		//InternetExplorerDriver ie_driver = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver ie_driver = new FirefoxDriver();
		String amazonurl ="http://amazon.in";
		ie_driver.get(amazonurl);
		
		////*[@id="nav-link-yourAccount"]/span[2]  ,,id="nav-link-yourAccount"
		//<span class="nav-line-2">Your Orders<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		 // </span>
		//<span class="nav-line-1">Hello. Sign in</span>
		//ie_driver.findElement(By.id("nav-your-amazon")).click();
	     //WebElement hellowsignin = ie_driver.findElement(By.id("nav-link-yourAccount"));
		//hellowsignin.click();
		//<a id="nav-your-amazon" href="/gp/yourstore/home?ref=nav_cs_ys" class="nav-a" tabindex="20">Your Amazon.in</a>
		//Actions act = new Actions(ie_driver);
		
		//act.moveToElement(hellowsignin).click();
		
		////*[@id="nav-link-prime"]
		
		WebElement prime = ie_driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
		
		Actions act = new Actions(ie_driver);
		//act.moveToElement(prime).build().perform();
		act.moveToElement(prime).click();
		
		
		
		
		
		
		
	}

}
