package com.qa.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountImages {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			List<WebElement>textfield=driver.findElements(By.tagName("img"));
			System.out.println(textfield.size());
			for(int i=0; i<textfield.size();i++)
			{
				String imagesource= textfield.get(i).getAttribute("src");
				System.out.println(imagesource);
			}
		

	}

}
