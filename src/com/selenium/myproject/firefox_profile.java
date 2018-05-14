package com.selenium.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class firefox_profile {

	public static void main(String[] args) {
		
		ProfilesIni listprofile = new ProfilesIni();
		FirefoxProfile profile = listprofile.getProfile("Selenium");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://google.com");
		
		
	}

}
