package com.selenium.myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ValidateWebDriverEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		
		WebDriverEvent_Listener listener = new WebDriverEvent_Listener();
		
		driver.register(listener);
		
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FEASJIM0N2RF");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[4]/ul/li[6]/button")).click();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//div[1]/div[3]/div/button[1]")).click();
		
		Alert alertbox = driver.switchTo().alert();
		System.out.println(alertbox.getText());
		Thread.sleep(3000L);
		alertbox.accept();
	}

}
