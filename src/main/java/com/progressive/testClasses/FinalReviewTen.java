package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

import utilities.Screenshot;

public class FinalReviewTen extends TestBase
{

	@Test(priority=1)
	public void finalreview() throws InterruptedException
	{
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(OR.getProperty("everaccident"))).click();
	}
	@Test(priority=2)
	public void verification() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("verification"))).click();
	}
	@Test(priority=3)
	public void continuebut() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("contibutton"))).click();
		
		
	}
	@Test(priority=4)
	public void finalquotationbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("lastbutton"))).click();
		Screenshot screen=new Screenshot(); screen.takescreenshot(driver,
				  "Quotes");
	}
}
