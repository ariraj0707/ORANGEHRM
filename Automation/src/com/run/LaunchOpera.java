package com.run;


import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera {

	public static void main(String[] args) {
		
System.setProperty("webdriver.opera.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		
		driver.get("hhtp:\\facebook.com");

	}

}
