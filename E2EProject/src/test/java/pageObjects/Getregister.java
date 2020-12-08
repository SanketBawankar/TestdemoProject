package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Getregister {

	public WebDriver driver;
	
	By signin= By.cssSelector("a[href*='my-account']");
	By signin1= By.className("login");
	
	
	public Getregister(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getLogin()
	{
		
		return driver.findElement(signin);
	}
	
	
	
	
	
}
