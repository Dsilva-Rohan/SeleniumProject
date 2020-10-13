package com.qa.Selenium.MainClass;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.SeleniumMajor.Utility.EXcelUtitlity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelmain {

	static WebDriver driver; 
	 static EXcelUtitlity excel=new EXcelUtitlity("D:\\eclipse\\SeleniumProject\\DataReader.xlsx");
	
	
	 public static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			//Excelmain.doligin(driver, HashMapdata(), HashMapdata().get(Username1));
			//Excelmain.doligin(driver, HashMapdata(), HashMapdata().get(Username2));
			Excelmain.HashMapdata(driver);
		}
		
		
		
	public  static void HashMapdata(WebDriver driver) throws InterruptedException
	{
		String Username1;
		String Username2;
		HashMap<String, String> maps=new HashMap<String, String>();
		Username1=excel.getCellData("Credentials_Data", 0, 2);
		System.out.println(Username1);
		String credentilas1=excel.getCellData("Credentials_Data", 1, 2);
		System.out.println(credentilas1);
		 Username2=excel.getCellData("Credentials_Data", 0, 3);
		System.out.println(Username2);
		String credentilas2=excel.getCellData("Credentials_Data", 1, 3);
		System.out.println(credentilas2);
		maps.put(Username1, credentilas1);
		maps.put(Username2, credentilas2);
		
		
		//System.out.println("dologin data:::::"+data1);
		String data1=maps.get(Username1);
		
		String datavalue[]=data1.split("_");
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys(datavalue[0]);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(datavalue[1]);
		String data2=maps.get(Username2);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		String datavalue2[]=data2.split("_");
		
		driver.findElement(By.id("username")).sendKeys(datavalue2[0]);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(datavalue2[1]);
		
		//return maps;
	
		
	
	
	/*
	 * public static void doligin(WebDriver driver, HashMap<String,
	 * String>mapdata,String value) throws InterruptedException {
	 * 
	 * String data1=mapdata.get(value);
	 * System.out.println("dologin data:::::"+data1); String
	 * datavalue[]=data1.split("_");
	 * driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	 * driver.findElement(By.id("username")).sendKeys(datavalue[0]);
	 * Thread.sleep(2000);
	 * driver.findElement(By.id("username")).sendKeys(datavalue[1]);
	 * 
	 * 
	 * }
	 */
	}

}
