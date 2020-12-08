package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Additemspage {

	public WebDriver driver;
	
	By additemone= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By ibutton= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]/i[1]");
	By addtocart= By.xpath("//span[contains(text(),'Add to cart')]");
	By continueshopping= By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]");
	
	
	By additemtwo= By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By addtocarttwo= By.xpath("//span[contains(text(),'Add to cart')]");
	By proceedcheck= By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]");

	public Additemspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getadditemone()
	{
		return driver.findElement(additemone);
	
	}
	
	public WebElement getibutton()
	{
		return driver.findElement(ibutton);
	
	}
	
	public WebElement getaddtocart()
	{
		return driver.findElement(addtocart);
	
	}
	
	public WebElement getcontinueshopping()
	{
		return driver.findElement(continueshopping);
	
	}
	
	public WebElement getadditemtwo()
	{
		return driver.findElement(additemtwo);
	
	}
	
	public WebElement addtocarttwo()
	{
		return driver.findElement(addtocarttwo);
	
	}
	
	public WebElement proceedcheck()
	{
		return driver.findElement(proceedcheck);
	
	}
	
	
	
}
