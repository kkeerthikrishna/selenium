package com.harman.multipletabs;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Harman_testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.medibuddy.in/");
		
		//click on Not Now
		driver.findElement(By.id("wzrk-cancel")).click();
		
		//click on for employer
		driver.findElement(By.linkText("For Employer")).click();
		
		//switch to 2nd tab
		List<String> sessions=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sessions.get(1));
		
        driver.findElement(By.id("getInTouchName")).sendKeys("Keerthi");
		 
		driver.findElement(By.id("getInTouchEmail")).sendKeys("keerthi123@gmail.com");
		
		//enter phone number as 12345
		driver.findElement(By.id("getInTouchMobile")).sendKeys("123456");
		
		driver.findElement(By.id("getInTouchDesignation")).sendKeys("Nothing");
		 
		driver.findElement(By.id("getInTouchEmpCount")).sendKeys("12");
		 
		driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();
		
	}

}
