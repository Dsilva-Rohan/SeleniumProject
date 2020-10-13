package com.qa.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownallvalue
{
	public static void main(String args[])
	{
		
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  WebElement dayelement=driver.findElement( By.id("day"));
	  WebElement monthelement=driver.findElement( By.id("month"));
	  WebElement yearelement=driver.findElement( By.id("year"));
		/*
		 * Thread.sleep(5000); Select select=new Select(element);
		 * select.selectByVisibleText("30");
		 * 
		 */
	  dropdownselection(dayelement);
	  dropdownselection(monthelement);
	  dropdownselection(yearelement);
	}	
	
	public static void dropdownselection(WebElement element)
	{
		Select select=new Select(element);
		List<WebElement> elements= select.getOptions();
		 System.out.println("Count:"+ elements.size());
		 for(int i=0; i<elements.size(); i++)
		 {
			 String text=elements.get(i).getText();
			 System.out.println(text);
	     }
}
}
