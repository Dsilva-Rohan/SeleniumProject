package com.qa.SeleniumUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownSelection
{
   public static void main(String args[])
   {
	      WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebElement dayelement=driver.findElement( By.id("day"));
		  WebElement monthelement=driver.findElement( By.id("month"));
		  WebElement yearelement=driver.findElement( By.id("year"));
		  
		  List<WebElement> dayelements=driver.findElements( By.xpath("//select[@id='day']/option"));
		  List<WebElement> monthelements=driver.findElements( By.xpath("//select[@id='month']/option"));
		  List<WebElement> yearelements=driver.findElements( By.xpath("//select[@id='year']/option"));
		  
		  DropdownUtility.dropdownselection(dayelement, "30");
		  DropdownUtility.dropdownselection(monthelement, "Sept");
		  DropdownUtility.dropdownselection(yearelement, "2003");
		  DropdownUtility.selectalldropdowncount(dayelement);
		  DropdownUtility.selectalldropdowncount(monthelement);
		  DropdownUtility.selectalldropdowncount(yearelement);
		  
		ArrayList<String> day=DropdownUtility.arraylistdropdwon(dayelement);
		ArrayList<String> month=DropdownUtility.arraylistdropdwon(monthelement);
		ArrayList<String> Year=DropdownUtility.arraylistdropdwon(yearelement);
		
		 
		 System.out.println("Arraylist"+day.get(4));
		 System.out.println("Arraylist"+month.get(4));
		 System.out.println("Arraylist"+Year.get(4));
		 
		 DropdownUtility.SelectbyIndex(dayelement, 26);
		 DropdownUtility.SelectbyIndex(monthelement, 4);
		 DropdownUtility.SelectbyIndex(yearelement, 10);
		 
		 String indextext="8-7-2009";
		 String indextextafterslpit[]=indextext.split("-");
		 
		 DropdownUtility.SelectbyValue(dayelement,indextextafterslpit[0]);
		 DropdownUtility.SelectbyValue(monthelement,indextextafterslpit[1]);
		 DropdownUtility.SelectbyValue(yearelement,indextextafterslpit[2]);
		
		// DropdownUtility.Deselect(dayelement,30);
		 //DropdownUtility.Deselect(monthelement,1);
		 //DropdownUtility.Deselect(yearelement,1986);
		 DropdownUtility.withoutselect(dayelements, "31");
		 DropdownUtility.withoutselect(monthelements, "Dec");
		 DropdownUtility.withoutselect(yearelements, "1992");
   }
}
 