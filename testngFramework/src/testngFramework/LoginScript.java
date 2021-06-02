package testngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.webDriverWrapperClass;

public class LoginScript extends webDriverWrapperClass{
	

	@Test
	public void validcredentials()
	{
		
		 WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		 WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		 WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		 
		 username.sendKeys("06204021101");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 pass.sendKeys("Vishaka1");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 submit.click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 String actualValue = driver.getTitle();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 String expectedvalue = "TNEB Online Payment";
//		 WebDriverWait wait = new WebDriverWait(driver, 50);
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Last login :')]")));
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Last login :')]")));
		 Assert.assertEquals(actualValue, expectedvalue);
	}
	
	@Test
	public void invalidcredentials()
	{
		System.out.println("this from test");
		
		
		 WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		 WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		 WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		 username.sendKeys("06204021101");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 pass.sendKeys("Vishaka1");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		 submit.click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	//	 WebDriverWait wait = new WebDriverWait(driver, 50);
		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Last login :')]")));
		 
		//String actual =  driver.findElement(By.xpath("//span[contains(text(),'Bad Credentials / Account not activated?')]")).getText();
		// Assert.assertEquals(actual.trim(), "Bad Credentials / Account not activated?");
	}

}
