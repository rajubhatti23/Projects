package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class PolicyDetailNine extends TestBase
{
	@Test(priority=1)
	public void phone() throws InterruptedException 
	  {
		Thread.sleep(8000);
		 driver.findElement(By.xpath(OR.getProperty("phonexpath"))).click();
		  driver.findElement(By.xpath(OR.getProperty("phonexpath"))).sendKeys(Config.getProperty("phonenumber"));
	  
	  }
	
	@Test(priority=2)
	public void licenseno() throws InterruptedException 
	  {
		Thread.sleep(3000);
		 driver.findElement(By.xpath(OR.getProperty("licensenumber"))).click();
		  driver.findElement(By.xpath(OR.getProperty("licensenumber"))).sendKeys(Config.getProperty("licensenum"));
	  
	  }
	
	@Test(priority=3)
	public void spouselicenseno() throws InterruptedException 
	  {
		Thread.sleep(3000);
		 driver.findElement(By.xpath(OR.getProperty("spouselicensenum"))).click();
		  driver.findElement(By.xpath(OR.getProperty("spouselicensenum"))).sendKeys(Config.getProperty("spouselicensenum"));
	  
	  }
	
	@Test(priority=4)
	public void vinnumber() throws InterruptedException 
	  {
		Thread.sleep(3000);
		 driver.findElement(By.xpath(OR.getProperty("vinnumber"))).click();
		  driver.findElement(By.xpath(OR.getProperty("vinnumber"))).sendKeys(Config.getProperty("vinnumbers"));
	  
	  }
	
	@Test(priority=5)
	public void companyname() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select name =new Select(driver.findElement(By.xpath(OR.getProperty("insurancecompanyname"))));
			name.selectByIndex(Integer.parseInt(Config.getProperty("companyname")));
	}
	
	@Test(priority=6)
	public void policynumber() throws InterruptedException 
	  {
		Thread.sleep(3000);
		 driver.findElement(By.xpath(OR.getProperty("policynumberxpath"))).click();
		  driver.findElement(By.xpath(OR.getProperty("policynumberxpath"))).sendKeys(Config.getProperty("policynumber"));
	  
	  }
	@Test(priority=7)
	public void recievedocuments() throws InterruptedException
	{
		 Thread.sleep(4000);
			Select docu =new Select(driver.findElement(By.xpath(OR.getProperty("recievedocumentby"))));
			docu.selectByIndex(Integer.parseInt(Config.getProperty("recievedocument")));
	}
	@Test(priority=8)
	public void continuebuttonsss() throws InterruptedException 
	  {
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath(OR.getProperty("onemorecontinue"))).click();
	  
	  }

}
