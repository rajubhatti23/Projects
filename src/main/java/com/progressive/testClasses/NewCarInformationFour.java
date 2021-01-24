package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class NewCarInformationFour extends TestBase  {


	@Test(priority=1)
	public void modelyear() throws InterruptedException
	{Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath(OR.getProperty("carmodelyearxpath")));
		element.sendKeys(Config.getProperty("carmodelyear"));
		element.click();
		
	}
	@Test(priority=2)
	public void carname() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath(OR.getProperty("carnamexpath")));
		element.sendKeys(Config.getProperty("carname"));
		element.click();
		
	}
	@Test(priority=3)
	public void carmodel() throws InterruptedException
	{
		Thread.sleep(4000);
	WebElement element=	driver.findElement(By.xpath(OR.getProperty("carnumberxpath")));
	element.sendKeys(Config.getProperty("carnumber"));
		element.click();
	}
	@Test(priority=4)
	public void bodyType() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement element =driver.findElement(By.xpath(OR.getProperty("carbodyTypexpath")));
		Select body =new Select(element);
		body.selectByIndex(Integer.parseInt(Config.getProperty("carbodytype")));
		
		
	}
	@Test(priority=5)
	public void primaryUse() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement element =driver.findElement(By.xpath(OR.getProperty("primaryusexpath")));
		Select whatuse =new Select(element);
		whatuse.selectByIndex(Integer.parseInt(Config.getProperty("primaryuse")));
		
		
	}
	@Test(priority=6)
	public void lease() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement element =driver.findElement(By.xpath(OR.getProperty("Ownerstatusxpath")));
		Select newlease =new Select(element);
		newlease.selectByIndex(Integer.parseInt(Config.getProperty("ownerstatus")));
		
		
	}
	@Test(priority=7)
	public void carAge() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement element =driver.findElement(By.xpath(OR.getProperty("caragexpath")));
		Select ageOfcar =new Select(element);
		ageOfcar.selectByIndex(Integer.parseInt(Config.getProperty("carage")));
		
		
	}
	@Test(priority=8)
	public void checkbox()
	{
		
	driver.findElement(By.xpath(OR.getProperty("caragexpath"))).click();
	}
	 
	
	

	/*
	 * public void ebreak() throws InterruptedException { Thread.sleep(3000);
	 * ebreak.click(); }
	 */
	@Test(priority=9)
	public void doneButton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("donebuttonxpath"))).click();
	}
	@Test(priority=10)
	public void contiButton() throws InterruptedException
	
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("continuebuttonxpath"))).click();
	}
	

}
