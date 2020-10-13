package com.qa.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		List<WebElement> lists=driver.findElements(By.tagName("a"));
		System.out.println(lists.size());
		for(int i=0; i<lists.size(); i++)
		{
			String text=lists.get(i).getText();
			if(text.length()>0)
			{
		      System.out.println(text);

	      }
	}
}
}
	
