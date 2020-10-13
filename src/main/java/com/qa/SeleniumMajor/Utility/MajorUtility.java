package com.qa.SeleniumMajor.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.io.Files;



public class MajorUtility 
{
 

	WebDriver driver;
    Actions action;
    Select select;
    WebDriverWait wait;
    
    public MajorUtility(WebDriver driver)
    {
    	this.driver=driver;
	}
     
    // this is to  find the element and converting to web element
    public WebElement getfindelement(By locator)
    {
    	JavaScriptUtitlity javascript=new JavaScriptUtitlity(driver);
    	WebElement element = null;
    	
    	
    	try
    	{
    		
    		element=driver.findElement(locator);
    		javascript.Highlightelement(element);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception occured during locator identify");
    		System.out.println(e.getMessage());
    	}
    	  return element;
    }
    
    //find the find elements
    public List<WebElement> getfindelements(By locators)
    {
    	List<WebElement> elements = null;
    	
    	try
    	{
    		elements=driver.findElements(locators);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception occured during locator identify of findelements");
    		System.out.println(e.getMessage());
    	}
    	  return elements;
    }
    
    // Clicking on the Webelement
     public void clicks(By locator)
    {
    	try
    	{
    		getfindelement(locator).click();
    	}
    	catch(Exception e)
    	{
    		System.out.println("exception occured:");
    		System.out.println(e.getMessage());
    	}
    	
    }
    
     
    // sending the value on the element
    public void sendkeydata(By locator, String values)
    {
    	try
    	{
    		
    		getfindelement(locator).sendKeys(values);
    	}
    	catch(Exception e)
    	{   System.out.println("exception occured:");
    		System.out.println(e.getMessage());
    	}
    }
    
    
    //Mouse ActionContextCLick
    public void mouseactionsrightclick(By locator)
    {
    	 action=new Actions(driver);
    	 WebElement el=getfindelement(locator);
    	try
    	{
    	  action.contextClick(el).build().perform();
    	}
    	catch(Exception e)
        {
    		System.out.println("MouseAction Exception");
    		System.out.println(e.getMessage());
        }
    }
    
   // Right clicking on the element and clicking on the particular option
    public  void  rightcliclpopupclick(By locator,By menulocators, String value)
	{
    	mouseactionsrightclick(locator);
    	
    	String righttext=null;
	 for (int i=0; i<getfindelements(menulocators).size(); i++)
	 {
		  righttext=getfindelements(menulocators).get(i).getText();
		 if(righttext.equals(value))
		 {
			 getfindelements(menulocators).get(i).click();
			 break;
		 }
		
	 }
     
   }
    
 // Right clicking on the element and print all the text
	public  ArrayList<String> rightclickandprint(By locator, By populocators)
	{
		mouseactionsrightclick(locator); 
		String righttext=null;
		ArrayList<String> list=new ArrayList<String>();	 
	   for(int i=0; i<getfindelements(populocators).size(); i++)
	   {
		  righttext=getfindelements(populocators).get(i).getText();
		  list.add(righttext);
		
	   }
       return list;
}
	
	//Selecting the option from the drop down
	public  void dropdownselection(By locator, String text)
	{
		WebElement el=getfindelement(locator);
		select=new Select(el);
		select.selectByVisibleText(text);
		 
	}
	
	//Selecting the dropdwon option and print option from the drop down
	
	public  void selectalldropdowncount(By locator)
	{
		WebElement el=getfindelement(locator); 
		select=new Select(el);
		List<WebElement>els=select.getOptions();
		 System.out.println(els.size());
		 for(int i=0; i<els.size(); i++)
		 {
			 String text=els.get(i).getText();
			 System.out.println(text);
		 }
		 
	}
    
	//Selecting all the dropdown count and value using the arraylist
	public  ArrayList<String> arraylistdropdwon(By locator)
	{
		WebElement el=getfindelement(locator); 
		select=new Select(el);
		 List<WebElement>allelement=select.getOptions();
		 System.out.println(allelement.size());
		 ArrayList<String> list=new ArrayList<String>();
		 for(int i=0; i<allelement.size(); i++)
		 {
			 String text=allelement.get(i).getText();
			 list.add(text);
			 //System.out.println(text);
		 }
		  
		 return list;
	}
	
	// Select drop down by drop down list by using selectByIndex
	public static void SelectbyIndex(WebElement element, int index)
	{
		Select select=new Select(element);
		 select.selectByIndex(index);
		 
	}
	
	// Select drop down by drop down list by using selectByValue
	public static void SelectbyValue(WebElement element, String value)
	{
		Select select=new Select(element);
		 select.selectByValue(value);
		 
	}
	
	
	//Deselecting the element form the select class.
	public static void Deselect(WebElement element, int index)
	{
		Select select=new Select(element);
		 select.deselectByIndex(index);
		 
	}
	
	
	//Without using the select class
	public  void withoutselect(By locator, String value)
	{
	  List<WebElement> lists=getfindelements(locator);
	  try
	  {
		  for(int i=0; i<lists.size(); i++)
		  {
			  String daytext=lists.get(i).getText();
			  if(daytext.equals(value))
			  {
				  lists.get(i).click();
				  break;
			  }
			  
		  }
	  }catch(Exception e)
	  {
		 System.out.println(e.getMessage());
	  }
	
    }
 
	
	//Explicit wait 
	public void explicitlywait(By locator, int timeout)
	{
		 wait=new WebDriverWait(driver,timeout);
		 try
		 {
			 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		 }
		 catch(Exception e)
		 {
				System.out.println(e.getMessage());
		 }
	}
	
	
	//Explicit wait
	public void explicitlywaitclickable(By locator, int timeout)
	{
		 wait=new WebDriverWait(driver,timeout);
		 try
		 {
			 wait.until(ExpectedConditions.elementToBeClickable(locator));
		 }
		 catch(Exception e)
		 {
				System.out.println(e.getMessage());
		 }
	}
	
	
	//Explicit wait
	public void explicitlyinVisible(By locator, int timeout)
	{
		WebElement ele=getfindelement(locator);
		wait=new WebDriverWait(driver,timeout);
		 try
		 {
			 wait.until(ExpectedConditions.invisibilityOf(ele));
		 }
		 catch(Exception e)
		 {
				System.out.println(e.getMessage());
		 }
	}
	
	//Explicit wait
	public void explicitlyVisible(By locator, int timeout)
	{
		WebElement ele=getfindelement(locator);
		wait=new WebDriverWait(driver,timeout);
		 try
		 {
			 wait.until(ExpectedConditions.visibilityOf(ele));
		 }
		 catch(Exception e)
		 {
				System.out.println(e.getMessage());
		 }
	}
		
	//Screenshot utility for entire page
	public void ScreenshotUtils(String Filename) 
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		try
		{
			
	      File src= screenshot.getScreenshotAs(OutputType.FILE);
	      File destfile=new File("D:\\eclipse\\SeleniumProject\\target\\"+Filename+".png");
	      FileUtils.copyFile(src, destfile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//Webelement screenshots with selenium 4
	public void ScreenshotUtilswebelement(By locator, String Filename) 
	{
		WebElement el=getfindelement(locator);
		TakesScreenshot screenshot=(TakesScreenshot)el;
		
		try
		{
	       File src= screenshot.getScreenshotAs(OutputType.FILE);
	       File destfile=new File("D:\\eclipse\\SeleniumProject\\target\\"+Filename+".png");
	       FileUtils.copyFile(src, destfile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	//fluentwait for the visibilityOf
	public void fluentwait(By locator, int timeout, int pollingtimeout)
	{
		//WebElement ele=driver.findElement(locator);
		Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtimeout))
				.ignoring(NoSuchElementException.class);
				
				 fluent.until(ExpectedConditions.presenceOfElementLocated(locator));
				
	}
	
	
	//fluentwait for the visibilityOf
	public void fluentwaitinvisbility(By locator, int timeout, int pollingtimeout)
	{
		WebElement ele=driver.findElement(locator);
		Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtimeout))
				.ignoring(NoSuchElementException.class);
				
				 fluent.until(ExpectedConditions.visibilityOf(ele));
				
	}
	
	//fluent wait override
	
	public WebElement fluentoverride(final By locator, int timeout, int pollingtimeout)
	{
		
		Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtimeout))
				.ignoring(NoSuchElementException.class);
				
	   WebElement element=fluent.until(new Function<WebDriver,WebElement>()
		{
		   public WebElement apply(WebDriver driver)
		   {
			   return driver.findElement(locator);
		   }
		});
		return element;		
	}
	
	
	//custom wait
	
	public void customwait(By locator,int timeout)  
	{
		//WebElement ele=null;
		
		for(int i=1;i<=timeout;i++)
		{
			try
			{
				driver.findElement(locator);
				
				break;
				
				
			}
			catch(Exception e)
			{
				System.out.println("first try waiting for the element"+locator+"seconds:::"+i);	
			
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e1)
			{
				
			}
			}

		}
		
	}

	public void Highlightelement2(WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0; i<=1000; i++)
		{
			backgroundcolor1("rgb(200,200,200)",element);
			backgroundcolor1(bgcolor,element);
			
		}
	}
	public void backgroundcolor1(String color,WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
	}
	

}

    
    

