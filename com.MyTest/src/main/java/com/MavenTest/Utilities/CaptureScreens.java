package com.MavenTest.Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreens {
	
	public static WebDriver driver;
	public static  String ScreenCapture(WebDriver driver, String screenname) {
		try {
			TakesScreenshot Screens=(TakesScreenshot)driver;
			File file=Screens.getScreenshotAs(OutputType.FILE);
			String destination="./Screen/"+screenname+".png";
			File dest=new File(destination);
			FileUtils.copyFile(file, dest);
			
			
			
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Captured screen");
		}
		return screenname;
		}
	

}
