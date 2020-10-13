package com.qa.Selenium.MainClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.SeleniumMajor.Utility.JavaScriptUtitlity;
import com.qa.SeleniumMajor.Utility.MajorUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptUtilMaincalss
{
        
		static By signbutton = By.xpath("//a[text()='Sign in']");
		static By username = By.id("username");
		static By password = By.id("password");
		static By Loginbutton = By.xpath("//button[text()='Sign in']");
		static By rightclick = By.xpath("//span[text()='right click me']");
		static By rightclickelements = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
		static By dayelement = By.id("day");
		static By monthelement = By.id("month");
		static By yearelement = By.id("year");
		static By dayelements = By.xpath("//select[@id='day']/option");
		static By monthelements = By.xpath("//select[@id='month']/option");
		static By yearelements = By.xpath("//select[@id='year']/option");
		static By UIborder=By.xpath("(//div[@class='header__logo' and @aria-hidden='true']//..)[1]");

		public static void main(String args[]) throws InterruptedException  
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			JavaScriptUtitlity javascript=new JavaScriptUtitlity(driver);
			MajorUtility utility=new MajorUtility(driver);
			driver.get("https://www.linkedin.com/");
			String title=javascript.Javascriptgettitle();
			System.out.print(title);
			//javascript.JavascriptAlerts("its My Own Alert Messahe");
			javascript.javascriptrefresh();
			String agent=javascript.javascriptbrowserAgent();
			System.out.println(agent);
			WebElement element=utility.getfindelement(signbutton);
			javascript.Highlightelement(element);
			javascript.JavascriptClick(element);
			Thread.sleep(2000);
			javascript.Javascriptsendkeys("username","scriptexce");
			
			WebElement element2=utility.getfindelement(username);
			javascript.Highlightelement(element2);
			javascript.Javascriptborder(element2);
			
			String innertext=javascript.innertext();
			System.out.print(innertext);
			if(innertext.contains("User Agreement"))
			{
				System.out.println("\n Test is passed");
			}
			else
			{
				System.out.println("Test is Failed");
			}
			
			javascript.Scrolldown();
		}
		
}
