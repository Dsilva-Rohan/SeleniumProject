package com.qa.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAtribute {

	public static void main(String[] args)
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		String a=driver.findElement(By.xpath("//a[text()=' Shop by Category ']")).getAttribute("qa");
		driver.findElement(By.xpath("//input[contains(@qa,'searchBar')]")).sendKeys("Christopher Rohan Dsilva");
		String b=driver.findElement(By.xpath("//input[contains(@qa,'searchBar')]")).getAttribute("value");
		
		
		System.out.println(a+b);
		//Xpath
		//(//a[@title='Bigbasket'])[1]
		//(//a[@title='Bigbasket'])[2]
		//(//a[@title='Bigbasket'])[position()=1]
		//(//a[@title='Bigbasket'])[position()=2]
		//(//li//a[@qa='loginLink' and text()='Login'])[2]
		//a[@class='ng-scope']
		//a[contains(@class,'ng-scope') and text()='Sign up']
		//a[contains(@class,'nav-link-a')]/span[text()='OFFERS']
		////i[starts-with(@class,'icon svg-header svg-search svg-search-dim')]
		////span[contains(@class,'hidden-xs hidden-sm')]/span[contains(@class,'basket-content')]
		////span[contains(@class,'hidden-sm')]/span[contains(@class,'basket-content')]
				
		//Xpath Axes		
	    //(//button[@qa='add'])[3]//parent::div//preceding-sibling::div//child::div//input[contains(@class,'form-control')]		
	    //div[@class='hidden-md hidden-lg']//ancestor::bigbasket-cart-template//following-sibling::div/child::div/child::input[@qa='searchBar']		
        ////div[@jsname='aajZCb']/ul/li//descendant::div[@class='sbl1']
	    //a[text()='UT Khawaja']//parent::td[@title='record rank: 1']//following-sibling::td
		//img[@src='https://www.bigbasket.com/media/uploads/p/s/40033824_17-fresho-apple-red-deliciouswashington-regular.jpg']/../../../../../../../../..
		//img[@src='https://www.bigbasket.com/media/uploads/p/s/40033824_17-fresho-apple-red-deliciouswashington-regular.jpg']//..//..//..//..//..//..//..//..//..		

	}

}
