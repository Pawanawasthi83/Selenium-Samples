package com.selenium.myproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]"));
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		
		for(int i=0;i<links.size();i++){
			
			System.out.println(links.get(i).getAttribute("href"));
		}
        
		System.out.println("Number of Links : "+ links.size());
	}

}
