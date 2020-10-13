package com.qa.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeys {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Chromdriver\\chromedriverNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement element=driver.findElement(By.id("input"));
		WebElement element2=driver.findElement(By.xpath("//a[text()=' Shop by Category ']"));
		WebElement fish=driver.findElement(By.xpath("//ul[@id='navBarMegaNav']//li[@data-submenu-id='eggs-meat-fish' and @class='ng-scope']/a[text()='Eggs, Meat & Fish']"));
		WebElement mybasket=driver.findElement(By.xpath("//span[text()='My Basket']"));
		
		
		Actions action=new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(5000);
		action.moveToElement(fish).build().perform();
		Thread.sleep(2000);
		action.click(mybasket).build().perform();
		Thread.sleep(2000);
		action.sendKeys(element,"Mango",Keys.ENTER).build().perform();
		
		WebElement mango=driver.findElement(By.xpath("//a[text()='raw mango']"));
		action.doubleClick(mango).build().perform();
		action.contextClick(fish).build().perform();
		

	}

}
