package com.selenium.myproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoGuru99 {

	@Test	
	public void validateRegitrationErrMsg() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		By registrationLink = By.xpath("//a[contains(text(),'here')]");
		By email = By.xpath("//input[@name='emailid']");
		By submitBtn = By.xpath("//input[@name='btnLogin']");
		By regErrMsg = By.xpath("//*[@id='message9']");
		
		driver.findElement(registrationLink).click();
		driver.findElement(email).sendKeys(" ");
		driver.findElement(submitBtn).click();
		String acctuallMsg =driver.findElement(regErrMsg).getText();
		System.out.println("Actuall Message : "+acctuallMsg);
		Assert.assertEquals(acctuallMsg, "Email ID is not valid");
		driver.close();
	}
	@Test	
	public void validateRegitration() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		By userid = By.xpath("//input[@name='uid']");
		By password = By.xpath("//input[@type='password']");
		By login = By.xpath("//input[@type='submit']");
		By reset = By.xpath("//input[@type='RESET']");
		
		
		driver.close();
	}
}
