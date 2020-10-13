package com.qa.SeleniumUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithoutselectclass
{
	public static void main(String args[])
	   {
		      WebDriverManager.chromedriver().setup();
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  List<WebElement> dayelement=driver.findElements( By.xpath("//select[@id='day']/option"));
			  List<WebElement> monthelement=driver.findElements( By.xpath("//select[@id='month']/option"));
			  List<WebElement> yearelement=driver.findElements( By.xpath("//select[@id='year']/option"));
			  System.out.println(dayelement.size());
			  
			  //driver.findElement(By.id("day")).click();
			  for(int i=0; i<dayelement.size(); i++)
			  {
				  String daytext=dayelement.get(i).getText();
				  if(daytext.equals("12"))
				  {
					  dayelement.get(i).click();
					  break;
				  }
				  
			  }
}
}