package com.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\geckodriver.exe");
		FirefoxDriver driver_Firefox = new FirefoxDriver();
		
		String amazonurl = "http:\\amazon.in";
		driver_Firefox.navigate().to(amazonurl);
		
		//<span class="nav-line-2">Your Orders<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		 //<a href="https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;&amp;openid.pape.max_auth_age=0" class="nav-a nav-a-2" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-yourAccount" tabindex="25">
		 // <span class="nav-line-1">Hello. Sign in</span>
		 // <span class="nav-line-2">Your Orders<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		 // </span>
		 // <span class="nav-line-3">Sign in</span>
		 // <span class="nav-line-4">Your Orders</span>
		//</a> //<span class="nav-line-1">Hello. Sign in</span>
		//<span class="nav-text">Your Account</span>
		//<span class="nav-line-1">Hello. Sign in</span>
		
		WebElement hellowsignin=driver_Firefox.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver_Firefox);
		act.moveToElement(hellowsignin).click();
		
		driver_Firefox.findElement(By.xpath("//*[@id='nav_prefetch_yourorders']")).click();
	}

}
