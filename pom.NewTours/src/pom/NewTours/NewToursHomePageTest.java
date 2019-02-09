package pom.NewTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursHomePageTest


{
	
	WebDriver driver =null;
	String url="http://www.newtours.demoaut.com/";
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void homePageTest()
	{
		WelcomMercuryTours wmb = PageFactory.initElements(driver, WelcomMercuryTours.class);
		
		
		wmb.signOn();
		
		driver.navigate().back();
		
		wmb.register();
		driver.navigate().back();
		
		wmb.support();
		driver.navigate().back();
		
		wmb.contact();
		driver.navigate().back();
		
		wmb.your_Destination();
		driver.navigate().back();
		
		wmb.featureVD();
		driver.navigate().back();
		
		wmb.regHear();
		driver.navigate().back();
		
		wmb.businessTravel();
		driver.navigate().back();
		
		wmb.salonTravel();
		driver.navigate().back();
		
		wmb.flights();
		
		wmb.lefttable();
		
		wmb.logIN("tutorial", "tutorial");
	}
	
}
