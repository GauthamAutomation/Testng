package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class webDriverWrapperClass {
	
	public  WebDriver driver;
	@BeforeMethod
	//@Parameters({"browser"})
	@Parameters({"browser"})
	public void setup(@Optional("ch")String browserName)
	{
		String bname = browserName;
		if(bname.equalsIgnoreCase("ff"))
		{
			
		}
		else if(bname.equalsIgnoreCase("ie"))
		{
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		 driver.get("https://www.tnebnet.org/atm/login");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
