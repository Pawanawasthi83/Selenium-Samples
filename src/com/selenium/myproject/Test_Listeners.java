package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Test_Listeners {

	public static void main(String[] args) {
		
		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver) ;
		
		weblisteners listeners = new weblisteners();
		
		driver.register(listeners);
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath(".//*[@id='fsl']/a[2]")).click();
		
	}

}
