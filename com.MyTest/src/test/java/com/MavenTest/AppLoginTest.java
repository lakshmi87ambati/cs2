package com.MavenTest;



import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.MavenTest.Utilities.BrowserFactory;
import com.MavenTest.Utilities.CaptureScreens;
import com.MavenTest.Utilities.OrangePageObjects;


public class AppLoginTest 
{
	public static WebDriver driver;
	public static String weburl="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public static BrowserFactory browser=new BrowserFactory();
	public static OrangePageObjects loginpage=new OrangePageObjects(driver);
	public static CaptureScreens screen=new CaptureScreens();
    
    @Test
    public void shouldAnswerWithTrue()
    {
    	/*
    	driver=BrowserFactory.getbrowser("firefox",weburl);
		loginpage=new OrangePageObjects(driver);
		OrangePageObjects.getusername("Admin");
		
		OrangePageObjects.getpassword("admin123");
		
		OrangePageObjects.login();
		
		OrangePageObjects.clickleavebutton();
		OrangePageObjects.clickAssignLeave();
		//CaptureScreens.ScreenCapture(driver,"Assign Leave Page");
		OrangePageObjects.enteremplyeename();
		OrangePageObjects.leavetype();
		OrangePageObjects.leaveFromdate();
		OrangePageObjects.leaveTodate();
		OrangePageObjects.comment();
		OrangePageObjects.clickAssignButton();
		*/
    	driver=BrowserFactory.getbrowser("firefox",weburl);
		loginpage=new OrangePageObjects(driver);
		OrangePageObjects.getusername("Admin");
		
		OrangePageObjects.getpassword("admin123");
		
		OrangePageObjects.login();
		
		OrangePageObjects.recruitmentbutton();
		OrangePageObjects.candidatesbutton();
		OrangePageObjects.vacancy();
		OrangePageObjects.hiringmanager();
		OrangePageObjects.status();
		OrangePageObjects.getcandidatename();
		OrangePageObjects.getkeywords();
		OrangePageObjects.getFromdate();
		OrangePageObjects.getTodate();
		OrangePageObjects.methodOfApplication();
		OrangePageObjects.clickaddbutton();
		
		CaptureScreens.ScreenCapture(driver,"Add Candidate Page");
		driver.close();
        
    }
}
