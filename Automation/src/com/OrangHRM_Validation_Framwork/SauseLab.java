package com.OrangHRM_Validation_Framwork;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class SauseLab 
{
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://ariraja0707:build-1234@app.saucelabs.com:80/wd/hub"), dc);
	
		driver.get("http:google.com");
		System.out.println(driver.getTitle());
	}
}

