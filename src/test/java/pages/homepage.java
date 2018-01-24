package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.common2;

public class homepage extends common2 {
	
	  private WebDriver driver;
   
	  @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/ul/li[1]/a")
      private WebElement Signin;
     
      @FindBy(how = How.XPATH, using = "//*[@id='login']")
      private WebElement email;
      
      @FindBy(how = How.XPATH, using = "//*[@id='password']")
      private WebElement PWD;
      
      @FindBy(how = How.XPATH, using = "//*[@id='signin']/p[1]/button")
      private WebElement signinbutton;
      
      
      
     
      
      
      
   public homepage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
      
    
	public void Login()
	{
		click(Signin);
	     Sendusername(email);
	     sendpassword(PWD);
	    clickon(signinbutton);
	   
	}
	
	public void checktext() {
		
		  String ExpectedText="Your sign in information was incorrect. Please try again or sign up.";
		  String ActualText=driver.findElement(By.xpath("//*[@id='signin']/div/div")).getText();
		  Assert.assertEquals(ExpectedText, ActualText);
		  logger.info("text verified");
		}
	}



