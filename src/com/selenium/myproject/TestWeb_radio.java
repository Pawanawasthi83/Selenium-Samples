package com.selenium.myproject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWeb_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FE2SODAPP5W5");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[4]/ul/li[6]/button")).click();
		
		driver.switchTo().frame("iframeResult");
		List<WebElement> radio_btn = driver.findElements(By.name("gender"));
		
		System.out.println(radio_btn.get(0).getAttribute("value"));
		System.out.println(radio_btn.get(1).getAttribute("value"));
		System.out.println(radio_btn.get(2).getAttribute("value"));
		
		String  boo = radio_btn.get(1).getAttribute("checked");
		
		if(boo!= null){
			
			System.out.println(radio_btn.get(1).getAttribute("value") + " Selected");
		}else{
			
			radio_btn.get(1).click();
			System.out.println("Clicked On : "+radio_btn.get(1).getAttribute("value"));
						
		}
		
		
	}

}
