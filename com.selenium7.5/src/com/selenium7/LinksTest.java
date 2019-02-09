package com.selenium7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

	public static void main(String[] args) {

		System.out.println("***********************************************************");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		
		//hit the url
		String url ="https://www.ebay.com/";
		chromeDriver.get(url);
		
		List<WebElement>links=chromeDriver.findElements(By.tagName("a"));
		
		int totallinks=links.size();
		
		System.out.println(totallinks);
		
		////*[@id="glbfooter"]
		
		WebElement fooder=chromeDriver.findElement(By.xpath("//*[@id=\"glbfooter\"]"));
		List<WebElement>fooderlinks=fooder.findElements(By.tagName("a"));
		int totfoodlink=fooderlinks.size();
		
		System.out.println(totfoodlink);
		
		
		///html/body/div[6]/footer/div[2]/table/tbody/tr/td[2]/ul 
		///html/body/div[6]/footer/div[2]/table/tbody/tr/td[2]/ul
		 ////html/body/div[6]/footer/div[2]/table/tbody/tr/td[2]
		 
		
		WebElement col=chromeDriver.findElement(By.cssSelector("#gf-BIG > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2)"));
		List<WebElement>collinks=col.findElements(By.tagName("a"));
		int collinkscou=collinks.size();
		System.out.println(collinkscou);
		String hometitle = null;
		String sittitle;
		
		for(int o=0;o<collinkscou;o++)
		{
			String linktext =collinks.get(o).getText();
			//System.out.println(linktext);
			
			if(linktext.contains("Site map")) {
				 hometitle= chromeDriver.getTitle();
				System.out.println(hometitle);
				collinks.get(o).click();
				break;
			}
		}
		 sittitle = chromeDriver.getTitle();
		System.out.println(sittitle);
		
		if(hometitle!=sittitle)
		{
			System.out.println("fail");
			
		}
		else 
		{
			if(chromeDriver.getPageSource().contains("Antiques"));
			{
				System.out.println("pass");
			}
			
		}
		
		chromeDriver.quit();
		
		
	}

}
