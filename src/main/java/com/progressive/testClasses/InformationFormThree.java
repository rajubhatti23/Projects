
  package com.progressive.testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;

public class InformationFormThree extends TestBase{
  
  @Test(priority=1) 
  public void firstName() throws InterruptedException
  {
  Thread.sleep(7000);
  driver.findElement(By.xpath(OR.getProperty("firstnamexpath"))).sendKeys(Config.getProperty("firstname")); 
  }
  
  @Test(priority=2)
  public void lastName()
  {
  driver.findElement(By.xpath(OR.getProperty("lastnamexpath"))).sendKeys(Config.getProperty("lastname")); 
  }
  
  @Test(priority=3)
  public void dateOfBirth()
  {
  
  driver.findElement(By.xpath(OR.getProperty("dobxpath"))).sendKeys(Config.getProperty("dob"));
  
  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
  }
  
  @Test(priority=4)
  public void mailingAddress () throws InterruptedException 
  {
 driver.findElement(By.xpath(OR.getProperty("streetnamexpath"))).sendKeys(Keys.CLEAR);
  driver.findElement(By.xpath(OR.getProperty("streetnamexpath"))).sendKeys(Keys.TAB);
  Thread.sleep(4000); 
  // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  driver.findElement(By.xpath(OR.getProperty("streetnamexpath"))).sendKeys(Config.getProperty("streetname"));
  }
  
  @Test(priority=5)
  public void apartUnit() 
  {
  driver.findElement(By.xpath(OR.getProperty("apartunitxpath"))).sendKeys(Config.getProperty("appartment"));
  }
  
  @Test(priority=6)
  public void mailingcity() 
  {
  driver.findElement(By.xpath(OR.getProperty("cityxpath"))).sendKeys(Config.getProperty("city")); 
  }
  
  @Test(priority=7) 
  public void mailingzipcode() 
  {
  driver.findElement(By.xpath(OR.getProperty("zipcode2xpath"))).sendKeys(Config.getProperty("zipcode2"));
  }
  
  @Test(priority=8)
  public void checkBox()
  {
  driver.findElement(By.xpath(OR.getProperty("checkboxxpath"))).click();
  }
  
  @Test(priority=9) 
  public void getFinalQuote() 
  {
  driver.findElement(By.xpath(OR.getProperty("lastbuttonxpath"))).click(); }
 
  }
 