
  package testngFramework;
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.support.ui.ExpectedConditions; import
  org.openqa.selenium.support.ui.WebDriverWait; import
  org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
  
  import com.baseclass.webDriverWrapperClass;
  
  public class GetRecipt extends webDriverWrapperClass{
  
  
  
  @Test
  public void getReciptforconsumer() { 
	  WebElement username =
  driver.findElement(By.xpath("//input[@id='userName']")); 
	  WebElement pass =
  driver.findElement(By.xpath("//input[@id='password']")); 
	  WebElement submit =
  driver.findElement(By.xpath("//input[@name='submit']"));
  
  username.sendKeys("06204021101");
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
  pass.sendKeys("Vishaka1");
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
  submit.click();
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ; 
  String
  actualValue = driver.getTitle();
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ; 
  String
  expectedvalue = "TNEB Online Payment";
  WebDriverWait wait = new
  WebDriverWait(driver, 50);
  wait.until(ExpectedConditions.presenceOfElementLocated(By.
  xpath("//span[contains(text(),'Last login :')]"))); 
  WebElement eRecipt =
  driver.findElement(By.xpath("//a[@href='/atm/paymentReport']"));
  
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
  eRecipt.click();
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ; WebElement
  consumerNo = driver.findElement(By.xpath("//input[@id='form:comid']"));
  WebElement submiteRecipt =
  driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
  consumerNo.sendKeys("06204021101");
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
  submiteRecipt.click(); 
  } 
  }
 