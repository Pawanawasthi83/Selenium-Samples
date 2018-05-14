package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseFiringEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		
		WebDriverEvent_Listener listener = new WebDriverEvent_Listener();
				
		driver.register(listener);
		
		EventFiringMouse mouse = new EventFiringMouse(driver,listener);
		
		
		driver.get("http://google.com");
		
		Thread.sleep(2000L);
		
		Locatable hoveritem = (Locatable) driver.findElement(By.xpath(".//*[@id='fsl']/a[1]"));
			
		Coordinates cord = hoveritem.getCoordinates();
		System.out.println(cord.inViewPort().getX());
		System.out.println(cord.inViewPort().getY());
		mouse.mouseMove(cord);;
		
		
		
	}

}
