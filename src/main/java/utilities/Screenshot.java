package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void takescreenshot(WebDriver driver,String screenshotname) 
	{
		try {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(src, new File(".\\screenshots\\"+screenshotname+".jpg"));
			System.out.println("Screenshot Taken");
			Thread.sleep(3000);
		} catch (IOException e) {
			
			System.out.println("Error while takingScreenshot");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
