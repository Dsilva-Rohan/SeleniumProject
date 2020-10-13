 package com.qa.SeleniumMajor.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtitlity 
{
	
	WebDriver driver;
	
	public JavaScriptUtitlity(WebDriver driver)
	{
		this.driver=driver;
	}

	//Get the page title  
public  String Javascriptgettitle()
{
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	String title=js.executeScript("return document.title").toString();
	return title;
	
	
}

//Alert program
public void JavascriptAlerts(String Message)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('"+Message+"')");
}

//Refresh the browser

public void javascriptrefresh()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("history.go(0)");
	
}

//get the detail of  all the installed browser in the system
public String javascriptbrowserAgent()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String agent=js.executeScript("return navigator.userAgent;").toString();
	return agent;
}

//Send keys of text
public void Javascriptsendkeys(String id, String values )
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("document.querySelector("*[type='email']").getattribute("id")");
	js.executeScript("document.getElementById('" + id + "').value='" + values + "'");
	 
}

// Clicking on particular element

public void JavascriptClick(WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
	
}

//Java Script Border method to element

public void Javascriptborder(WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'",element);
	
}


//Flash Highlight the method
public void Highlightelement(WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0; i<=25; i++)
	{
		backgroundcolor("rgb(200,200,200)",element);
		backgroundcolor(bgcolor,element);
		
	}
}

//this is the internal method for flashobjects

public void backgroundcolor(String color,WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	
}

//Getting the text of entire page

public String  innertext()
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String innertext=js.executeScript("return document.documentElement.innerText;").toString();
	return innertext;
	
}

// scrolling the complete page scroll bar 
public void Scrolldown()
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}

//Scrolling the scroll bar till the element is visible
public void Scrollspecificelemnet(WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	
}


public void Highlightelement2(WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0; i<=1000; i++)
	{
		backgroundcolor1("rgb(200,200,200)",element);
		backgroundcolor1(bgcolor,element);
		
	}
}
public void backgroundcolor1(String color,WebElement element)
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	
}
}
