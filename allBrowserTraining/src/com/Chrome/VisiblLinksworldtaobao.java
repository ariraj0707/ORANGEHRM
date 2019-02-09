package com.Chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisiblLinksworldtaobao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://world.taobao.com");
		//https://world.taobao.com
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linkscount=links.size();
		System.out.println("total links in current page is : "+linkscount);
		
		for(int k=0;k<linkscount;k++)
		{
			if(links.get(k).isDisplayed())
			{
				String linksname= links.get(k).getText();
				System.out.println(linksname);
			}
			

	}
		driver.quit();
	}
}
