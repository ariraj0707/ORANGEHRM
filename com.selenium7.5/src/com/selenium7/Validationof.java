package com.selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validationof {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		String url="http:\\spicejet.com";
		 driver.get(url);
		 
		 ////*[@id="ctl00_mainContent_view_date1"]
		 WebElement depature_date =driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']"));
		 depature_date.click();
		 //
		 ///html/body/div[2]/div[2]/div/a/span
		 ///html/body/div[2]/div[2]/div/a/span
		 ////*[@id="ui-datepicker-div"]/div/a[2]/span
		 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a/span")).click();
		 
		 ////*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[5]/a
		 ////*[@id="ui-datepicker-div"]/div[2]/table/tbody/tr[4]/td[7]/a
		 ///html/body/div[2]/div[2]/table/tbody/tr[3]/td[7]/a
		 driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[3]/td[7]/a")).click();
	}

}
