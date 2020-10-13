package com.qa.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleText {
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		 Thread.sleep(2000);
		List<WebElement> lists= driver.findElements(By.xpath("//div[@jsname='aajZCb']/ul/li/descendant::div[@class='sbl1']"));
		Thread.sleep(2000);
		System.out.println(lists.size());
		for(int i=0; i<lists.size(); i++)
		{
			if(lists.get(i).getText().contains("testing tools"))
			{
				lists.get(i).click();
				break;
			}
		}

	}

}
