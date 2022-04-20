package com.harman.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Harman_testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
		String title = driver.getTitle();
	    System.out.println(title);
	    
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String html=driver.getPageSource();
	    System.out.println(html);
	    
	    driver.close();
	}

}