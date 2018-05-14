package com.selenium.myproject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateWebElements {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FF8A5GOE6ZLZ");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[4]/div/button[4]")).click();
		
		driver.switchTo().frame("iframeResult");
		
		// Select Gender Radio Button
		By gender = By.name("gender");
		By colors = By.name("color");
		
		selectRadioButton(gender,"female");
		selectRadioButton(colors,"Yellow");		
		
		//driver.close();
	}
	
	public static void selectRadioButton(By by, String value) {
		
		List<WebElement> radio_g = driver.findElements(by);
		
		for(int i=0;i<radio_g.size();i++){
			
			try{
			if(radio_g.get(i).getAttribute("value").equalsIgnoreCase(value)){
				System.out.println("Element Present at " +i+ " Index");
			boolean check_selected=radio_g.get(i).isSelected();
			boolean check_enabled = radio_g.get(i).isEnabled();
			boolean check_displayed = radio_g.get(i).isDisplayed();
			if(check_selected){
				System.out.println("Radio button "+radio_g.get(i).getAttribute("value")+" already checked");
			}else {
				if(check_enabled){
					if(check_displayed){
						radio_g.get(i).click();
						System.out.println("Radio button "+radio_g.get(i).getAttribute("value")+" have been checked");	
					}else{
						System.out.println("Radio button "+radio_g.get(i).getAttribute("value")+" is hidden");}
				}else{
					
					System.out.println("Radio button "+radio_g.get(i).getAttribute("value")+" is not enabled");
				}
			}break;
			}else {
				
				System.out.println("Element Not Present at " +i+ " Index");
			}
			}catch (NoSuchElementException e) {
				
				System.out.println(e);
			}
			
		}
		
	}

}
