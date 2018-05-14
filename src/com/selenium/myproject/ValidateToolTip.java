package com.selenium.myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidateToolTip {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FF8A5GOE6ZLZ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[4]/div/button[4]")).click();
		
		driver.switchTo().frame("iframeResult");
		
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div")).sendKeys(Keys.PAGE_DOWN);
		
		action.moveToElement(driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div"))).perform();
		
		System.out.println(driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div/span")).getText());
		

	}

}
