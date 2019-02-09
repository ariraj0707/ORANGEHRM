package com.run;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\MicrosoftWebDriver.exe");
		
		EdgeDriver g = new EdgeDriver();
		g.get("http:\\google.com");
		g.navigate().to("http:\\facebook.com");
	}

}
