package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class QuestionPageFive extends TestBase

{
	
	 @Test(priority=1)
		public void gender() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath(OR.getProperty("genderxpath"))).click();
			
		}
	 @Test(priority=2)
	public void maritalStatus() throws InterruptedException
	{
		Thread.sleep(4000);
		Select marital =new Select(driver.findElement(By.xpath(OR.getProperty("maritalstatusxpath"))));
		marital.selectByIndex(Integer.parseInt(Config.getProperty("maritalstatus")));
		
	}
	 @Test(priority=3) 
	public void education() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select educ =new Select(driver.findElement(By.xpath(OR.getProperty("educationxpath"))));
			educ.selectByIndex(Integer.parseInt(Config.getProperty("educationlevel")));
	}
	 @Test(priority=4)
	public void empStatus() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select empstat =new Select(driver.findElement(By.xpath(OR.getProperty("empstatusxpath"))));
			empstat.selectByIndex(Integer.parseInt(Config.getProperty("employeestatus")));
	}

	/*
	 * @Test(priority=5) public void jobTitle(String job) { //
	 * driver.findElement(By.xpath(OR.getProperty("jobtitle"))).click();
	 * driver.findElement(By.xpath(OR.getProperty("jobtitlexpath"))).sendKeys(Config
	 * .getProperty("jobtitle"));
	 * driver.findElement(By.xpath(OR.getProperty("jobtitlexpath"))).click(); }
	 */
	 
	 @Test(priority=5)
	public void socialSecurity() throws InterruptedException
	{
		 driver.findElement(By.xpath(OR.getProperty("socialxpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("socialxpath"))).sendKeys(Config.getProperty("socialsecurity"));
		
	}
	 @Test(priority=6)
	 public void pResidance() throws InterruptedException
		{
		 Thread.sleep(4000);
			Select presi =new Select(driver.findElement(By.xpath(OR.getProperty("primaryresidancexpath"))));
			presi.selectByIndex(Integer.parseInt(Config.getProperty("primaryresidance")));
		}
	 @Test(priority=7)
	 public void lastMove() throws InterruptedException
		{
		 Thread.sleep(4000);
			Select plastmove =new Select(driver.findElement(By.xpath(OR.getProperty("lastmovexpath"))));
			plastmove.selectByIndex(Integer.parseInt(Config.getProperty("lastmove")));
		}
	 @Test(priority=8)
	public void licensestatus() throws InterruptedException
	{
		Thread.sleep(4000);
		Select licen =new Select(driver.findElement(By.xpath(OR.getProperty("licensestatusxpath"))));
		licen.selectByIndex(Integer.parseInt(Config.getProperty("licensestatus")));
	}
	 @Test(priority=9)
	  public void licenseAge() 
	  {
		//  driver.findElement(By.xpath(OR.getProperty("agefirstlicensedxpath"))).click();
		  driver.findElement(By.xpath(OR.getProperty("agefirstlicensedxpath"))).sendKeys(Config.getProperty("agefirstlicensed"));
	  
	  }
	 
	 @Test(priority=10)
		public void licenseAnotherstateage() throws InterruptedException
		{
		 
		 Thread.sleep(4000);
		Select otherlicen =new Select(driver.findElement(By.xpath(OR.getProperty("anothercountrylicense"))));
		otherlicen.selectByIndex(Integer.parseInt(Config.getProperty("licenseinothercountry"))); 
		}

	
	
	
	
		
		
		 

	 @Test(priority=11)
	public void accidentDamage() throws InterruptedException
	{
		 Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("accidentclaimxpath"))).click();
	}
	 @Test(priority=12)
	public void violation() throws InterruptedException
	{
		 Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("violationticket"))).click();
	}
	
	 @Test(priority=13)
	public void ContiButton() throws InterruptedException
	{
		 Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("continuebutton"))).click();
	}
	

}
