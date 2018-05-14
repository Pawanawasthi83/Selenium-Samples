package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation_mathod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");

		driver.findElement(By.xpath("//*[@id='fsl']/a[2]")).click();
		
		System.out.println("a");
		Thread.sleep(2000);
		driver.navigate().back();
		
		System.out.println("b");
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("c");
	}

}
