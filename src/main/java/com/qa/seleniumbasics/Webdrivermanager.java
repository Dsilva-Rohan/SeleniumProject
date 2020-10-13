package com.qa.seleniumbasics;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Webdrivermanager {
	

		public static void main(String[] args)
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			System.out.println(driver.getTitle());
			driver.close();

		}

		public static Object chromedriver() {
			// TODO Auto-generated method stub
			return null;
		}

	}



