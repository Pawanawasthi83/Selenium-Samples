package com.selenium.myproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLocaters {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    //rc-button rc-button-submit
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("Pawan Awasthi");
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Pawan Awasthi");
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Pawan Awasthi");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Pawan Awasthi");
		driver.findElement(By.xpath("//*[@id='u_0_q']")).click();
	}
	}


