package com.qa.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  WebElement frame=driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(frame);
		  WebElement drag=driver.findElement(By.id("draggable"));
		  WebElement drop=driver.findElement(By.id("droppable"));
		  Actions action=new Actions(driver);
		  action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		  driver.switchTo().defaultContent();
		  WebElement click=driver.findElement(By.linkText("Download"));
		  click.click();
		  
	}

}
