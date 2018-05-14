package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@id='fsl']/a[2]")).click();
		
		Thread.sleep(3000L);
		
		driver.navigate().back();
		
		Thread.sleep(2000L);
		
		driver.navigate().forward();
		

		
	}

}
