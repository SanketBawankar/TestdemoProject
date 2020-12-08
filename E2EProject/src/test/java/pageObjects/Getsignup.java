package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Getsignup {

	public WebDriver driver;
	
	By emailadress= By.xpath("//*[@id='email_create']");
	
	By createaccount=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	
	
	
	public Getsignup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}





	public WebElement getEmail()
	{
		
		return driver.findElement(emailadress);
	}
	
	public WebElement getCreateaccount()
	{
		
		return driver.findElement(createaccount);
	}
}
