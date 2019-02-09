package com.StepDefenition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsLoginHRm {
	WebDriver driver =null;
	String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	
	@Given("^open Firefox Browser and Enter url$")
	public void open_Firefox_Browser_and_Enter_url() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
	}

	@When("^user Enter Valid UserName and Password and Click Login$")
	public void user_Enter_Valid_UserName_and_Password_and_Click_Login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^user Should be able to Succesfully login$")
	public void user_Should_be_able_to_Succesfully_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		String expected_Text = "Welcom admin";
		System.out.println("Expected Text : "+expected_Text);
		
		String actual_Text =driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		System.out.println("ActualText : "+actual_Text);
		
		if(actual_Text.equals(expected_Text))
		{
			System.out.println("Login Seccesfull --Pass");
		}
		else
		{
			System.out.println("Login Unsuccesfull --Fail");
		}
	}

	@Then("^close the Browser$")
	public void close_the_Browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.quit();
	}

}
