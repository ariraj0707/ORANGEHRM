package com.run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		String url = "http://www.newtours.demoaut.com/";
		driver.get(url);
		
		driver.findElement(By.partialLinkText("REGI")).click();
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		List<WebElement>countries=driver.findElements(By.tagName("option"));
		int country_count=countries.size();
		
		for(int k=0;k<country_count;k++)
		{
			String countryname=countries.get(k).getText();
			System.out.println(k+""+countryname);
		}
	}

}
