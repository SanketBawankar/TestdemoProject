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

public class HomePage extends base{

@BeforeTest

public void initialize() throws IOException
{
	driver=intlDriver();
	driver.get(prop.getProperty("url"));
	 	
}
	
	
	
	
 @Test (dataProvider="getData")
 public void basePage(String Email, String Firstname, String Lastname) throws IOException
 {

	 
	 Getregister gt=new Getregister(driver);
	 gt.getLogin().click();
	 
	//Signup page
	 
	 Getsignup gs=new Getsignup(driver);
	 gs.getEmail().sendKeys(Email);
	 gs.getCreateaccount().click();
	 
	 //Register Details
	
	 Registerdetails rd=new Registerdetails(driver);
     rd.getGender().click();
	 rd.getfirstname().sendKeys(Firstname);
	 rd.getlastname().sendKeys(Lastname);
	 rd.getpassword().sendKeys("sank1234");
	 
	 
	 Select s=new Select(rd.getDate());
	 s.selectByIndex(20);
	 
	 Select sm=new Select(rd.getMonth());
	 sm.selectByValue("7");
	 
	 Select sy=new Select(rd.getYear());
	 sy.selectByValue("1990");
	 
	 rd.getnewsletter().click();
	 rd.getadressfirstname().sendKeys("Sanket");
	 rd.getadresslastname().sendKeys("Bawankar");
	 rd.getcompany().sendKeys("Nihi");
	 rd.getadress().sendKeys("adress");
	 rd.getadresstwo().sendKeys("adress2");
	 rd.getcity().sendKeys("Nagpur");
	 
	 Select st=new Select(rd.getState());
	 st.selectByValue("43");
	 
	 rd.getpostcode().sendKeys("12345");
	 rd.getaddinfo().sendKeys("this is the additional info");
	 rd.getphone().sendKeys("9823456789");
	 rd.getmobilephone().sendKeys("123456780");
	 rd.getassignadress().sendKeys("My new adress");
	 rd.getRegister().click();
	 
 }
 
 
 
 @DataProvider
 
 public Object[][] getData()
 {
	 Object[][] data= new Object [1][3];
	 data[0][0]="deepaksharma@gmail.com";
	 data[0][1]="pawan";
	 data[0][2]="kumar";
	 return data;
 }

 
 
@AfterTest

public void teardown()
{
	driver.close();
}
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

}
