package com.selenium.myproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testResizable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(
		driver.findElements(By.tagName("iframe")).get(0));
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 200, 400).perform();
		
		Thread.sleep(3000);

	}

}
