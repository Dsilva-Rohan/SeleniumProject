package com.qa.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		String s=alert.getText();
		System.out.println(s);
		//alert.accept();
		alert.dismiss();
		driver.navigate().to("https://cgi-lib.berkeley.edu/ex/fup.html");
		//below file upload code will work only when we have tag as INPUT and Type=File other wise it will n ot work.
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\rohan\\OneDrive\\Desktop\\Selenium Interview\\API automation.PNG");
		String t;
		//if(t.length()>0)
		//driver.close();

	}

}
