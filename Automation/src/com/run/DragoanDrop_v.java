package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class DragoanDrop_v {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\IEDriverServer.exe");
		WebDriver driver = null;
		driver =new InternetExplorerDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		////*[@id="draggable"]
		
		 WebElement innerfram=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 driver.switchTo().frame(innerfram);
		Actions act = new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		//#droppable
		////*[@id="droppable"]
		
		WebElement drop=driver.findElement(By.cssSelector("#droppable"));
		
		act.dragAndDrop(drag, drop).perform();
		String actualtex=drop.getText();
		String expectedtxt = "drag me to the target";
		
		if(actualtex.contains(expectedtxt))
		{
			System.out.println("testcase pass");
			
		}
		else
		{
			System.out.println("testcase fail");
		}
		driver.switchTo().defaultContent();
		
		
		
	
	}

}
