package com.qa.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigations {

	//Intervdiew question:
	//Whart is the diffrence between driver.navigate().to() and driver.get?
		
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//Chromdriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		//driver.quit();

	}

}
