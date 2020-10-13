package com.qa.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class cricketScorecard {

	private static final char[] cricketlist = null;

	public static void main(String[] args) throws InterruptedException
	{
		
				 //WebDriverManager.chromedriver().setup();
		         System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Chromdriver\\chromedriverNew\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://stats.espncricinfo.com/ci/engine/records/averages/batting_bowling_by_team.html?id=12615;team=2;type=series");
				 ArrayList<String> cricketlist=new ArrayList<String>();
				List<WebElement> lists= driver.findElements(By.xpath("//a[text()='UT Khawaja']//parent::td[@title='record rank: 1']//following-sibling::td"));
				Thread.sleep(2000);
				System.out.println(lists.size());
				for(int i=0; i<lists.size(); i++)
				{
					String All=lists.get(i).getText();
					
					
					cricketlist.add(All);
				}
				System.out.println(cricketlist);
			
	
	}
	
	
}
