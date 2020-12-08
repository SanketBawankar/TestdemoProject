package DemoProject.E2EProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Getregister;
import pageObjects.Getsignup;
import pageObjects.Registerdetails;
import pageObjects.SigninPage;

public class ValidateQuerySub extends base{

	//Validate Sign in
@BeforeTest

	public void initialize() throws IOException
	{
		driver=intlDriver();
		driver.get(prop.getProperty("url"));
		 	
	}	
	
	
 @Test
 public void basePage() throws IOException
 {
	
	 
	 SigninPage sin=new SigninPage(driver);
	 sin.getSignin().click();
	 sin.getinputEmail().sendKeys("sanketbawankar344@gmail.com");
	 sin.getinputPassword().sendKeys("qwer1234");
	 sin.getSigninbutton().click();
	 sin.getContactus().click();
	 
	 Select s2=new Select(sin.getSubhead());
	 s2.selectByIndex(1);
	 
	 Select s3=new Select(sin.getorderref());
	 s3.selectByIndex(1);
	 
	 Select s4=new Select(sin.getProduct());
	 s4.selectByIndex(1);
	 

	 
	 sin.getMessage().click();
	 sin.getMessage().sendKeys("Thanks for your wonderful service");
	 sin.getSend().click();
	  
			  
 }
 
 
 
 @AfterTest

 public void teardown()
 {
 	driver.close();
 }
	 
	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

}
