package com.selenium.myproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		//driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Azərbaycanca");

		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		
		//select.selectByVisibleText("Azərbaycanca");
		
		//select.selectByValue("hi");
		//select.selectByIndex(0);
		
		//List<WebElement> options = select.getOptions();
		
		//System.out.println(options.size());
		
		/*for(int i=0;i<options.size();i++){
			
			System.out.println(options.get(i).getText());
			
		}*/
		
		System.out.println(select.isMultiple());
		
		
		
	}

}	
