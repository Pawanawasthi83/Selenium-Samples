package com.selenium.myproject;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class WebDriver_Wait {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
				
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='sbse2']/div[2]"))).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(20L, TimeUnit.SECONDS)
								.pollingEvery(2L, TimeUnit.SECONDS)
								.ignoring(NoSuchElementException.class)
								.withMessage("MESSAGES :: WAIT...");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='sbse2']/div[2]"))).click();
		
		

	}

}
