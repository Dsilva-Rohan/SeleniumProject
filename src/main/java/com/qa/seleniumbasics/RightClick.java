package com.qa.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.SeleniumUtility.ActionUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
		List<WebElement> rightclickelement=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		System.out.println(rightclickelement.size());
		ActionUtility.rightclick(rightclickelement, "Delete");
		//ArrayList<String> addlist=ActionUtility.rightclickandprint(rightclickelement);
		//System.out.println(addlist);

}
}
