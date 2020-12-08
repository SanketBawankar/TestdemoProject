package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {

	public WebDriver driver;
	
	By signin1= By.xpath("//a[contains(text(),'Sign in')]");
	By inputemail= By.xpath("//input[@id='email']");
	By inpupassword= By.xpath("//input[@id='passwd']");
	By signinButton= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");
	By homeButton= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]");
	
	
	By inputsignin= By.cssSelector("body.my-account.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) a.account > span:nth-child(1)");
	By orderhistory= By.xpath("//span[contains(text(),'Order history and details')]");
	
	By contactus= By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[3]/a[1]");
	By subhead= By.xpath("//select[@id='id_contact']");
	By orderref= By.xpath("//select[@name='id_order']");
	By product= By.xpath("//select[@id='263379_order_products']");
	By message= By.xpath("//textarea[@id='message']");
	By send= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]");

	
	
	
	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getSignin()
	{
		return driver.findElement(signin1);
	
	}
	
	public WebElement getinputEmail()
	{
		return driver.findElement(inputemail);
	
	}
	
	public WebElement getinputPassword()
	{
		return driver.findElement(inpupassword);
	
	}
	
	public WebElement getSigninbutton()
	{
		return driver.findElement(signinButton);
	
	}
	
	public WebElement getHomebutton()
	{
		return driver.findElement(homeButton);
	
	}
	
	public WebElement getinputsignin()
	{
		return driver.findElement(inputsignin);
	
	}
	
	public WebElement orderhistory()
	{
		return driver.findElement(orderhistory);
	
	}
	
	public WebElement getContactus()
	{
		return driver.findElement(contactus);
	
	}
	
	public WebElement getSubhead()
	{
		return driver.findElement(subhead);
	
	}
	
	public WebElement getorderref()
	{
		return driver.findElement(orderref);
	
	}
	
	public WebElement getProduct()
	{
		return driver.findElement(product);
	
	}
	
	public WebElement getMessage()
	{
		return driver.findElement(message);
	
	}
	
	public WebElement getSend()
	{
		return driver.findElement(send);
	
	}
	
	
	
	
}
