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

public class ValidateTitle extends base{

@BeforeTest

	public void initialize() throws IOException
	{
		driver=intlDriver();
		driver.get(prop.getProperty("url"));
		 	
	}
	
	
	
	
 @Test
 public void basePage() throws IOException
 {

	 
	 String PageTitle = driver.getTitle();
	 
	 if(PageTitle.equalsIgnoreCase("My Store"))
	 {
		 System.out.println("Title Matched");
	 }
	 else
	 {
		 System.out.println("Title didn't Matched"); 
	 }
	 
 	 
 }
 
 
 
 @AfterTest

 public void teardown()
 {
 	driver.close();
 }
	 
	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

}
