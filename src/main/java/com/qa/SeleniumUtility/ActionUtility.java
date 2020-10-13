package com.qa.SeleniumUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ActionUtility
{
	
	public static void  rightclick(List<WebElement> rightclickelement, String value)
	{
		 String righttext=null;
	for (int i=0; i<rightclickelement.size(); i++)
	 {
		  righttext=rightclickelement.get(i).getText();
		 if(righttext.equals(value))
		 {
			 rightclickelement.get(i).click();
			 break;
		 }
		
	 }
     
}
	
	public static ArrayList<String> rightclickandprint(List<WebElement> rightclickelement)
	{
		 String righttext=null;
		 ArrayList<String> list=new ArrayList<String>();
		 
	for (int i=0; i<rightclickelement.size(); i++)
	 {
		  righttext=rightclickelement.get(i).getText();
		  list.add(righttext);
		
	 }
     return list;
}
}
