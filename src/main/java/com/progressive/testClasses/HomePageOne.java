package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

import utilities.Screenshot;

public class HomePageOne extends TestBase {
	
	@Test
	public void firstTestAuto() 
	{
	
		driver.findElement(By.xpath(OR.getProperty("autoxpath"))).click();
		
		  Screenshot screen=new Screenshot(); 
		  screen.takescreenshot(driver,"homepage");
		 
	
	}
	
	

}
