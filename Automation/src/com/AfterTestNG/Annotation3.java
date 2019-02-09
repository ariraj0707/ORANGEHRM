package com.AfterTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {
	
	@BeforeMethod
	public void Applicationlogin()
	{
		System.out.println("Testing Application Login");
	}

	@Test(priority=1)
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@Test(priority=2)
	public void Composemail()
	{
		System.out.println("Testing Functionality of compose mail");
	}
	
	@Test(priority=3)
	public void Draft()
	{
		System.out.println("Testing Draaft Functionality");
		
	}
	
	@AfterMethod
	public void ApploicationClose()
	{
		System.out.println("Testing Application Close");
	}
	

}
