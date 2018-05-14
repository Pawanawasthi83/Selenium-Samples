package com.selenium.myproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturescreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ROOT_PATH = System.getProperty("user.dir");
				
		Date date = new Date();
		SimpleDateFormat dt =  new SimpleDateFormat ("y.M.d'_'hh_mm_ss_SS");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(ROOT_PATH +"\\ScreenShots\\ScreenShot_" + dt.format(date) + ".jpg"));
		
		
		try {
			driver.findElement(By.xpath("//*[@id='XYZ']"));
		} catch (Exception e) {
			
			FileUtils.copyFile(scrFile, new File(ROOT_PATH +"\\ScreenShots\\Error_ScreenShot_" + dt.format(date) + ".jpg"));
			
		}
	}

}
