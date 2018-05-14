package com.selenium.myproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;

public class KeyPress_Event {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("pawanawasthi83@gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("2fast2hot");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(Keys.ENTER);*/
		
		//driver.findElement(By.xpath("//*[@id='gaia_firstform']/div/a")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//nav/div/a[2]")).sendKeys(Keys.PAGE_DOWN);
		System.out.println("Page Down");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav/div/a[2]")).sendKeys(Keys.PAGE_UP);
		System.out.println("Page UP");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav/div/a[2]")).sendKeys(Keys.BACK_SPACE);
		System.out.println("Back Space Pressed");
		Thread.sleep(2000);
	}

}
