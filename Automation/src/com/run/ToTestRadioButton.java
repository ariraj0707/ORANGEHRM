package com.run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTestRadioButton {

	public static void main(String[] args) {
		
		
		//<td bgcolor="#99aa99"><table border="0" cellspacing="1" cellpadding="2" bgcolor="#000000" width="450"><tbody><tr><td class="table5"><!-- perl mysql php web host -->


//<br><br><input type="radio" name="group1" value="Milk"> Milk<br><input type="radio" name="group1" value="Butter" checked=""> Butter<br><input type="radio" name="group1" value="Cheese"> Cheese<hr><input type="radio" name="group2" value="Water"> Water<br><input type="radio" name="group2" value="Beer"> Beer<br><input type="radio" name="group2" value="Wine" checked=""> Wine<div align="center"></div><br>
//</td></tr></tbody></table></td>
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIVAZHAGAN\\Desktop\\selemium files\\workspace\\Automation\\library\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		String url = "http://www.echoecho.com/htmlforms10.htm";
		
		chromeDriver.get(url);
		
		///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td
		
		WebElement radiobuttonblock=chromeDriver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
		
		List<WebElement>radio= radiobuttonblock.findElements(By.name("group1"));
		int radiocount = radio.size();
		
		System.out.println(	radiocount);
		
		for( int k=0;k<radiocount;k++)
		{
			radio.get(k).click();
			for(int p=0;p<radiocount;p++)
			{
				
				if(radio.get(p).isSelected())
				{
					System.out.println("active");
				}else
				{
					System.out.println("inactive");
					
				}
				String radioname = radiobuttonblock.getText();
			}
			
		//System.out.println(radio.get(p).ge);	
		
		}
		chromeDriver.quit();

	}

}
