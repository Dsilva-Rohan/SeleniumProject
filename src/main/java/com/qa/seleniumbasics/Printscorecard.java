package com.qa.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printscorecard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://stats.espncricinfo.com/ci/engine/records/averages/batting_bowling_by_team.html?id=12615;team=2;type=series");
		 ArrayList<String> cricketlist=new ArrayList<String>();
		List<WebElement> lists= driver.findElements(By.xpath("//a[@class='data-link']//parent::td/a"));
		
		System.out.println(lists.size());
		for(int i=0; i<lists.size(); i++)
		{
			
			String All=lists.get(i).getText();
			
			cricketlist.add(All);
		}
		System.out.println(cricketlist+"\t");
		
		ArrayList<String> cricketlistscore=new ArrayList<String>();
		List<WebElement> lists2= driver.findElements(By.xpath("//a[@class='data-link']//ancestor::table//caption[text()='Australia batting averages']//following-sibling::tbody/tr/td"));
		System.out.println(lists2.size());
		for(int i=0; i<lists2.size(); i++)
		{
			
			String All=lists2.get(i).getText();
			
			cricketlistscore.add(All);
			
		}
		System.out.print(cricketlistscore+"\t");
	}

}
