package com.qa.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleCheckBox {

	static WebDriver driver;
			public static void main(String[] args) throws InterruptedException
			{
				
						 WebDriverManager.chromedriver().setup();
						  driver=new ChromeDriver();
						 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
						 driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
						 Thread.sleep(2000);
						 selectmultiple("choice 2");
						 selectmultiple("choice 6 1");
						 selectmultiple("choice 6 2 3");
						 
			}		 
			
			
		
						 public static  void selectmultiple(String value) throws InterruptedException
						 { 
						 
						 List<WebElement>list= driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']/ul/li//span"));
						 System.out.println(list.size());
						
						 for(int i=0;i<list.size();i++)
						 {
							 if(list.get(i).getText().contains(value))
							 {
								 System.out.println(list.get(i).getText());
								 list.get(i).click();
								 break;
							 }
						 }
						 } 
						
					}
		

	


