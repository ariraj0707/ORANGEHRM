package com.AfterTestNG;

import org.testng.annotations.Test;

public class Annotation1
{
	@Test(priority=0)
	public void applicationlaunch()
	{
		System.out.println("Gmail Application Launch");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Testing login Functionaloity");
	}
	
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("Testing Inbox Functionality");
	
	}
	
	@Test(enabled=false)
	public void sentmail()
	{
		System.out.println("testing Sent Mail Functionality");
	}
	
	@Test(priority=3)
	public void composemail()
	{
		System.out.println("Testing Compose Mail");
		
	}
	
	
}
