package com.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		/*//<div class="menu-tab ">Resources <i class="fa fa-caret-down" aria-hidden="true"></i>
		<div class="drop-cont Single">
		<ul class="dropDown">
		<li><a class="top-nav-link" href="https://try.alexa.com/resources">eBooks</a></li>
		<li><a class="top-nav-link" href="https://try.alexa.com/alexa-tutorials/">Video Tutorials</a></li>
		<li><a class="top-nav-link" href="http://blog.alexa.com/">Blog</a></li>
		</ul>
		</div>
		</div>*/
		
		//<a class="top-nav-link" href="https://try.alexa.com/alexa-tutorials/">Video Tutorials</a>

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String url ="https://www.alexa.com/siteinfo/wikipedia.org";
		
		driver.get(url);
		
		WebElement resource=driver.findElement(By.xpath("//*[@id='alx-header']/div/section[2]/div[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(resource).build().perform();
		
		driver.findElement(By.xpath("//*[@id='alx-header']/div/section[2]/div[2]/div/ul/li[2]/a")).click();
	}

}
