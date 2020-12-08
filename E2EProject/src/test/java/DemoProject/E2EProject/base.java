package DemoProject.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver intlDriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Work\\Eclipse Workspace\\E2EProject\\src\\test\\java\\DemoProject\\E2EProject\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanket\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sanket\\Firedriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sanket\\IEdriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	

}
