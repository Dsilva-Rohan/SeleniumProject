package com.qa.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args)
	{
	     WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.linkedin.com/home");
		driver.findElement(By.cssSelector(".nav__button-secondary")).click();
		
		//#id
		//input#username
		//input[id='username']
		//input[id='username'][name='session_key']
		//input[name='session_key']
		//div[id='error-for-username'].form__label--error.hidden
		//code#consumer_login__text_plain__no_username
		
		//class
		//.form__label--error.hidden
		//div.form__label--error.hidden
		//div.hidden
		
		//Text 
		//code[id^='consumer'] //starts for the code tag.
        //code[id$='v2'] //End the text with v2 for the tag of code and attribute of id.
		
		//contains text
		//label[class*='floating']
		
		//parent and clild traversing in css selector
		//div>div.header__logo
		//div>input#username
		//div[class='form__input--floating']>input[id='password']
		
		//xpath traversing back
		//img[@src='https://www.bigbasket.com/media/uploads/p/s/40033824_17-fresho-apple-red-deliciouswashington-regular.jpg']/../../../../../../../../..
		
	}

}
