package com.MavenTest.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrangePageObjects {
	
	public static  WebDriver driver;
	
	public OrangePageObjects(WebDriver driver) {
			OrangePageObjects.driver=driver;
	}
	
	public  static void getusername(String un) {
		driver.findElement(By.name("txtUsername")).sendKeys(un);
		
		
		}
	
	public static void getpassword(String pwd) {
		
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		
	}
	
	public static void login() {
		WebElement loginbutton= driver.findElement(By.name("Submit"));
		if(loginbutton.isEnabled())
		{
			loginbutton.click();
			System.out.println("login successfully");
		}
		else
		{
			System.out.println("login is not successfully");
		}
	}
	
	public static void logout() {
		WebElement logoutbutton=driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
		if(logoutbutton.isEnabled())
		{
			logoutbutton.click();
			System.out.println("logout successfully");
		}
		else
		{
			System.out.println("logout is not successfully");
		}
	}
	
	public static void recruitmentbutton() {
		driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")).click();
	}
	
	public static void candidatesbutton() {
		driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewCandidates\"]")).click();
	}
	
	public static void jobtitle() {
		Select jobtitle= new Select( driver.findElement(By.xpath("//*[@id=\"candidateSearch_jobTitle\"]")));
		jobtitle.selectByVisibleText("QAEngineer");
		
		
	}

	
	public static void vacancy() {
		Select  vacancy=new Select(driver.findElement(By.xpath("//*[@id=\"candidateSearch_jobVacancy\"]")));
		vacancy.selectByVisibleText("All");
	}
	public static void hiringmanager() {
		Select hiringmanager=new Select(driver.findElement(By.xpath("//*[@id=\"candidateSearch_hiringManager\"]")));
		hiringmanager.selectByVisibleText("All");
	}
	public static void status() {
		Select status=new Select(driver.findElement(By.xpath("//*[@id=\"candidateSearch_status\"]")));
		status.selectByVisibleText("Application Initiated");
	}
	public static void getcandidatename() {
		driver.findElement(By.xpath("//*[@id=\"candidateSearch_candidateName\"]")).sendKeys("ambati tulasi");
		
	}
	public static void getkeywords() {
		driver.findElement(By.xpath("//*[@id=\"candidateSearch_keywords\"]")).sendKeys("Automation tester");
	}
	public static void getFromdate() {
		WebElement dateBox=driver.findElement(By.xpath("//*[@id=\"candidateSearch_fromDate\"]"));
		dateBox.sendKeys("02102021");
		
	}
	
	public static void getTodate() {
		WebElement dateBox=driver.findElement(By.xpath("//*[@id=\"candidateSearch_toDate\"]"));
		dateBox.sendKeys("02122021");
		
	}
	public static void methodOfApplication() {
		driver.findElement(By.xpath("//*[@id=\"candidateSearch_modeOfApplication\"]")).sendKeys("online");;
	}
	
	public static void clickaddbutton() {
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
	}
	

	public static void clickleavebutton() {
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]")).click();
	}
	
	public static void clickAssignLeave() {
		driver.findElement(By.xpath("//*[@id=\"menu_leave_assignLeave\"]")).click();
	}
	
	public static void enteremplyeename() {
		driver.findElement(By.xpath("//*[@id=\"assignleave_txtEmployee_empName\"]")).sendKeys("ambati tulasi");
	}
	public static void leavetype() {
		Select leavetype=new Select(driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]")));
		leavetype.selectByVisibleText("US - Vacation");
	}
	public static void leaveFromdate() {
		WebElement dateBox=driver.findElement(By.xpath("//*[@id=\"assignleave_txtFromDate\"]"));
		dateBox.sendKeys("02152021");
		
	}
	
	public static void leaveTodate() {
		WebElement dateBox=driver.findElement(By.xpath("//*[@id=\"assignleave_txtToDate\"]"));
		dateBox.sendKeys("02202021");
		
	}
	public static void comment() {
		driver.findElement(By.xpath("//*[@id=\"assignleave_txtComment\"]")).sendKeys("Paris 5 Days tour");
	}
	public static void clickAssignButton() {
		driver.findElement(By.xpath("//*[@id=\"assignBtn\"]")).click();
	}
	
}



