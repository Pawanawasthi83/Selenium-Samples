package com.selenium.myproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown_01 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Users/pawan.awasthi/Desktop/Options.html");
		
		WebElement select = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select option = new Select(select);
		
		List<WebElement> selectedOptions = option.getAllSelectedOptions();
		
		for(int i=0;i<selectedOptions.size();i++){
			
			System.out.println(selectedOptions.get(i).getText());
			
			
		}
		
		WebElement element = option.getFirstSelectedOption();
		System.out.println("First Selected Option : "+element.getText());
		
		option.deselectAll();
	}

}
