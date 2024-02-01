package TestPackg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static WebDriver driver;

	public static void BrowLaunch(Object[] parameters) // object array it is parent of all data type
	{
		String key = (String) parameters[0];
		String value = (String) parameters[1];
	if(key.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	}

	public void geturl(Object[] url) {
		try{
		String urrl = (String) url[0];
		driver.get(urrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

//x path & send keys
	public static void findElement(Object[] parameters) {
		try {
		String element = (String) parameters[0];
		String key = (String) parameters[1];
		driver.findElement(By.xpath(element)).sendKeys(key);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public static void clicklogin(Object[] parameters) {
		try {
		String clikab = (String) parameters[0];
		driver.findElement(By.xpath(clikab)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}