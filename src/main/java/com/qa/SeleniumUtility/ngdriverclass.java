package com.qa.SeleniumUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.paulhammant.ngwebdriver.*;

public class ngdriverclass 
{

	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	NgWebDriver ngdriver=new NgWebDriver(js);
	
	ByAngularBinding bindings=ByAngular.binding("Text");
	ByAngularOptions option=ByAngular.options("Text");
	ByAngularModel model=ByAngular.model("text");
	ByAngularRepeater model2=ByAngular.repeater("test");
	
	ByAngularButtonText buttons=ByAngular.buttonText("Add ");
	
	
	public void test()
	{
		ngdriver.waitForAngularRequestsToFinish();
		driver.findElement(bindings);
		driver.findElement(ByAngular.cssContainingText("test", "text"));
		ngdriver.waitForAngularRequestsToFinish();
	}
}
