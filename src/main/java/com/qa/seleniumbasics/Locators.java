package com.qa.seleniumbasics;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D://eclipse//Chromdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> windownames=driver.getWindowHandles();
	    Iterator<String> it= windownames.iterator();
		String parent = it.next();
		System.out.println("parentID"+parent);
		String child = it.next();
		System.out.println("childID"+child);
		driver.switchTo().window(child); 
		
		//ID locator
		driver.findElement(By.id("identifierId")).sendKeys("rohanestar@gmail.com");
		//xpathlocator
		WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
		element.clear();
		element.sendKeys("rohanestar@gmail.com");
		//cssselectorlocator
		WebElement element2=driver.findElement(By.cssSelector("#identifierId"));
		element2.clear();
		element2.sendKeys("rohanestarcss@gmail.com");
	    driver.findElement(By.linkText("Help")).click();
	    Thread.sleep(5000);
	    
	    String originalHandle = driver.getWindowHandle();

	    //Do something to open new tabs

	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }

	    driver.switchTo().window(child);
	  
	   Thread.sleep(5000);

	   driver.findElement(By.partialLinkText("Learn")).click();
	   //driver.navigate().back(); 
	   //Name locator
	   driver.findElement(By.name("q")).sendKeys("testing");
	   Thread.sleep(5000);
	   driver.navigate().back(); 
	   //in class name you have to enter only one class not multiple class which you find the tag of the DOM
	   
	   //driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("ClassnameTest");
		
	   driver.findElement(By.className("whsOnd")).sendKeys("ClassnameTest");
		
	}

	}
	


  