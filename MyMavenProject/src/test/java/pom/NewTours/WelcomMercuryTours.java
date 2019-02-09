package pom.NewTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomMercuryTours {
	
	//<a href="mercurysignon.php?osCsid=b93ae8f93d58715fc0eb63f29e00f917">SIGN-ON</a>
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	public void signOn()
	{
		signOn.click();
	}
	
	//<a href="mercuryregister.php?osCsid=e310d62a3715655153bf4c5f7fbc1147">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void register()
	{
		register.click();
	}
	
	//<a href="mercuryunderconst.php?osCsid=e310d62a3715655153bf4c5f7fbc1147">SUPPORT</a>
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void support()
	{
		support.click();
	}
	
	//<a href="mercuryunderconst.php?osCsid=e310d62a3715655153bf4c5f7fbc1147">CONTACT</a>
	@FindBy(linkText="CONTACT")
	WebElement contact;
	public void contact()
	{
		contact.click();
	}
	
	//<a href="mercuryunderconst.php">your destination</a>
	@FindBy(linkText="your destination")
	WebElement your_Destination;
	public void your_Destination()
	{
		your_Destination.click();
	}
	
	//<a href="mercuryunderconst.php">featured vacation destinations</a>
	@FindBy(linkText="featured vacation destinations")
	WebElement feature_VD;
	public void featureVD()
	{
		feature_VD.click();
	}
	
	//<a href="mercuryregister.php">Register here</a>
	@FindBy(linkText="Register here")
	WebElement reg_Hear;
	public void regHear()
	{
		reg_Hear.click();
	}
	
	//<a href="http://businesstravel.about.com/mbody.htm?PM=78_101_T&amp;cob=home">Business Travel @ About.com</a>
	@FindBy(linkText="Business Travel @ About.com")
	WebElement business_Travel;
	public void businessTravel()
	{
		business_Travel.click();
	}
	
	//<a href="http://www.salon.com/travel/index.html">Salon Travel</a>
	@FindBy(linkText="Salon Travel")
	WebElement salon_Travels;
	public void salonTravel()
	{
		salon_Travels.click();
	}
	
	//<a href="mercurywelcome.php">Home</a>
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	
	//<a href="mercuryreservation.php">Flights</a>
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flights()
	{
		flights.click();
	}
	
	///html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td")
	WebElement left_table;
	public void lefttable()
	{
		List<WebElement>table_Links=left_table.findElements(By.tagName("a"));
		int linkcount=table_Links.size();
		System.out.println("Available links in left side are :");
		for(int i=0;i<linkcount;i++)
		{
			String linkName=table_Links.get(i).getText();
			System.out.println(linkName);
		}
	}
	
	//<input type="text" name="userName" size="10">
	
	@FindBy(name="userName")
	WebElement username;
	
	//<input type="password" name="password" size="10">
	@FindBy(name="password")
	WebElement password;
	
	//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=b93ae8f93d58715fc0eb63f29e00f917" width="58" height="17" alt="Sign-In" border="0">
	@FindBy(name="login")
	WebElement signIn;
	
	public void logIN(String userName,String passWord)
	{
		
		username.sendKeys(userName);
		password.sendKeys(passWord);
		signIn.click();
	}
	
	
	

}
