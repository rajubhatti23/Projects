package com.progressive.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	
	public static WebDriver driver;
    public static Properties Config=new Properties();
    public static Properties OR=new Properties();
    public static FileInputStream fis;
    @BeforeSuite
    public void setUp()
    {
    	
    	if(driver==null)
    	{
    		try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
				Config.load(fis); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
    		if(Config.getProperty("browser").equalsIgnoreCase("chrome"))
    		{
    			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+".\\libs\\chromedriver2.exe");
    			driver=new ChromeDriver();
    		}
    		else if(Config.getProperty("browser").equalsIgnoreCase("firefox"))
    		{
    			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+".\\libs\\geckodriver.exe");
    			driver=new FirefoxDriver();
    		}
    		else if(Config.getProperty("browser").equalsIgnoreCase("ie"))
    		{
    			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+".\\libs\\IEDriverServer.exe");
    			driver=new InternetExplorerDriver();
    		}
    		driver.get(Config.getProperty("testsite"));
    		driver.manage().window().maximize();
    		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicittime")), TimeUnit.SECONDS);
    	}
    	
    }
    @AfterSuite
    public void tearDown()
    {
    	if(driver!=null)
    	{
    		//driver.quit();
    	}
    }
	

}
