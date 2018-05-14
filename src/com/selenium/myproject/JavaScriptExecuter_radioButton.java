package com.selenium.myproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter_radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FF0PE6DUZRZ8");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[4]/div/button[4]")).click();
		driver.switchTo().frame("iframeResult");
		
		By by = By.name("gender");
		
		List<WebElement> radio_btn=driver.findElements(by);
		
		for(int i=0;i<radio_btn.size();i++){
			
			if(radio_btn.get(i).getAttribute("value").equalsIgnoreCase("female")){
				
				js.executeScript("arguments[0].click();", radio_btn.get(i));
			}
			
			
		}
		
		
	}

}
