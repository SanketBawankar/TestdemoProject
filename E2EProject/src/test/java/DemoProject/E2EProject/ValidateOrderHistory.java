package DemoProject.E2EProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Getregister;
import pageObjects.Getsignup;
import pageObjects.Registerdetails;
import pageObjects.SigninPage;

public class ValidateOrderHistory extends base{

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
	 
	 sin.getinputsignin().click();
	 sin.orderhistory().click();
	 
	 
			  
 }
 
 
 @AfterTest

 public void teardown()
 {
 	driver.close();
 }
	 
	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

}
