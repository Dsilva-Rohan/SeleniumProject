package com.qa.SeleniumUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility 
{
	public static void dropdownselection(WebElement element, String text)
	{
		Select select=new Select(element);
		 select.selectByVisibleText(text);
		 
	}
	public static void selectalldropdowncount(WebElement element)
	{
		Select select=new Select(element);
		 List<WebElement>allelement=select.getOptions();
		 System.out.println(allelement.size());
		 for(int i=0; i<allelement.size(); i++)
		 {
			 String text=allelement.get(i).getText();
			 System.out.println(text);
		 }
		 
	}
    
	//Selecting all the dropdown count and value using the arraylist
	public static ArrayList<String> arraylistdropdwon(WebElement element)
	{
		Select select=new Select(element);
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
	
	public static void SelectbyIndex(WebElement element, int index)
	{
		Select select=new Select(element);
		 select.selectByIndex(index);
		 
	}
	
	public static void SelectbyValue(WebElement element, String value)
	{
		Select select=new Select(element);
		 select.selectByValue(value);
		 
	}
	
	public static void Deselect(WebElement element, int index)
	{
		Select select=new Select(element);
		 select.deselectByIndex(index);
		 
	}
	public static void withoutselect(List<WebElement> element, String value)
	{
		
	 for(int i=0; i<element.size(); i++)
	  {
		  String daytext=element.get(i).getText();
		  if(daytext.equals(value))
		  {
			  element.get(i).click();
			  break;
		  }
		  
	  }
}
    
}
