package com.qa.Selenium.MainClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.SeleniumMajor.Utility.MajorUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilMainClass {
	private static final String Unit = null;
	private static final String TimeUnits = null;
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

	public static void main(String args[]) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// right click assignment URL
		// driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		// Select class URL
		//driver.get("https://www.facebook.com/");

		driver.get("https://www.linkedin.com/");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		MajorUtility utility = new MajorUtility(driver);
		//utility.fluentwaitinvisbility(signbutton,20,2);
		//utility.explicitlyVisible(signbutton,2);
		//utility.explicitlyinVisible(signbutton, 2);
		//utility.customwait(signbutton, 10);
		utility.clicks(signbutton);
		Thread.sleep(5000);
		//utility.fluentwaitinvisbility(username,20,2);
		utility.customwait(username, 10);
		//utility.explicitlyVisible(username,2);
		//utility.explicitlyinVisible(username, 2);
		utility.sendkeydata(username, "rohanestar@gmail.com");
		utility.ScreenshotUtilswebelement(username,"wescrennshot");
		//utility.fluentwaitinvisbility(password,30,2);
		//utility.explicitlyVisible(password,2);
		utility.explicitlyinVisible(password, 2);
		utility.customwait(password, 10);
		utility.sendkeydata(password, "Asdf123!Q");
		
		//utility.explicitlywait(Loginbutton,2);
		//utility.explicitlyinVisible(Loginbutton, 2);
		//utility.fluentwaitinvisbility(Loginbutton,30,2);
		utility.customwait(Loginbutton, 10);
		utility.clicks(Loginbutton);
		utility.ScreenshotUtils("lined");
		// Thread.sleep(2000);
		// Actions class code
		// utility.mouseactionsrightclick(rightclick);
		// utility.rightcliclpopupclick(rightclick,rightclickelements,"Paste");
		// ArrayList<String>
		// addlist=utility.rightclickandprint(rightclick,rightclickelements);
		// System.out.println(addlist);
		// utility.dropdownselection(dayelement,"30");
		// utility.dropdownselection(monthelement,"Dec");
		// utility.dropdownselection(yearelement,"1986");
		// utility.selectalldropdowncount(dayelement);
		// utility.selectalldropdowncount(monthelement);
		// utility.selectalldropdowncount(yearelement);
		/*
		 * ArrayList<String> list=utility.arraylistdropdwon(dayelement);
		 * System.out.println(list); ArrayList<String>
		 * monthlist=utility.arraylistdropdwon(monthelement);
		 * System.out.println(monthlist); ArrayList<String>
		 * yearlist=utility.arraylistdropdwon(yearelement);
		 * System.out.println(yearlist);
		 * 
		 * utility.withoutselect(dayelements,"30");
		 * utility.withoutselect(monthelements,"Dec");
		 * utility.withoutselect(yearelements,"1986");
		 */
	}
}
