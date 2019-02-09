package com.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<a href="https://www.hao123.com" name="tj_trhao123" class="mnav">hao123</a>
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com");
		driver.findElement(By.xpath("//*[@name='tj_trhao123' and @class='mnav']")).click();
	}

}
