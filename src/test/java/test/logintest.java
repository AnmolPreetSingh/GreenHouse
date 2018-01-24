package test;





import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



import common.common2;
import pages.homepage;

public class logintest {
	private WebDriver driver;
	public common2 obj1;
	
	public  Logger logger= Logger.getLogger(logintest.class);
	
	
	@BeforeMethod
	public void setUp()
	{
	obj1=new common2();
	driver=obj1.OpenBrowser();
	obj1.Openurl();
	logger.info("first comment");
	
	}
	
	@Test
	public void mainTest()
	{
		   
		
		homepage obj2=new homepage(driver);
		obj2.Login();
		obj2.checktext();
		logger.info("second comment");
		
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	

	public void teardown()
	{
		
		obj1.closeBrowser();
	
	}
}
