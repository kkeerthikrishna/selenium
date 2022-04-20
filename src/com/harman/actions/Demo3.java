package com.harman.actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Harman_testing\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			
	        driver.get("https://nasscom.in/");
			
			Actions action=new Actions(driver);
			
			action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).pause(1000)
			.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']")))
			.build().perform();
			
			driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

		

	}

}