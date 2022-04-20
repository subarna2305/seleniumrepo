package com.harman.bacis;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Subarna");
		driver.findElement(By.name("lastname")).sendKeys("Kirtaniya");
		driver.findElement(By.name("reg_email__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("welcome123");
		
		Select selectday = new Select(driver.findElement(By.id("day")));
		selectday.selectByVisibleText("23");
		Select selectmonth = new Select(driver.findElement(By.id("month")));
		selectmonth.selectByValue("5");
		Select selectyear = new Select(driver.findElement(By.id("year")));
		selectyear.selectByVisibleText("1999");
		
		
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
