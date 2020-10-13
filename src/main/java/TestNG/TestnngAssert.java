package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestnngAssert
{
   
WebDriver driver;
   
   @BeforeMethod
   public void setup()
   {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://www.goindigo.in/");
	   driver.manage().window().fullscreen();
   }
   
   @Test(priority=1)
   public void titles()
   {
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Book Domestic & International Flights at Lowest Airfare - IndiGo");
	  
   }
   
   
   @Test(priority=2)
   public void logotest()
   {
	   boolean flag=driver.findElement(By.xpath("//img[@alt='indigo-logo']")).isDisplayed();
	   Assert.assertTrue(flag);
   }
   
   @AfterMethod()
   public void Teardown()
   {
	   driver.quit();
   }
}
