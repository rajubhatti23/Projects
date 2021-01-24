package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class FinalDetailsEight extends TestBase {
	@Test(priority=1)
	public void insurancequ() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("insurancequestion"))).click();
	}
	@Test(priority=2)
	public void timewithcompany() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select comptime =new Select(driver.findElement(By.xpath(OR.getProperty("timewithcompany"))));
			comptime.selectByIndex(Integer.parseInt(Config.getProperty("timewithcompany")));
	}
	
	@Test(priority=3)
	public void injurylimit() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select limit =new Select(driver.findElement(By.xpath(OR.getProperty("injuryinsurance"))));
			limit.selectByIndex(Integer.parseInt(Config.getProperty("injuryinsu")));
	}
	
	@Test(priority=4)
	public void nonautoinsurance()
	{
		driver.findElement(By.xpath(OR.getProperty("nonautopolicy"))).click();
	}
	
	@Test(priority=5)
	public void autoinsurance()
	{
		driver.findElement(By.xpath(OR.getProperty("autoinsurance"))).click();
	}
	@Test(priority=6)
	 public void insuranceStart() throws InterruptedException
	  {
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("insuranceStartdate"))).click();
	  driver.findElement(By.xpath(OR.getProperty("insuranceStartdate"))).sendKeys(Config.getProperty("insuranceStart"));
	  
	  
	  }
	
	@Test(priority=7)
	public void email() throws InterruptedException 
	  {
		Thread.sleep(3000);
		 driver.findElement(By.xpath(OR.getProperty("email"))).click();
		  driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys(Config.getProperty("email"));
	  
	  }
	@Test(priority=8)
	public void umbrellapolicy() throws InterruptedException 
	  {
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath(OR.getProperty("umbrellapolicy"))).click();
	  
	  }
	@Test(priority=9)
	public void continueb() throws InterruptedException 
	  {
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath(OR.getProperty("secondlastcontinuebutton"))).click();
	  
	  }
	
	@Test(priority=10)
	public void nothanks() throws InterruptedException 
	  {
		Thread.sleep(5000);
		
		  driver.findElement(By.xpath(OR.getProperty("nothanksbutton"))).click();
	  
	  }
	
	@Test(priority=11)
	public void finishbuy() throws InterruptedException 
	  {
		Thread.sleep(6000);
		
		  driver.findElement(By.xpath(OR.getProperty("finishbuy"))).click();
	  
	  }
	
	

}
