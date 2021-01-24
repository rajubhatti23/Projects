package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

import utilities.Screenshot;

public class GettingQuotePageTwo extends TestBase {
	

	@Test(priority=1)
	public void firstQuote()
	{
		driver.findElement(By.xpath(OR.getProperty("zipcodexpath"))).sendKeys(Config.getProperty("zipcode"));
		
	}
@Test(priority=2)
public void getquote() throws InterruptedException
{
	driver.findElement(By.xpath(OR.getProperty("getquotebutton"))).click();
	 Screenshot screen=new Screenshot(); screen.takescreenshot(driver,
			  "secondpage");
	
	
}

}
