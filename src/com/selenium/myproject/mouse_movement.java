package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class mouse_movement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		
		weblisteners listener = new weblisteners();
		
		driver.register(listener);
				
		EventFiringMouse mouse = new EventFiringMouse(driver, listener);
		
		driver.get("http://google.com");
		
		Thread.sleep(2000);
		
		Locatable hoveritem = (Locatable) driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		
		Coordinates cord = hoveritem.getCoordinates();
		
		try{
			
			mouse.mouseMove(cord);
			
		}catch (Throwable t) {
			
		System.out.println("Exception....");
		}
		
			
	}

}
