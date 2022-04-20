package com.harman.advance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo2FBRegister {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Harman_testing\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Keerthi");
		driver.findElement(By.name("lastname")).sendKeys("Kamutam");
		
		driver.findElement(By.name("reg_email__")).sendKeys("keerthi@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("keerthi@gmail.com");
		driver.findElement(By.name("reg_Passwd__")).sendKeys("keerthi@123");
		
		Select selectDay= new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		Select selectMon = new Select(driver.findElement(By.name("birthday_month")));
		selectMon.selectByVisibleText("Dec");
		selectMon.selectByValue("12");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectPro = new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPro.selectByIndex(3);
		
	
		
		driver.findElement(By.name("websubmit")).click();
	}

}
