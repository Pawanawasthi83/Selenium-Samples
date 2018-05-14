package com.selenium.myproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateBrokenLinks {

	public static WebDriver driver;
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		driver = new FirefoxDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");
		//By links_block = By.xpath("//*[@id='www-wikipedia-org']/div[6]");
		validateBrokenLinks();
	}
	
	public static String validateBrokenLinks() throws ClientProtocolException, IOException {
		
		//WebElement block = driver.findElement(by);
		List<String> brokenLink =new ArrayList<String>();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links){
			String url = link.getAttribute("href");
			if (url != null) {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(url);
				HttpResponse response = client.execute(request);
				System.out.println(url+"====="+response.getStatusLine().getStatusCode());
				if (response.getStatusLine().getStatusCode() != 200||response.getStatusLine().getStatusCode() == 404){
					brokenLink.add(url);
				}}}		
        System.out.println("Number of Links : "+ brokenLink.size());
        return null;
		}
}


