package com.selenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_Menubar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.homeshop18.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[6]/div/a")).click();
				
		WebElement main_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']/a"));
		WebElement sub_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']/ul/li[1]/ul[1]/li[3]/a"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(main_menu).perform();
		
		Thread.sleep(3000);
		
		sub_menu.click();
		
		Thread.sleep(3000);
		
		
	}

}
	