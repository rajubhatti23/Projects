package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class SecondcontinuepageSeven extends TestBase 
{
	@Test(priority=1)
	public void clickingcontinuebutton() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("secondcontinuebutton"))).click();
	}
	
	@Test(priority=2)
	public void checkinformation() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("thirdcontinuebutton"))).click();
	}
	
	@Test(priority=3)
	public void confirm() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("fourthcontinuebutton"))).click();
	}
	
	@Test(priority=4)
	public void confirmproperly() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("fifthcontinuebutton"))).click();
	}

}
