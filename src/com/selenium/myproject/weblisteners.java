package com.selenium.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class weblisteners extends AbstractWebDriverEventListener {

	
	public void afterClickOn(WebElement element, WebDriver driver) {
	    
		System.out.println("Element clicked....."); 
	  }
	
}
