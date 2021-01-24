package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class SpouseInformationSix extends TestBase
{

	@Test(priority=1)
	public void spousefirstname() throws InterruptedException
	{
		 Thread.sleep(7000);
		  driver.findElement(By.xpath(OR.getProperty("spousefirstnamexpath"))).sendKeys(Config.getProperty("spousefirstname")); 
	}
	@Test(priority=2)
	public void spousegender()
	{
		driver.findElement(By.xpath(OR.getProperty("spousegenderxpath"))).click();
	}
	@Test(priority=3)
	public void spousedateofbirth()
	{
		driver.findElement(By.xpath(OR.getProperty("spousedobxpath"))).sendKeys(Config.getProperty("spousedob"));
	}
	@Test(priority=4)
	public void spouseedulevel() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select edu =new Select(driver.findElement(By.xpath(OR.getProperty("spouseeducationxpath"))));
			edu.selectByIndex(Integer.parseInt(Config.getProperty("spouseeducation")));
	}
	
	@Test(priority=5)
	public void spouseempstatus() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select emp =new Select(driver.findElement(By.xpath(OR.getProperty("spouseempstatusxpath"))));
			emp.selectByIndex(Integer.parseInt(Config.getProperty("spouseempstatus")));
	}
	
	@Test(priority=6)
	public void spouselicensestatus() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select licstatus =new Select(driver.findElement(By.xpath(OR.getProperty("spouselicensestatus"))));
			licstatus.selectByIndex(Integer.parseInt(Config.getProperty("licensestatus")));
	}
	@Test(priority=7)
	public void spouselicenseAge() 
	  {
		//  driver.findElement(By.xpath(OR.getProperty("agewhenlicensedxpath"))).click();
		  driver.findElement(By.xpath(OR.getProperty("spouseagewhenlicensedxpath"))).sendKeys(Config.getProperty("agewhenlicensed"));
	  
	  }
	 @Test(priority=8)
		public void spouselicenseAnotherstateage() throws InterruptedException
		{
		 
		 Thread.sleep(4000);
		Select otherlicen =new Select(driver.findElement(By.xpath(OR.getProperty("spouseanotherstatelicense"))));
		otherlicen.selectByIndex(Integer.parseInt(Config.getProperty("anotherstatelicense"))); 
		}
	 
	    @Test(priority=9)
		public void spouseaccidentDamage() throws InterruptedException
		{
			 Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("spouseaccidentdamagexpath"))).click();
		}
		 @Test(priority=10)
		public void spouseviolation() throws InterruptedException
		{
			 Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("spouseviolationxpath"))).click();
		}
		
		 @Test(priority=11)
		public void spouseContiButton() throws InterruptedException
		{
			 Thread.sleep(4000);
			driver.findElement(By.xpath(OR.getProperty("spousecontinuebutton"))).click();
		}
		 
		
	
	
}
