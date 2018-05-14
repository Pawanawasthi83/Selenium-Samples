package com.selenium.myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter_FormSubmitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FF0PE6DUZRZ8");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[4]/div/button[4]")).click();
		driver.switchTo().frame("iframeResult");
		
		WebElement fname= driver.findElement(By.id("fname"));
		WebElement lname= driver.findElement(By.id("lname"));
		WebElement btn = driver.findElement(By.id("subBtn"));
		
		//js.executeScript("window.document.getElementById('fname').sendKeys('Pawan')");
		js.executeScript("arguments[0].value='pawan';arguments[1].value='Awasthi';"
				+ "arguments[2].click();",fname,lname,btn);
		
		/*js.executeScript("document.getElementById('fname').value='Pawan';"
				+ "document.getElementById('lname').value='Awasthi';"
				+ "document.getElementById('subBtn').click();");*/
		
		
		
		
	}

}
