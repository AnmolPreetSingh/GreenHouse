package common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class common2 {

	  public WebDriver driver;
	  public  Logger logger= Logger.getLogger(common2.class);
	 
	   public WebDriver OpenBrowser()  {
		            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
				    logger.info("opening browser");
					  driver = new ChromeDriver();
			
		
				
			
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    return driver;
			    
			    
			  }
		 
	  
	   
	   
	   public void Openurl()
	   {
	
		  driver.get("http://10.1.10.238:8081/greenhouse-1.0.0.BUILD-SNAPSHOT/");
		  logger.info("opened greenhouse");
		
	   
	      }
	 
		
		  public void closeBrowser() 
		{
		    driver.quit();
		}
		  
		  public void click(WebElement selement)
		  {
			  try
			  {
				 selement.click();
				 logger.info(selement+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void Sendusername(WebElement email ) {
			  try {
				  email.sendKeys("ask@test.com");
				  logger.info("ask@test.com entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void sendpassword(WebElement PWD ) {
			  try {
				  PWD.sendKeys("testgreen");
				  logger.info("testgreen entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void clickon(WebElement signinbutton)
		  {
			  try
			  {
				  signinbutton.click();
				 logger.info(signinbutton+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
			  }	  

}

		
}
