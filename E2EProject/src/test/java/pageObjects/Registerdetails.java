package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registerdetails {

	public WebDriver driver;
	
	By gender=By.xpath("//div[@id='uniform-id_gender1']");
	By firstname=By.id("customer_firstname");
	By lastname=By.id("customer_lastname");
	By password=By.id("passwd");
	By date=By.xpath("//select[@id='days']");
	By month=By.xpath("//select[@id='months']");
	By year=By.xpath("//select[@id='years']");
	By newsletter=By.xpath("//label[contains(text(),'Sign up for our newsletter!')]");
	By adressfirstname=By.xpath("//input[@id='firstname']");
	By adresslastname=By.xpath("//input[@id='lastname']");
	By company=By.cssSelector("#company"); // Check
	By adress=By.cssSelector("#address1");
	By adresstwo=By.cssSelector("#address2");
	By city=By.cssSelector("#city");
	By state=By.xpath("//select[@id='id_state']");
	By postcode=By.cssSelector("#postcode");
	By addinfo=By.cssSelector("#other");
	By phone=By.cssSelector("#phone");
	By mobilephone=By.xpath("//input[@id='phone_mobile']");
	By assignadress=By.xpath("//input[@id='alias']");
	By register= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
	
	
	public Registerdetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getGender()
	{
		return driver.findElement(gender);
	}
	
	public WebElement getfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement getlastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getDate()
	{
		
		return driver.findElement(date);
	}
	
	public WebElement getMonth()
	{
		
		return driver.findElement(month);
	}
	
	public WebElement getYear()
	{
		
		return driver.findElement(year);
	}
	
	public WebElement getnewsletter()
	{
		return driver.findElement(newsletter);
	}
	
	public WebElement getadressfirstname()
	{
		return driver.findElement(adressfirstname);
	}
	
	public WebElement getadresslastname()
	{
		return driver.findElement(adresslastname);
	}
	
	public WebElement getcompany()
	{
		return driver.findElement(company);
	}
	
	public WebElement getadress()
	{
		return driver.findElement(adress);
	}
	
	public WebElement getadresstwo()
	{
		return driver.findElement(adresstwo);
	}
	
	public WebElement getcity()
	{
		return driver.findElement(city);
	}
	
	public WebElement getState()
	{
		return driver.findElement(state);
	}
	
	public WebElement getpostcode()
	{
		return driver.findElement(postcode);
	}
	
	public WebElement getaddinfo()
	{
		return driver.findElement(addinfo);
	}
	
	public WebElement getphone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement getmobilephone()
	{
		return driver.findElement(mobilephone);
	}
	
	public WebElement getassignadress()
	{
		return driver.findElement(assignadress);
	}
	
	public WebElement getRegister()
	{
		return driver.findElement(register);
	}
	
	
}
