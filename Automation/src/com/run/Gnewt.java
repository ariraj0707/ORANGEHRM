package com.run;

import org.openqa.selenium.edge.EdgeDriver;

public class Gnewt {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http:\\newtours.demoaut.com");
		String title = driver.getTitle();
		System.out.println("the title is : "+title);
	}

}
