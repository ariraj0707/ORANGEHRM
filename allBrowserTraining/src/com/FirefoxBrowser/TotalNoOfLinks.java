package com.FirefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalNoOfLinks {

	public static void main(String[] args) {
		 
		//<a href="mercuryregister.php">REGISTER</a>
		//<a href="mercuryregister.php">REGISTER</a>
		//<a href="mercuryunderconst.php">SUPPORT</a>
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String newtoursurl ="http:\\newtours.demoaut.com";
		driver_Firefox.get(newtoursurl);
		
	List<WebElement>links=driver_Firefox.findElements(By.tagName("a"));
		
		int linkscount=links.size();
		
		System.out.println("the total number of links on newtous home page are : "+linkscount);
		driver_Firefox.quit();
		
	}

}
