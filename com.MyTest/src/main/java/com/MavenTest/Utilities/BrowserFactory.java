package com.MavenTest.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static  WebDriver getbrowser(String browsername, String appurl) {
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
			if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./browsers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
		else
			if(browsername.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver","./browsers/msedgedriver.exe");
				driver=new EdgeDriver();
			}
		driver.get(appurl);
		driver.manage().window().maximize();
		return driver;
	}

	public static void closebrowser() {
		driver.quit();
	}
	
	
	
}
