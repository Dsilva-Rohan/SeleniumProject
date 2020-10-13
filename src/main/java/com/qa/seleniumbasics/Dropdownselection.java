package com.qa.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownselection
{
	public static void main(String args[]) throws InterruptedException
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
	  dropdownselection(dayelement,"25");
	  dropdownselection(monthelement,"Aug");
	  dropdownselection(yearelement,"2010");
	}	
	
	public static void dropdownselection(WebElement element, String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
		 
	}
	
	
	 
                 /* Selecting the multiple values from the drop down */
	 
	        //WebElement select1 = driver.findElement(By.xpath("//option[@value='Maruti']"));
	      //  WebElement select2 = driver.findElement(By.xpath("//option[@value='Honda']"));
	        //Actions action = new Actions(driver);
	       // action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();
	 
}
