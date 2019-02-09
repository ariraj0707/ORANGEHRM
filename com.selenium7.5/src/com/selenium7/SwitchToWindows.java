package com.selenium7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		
		System.out.println("before switch"+" "+driver.getTitle());
		//
		Set<String>ides=driver.getWindowHandles();
		Iterator<String>ite=ides.iterator();
		String parent =ite.next();
		String child1 =ite.next();
		//
		driver.switchTo().window(child1);
		System.out.println("after switching");
		System.out.println(driver.getTitle());
		
		
		//driver.switchTo().window(parent);
		//System.out.println("switching to parrent");
		//System.out.println(driver.getTitle());
		
		//driver.quit();
		
	}

}
