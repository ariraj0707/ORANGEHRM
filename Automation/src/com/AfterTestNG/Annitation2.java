package com.AfterTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annitation2 {
	
	@BeforeTest
	public void Applicationlogin()
	{
		System.out.println("Testing Application Login");
	}

	@Test(priority=1)
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@Test(priority=0)
	public void Composemail()
	{
		System.out.println("Testing Functionality of compose mail");
	}
	
	@Test(priority=4)
	public void Draft()
	{
		System.out.println("Testing Draaft Functionality");
		
	}
	
	@AfterTest
	public void ApploicationClose()
	{
		System.out.println("Testing Application Close");
	}
	
}
