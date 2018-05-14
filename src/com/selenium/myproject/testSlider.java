package com.selenium.myproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testSlider {

	public static void main(String[] args) throws InterruptedException {
		
			    
		//System.setProperty("webdriver.ie.driver", "D:\\SeleniumWS\\Drivers\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver.logfile", "D:\\SeleniumWS\\Drivers\\IEDriverServer_Win32_2.53.0\\IEdriver.log");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println("Window ID : " + driver.findElements(By.tagName("iframe")).size());
				
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider,90,0).perform();
		
		Thread.sleep(3000);


	}

}
