package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keypress_events {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");

		/*driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("pawanawasthi83@gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("2fast2hot");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
		driver.close();*/
		
		driver.findElement(By.xpath("//*[@id='link-signup']/a")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/h1")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/h1")).sendKeys(Keys.PAGE_UP);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/h1")).sendKeys(Keys.BACK_SPACE);
	
		
	}

}
