package com.qa.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{

	
	//interview question:
	//what is top casting, dynamic polymorphism, difference between driver.quite and driver.close.
	//what is webdriver,chromedriver?
	//what is WebDriver driver?
	 
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","D://eclipse//Chromdriver//chromedriver.exe");
		// if above method is not correct then it will give Staleelementexception()
		//if u dont declare above method then it will give webdriverexcption()
		WebDriver driver=new ChromeDriver(); // Here Session ID will be created and the constructor 
		//of the chromdriver class is called. After this every driver.commands 
		//are using that session ID for future operation
		
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		String googletitle=driver.getTitle();
		System.out.println("Google Title:  "+googletitle);
		
		if(googletitle.contentEquals("Google"))
		{
			System.out.println("Title is correct");
			
		}
		else 
		{
			System.out.println("Title is Wrong");
		}
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		//System.out.println(driver.getPageSource());
		System.out.println(currenturl);
		driver.quit(); //  this will close all the tabs which are opened for the browser and nullify the session ID.
          //Here it will give nosuchsessionexception.	
		driver.close(); //this will close the current tab of the browser and  session id will expire in this case,
		//it will not close all the tabs of the browser at the time.
	}

}
